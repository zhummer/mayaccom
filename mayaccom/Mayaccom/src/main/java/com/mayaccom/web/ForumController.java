package com.mayaccom.web;

import com.mayaccom.dao.ForumDAO;

import com.mayaccom.domain.Forum;

import com.mayaccom.service.ForumService;

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
 * Spring MVC controller that handles CRUD requests for Forum entities
 * 
 */

@Controller("ForumController")

public class ForumController {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Forum entities
	 * 
	 */
	@Autowired
	private ForumService forumService;

	/**
	 * Entry point to show all Forum entities
	 * 
	 */
	public String indexForum() {
		return "redirect:/indexForum";
	}

	/**
	* Delete an existing Forum entity
	* 
	*/
	@RequestMapping("/deleteForum")
	public String deleteForum(@RequestParam Integer idKey) {
		Forum forum = forumDAO.findForumByPrimaryKey(idKey);
		forumService.deleteForum(forum);
		return "forward:/indexForum";
	}

	/**
	* Create a new Forum entity
	* 
	*/
	@RequestMapping("/newForum")
	public ModelAndView newForum() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", new Forum());
		mav.addObject("newFlag", true);
		mav.setViewName("forum/editForum.jsp");

		return mav;
	}

	/**
	* Edit an existing Forum entity
	* 
	*/
	@RequestMapping("/editForum")
	public ModelAndView editForum(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(idKey));
		mav.setViewName("forum/editForum.jsp");

		return mav;
	}

	/**
	* Show all Forum entities
	* 
	*/
	@RequestMapping("/indexForum")
	public ModelAndView listForums() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forums", forumService.loadForums());

		mav.setViewName("forum/listForums.jsp");

		return mav;
	}

	/**
	* Select the Forum entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteForum")
	public ModelAndView confirmDeleteForum(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(idKey));
		mav.setViewName("forum/deleteForum.jsp");

		return mav;
	}

	/**
	* Save an existing Forum entity
	* 
	*/
	@RequestMapping("/saveForum")
	public String saveForum(@ModelAttribute Forum forum) {
		forumService.saveForum(forum);
		return "forward:/indexForum";
	}

	/**
	*/
	@RequestMapping("/forumController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
	* Select an existing Forum entity
	* 
	*/
	@RequestMapping("/selectForum")
	public ModelAndView selectForum(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(idKey));
		mav.setViewName("forum/viewForum.jsp");

		return mav;
	}
}