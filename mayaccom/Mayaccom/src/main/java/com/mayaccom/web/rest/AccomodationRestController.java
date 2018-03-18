package com.mayaccom.web.rest;

import com.mayaccom.dao.AccomodationDAO;

import com.mayaccom.domain.Accomodation;

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
 */

@Controller("AccomodationRestController")

public class AccomodationRestController {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Accomodation entities
	 * 
	 */
	@Autowired
	private AccomodationService accomodationService;

	/**
	 * Create a new Accomodation entity
	 * 
	 */
	@RequestMapping(value = "/Accomodation", method = RequestMethod.POST)
	@ResponseBody
	public Accomodation newAccomodation(@RequestBody Accomodation accomodation) {
		accomodationService.saveAccomodation(accomodation);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());
	}

	/**
	* Register custom, context-specific property editors
	* 
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

	/**
	* Save an existing Accomodation entity
	* 
	*/
	@RequestMapping(value = "/Accomodation", method = RequestMethod.PUT)
	@ResponseBody
	public Accomodation saveAccomodation(@RequestBody Accomodation accomodation) {
		accomodationService.saveAccomodation(accomodation);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());
	}

	/**
	* Show all Accomodation entities
	* 
	*/
	@RequestMapping(value = "/Accomodation", method = RequestMethod.GET)
	@ResponseBody
	public List<Accomodation> listAccomodations() {
		return new java.util.ArrayList<Accomodation>(accomodationService.loadAccomodations());
	}

	/**
	* Delete an existing Accomodation entity
	* 
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccomodation(@PathVariable Integer accomodation_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation_id);
		accomodationService.deleteAccomodation(accomodation);
	}

	/**
	* Select an existing Accomodation entity
	* 
	*/
	@RequestMapping(value = "/Accomodation/{accomodation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Accomodation loadAccomodation(@PathVariable Integer accomodation_id) {
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation_id);
	}
}