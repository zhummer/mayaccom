package com.mayaccom.service;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.ContentDAO;
import com.mayaccom.dao.HostDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;
import com.mayaccom.domain.Host;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Accomodation entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/.properties.srv]
 * @generated
 */

@Service("AccomodationService")

@Transactional
public class AccomodationServiceImpl implements AccomodationService {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/.properties.srv#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/.properties.srv#//@variables%5Bname='contentDAO'%5D]
	 */
	@Autowired
	private ContentDAO contentDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/.properties.srv#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * Instantiates a new AccomodationServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public AccomodationServiceImpl() {
	}

	/**
	 * Return a count of all Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/countAccomodations%7Bf118057a-2d9b-464d-822b-4b23ff8121ea%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countAccomodations() {
		return ((Long) accomodationDAO.createQuerySingleResult("select count(o) from Accomodation o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/saveAccomodationContents%7B957734ca-1a82-4242-8b9a-ce898bd192b1%7D/.properties.swoperation]
	 */
	@Transactional
	public Accomodation saveAccomodationContents(Integer id, Content related_contents) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(id, -1, -1);
		Content existingcontents = contentDAO.findContentByPrimaryKey(related_contents.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcontents != null) {
			existingcontents.setId(related_contents.getId());
			existingcontents.setEditorContent(related_contents.getEditorContent());
			existingcontents.setContentName(related_contents.getContentName());
			related_contents = existingcontents;
		}

		related_contents.setAccomodation(accomodation);
		accomodation.getContents().add(related_contents);
		related_contents = contentDAO.store(related_contents);
		contentDAO.flush();

		accomodation = accomodationDAO.store(accomodation);
		accomodationDAO.flush();

		return accomodation;
	}

	/**
	 * Return all Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/findAllAccomodations%7B3238be09-0c2a-47f5-bb0e-b16d274e45bd%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Accomodation> findAllAccomodations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Accomodation>(accomodationDAO.findAllAccomodations(startResult, maxRows));
	}

	/**
	 * Delete an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/deleteAccomodation%7B379978f8-54cd-4f7c-8df2-543125612289%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteAccomodation(Accomodation accomodation) {
		accomodationDAO.remove(accomodation);
		accomodationDAO.flush();
	}

	/**
	 * Delete an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/deleteAccomodationHost%7B5a9ed9e7-bbf2-442d-8dba-da7c51cfabb6%7D/.properties.swoperation]
	 */
	@Transactional
	public Accomodation deleteAccomodationHost(Integer accomodation_id, Integer related_host_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation_id, -1, -1);
		Host related_host = hostDAO.findHostByPrimaryKey(related_host_id, -1, -1);

		accomodation.setHost(null);
		related_host.getAccomodations().remove(accomodation);
		accomodation = accomodationDAO.store(accomodation);
		accomodationDAO.flush();

		related_host = hostDAO.store(related_host);
		hostDAO.flush();

		hostDAO.remove(related_host);
		hostDAO.flush();

		return accomodation;
	}

	/**
	 * Load an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/loadAccomodations%7Bf7dfaa6b-31f3-47e0-8fdf-a7a3289bdf37%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Accomodation> loadAccomodations() {
		return accomodationDAO.findAllAccomodations();
	}

	/**
	 * Save an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/saveAccomodationHost%7B35f948b1-0a6f-4efa-aa64-6382a5311273%7D/.properties.swoperation]
	 */
	@Transactional
	public Accomodation saveAccomodationHost(Integer id, Host related_host) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(id, -1, -1);
		Host existinghost = hostDAO.findHostByPrimaryKey(related_host.getId());

		// copy into the existing record to preserve existing relationships
		if (existinghost != null) {
			existinghost.setId(related_host.getId());
			existinghost.setContactPerson(related_host.getContactPerson());
			existinghost.setPhone1(related_host.getPhone1());
			existinghost.setPhone2(related_host.getPhone2());
			existinghost.setPhone3(related_host.getPhone3());
			existinghost.setEmail(related_host.getEmail());
			existinghost.setUsername(related_host.getUsername());
			existinghost.setPassword(related_host.getPassword());
			related_host = existinghost;
		} else {
			related_host = hostDAO.store(related_host);
			hostDAO.flush();
		}

		accomodation.setHost(related_host);
		related_host.getAccomodations().add(accomodation);
		accomodation = accomodationDAO.store(accomodation);
		accomodationDAO.flush();

		related_host = hostDAO.store(related_host);
		hostDAO.flush();

		return accomodation;
	}

	/**
	 * Save an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/saveAccomodation%7Bf9c97701-cb2a-48e9-a32b-dc9cc6e4dac6%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveAccomodation(Accomodation accomodation) {
		Accomodation existingAccomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());

		if (existingAccomodation != null) {
			if (existingAccomodation != accomodation) {
				existingAccomodation.setId(accomodation.getId());
				existingAccomodation.setName(accomodation.getName());
				existingAccomodation.setAddress(accomodation.getAddress());
				existingAccomodation.setCity(accomodation.getCity());
				existingAccomodation.setZipCode(accomodation.getZipCode());
				existingAccomodation.setCapacity(accomodation.getCapacity());
				existingAccomodation.setLink1(accomodation.getLink1());
				existingAccomodation.setLink2(accomodation.getLink2());
				existingAccomodation.setLink3(accomodation.getLink3());
				existingAccomodation.setAreaM2(accomodation.getAreaM2());
			}
			accomodation = accomodationDAO.store(existingAccomodation);
		} else {
			accomodation = accomodationDAO.store(accomodation);
		}
		accomodationDAO.flush();
	}

	/**
	 * Delete an existing Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/deleteAccomodationContents%7B6804927b-f575-4baa-b19f-f601d9b7cb85%7D/.properties.swoperation]
	 */
	@Transactional
	public Accomodation deleteAccomodationContents(Integer accomodation_id, Integer related_contents_id) {
		Content related_contents = contentDAO.findContentByPrimaryKey(related_contents_id, -1, -1);

		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation_id, -1, -1);

		related_contents.setAccomodation(null);
		accomodation.getContents().remove(related_contents);

		contentDAO.remove(related_contents);
		contentDAO.flush();

		return accomodation;
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/findAccomodationByPrimaryKey%7Bb69a3065-18e6-4c4b-ac79-7f69579677a2%7D/.properties.swoperation]
	 */
	@Transactional
	public Accomodation findAccomodationByPrimaryKey(Integer id) {
		return accomodationDAO.findAccomodationByPrimaryKey(id);
	}
}
