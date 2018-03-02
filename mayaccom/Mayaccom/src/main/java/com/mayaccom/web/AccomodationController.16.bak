package com.mayaccom.web;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.ContentDAO;
import com.mayaccom.dao.HostDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;
import com.mayaccom.domain.Host;

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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/.properties.webcontroller]
 * @generated
 */

@Controller("AccomodationController")

public class AccomodationController {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/.properties.webcontroller#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/.properties.webcontroller#//@variables%5Bname='contentDAO'%5D]
	 */
	@Autowired
	private ContentDAO contentDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/.properties.webcontroller#//@variables%5Bname='accomodationService'%5D]
	 */
	@Autowired
	private AccomodationService accomodationService;

	/**
	 * Save an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/saveAccomodation%7B75b5e340-e88d-492d-87d6-e6ea65fa6531%7D/.properties.swoperation]
	 */
	@RequestMapping("/saveAccomodation")
	public String saveAccomodation(@ModelAttribute Accomodation accomodation) {
		accomodationService.saveAccomodation(accomodation);
		return "forward:/indexAccomodation";
	}

	/**
	* Select an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/selectAccomodation%7B451e5f1c-28fe-40a5-911c-33d31a2487a2%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectAccomodation")
	public ModelAndView selectAccomodation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/viewAccomodation.jsp");

		return mav;
	}

	/**
	* Select the child Content entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/confirmDeleteAccomodationContents%7B1370d101-3d16-4233-83e8-149ae66d859a%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteAccomodationContents")
	public ModelAndView confirmDeleteAccomodationContents(@RequestParam Integer accomodation_id, @RequestParam Integer related_contents_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("content", contentDAO.findContentByPrimaryKey(related_contents_id));
		mav.addObject("accomodation_id", accomodation_id);
		mav.setViewName("accomodation/contents/deleteContents.jsp");

		return mav;
	}

	/**
	* Edit an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/editAccomodationContents%7B1e111141-3d88-4513-a6a7-43004ad605bb%7D/.properties.swoperation]
	*/
	@RequestMapping("/editAccomodationContents")
	public ModelAndView editAccomodationContents(@RequestParam Integer accomodation_id, @RequestParam Integer contents_id) {
		Content content = contentDAO.findContentByPrimaryKey(contents_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("content", content);
		mav.setViewName("accomodation/contents/editContents.jsp");

		return mav;
	}

	/**
	* Show all Content entities by Accomodation
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/listAccomodationContents%7B39f4024a-e229-4923-8ff2-81eae5b84c85%7D/.properties.swoperation]
	*/
	@RequestMapping("/listAccomodationContents")
	public ModelAndView listAccomodationContents(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/contents/listContents.jsp");

		return mav;
	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/saveAccomodationHost%7Bfc7c4894-0776-47d2-bb46-c41d71f111a8%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveAccomodationHost")
	public ModelAndView saveAccomodationHost(@RequestParam Integer accomodation_id, @ModelAttribute Host host) {
		Accomodation parent_accomodation = accomodationService.saveAccomodationHost(accomodation_id, host);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("accomodation", parent_accomodation);
		mav.setViewName("accomodation/viewAccomodation.jsp");

		return mav;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/initBinder%7Beb42c3b0-bf82-4809-99f1-0c7b955da3cb%7D/.properties.swoperation]
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
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/newAccomodationHost%7Bde2da336-0d48-484f-8b03-996b35986bee%7D/.properties.swoperation]
	*/
	@RequestMapping("/newAccomodationHost")
	public ModelAndView newAccomodationHost(@RequestParam Integer accomodation_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("host", new Host());
		mav.addObject("newFlag", true);
		mav.setViewName("accomodation/host/editHost.jsp");

		return mav;
	}

	/**
	* View an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/selectAccomodationContents%7B1a0b97e9-9da8-443e-bf0c-0d2176ff905b%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectAccomodationContents")
	public ModelAndView selectAccomodationContents(@RequestParam Integer accomodation_id, @RequestParam Integer contents_id) {
		Content content = contentDAO.findContentByPrimaryKey(contents_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("content", content);
		mav.setViewName("accomodation/contents/viewContents.jsp");

		return mav;
	}

	/**
	* Edit an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/editAccomodationHost%7Ba8f6bb2d-8e57-415f-afaf-a6e3aef542e4%7D/.properties.swoperation]
	*/
	@RequestMapping("/editAccomodationHost")
	public ModelAndView editAccomodationHost(@RequestParam Integer accomodation_id, @RequestParam Integer host_id) {
		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("host", host);
		mav.setViewName("accomodation/host/editHost.jsp");

		return mav;
	}

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/deleteAccomodationHost%7B5f7ab463-6372-4fa5-8590-6012573635a8%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteAccomodationHost")
	public ModelAndView deleteAccomodationHost(@RequestParam Integer accomodation_id, @RequestParam Integer related_host_id) {
		ModelAndView mav = new ModelAndView();

		Accomodation accomodation = accomodationService.deleteAccomodationHost(accomodation_id, related_host_id);

		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("accomodation", accomodation);
		mav.setViewName("accomodation/viewAccomodation.jsp");

		return mav;
	}

	/**
	* Entry point to show all Accomodation entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/indexAccomodation%7B42393b03-776b-4ff3-98a7-1c0219ccf50b%7D/.properties.swoperation]
	*/
	public String indexAccomodation() {
		return "redirect:/indexAccomodation";
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/streamBinary%7B09d0d3a1-fc04-41b5-a0c9-445a8f4ded50%7D/.properties.swoperation]
	*/
	@RequestMapping("/accomodationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/newAccomodationContents%7Bd8e0dd3b-6433-47eb-b00d-20d832e6cfc9%7D/.properties.swoperation]
	*/
	@RequestMapping("/newAccomodationContents")
	public ModelAndView newAccomodationContents(@RequestParam Integer accomodation_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("content", new Content());
		mav.addObject("newFlag", true);
		mav.setViewName("accomodation/contents/editContents.jsp");

		return mav;
	}

	/**
	* View an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/selectAccomodationHost%7B33a51592-e728-4723-83db-e032c48d76fc%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectAccomodationHost")
	public ModelAndView selectAccomodationHost(@RequestParam Integer accomodation_id, @RequestParam Integer host_id) {
		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("host", host);
		mav.setViewName("accomodation/host/viewHost.jsp");

		return mav;
	}

	/**
	* Show all Accomodation entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/listAccomodations%7B3bb8c420-5003-4e54-88e5-e968d940c80a%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexAccomodation")
	public ModelAndView listAccomodations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodations", accomodationService.loadAccomodations());

		mav.setViewName("accomodation/listAccomodations.jsp");

		return mav;
	}

	/**
	* Create a new Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/newAccomodation%7Ba1511dbc-177c-4adb-9bb4-58230a33c8f1%7D/.properties.swoperation]
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
	* Delete an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/deleteAccomodation%7Bd568c601-5e80-4263-a8f1-7e3cbe25a950%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteAccomodation")
	public String deleteAccomodation(@RequestParam Integer idKey) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(idKey);
		accomodationService.deleteAccomodation(accomodation);
		return "forward:/indexAccomodation";
	}

	/**
	* Delete an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/deleteAccomodationContents%7B84e1aea0-3d03-4227-9e7a-2d5a0f3a9094%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteAccomodationContents")
	public ModelAndView deleteAccomodationContents(@RequestParam Integer accomodation_id, @RequestParam Integer related_contents_id) {
		ModelAndView mav = new ModelAndView();

		Accomodation accomodation = accomodationService.deleteAccomodationContents(accomodation_id, related_contents_id);

		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("accomodation", accomodation);
		mav.setViewName("accomodation/viewAccomodation.jsp");

		return mav;
	}

	/**
	* Show all Host entities by Accomodation
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/listAccomodationHost%7Bc9c7c0ce-5dad-438c-997b-5c69111abbbe%7D/.properties.swoperation]
	*/
	@RequestMapping("/listAccomodationHost")
	public ModelAndView listAccomodationHost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/host/listHost.jsp");

		return mav;
	}

	/**
	* Select the Accomodation entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/confirmDeleteAccomodation%7B3ddfce87-33b3-41b9-be87-e1f4590071f1%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteAccomodation")
	public ModelAndView confirmDeleteAccomodation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/deleteAccomodation.jsp");

		return mav;
	}

	/**
	* Select the child Host entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/confirmDeleteAccomodationHost%7Bb2b0904a-b964-4c2a-9ef5-c408b5ed9a6c%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteAccomodationHost")
	public ModelAndView confirmDeleteAccomodationHost(@RequestParam Integer accomodation_id, @RequestParam Integer related_host_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(related_host_id));
		mav.addObject("accomodation_id", accomodation_id);
		mav.setViewName("accomodation/host/deleteHost.jsp");

		return mav;
	}

	/**
	* Save an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/saveAccomodationContents%7B3e6b0e50-f9f2-4753-a43d-4a3af4b9ee45%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveAccomodationContents")
	public ModelAndView saveAccomodationContents(@RequestParam Integer accomodation_id, @ModelAttribute Content contents) {
		Accomodation parent_accomodation = accomodationService.saveAccomodationContents(accomodation_id, contents);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accomodation_id", accomodation_id);
		mav.addObject("accomodation", parent_accomodation);
		mav.setViewName("accomodation/viewAccomodation.jsp");

		return mav;
	}

	/**
	* Edit an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AccomodationController/editAccomodation%7Bf1379e42-e3bc-4393-9bd7-1b33e4ec0a44%7D/.properties.swoperation]
	*/
	@RequestMapping("/editAccomodation")
	public ModelAndView editAccomodation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(idKey));
		mav.setViewName("accomodation/editAccomodation.jsp");

		return mav;
	}
}