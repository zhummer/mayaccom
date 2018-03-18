package com.mayaccom.web;

import com.mayaccom.dao.BlogDAO;

import com.mayaccom.domain.Blog;

import com.mayaccom.service.BlogService;

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
 * Spring MVC controller that handles CRUD requests for Blog entities
 * 
 */

@Controller("BlogController")

public class BlogController {

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
	 * Select the Blog entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBlog")
	public ModelAndView confirmDeleteBlog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/deleteBlog.jsp");

		return mav;
	}

	/**
	* Entry point to show all Blog entities
	* 
	*/
	public String indexBlog() {
		return "redirect:/indexBlog";
	}

	/**
	* Delete an existing Blog entity
	* 
	*/
	@RequestMapping("/deleteBlog")
	public String deleteBlog(@RequestParam Integer idKey) {
		Blog blog = blogDAO.findBlogByPrimaryKey(idKey);
		blogService.deleteBlog(blog);
		return "forward:/indexBlog";
	}

	/**
	* Select an existing Blog entity
	* 
	*/
	@RequestMapping("/selectBlog")
	public ModelAndView selectBlog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/viewBlog.jsp");

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
	* Show all Blog entities
	* 
	*/
	@RequestMapping("/indexBlog")
	public ModelAndView listBlogs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blogs", blogService.loadBlogs());

		mav.setViewName("blog/listBlogs.jsp");

		return mav;
	}

	/**
	* Save an existing Blog entity
	* 
	*/
	@RequestMapping("/saveBlog")
	public String saveBlog(@ModelAttribute Blog blog) {
		blogService.saveBlog(blog);
		return "forward:/indexBlog";
	}

	/**
	* Create a new Blog entity
	* 
	*/
	@RequestMapping("/newBlog")
	public ModelAndView newBlog() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", new Blog());
		mav.addObject("newFlag", true);
		mav.setViewName("blog/editBlog.jsp");

		return mav;
	}

	/**
	* Edit an existing Blog entity
	* 
	*/
	@RequestMapping("/editBlog")
	public ModelAndView editBlog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/editBlog.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/blogController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}