package com.mayaccom.web;

import com.mayaccom.dao.AccomodationDAO;

import com.mayaccom.domain.Accomodation;

import com.mayaccom.service.AccomodationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Accomodation entities
 * 
 */

@Controller("AccomodationController")

public class AccomodationController {

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
	 * Edit an existing Accomodation entity
	 * 
	 */
	@RequestMapping("/editAccomodation")
	public ModelAndView editAccomodation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/editAccomodation.jsp");

		return mav;
	}

	/**
	* Select an existing Accomodation entity
	* 
	*/
	@RequestMapping("/selectAccomodation")
	public ModelAndView selectAccomodation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/viewAccomodation.jsp");

		return mav;
	}

	/**
	* Delete an existing Accomodation entity
	* 
	*/
	@RequestMapping("/deleteAccomodation")
	public String deleteAccomodation(@RequestParam Integer idKey) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(idKey);
		accomodationService.deleteAccomodation(accomodation);
		return "forward:/indexAccomodation";
	}

	/**
	*/
	@RequestMapping("/accomodationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing Accomodation entity
	* 
	*/
	@RequestMapping("/saveAccomodation")
	public String saveAccomodation(@ModelAttribute Accomodation accomodation) {
		accomodationService.saveAccomodation(accomodation);
		return "forward:/indexAccomodation";
	}

	/**
	* Entry point to show all Accomodation entities
	* 
	*/
	public String indexAccomodation() {
		return "redirect:/indexAccomodation";
	}

	/**
	* Create a new Accomodation entity
	* 
	*/
	@RequestMapping("/newAccomodation")
	public ModelAndView newAccomodation() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", new Accomodation());
		mav.addObject("newFlag", true);
		mav.setViewName("accomodation/editAccomodation.jsp");

		return mav;
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
	* Select the Accomodation entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteAccomodation")
	public ModelAndView confirmDeleteAccomodation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/deleteAccomodation.jsp");

		return mav;
	}

	/**
	* Show all Accomodation entities
	* 
	*/
	@RequestMapping("/indexAccomodation")
	public ModelAndView listAccomodations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodations", accomodationService.loadAccomodations());

		mav.setViewName("accomodation/listAccomodations.jsp");

		return mav;
	}
}