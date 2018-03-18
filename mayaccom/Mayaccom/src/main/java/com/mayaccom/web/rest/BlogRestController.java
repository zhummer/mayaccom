package com.mayaccom.web.rest;

import com.mayaccom.dao.BlogDAO;

import com.mayaccom.domain.Blog;

import com.mayaccom.service.BlogService;

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
 * Spring Rest controller that handles CRUD requests for Blog entities
 * 
 */

@Controller("BlogRestController")

public class BlogRestController {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Blog entities
	 * 
	 */
	@Autowired
	private BlogService blogService;

	/**
	 * Save an existing Blog entity
	 * 
	 */
	@RequestMapping(value = "/Blog", method = RequestMethod.PUT)
	@ResponseBody
	public Blog saveBlog(@RequestBody Blog blog) {
		blogService.saveBlog(blog);
		return blogDAO.findBlogByPrimaryKey(blog.getId());
	}

	/**
	* Delete an existing Blog entity
	* 
	*/
	@RequestMapping(value = "/Blog/{blog_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBlog(@PathVariable Integer blog_id) {
		Blog blog = blogDAO.findBlogByPrimaryKey(blog_id);
		blogService.deleteBlog(blog);
	}

	/**
	* Select an existing Blog entity
	* 
	*/
	@RequestMapping(value = "/Blog/{blog_id}", method = RequestMethod.GET)
	@ResponseBody
	public Blog loadBlog(@PathVariable Integer blog_id) {
		return blogDAO.findBlogByPrimaryKey(blog_id);
	}

	/**
	* Create a new Blog entity
	* 
	*/
	@RequestMapping(value = "/Blog", method = RequestMethod.POST)
	@ResponseBody
	public Blog newBlog(@RequestBody Blog blog) {
		blogService.saveBlog(blog);
		return blogDAO.findBlogByPrimaryKey(blog.getId());
	}

	/**
	* Show all Blog entities
	* 
	*/
	@RequestMapping(value = "/Blog", method = RequestMethod.GET)
	@ResponseBody
	public List<Blog> listBlogs() {
		return new java.util.ArrayList<Blog>(blogService.loadBlogs());
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
}