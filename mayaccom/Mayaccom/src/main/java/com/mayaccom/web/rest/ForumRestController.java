package com.mayaccom.web.rest;

import com.mayaccom.dao.ForumDAO;

import com.mayaccom.domain.Forum;

import com.mayaccom.service.ForumService;

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
 * Spring Rest controller that handles CRUD requests for Forum entities
 * 
 */

@Controller("ForumRestController")

public class ForumRestController {

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
	 * Delete an existing Forum entity
	 * 
	 */
	@RequestMapping(value = "/Forum/{forum_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteForum(@PathVariable Integer forum_id) {
		Forum forum = forumDAO.findForumByPrimaryKey(forum_id);
		forumService.deleteForum(forum);
	}

	/**
	* Create a new Forum entity
	* 
	*/
	@RequestMapping(value = "/Forum", method = RequestMethod.POST)
	@ResponseBody
	public Forum newForum(@RequestBody Forum forum) {
		forumService.saveForum(forum);
		return forumDAO.findForumByPrimaryKey(forum.getId());
	}

	/**
	* Select an existing Forum entity
	* 
	*/
	@RequestMapping(value = "/Forum/{forum_id}", method = RequestMethod.GET)
	@ResponseBody
	public Forum loadForum(@PathVariable Integer forum_id) {
		return forumDAO.findForumByPrimaryKey(forum_id);
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
	* Show all Forum entities
	* 
	*/
	@RequestMapping(value = "/Forum", method = RequestMethod.GET)
	@ResponseBody
	public List<Forum> listForums() {
		return new java.util.ArrayList<Forum>(forumService.loadForums());
	}

	/**
	* Save an existing Forum entity
	* 
	*/
	@RequestMapping(value = "/Forum", method = RequestMethod.PUT)
	@ResponseBody
	public Forum saveForum(@RequestBody Forum forum) {
		forumService.saveForum(forum);
		return forumDAO.findForumByPrimaryKey(forum.getId());
	}
}