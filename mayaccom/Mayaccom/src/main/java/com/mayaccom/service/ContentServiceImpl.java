package com.mayaccom.service;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.ContentDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Content entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/.properties.srv]
 * @generated
 */

@Service("ContentService")

@Transactional
public class ContentServiceImpl implements ContentService {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/.properties.srv#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/.properties.srv#//@variables%5Bname='contentDAO'%5D]
	 */
	@Autowired
	private ContentDAO contentDAO;

	/**
	 * Instantiates a new ContentServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public ContentServiceImpl() {
	}

	/**
	 * Save an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/saveContentAccomodation%7Bef62b737-34bd-40ee-8ebb-f3b2fd3aff22%7D/.properties.swoperation]
	 */
	@Transactional
	public Content saveContentAccomodation(Integer id, Accomodation related_accomodation) {
		Content content = contentDAO.findContentByPrimaryKey(id, -1, -1);
		Accomodation existingaccomodation = accomodationDAO.findAccomodationByPrimaryKey(related_accomodation.getId());

		// copy into the existing record to preserve existing relationships
		if (existingaccomodation != null) {
			existingaccomodation.setId(related_accomodation.getId());
			existingaccomodation.setName(related_accomodation.getName());
			existingaccomodation.setAddress(related_accomodation.getAddress());
			existingaccomodation.setCity(related_accomodation.getCity());
			existingaccomodation.setZipCode(related_accomodation.getZipCode());
			existingaccomodation.setCapacity(related_accomodation.getCapacity());
			existingaccomodation.setLink1(related_accomodation.getLink1());
			existingaccomodation.setLink2(related_accomodation.getLink2());
			existingaccomodation.setLink3(related_accomodation.getLink3());
			existingaccomodation.setAreaM2(related_accomodation.getAreaM2());
			related_accomodation = existingaccomodation;
		}

		content.setAccomodation(related_accomodation);
		related_accomodation.getContents().add(content);
		content = contentDAO.store(content);
		contentDAO.flush();

		related_accomodation = accomodationDAO.store(related_accomodation);
		accomodationDAO.flush();

		return content;
	}

	/**
	 * Return a count of all Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/countContents%7Baf32471a-7a4e-44fc-b105-9700bb8de5b9%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countContents() {
		return ((Long) contentDAO.createQuerySingleResult("select count(o) from Content o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/deleteContent%7B8d2ab10c-3240-453e-8811-509841f27893%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteContent(Content content) {
		contentDAO.remove(content);
		contentDAO.flush();
	}

	/**
	 * Save an existing Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/saveContent%7B05339efd-245c-4fd7-acd3-6d1ff71c686e%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveContent(Content content) {
		Content existingContent = contentDAO.findContentByPrimaryKey(content.getId());

		if (existingContent != null) {
			if (existingContent != content) {
				existingContent.setId(content.getId());
				existingContent.setEditorContent(content.getEditorContent());
				existingContent.setContentName(content.getContentName());
			}
			content = contentDAO.store(existingContent);
		} else {
			content = contentDAO.store(content);
		}
		contentDAO.flush();
	}

	/**
	 * Delete an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/deleteContentAccomodation%7Bbf0714e4-04b0-4944-a2aa-c0aefa6a3857%7D/.properties.swoperation]
	 */
	@Transactional
	public Content deleteContentAccomodation(Integer content_id, Integer related_accomodation_id) {
		Content content = contentDAO.findContentByPrimaryKey(content_id, -1, -1);
		Accomodation related_accomodation = accomodationDAO.findAccomodationByPrimaryKey(related_accomodation_id, -1, -1);

		content.setAccomodation(null);
		related_accomodation.getContents().remove(content);
		content = contentDAO.store(content);
		contentDAO.flush();

		related_accomodation = accomodationDAO.store(related_accomodation);
		accomodationDAO.flush();

		accomodationDAO.remove(related_accomodation);
		accomodationDAO.flush();

		return content;
	}

	/**
	 * Return all Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/findAllContents%7Ba4acebec-4e2e-4fe3-a2b9-4c2e3226b5ec%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Content> findAllContents(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Content>(contentDAO.findAllContents(startResult, maxRows));
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/findContentByPrimaryKey%7B04dd0c9e-56bf-4a31-a3ed-48fd4b9d0562%7D/.properties.swoperation]
	 */
	@Transactional
	public Content findContentByPrimaryKey(Integer id) {
		return contentDAO.findContentByPrimaryKey(id);
	}

	/**
	 * Load an existing Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ContentService/loadContents%7B226a4d8a-84ad-4f0c-98f7-7c63c5e33228%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Content> loadContents() {
		return contentDAO.findAllContents();
	}
}
