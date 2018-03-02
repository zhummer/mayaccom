package com.mayaccom.web.rest;

import com.mayaccom.dao.BlogDAO;
import com.mayaccom.dao.BlogcommentDAO;
import com.mayaccom.dao.PersonDAO;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogcomment;
import com.mayaccom.domain.Person;

import com.mayaccom.service.PersonService;

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
 * Spring Rest controller that handles CRUD requests for Person entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/.properties.webcontroller]
 * @generated
 */

@Controller("PersonRestController")

public class PersonRestController {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/.properties.webcontroller#//@variables%5Bname='blogDAO'%5D]
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * DAO injected by Spring that manages Blogcomment entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/.properties.webcontroller#//@variables%5Bname='blogcommentDAO'%5D]
	 */
	@Autowired
	private BlogcommentDAO blogcommentDAO;

	/**
	 * DAO injected by Spring that manages Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/.properties.webcontroller#//@variables%5Bname='personDAO'%5D]
	 */
	@Autowired
	private PersonDAO personDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/.properties.webcontroller#//@variables%5Bname='personService'%5D]
	 */
	@Autowired
	private PersonService personService;

	/**
	 * Save an existing Blogcomment entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/savePersonBlogcomments%7B20dd2a84-cc07-49ff-908e-d020a9e24189%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Person/{person_id}/blogcomments", method = RequestMethod.PUT)
	@ResponseBody
	public Blogcomment savePersonBlogcomments(@PathVariable Integer person_id, @RequestBody Blogcomment blogcomments) {
		personService.savePersonBlogcomments(person_id, blogcomments);
		return blogcommentDAO.findBlogcommentByPrimaryKey(blogcomments.getId());
	}

	/**
	* Save an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/savePerson%7B3f6a0558-b30f-46c1-9b02-0f5e33febf9b%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person", method = RequestMethod.PUT)
	@ResponseBody
	public Person savePerson(@RequestBody Person person) {
		personService.savePerson(person);
		return personDAO.findPersonByPrimaryKey(person.getId());
	}

	/**
	* View an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/loadPersonBlogcomments%7Bfb1fbce4-5ddb-4d27-821a-9d607a0df90d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogcomments/{blogcomment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Blogcomment loadPersonBlogcomments(@PathVariable Integer person_id, @PathVariable Integer related_blogcomments_id) {
		Blogcomment blogcomment = blogcommentDAO.findBlogcommentByPrimaryKey(related_blogcomments_id, -1, -1);

		return blogcomment;
	}

	/**
	* Save an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/savePersonBlogs%7B708c0a01-2469-4045-9e17-09d47856da2f%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogs", method = RequestMethod.PUT)
	@ResponseBody
	public Blog savePersonBlogs(@PathVariable Integer person_id, @RequestBody Blog blogs) {
		personService.savePersonBlogs(person_id, blogs);
		return blogDAO.findBlogByPrimaryKey(blogs.getId());
	}

	/**
	* View an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/loadPersonBlogs%7B68e36141-ceb7-47a9-93e2-e93be2c9a021%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogs/{blog_id}", method = RequestMethod.GET)
	@ResponseBody
	public Blog loadPersonBlogs(@PathVariable Integer person_id, @PathVariable Integer related_blogs_id) {
		Blog blog = blogDAO.findBlogByPrimaryKey(related_blogs_id, -1, -1);

		return blog;
	}

	/**
	* Delete an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/deletePersonBlogs%7B33fd3282-dbaf-44c7-92d6-bbc39c2291b4%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogs/{blog_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePersonBlogs(@PathVariable Integer person_id, @PathVariable Integer related_blogs_id) {
		personService.deletePersonBlogs(person_id, related_blogs_id);
	}

	/**
	* Create a new Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/newPerson%7B58621e51-244d-4583-87c8-1328025ba869%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person", method = RequestMethod.POST)
	@ResponseBody
	public Person newPerson(@RequestBody Person person) {
		personService.savePerson(person);
		return personDAO.findPersonByPrimaryKey(person.getId());
	}

	/**
	* Delete an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/deletePerson%7B43b55737-016c-44f2-9fc3-1e3ddaa3d71d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePerson(@PathVariable Integer person_id) {
		Person person = personDAO.findPersonByPrimaryKey(person_id);
		personService.deletePerson(person);
	}

	/**
	* Delete an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/deletePersonBlogcomments%7B4234c40d-55fd-44ed-ac38-634e0cd96ec2%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogcomments/{blogcomment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePersonBlogcomments(@PathVariable Integer person_id, @PathVariable Integer related_blogcomments_id) {
		personService.deletePersonBlogcomments(person_id, related_blogcomments_id);
	}

	/**
	* Show all Blog entities by Person
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/getPersonBlogs%7Bdc33100f-944e-4a2b-8fc2-459a2e232c59%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogs", method = RequestMethod.GET)
	@ResponseBody
	public List<Blog> getPersonBlogs(@PathVariable Integer person_id) {
		return new java.util.ArrayList<Blog>(personDAO.findPersonByPrimaryKey(person_id).getBlogs());
	}

	/**
	* Create a new Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/newPersonBlogs%7B3d63448e-468e-4877-93c0-58dd94053490%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogs", method = RequestMethod.POST)
	@ResponseBody
	public Blog newPersonBlogs(@PathVariable Integer person_id, @RequestBody Blog blog) {
		personService.savePersonBlogs(person_id, blog);
		return blogDAO.findBlogByPrimaryKey(blog.getId());
	}

	/**
	* Show all Person entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/listPersons%7B08dd1c80-a354-4b33-8125-a769c41166ab%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person", method = RequestMethod.GET)
	@ResponseBody
	public List<Person> listPersons() {
		return new java.util.ArrayList<Person>(personService.loadPersons());
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/initBinder%7Bd77340cb-2e0f-4053-8df7-ddff745fefb9%7D/.properties.swoperation]
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
	* Show all Blogcomment entities by Person
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/getPersonBlogcomments%7Bd5cff747-11dd-4ceb-9bd2-b82f4f1097bb%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogcomments", method = RequestMethod.GET)
	@ResponseBody
	public List<Blogcomment> getPersonBlogcomments(@PathVariable Integer person_id) {
		return new java.util.ArrayList<Blogcomment>(personDAO.findPersonByPrimaryKey(person_id).getBlogcomments());
	}

	/**
	* Select an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/loadPerson%7Ba8654f1b-63f2-4f46-9d90-144291c1f938%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}", method = RequestMethod.GET)
	@ResponseBody
	public Person loadPerson(@PathVariable Integer person_id) {
		return personDAO.findPersonByPrimaryKey(person_id);
	}

	/**
	* Create a new Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PersonRestController/newPersonBlogcomments%7B3d742dce-6aa5-410f-be4f-a8e404cb4c32%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Person/{person_id}/blogcomments", method = RequestMethod.POST)
	@ResponseBody
	public Blogcomment newPersonBlogcomments(@PathVariable Integer person_id, @RequestBody Blogcomment blogcomment) {
		personService.savePersonBlogcomments(person_id, blogcomment);
		return blogcommentDAO.findBlogcommentByPrimaryKey(blogcomment.getId());
	}
}