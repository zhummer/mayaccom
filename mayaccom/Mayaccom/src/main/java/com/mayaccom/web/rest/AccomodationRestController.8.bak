package com.mayaccom.web.rest;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.ContentDAO;
import com.mayaccom.dao.HostDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;
import com.mayaccom.domain.Host;

import com.mayaccom.service.AccomodationService;

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
 * Spring Rest controller that handles CRUD requests for Accomodation entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/.properties.webcontroller]
 * @generated
 */

@Controller("AccomodationRestController")

public class AccomodationRestController {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/.properties.webcontroller#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/.properties.webcontroller#//@variables%5Bname='contentDAO'%5D]
	 */
	@Autowired
	private ContentDAO contentDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/.properties.webcontroller#//@variables%5Bname='accomodationService'%5D]
	 */
	@Autowired
	private AccomodationService accomodationService;

	/**
	 * Save an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/saveAccomodation%7B90e9a4f6-68fb-4b08-9d28-d03af6f632e1%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Accomodation", method = RequestMethod.PUT)
	@ResponseBody
	public Accomodation saveAccomodation(@RequestBody Accomodation accomodation) {
		accomodationService.saveAccomodation(accomodation);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());
	}

	/**
	* Select an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/loadAccomodation%7B89e2c88f-8b5d-4446-88e6-95efa7e3675a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Accomodation loadAccomodation(@PathVariable Integer accomodation_id) {
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation_id);
	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/saveAccomodationHost%7Ba347e911-e804-41d6-a6d7-fb0b2b0ab82a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/host", method = RequestMethod.PUT)
	@ResponseBody
	public Host saveAccomodationHost(@PathVariable Integer accomodation_id, @RequestBody Host host) {
		accomodationService.saveAccomodationHost(accomodation_id, host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* Show all Accomodation entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/listAccomodations%7B1a51a955-6387-4db9-949a-66cd371cdb87%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation", method = RequestMethod.GET)
	@ResponseBody
	public List<Accomodation> listAccomodations() {
		return new java.util.ArrayList<Accomodation>(accomodationService.loadAccomodations());
	}

	/**
	* View an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/loadAccomodationHost%7B5ba23ced-b5cf-438b-9322-1b0c3d7e31c1%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/host/{host_id}", method = RequestMethod.GET)
	@ResponseBody
	public Host loadAccomodationHost(@PathVariable Integer accomodation_id, @PathVariable Integer related_host_id) {
		Host host = hostDAO.findHostByPrimaryKey(related_host_id, -1, -1);

		return host;
	}

	/**
	* Save an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/saveAccomodationContents%7B4b8da1bb-009f-4ec9-9300-0194a6bba4ee%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/contents", method = RequestMethod.PUT)
	@ResponseBody
	public Content saveAccomodationContents(@PathVariable Integer accomodation_id, @RequestBody Content contents) {
		accomodationService.saveAccomodationContents(accomodation_id, contents);
		return contentDAO.findContentByPrimaryKey(contents.getId());
	}

	/**
	* Delete an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/deleteAccomodation%7Beec30564-1d2f-468a-9f1c-fc219d3d23bb%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccomodation(@PathVariable Integer accomodation_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation_id);
		accomodationService.deleteAccomodation(accomodation);
	}

	/**
	* Show all Content entities by Accomodation
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/getAccomodationContents%7Bf978bd42-0e81-49cb-b2f6-b7987cec8fbd%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/contents", method = RequestMethod.GET)
	@ResponseBody
	public List<Content> getAccomodationContents(@PathVariable Integer accomodation_id) {
		return new java.util.ArrayList<Content>(accomodationDAO.findAccomodationByPrimaryKey(accomodation_id).getContents());
	}

	/**
	* Delete an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/deleteAccomodationContents%7Bb3c4bb10-6ee7-4d0b-990f-c0680d422f62%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/contents/{content_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccomodationContents(@PathVariable Integer accomodation_id, @PathVariable Integer related_contents_id) {
		accomodationService.deleteAccomodationContents(accomodation_id, related_contents_id);
	}

	/**
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/newAccomodationHost%7B8f5b902e-6d82-459d-8ce1-6908638f3478%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/host", method = RequestMethod.POST)
	@ResponseBody
	public Host newAccomodationHost(@PathVariable Integer accomodation_id, @RequestBody Host host) {
		accomodationService.saveAccomodationHost(accomodation_id, host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* Create a new Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/newAccomodationContents%7B0c94683d-1f42-450b-8903-291ebaab5f13%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/contents", method = RequestMethod.POST)
	@ResponseBody
	public Content newAccomodationContents(@PathVariable Integer accomodation_id, @RequestBody Content content) {
		accomodationService.saveAccomodationContents(accomodation_id, content);
		return contentDAO.findContentByPrimaryKey(content.getId());
	}

	/**
	* Create a new Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/newAccomodation%7B3200eeab-6cba-4bf5-bf9b-8c785cf240a2%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation", method = RequestMethod.POST)
	@ResponseBody
	public Accomodation newAccomodation(@RequestBody Accomodation accomodation) {
		accomodationService.saveAccomodation(accomodation);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());
	}

	/**
	* View an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/loadAccomodationContents%7Bc94665ff-fa38-42f1-8c4c-b76b298f0915%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/contents/{content_id}", method = RequestMethod.GET)
	@ResponseBody
	public Content loadAccomodationContents(@PathVariable Integer accomodation_id, @PathVariable Integer related_contents_id) {
		Content content = contentDAO.findContentByPrimaryKey(related_contents_id, -1, -1);

		return content;
	}

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/deleteAccomodationHost%7B487770c7-393b-4fcf-a0a6-be615082012a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/host/{host_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccomodationHost(@PathVariable Integer accomodation_id, @PathVariable Integer related_host_id) {
		accomodationService.deleteAccomodationHost(accomodation_id, related_host_id);
	}

	/**
	* Get Host entity by Accomodation
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/getAccomodationHost%7B9f4db443-6300-417d-9bbd-329c11b7398e%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}/host", method = RequestMethod.GET)
	@ResponseBody
	public Host getAccomodationHost(@PathVariable Integer accomodation_id) {
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation_id).getHost();
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AccomodationRestController/initBinder%7B978fc509-c420-4aba-862b-0a182e1232fa%7D/.properties.swoperation]
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