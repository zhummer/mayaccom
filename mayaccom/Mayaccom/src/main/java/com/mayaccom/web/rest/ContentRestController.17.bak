package com.mayaccom.web.rest;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.ContentDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;

import com.mayaccom.service.ContentService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Content entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/.properties.webcontroller]
 * @generated
 */

@Controller("ContentRestController")

public class ContentRestController {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/.properties.webcontroller#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/.properties.webcontroller#//@variables%5Bname='contentDAO'%5D]
	 */
	@Autowired
	private ContentDAO contentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/.properties.webcontroller#//@variables%5Bname='contentService'%5D]
	 */
	@Autowired
	private ContentService contentService;

	/**
	 * Create a new Content entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/newContent%7B67c1c002-070d-4473-9076-e2e6d57c21bf%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Content", method = RequestMethod.POST)
	@ResponseBody
	public Content newContent(@RequestBody Content content) {
		contentService.saveContent(content);
		return contentDAO.findContentByPrimaryKey(content.getId());
	}

	/**
	* Delete an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/deleteContent%7B92ef4e35-9330-4e8a-8603-b6bf685c8d0d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content/{content_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteContent(@PathVariable Integer content_id) {
		Content content = contentDAO.findContentByPrimaryKey(content_id);
		contentService.deleteContent(content);
	}

	/**
	* Show all Content entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/listContents%7B0b06b164-a5c7-45bd-82f5-82e959053767%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content", method = RequestMethod.GET)
	@ResponseBody
	public List<Content> listContents() {
		return new java.util.ArrayList<Content>(contentService.loadContents());
	}

	/**
	* View an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/loadContentAccomodation%7B05d6fbad-804a-4d98-b740-8d1627ce9691%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content/{content_id}/accomodation/{accomodation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Accomodation loadContentAccomodation(@PathVariable Integer content_id, @PathVariable Integer related_accomodation_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(related_accomodation_id, -1, -1);

		return accomodation;
	}

	/**
	* Create a new Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/newContentAccomodation%7B39f0ea00-559f-4ab9-be7d-b455c3f10ad6%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content/{content_id}/accomodation", method = RequestMethod.POST)
	@ResponseBody
	public Accomodation newContentAccomodation(@PathVariable Integer content_id, @RequestBody Accomodation accomodation) {
		contentService.saveContentAccomodation(content_id, accomodation);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());
	}

	/**
	* Get Accomodation entity by Content
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/getContentAccomodation%7Bed1d87b8-d025-4bf1-a547-82131a4d8616%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content/{content_id}/accomodation", method = RequestMethod.GET)
	@ResponseBody
	public Accomodation getContentAccomodation(@PathVariable Integer content_id) {
		return contentDAO.findContentByPrimaryKey(content_id).getAccomodation();
	}

	/**
	* Delete an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/deleteContentAccomodation%7Ba758c899-bb2c-4f18-aa8f-2b6cd10b042d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content/{content_id}/accomodation/{accomodation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteContentAccomodation(@PathVariable Integer content_id, @PathVariable Integer related_accomodation_id) {
		contentService.deleteContentAccomodation(content_id, related_accomodation_id);
	}

	/**
	* Select an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/loadContent%7B102c9c65-d729-4bf2-9bd5-18214b0a24f3%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content/{content_id}", method = RequestMethod.GET)
	@ResponseBody
	public Content loadContent(@PathVariable Integer content_id) {
		return contentDAO.findContentByPrimaryKey(content_id);
	}

	/**
	* Save an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/saveContentAccomodation%7Ba6df79d2-7900-4c32-94ac-36c4d86247fb%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content/{content_id}/accomodation", method = RequestMethod.PUT)
	@ResponseBody
	public Accomodation saveContentAccomodation(@PathVariable Integer content_id, @RequestBody Accomodation accomodation) {
		contentService.saveContentAccomodation(content_id, accomodation);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());
	}

	/**
	* Save an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/saveContent%7Bae95f99c-b1f1-4cc6-8fa0-eb6f691559bb%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Content", method = RequestMethod.PUT)
	@ResponseBody
	public Content saveContent(@RequestBody Content content) {
		contentService.saveContent(content);
		return contentDAO.findContentByPrimaryKey(content.getId());
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ContentRestController/initBinder%7Bd2d25b3f-4fc6-49df-86dd-02ebdb48cc4c%7D/.properties.swoperation]
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}
}