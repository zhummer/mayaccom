package com.mayaccom.web;

import com.mayaccom.dao.BlogDAO;
import com.mayaccom.dao.BlogcommentDAO;
import com.mayaccom.dao.PersonDAO;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogcomment;
import com.mayaccom.domain.Person;

import com.mayaccom.service.PersonService;

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
 * Spring MVC controller that handles CRUD requests for Person entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/.properties.webcontroller]
 * @generated
 */

@Controller("PersonController")

public class PersonController {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/.properties.webcontroller#//@variables%5Bname='blogDAO'%5D]
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * DAO injected by Spring that manages Blogcomment entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/.properties.webcontroller#//@variables%5Bname='blogcommentDAO'%5D]
	 */
	@Autowired
	private BlogcommentDAO blogcommentDAO;

	/**
	 * DAO injected by Spring that manages Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/.properties.webcontroller#//@variables%5Bname='personDAO'%5D]
	 */
	@Autowired
	private PersonDAO personDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/.properties.webcontroller#//@variables%5Bname='personService'%5D]
	 */
	@Autowired
	private PersonService personService;

	/**
	 * Save an existing Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/savePerson%7B46861693-af50-44ab-b176-9ecd9257e73b%7D/.properties.swoperation]
	 */
	@RequestMapping("/savePerson")
	public String savePerson(@ModelAttribute Person person) {
		personService.savePerson(person);
		return "forward:/indexPerson";
	}

	/**
	* Select the Person entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/confirmDeletePerson%7B3d77b916-92e5-4393-9d52-6778a03f8809%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeletePerson")
	public ModelAndView confirmDeletePerson(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("person", personDAO.findPersonByPrimaryKey(idKey));
		mav.setViewName("person/deletePerson.jsp");

		return mav;
	}

	/**
	* Delete an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/deletePersonBlogs%7B7b76b55a-04bb-4f95-8abc-885352da3bd3%7D/.properties.swoperation]
	*/
	@RequestMapping("/deletePersonBlogs")
	public ModelAndView deletePersonBlogs(@RequestParam Integer person_id, @RequestParam Integer related_blogs_id) {
		ModelAndView mav = new ModelAndView();

		Person person = personService.deletePersonBlogs(person_id, related_blogs_id);

		mav.addObject("person_id", person_id);
		mav.addObject("person", person);
		mav.setViewName("person/viewPerson.jsp");

		return mav;
	}

	/**
	* Show all Person entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/listPersons%7B9b7ddccc-d310-49c7-bc2f-60b3c95a82fb%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexPerson")
	public ModelAndView listPersons() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("persons", personService.loadPersons());

		mav.setViewName("person/listPersons.jsp");

		return mav;
	}

	/**
	* Delete an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/deletePerson%7B9da07be2-f64b-40d7-b9ff-e29fcbd57b46%7D/.properties.swoperation]
	*/
	@RequestMapping("/deletePerson")
	public String deletePerson(@RequestParam Integer idKey) {
		Person person = personDAO.findPersonByPrimaryKey(idKey);
		personService.deletePerson(person);
		return "forward:/indexPerson";
	}

	/**
	* Edit an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/editPersonBlogcomments%7B93ef2559-30d9-47ba-bbf2-4c979a43a062%7D/.properties.swoperation]
	*/
	@RequestMapping("/editPersonBlogcomments")
	public ModelAndView editPersonBlogcomments(@RequestParam Integer person_id, @RequestParam Integer blogcomments_id) {
		Blogcomment blogcomment = blogcommentDAO.findBlogcommentByPrimaryKey(blogcomments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("blogcomment", blogcomment);
		mav.setViewName("person/blogcomments/editBlogcomments.jsp");

		return mav;
	}

	/**
	* Create a new Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/newPersonBlogcomments%7Bc1d48e37-5fa6-420a-9a4b-10441db0ef20%7D/.properties.swoperation]
	*/
	@RequestMapping("/newPersonBlogcomments")
	public ModelAndView newPersonBlogcomments(@RequestParam Integer person_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("blogcomment", new Blogcomment());
		mav.addObject("newFlag", true);
		mav.setViewName("person/blogcomments/editBlogcomments.jsp");

		return mav;
	}

	/**
	* Select an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/selectPerson%7B9188295f-8802-4d4a-8a30-7ba42b6dda1d%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectPerson")
	public ModelAndView selectPerson(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("person", personDAO.findPersonByPrimaryKey(idKey));
		mav.setViewName("person/viewPerson.jsp");

		return mav;
	}

	/**
	* Save an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/savePersonBlogs%7Bc67cf1b2-2d7a-4c45-a50a-3270425b68db%7D/.properties.swoperation]
	*/
	@RequestMapping("/savePersonBlogs")
	public ModelAndView savePersonBlogs(@RequestParam Integer person_id, @ModelAttribute Blog blogs) {
		Person parent_person = personService.savePersonBlogs(person_id, blogs);

		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("person", parent_person);
		mav.setViewName("person/viewPerson.jsp");

		return mav;
	}

	/**
	* Entry point to show all Person entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/indexPerson%7B420a714e-45d6-47ff-9125-a7ffafb245df%7D/.properties.swoperation]
	*/
	public String indexPerson() {
		return "redirect:/indexPerson";
	}

	/**
	* Delete an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/deletePersonBlogcomments%7Bb9aa0105-8228-452c-80f9-30b9d3e811c5%7D/.properties.swoperation]
	*/
	@RequestMapping("/deletePersonBlogcomments")
	public ModelAndView deletePersonBlogcomments(@RequestParam Integer person_id, @RequestParam Integer related_blogcomments_id) {
		ModelAndView mav = new ModelAndView();

		Person person = personService.deletePersonBlogcomments(person_id, related_blogcomments_id);

		mav.addObject("person_id", person_id);
		mav.addObject("person", person);
		mav.setViewName("person/viewPerson.jsp");

		return mav;
	}

	/**
	* Edit an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/editPerson%7Bdb29f236-312c-4467-8f49-ee120854a5d9%7D/.properties.swoperation]
	*/
	@RequestMapping("/editPerson")
	public ModelAndView editPerson(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("person", personDAO.findPersonByPrimaryKey(idKey));
		mav.setViewName("person/editPerson.jsp");

		return mav;
	}

	/**
	* View an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/selectPersonBlogcomments%7B7f65226e-8d38-46a2-99e5-58fd6cbb643a%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectPersonBlogcomments")
	public ModelAndView selectPersonBlogcomments(@RequestParam Integer person_id, @RequestParam Integer blogcomments_id) {
		Blogcomment blogcomment = blogcommentDAO.findBlogcommentByPrimaryKey(blogcomments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("blogcomment", blogcomment);
		mav.setViewName("person/blogcomments/viewBlogcomments.jsp");

		return mav;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/initBinder%7Bbb8b2301-6206-4303-9428-0d05467977b2%7D/.properties.swoperation]
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
	* Select the child Blogcomment entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/confirmDeletePersonBlogcomments%7Bf040aa71-5c51-432d-ac9d-c31366acfd9b%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeletePersonBlogcomments")
	public ModelAndView confirmDeletePersonBlogcomments(@RequestParam Integer person_id, @RequestParam Integer related_blogcomments_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blogcomment", blogcommentDAO.findBlogcommentByPrimaryKey(related_blogcomments_id));
		mav.addObject("person_id", person_id);
		mav.setViewName("person/blogcomments/deleteBlogcomments.jsp");

		return mav;
	}

	/**
	* Edit an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/editPersonBlogs%7B31c875eb-e6ce-40f0-b741-33b3fd7af8c1%7D/.properties.swoperation]
	*/
	@RequestMapping("/editPersonBlogs")
	public ModelAndView editPersonBlogs(@RequestParam Integer person_id, @RequestParam Integer blogs_id) {
		Blog blog = blogDAO.findBlogByPrimaryKey(blogs_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("blog", blog);
		mav.setViewName("person/blogs/editBlogs.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/streamBinary%7Be18025c7-0458-4545-9d7d-8d964a66bfa6%7D/.properties.swoperation]
	*/
	@RequestMapping("/personController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Show all Blog entities by Person
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/listPersonBlogs%7B49d6a41d-42b4-4e90-8642-a5e86e08f4dd%7D/.properties.swoperation]
	*/
	@RequestMapping("/listPersonBlogs")
	public ModelAndView listPersonBlogs(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("person", personDAO.findPersonByPrimaryKey(idKey));
		mav.setViewName("person/blogs/listBlogs.jsp");

		return mav;
	}

	/**
	* View an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/selectPersonBlogs%7Bdf416dca-0a89-4ec6-9681-dad9797f1026%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectPersonBlogs")
	public ModelAndView selectPersonBlogs(@RequestParam Integer person_id, @RequestParam Integer blogs_id) {
		Blog blog = blogDAO.findBlogByPrimaryKey(blogs_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("blog", blog);
		mav.setViewName("person/blogs/viewBlogs.jsp");

		return mav;
	}

	/**
	* Save an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/savePersonBlogcomments%7Bc46023b3-f9da-4e95-9609-bbab0f96aaa6%7D/.properties.swoperation]
	*/
	@RequestMapping("/savePersonBlogcomments")
	public ModelAndView savePersonBlogcomments(@RequestParam Integer person_id, @ModelAttribute Blogcomment blogcomments) {
		Person parent_person = personService.savePersonBlogcomments(person_id, blogcomments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("person", parent_person);
		mav.setViewName("person/viewPerson.jsp");

		return mav;
	}

	/**
	* Show all Blogcomment entities by Person
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/listPersonBlogcomments%7B99d96ef0-a32a-4d4e-a1a9-9717d0ffb414%7D/.properties.swoperation]
	*/
	@RequestMapping("/listPersonBlogcomments")
	public ModelAndView listPersonBlogcomments(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("person", personDAO.findPersonByPrimaryKey(idKey));
		mav.setViewName("person/blogcomments/listBlogcomments.jsp");

		return mav;
	}

	/**
	* Create a new Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/newPersonBlogs%7Bfe4b50a6-b43a-4586-a3a5-f131ad783e17%7D/.properties.swoperation]
	*/
	@RequestMapping("/newPersonBlogs")
	public ModelAndView newPersonBlogs(@RequestParam Integer person_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("person_id", person_id);
		mav.addObject("blog", new Blog());
		mav.addObject("newFlag", true);
		mav.setViewName("person/blogs/editBlogs.jsp");

		return mav;
	}

	/**
	* Create a new Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/newPerson%7B7d552e4a-69e9-4dea-ba16-0b0ad5597ceb%7D/.properties.swoperation]
	*/
	@RequestMapping("/newPerson")
	public ModelAndView newPerson() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("person", new Person());
		mav.addObject("newFlag", true);
		mav.setViewName("person/editPerson.jsp");

		return mav;
	}

	/**
	* Select the child Blog entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PersonController/confirmDeletePersonBlogs%7B761e256c-9b0a-4060-9f21-d31339012996%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeletePersonBlogs")
	public ModelAndView confirmDeletePersonBlogs(@RequestParam Integer person_id, @RequestParam Integer related_blogs_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(related_blogs_id));
		mav.addObject("person_id", person_id);
		mav.setViewName("person/blogs/deleteBlogs.jsp");

		return mav;
	}
}