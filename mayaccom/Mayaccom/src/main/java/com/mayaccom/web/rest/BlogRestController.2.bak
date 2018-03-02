package com.mayaccom.web.rest;

import com.mayaccom.dao.BlogDAO;
import com.mayaccom.dao.BlogpostDAO;
import com.mayaccom.dao.PersonDAO;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogpost;
import com.mayaccom.domain.Person;

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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/.properties.webcontroller]
 * @generated
 */

@Controller("BlogRestController")

public class BlogRestController {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/.properties.webcontroller#//@variables%5Bname='blogDAO'%5D]
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * DAO injected by Spring that manages Blogpost entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/.properties.webcontroller#//@variables%5Bname='blogpostDAO'%5D]
	 */
	@Autowired
	private BlogpostDAO blogpostDAO;

	/**
	 * DAO injected by Spring that manages Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/.properties.webcontroller#//@variables%5Bname='personDAO'%5D]
	 */
	@Autowired
	private PersonDAO personDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/.properties.webcontroller#//@variables%5Bname='blogService'%5D]
	 */
	@Autowired
	private BlogService blogService;

	/**
	 * Show all Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/listBlogs%7Bcd2a6008-9b06-417a-9fbf-48582eb7a704%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Blog", method = RequestMethod.GET)
	@ResponseBody
	public List<Blog> listBlogs() {
		return new java.util.ArrayList<Blog>(blogService.loadBlogs());
	}

	/**
	* Create a new Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/newBlogBlogposts%7B182bcb88-df4b-41ae-b22d-50058eee1e58%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/blogposts", method = RequestMethod.POST)
	@ResponseBody
	public Blogpost newBlogBlogposts(@PathVariable Integer blog_id, @RequestBody Blogpost blogpost) {
		blogService.saveBlogBlogposts(blog_id, blogpost);
		return blogpostDAO.findBlogpostByPrimaryKey(blogpost.getId());
	}

	/**
	* Save an existing Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/saveBlogBlogposts%7B026828d2-2d93-4fdd-b6e9-16f2f7a0fd31%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/blogposts", method = RequestMethod.PUT)
	@ResponseBody
	public Blogpost saveBlogBlogposts(@PathVariable Integer blog_id, @RequestBody Blogpost blogposts) {
		blogService.saveBlogBlogposts(blog_id, blogposts);
		return blogpostDAO.findBlogpostByPrimaryKey(blogposts.getId());
	}

	/**
	* Delete an existing Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/deleteBlogBlogposts%7Bca0c3f2a-114c-4a38-a859-3c5b9876129f%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/blogposts/{blogpost_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBlogBlogposts(@PathVariable Integer blog_id, @PathVariable Integer related_blogposts_id) {
		blogService.deleteBlogBlogposts(blog_id, related_blogposts_id);
	}

	/**
	* Get Person entity by Blog
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/getBlogPerson%7B09c91878-681f-4de2-a620-6451ceadee41%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/person", method = RequestMethod.GET)
	@ResponseBody
	public Person getBlogPerson(@PathVariable Integer blog_id) {
		return blogDAO.findBlogByPrimaryKey(blog_id).getPerson();
	}

	/**
	* Save an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/saveBlog%7B3b363bf4-202e-4eff-aac4-99b43da9911c%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog", method = RequestMethod.PUT)
	@ResponseBody
	public Blog saveBlog(@RequestBody Blog blog) {
		blogService.saveBlog(blog);
		return blogDAO.findBlogByPrimaryKey(blog.getId());
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/initBinder%7Be2b22d40-a6f8-44d2-89a9-455763577cdc%7D/.properties.swoperation]
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
	* Delete an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/deleteBlog%7Bcb1ec4bf-0ddf-45df-a28e-a53535070490%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBlog(@PathVariable Integer blog_id) {
		Blog blog = blogDAO.findBlogByPrimaryKey(blog_id);
		blogService.deleteBlog(blog);
	}

	/**
	* Create a new Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/newBlogPerson%7B4e17c8da-7e1b-4912-8eb6-e7ef0744c3d6%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/person", method = RequestMethod.POST)
	@ResponseBody
	public Person newBlogPerson(@PathVariable Integer blog_id, @RequestBody Person person) {
		blogService.saveBlogPerson(blog_id, person);
		return personDAO.findPersonByPrimaryKey(person.getId());
	}

	/**
	* View an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/loadBlogPerson%7B8abaa88a-cff6-4811-8354-20071ec00124%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/person/{person_id}", method = RequestMethod.GET)
	@ResponseBody
	public Person loadBlogPerson(@PathVariable Integer blog_id, @PathVariable Integer related_person_id) {
		Person person = personDAO.findPersonByPrimaryKey(related_person_id, -1, -1);

		return person;
	}

	/**
	* Save an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/saveBlogPerson%7B2b152d48-671c-4ba6-b54b-93cbe2af0b5a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/person", method = RequestMethod.PUT)
	@ResponseBody
	public Person saveBlogPerson(@PathVariable Integer blog_id, @RequestBody Person person) {
		blogService.saveBlogPerson(blog_id, person);
		return personDAO.findPersonByPrimaryKey(person.getId());
	}

	/**
	* View an existing Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/loadBlogBlogposts%7Bb0fcaac3-9fde-41c8-85ea-14fcebf6600a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/blogposts/{blogpost_id}", method = RequestMethod.GET)
	@ResponseBody
	public Blogpost loadBlogBlogposts(@PathVariable Integer blog_id, @PathVariable Integer related_blogposts_id) {
		Blogpost blogpost = blogpostDAO.findBlogpostByPrimaryKey(related_blogposts_id, -1, -1);

		return blogpost;
	}

	/**
	* Select an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/loadBlog%7B6ba9f8f3-9ef0-4987-9bc4-e9d6a5146e43%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}", method = RequestMethod.GET)
	@ResponseBody
	public Blog loadBlog(@PathVariable Integer blog_id) {
		return blogDAO.findBlogByPrimaryKey(blog_id);
	}

	/**
	* Show all Blogpost entities by Blog
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/getBlogBlogposts%7Bc13c5278-14b6-4618-8ed3-c512a98e59cb%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/blogposts", method = RequestMethod.GET)
	@ResponseBody
	public List<Blogpost> getBlogBlogposts(@PathVariable Integer blog_id) {
		return new java.util.ArrayList<Blogpost>(blogDAO.findBlogByPrimaryKey(blog_id).getBlogposts());
	}

	/**
	* Create a new Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/newBlog%7Bcc31248e-80b6-4add-b62d-59dbffe60239%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog", method = RequestMethod.POST)
	@ResponseBody
	public Blog newBlog(@RequestBody Blog blog) {
		blogService.saveBlog(blog);
		return blogDAO.findBlogByPrimaryKey(blog.getId());
	}

	/**
	* Delete an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/BlogRestController/deleteBlogPerson%7Baefee80a-3e74-41cf-bdc8-6295f613f70a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Blog/{blog_id}/person/{person_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBlogPerson(@PathVariable Integer blog_id, @PathVariable Integer related_person_id) {
		blogService.deleteBlogPerson(blog_id, related_person_id);
	}
}