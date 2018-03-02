package com.mayaccom.web;

import com.mayaccom.dao.BlogDAO;
import com.mayaccom.dao.BlogpostDAO;
import com.mayaccom.dao.PersonDAO;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogpost;
import com.mayaccom.domain.Person;

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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/.properties.webcontroller]
 * @generated
 */

@Controller("BlogController")

public class BlogController {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/.properties.webcontroller#//@variables%5Bname='blogDAO'%5D]
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * DAO injected by Spring that manages Blogpost entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/.properties.webcontroller#//@variables%5Bname='blogpostDAO'%5D]
	 */
	@Autowired
	private BlogpostDAO blogpostDAO;

	/**
	 * DAO injected by Spring that manages Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/.properties.webcontroller#//@variables%5Bname='personDAO'%5D]
	 */
	@Autowired
	private PersonDAO personDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/.properties.webcontroller#//@variables%5Bname='blogService'%5D]
	 */
	@Autowired
	private BlogService blogService;

	/**
	 * Delete an existing Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/deleteBlogPerson%7B78edb3c4-9dba-4f12-9d43-70e8869a7db0%7D/.properties.swoperation]
	 */
	@RequestMapping("/deleteBlogPerson")
	public ModelAndView deleteBlogPerson(@RequestParam Integer blog_id, @RequestParam Integer related_person_id) {
		ModelAndView mav = new ModelAndView();

		Blog blog = blogService.deleteBlogPerson(blog_id, related_person_id);

		mav.addObject("blog_id", blog_id);
		mav.addObject("blog", blog);
		mav.setViewName("blog/viewBlog.jsp");

		return mav;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/initBinder%7B5117c111-0e3f-452c-a301-b71719acd92e%7D/.properties.swoperation]
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
	* Entry point to show all Blog entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/indexBlog%7Be53526f6-f677-4f80-9fae-d78c7d252a08%7D/.properties.swoperation]
	*/
	public String indexBlog() {
		return "redirect:/indexBlog";
	}

	/**
	* Edit an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/editBlog%7B19ae7754-bf9c-4292-84c9-f034f5131a8e%7D/.properties.swoperation]
	*/
	@RequestMapping("/editBlog")
	public ModelAndView editBlog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/editBlog.jsp");

		return mav;
	}

	/**
	* Save an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/saveBlog%7B16906e63-380f-4daa-9700-693c116f1cd4%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveBlog")
	public String saveBlog(@ModelAttribute Blog blog) {
		blogService.saveBlog(blog);
		return "forward:/indexBlog";
	}

	/**
	* View an existing Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/selectBlogBlogposts%7Baf6da985-9d32-4502-8e6b-5363166ca447%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectBlogBlogposts")
	public ModelAndView selectBlogBlogposts(@RequestParam Integer blog_id, @RequestParam Integer blogposts_id) {
		Blogpost blogpost = blogpostDAO.findBlogpostByPrimaryKey(blogposts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("blogpost", blogpost);
		mav.setViewName("blog/blogposts/viewBlogposts.jsp");

		return mav;
	}

	/**
	* Save an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/saveBlogPerson%7Bba858c96-acfd-4c48-ac6f-9b30d9706881%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveBlogPerson")
	public ModelAndView saveBlogPerson(@RequestParam Integer blog_id, @ModelAttribute Person person) {
		Blog parent_blog = blogService.saveBlogPerson(blog_id, person);

		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("blog", parent_blog);
		mav.setViewName("blog/viewBlog.jsp");

		return mav;
	}

	/**
	* Edit an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/editBlogPerson%7Bb8465149-5fad-49bb-942c-f22742784a32%7D/.properties.swoperation]
	*/
	@RequestMapping("/editBlogPerson")
	public ModelAndView editBlogPerson(@RequestParam Integer blog_id, @RequestParam Integer person_id) {
		Person person = personDAO.findPersonByPrimaryKey(person_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("person", person);
		mav.setViewName("blog/person/editPerson.jsp");

		return mav;
	}

	/**
	* Show all Person entities by Blog
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/listBlogPerson%7B2a6a9063-9a4b-44d5-812a-187ab12a2e2c%7D/.properties.swoperation]
	*/
	@RequestMapping("/listBlogPerson")
	public ModelAndView listBlogPerson(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/person/listPerson.jsp");

		return mav;
	}

	/**
	* Delete an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/deleteBlog%7B0225a1dd-bc07-4458-a57d-81138b946aad%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteBlog")
	public String deleteBlog(@RequestParam Integer idKey) {
		Blog blog = blogDAO.findBlogByPrimaryKey(idKey);
		blogService.deleteBlog(blog);
		return "forward:/indexBlog";
	}

	/**
	* Show all Blogpost entities by Blog
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/listBlogBlogposts%7B0b4d3a6a-b173-4831-abbf-0503bd40b190%7D/.properties.swoperation]
	*/
	@RequestMapping("/listBlogBlogposts")
	public ModelAndView listBlogBlogposts(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/blogposts/listBlogposts.jsp");

		return mav;
	}

	/**
	* Select the child Person entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/confirmDeleteBlogPerson%7B74617537-5395-4b97-ba73-1e13801d6272%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteBlogPerson")
	public ModelAndView confirmDeleteBlogPerson(@RequestParam Integer blog_id, @RequestParam Integer related_person_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("person", personDAO.findPersonByPrimaryKey(related_person_id));
		mav.addObject("blog_id", blog_id);
		mav.setViewName("blog/person/deletePerson.jsp");

		return mav;
	}

	/**
	* Edit an existing Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/editBlogBlogposts%7B7e0ec732-f937-4d0f-8e42-13298832579c%7D/.properties.swoperation]
	*/
	@RequestMapping("/editBlogBlogposts")
	public ModelAndView editBlogBlogposts(@RequestParam Integer blog_id, @RequestParam Integer blogposts_id) {
		Blogpost blogpost = blogpostDAO.findBlogpostByPrimaryKey(blogposts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("blogpost", blogpost);
		mav.setViewName("blog/blogposts/editBlogposts.jsp");

		return mav;
	}

	/**
	* View an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/selectBlogPerson%7B58cab908-854b-40b9-8afb-cf9a6e6472be%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectBlogPerson")
	public ModelAndView selectBlogPerson(@RequestParam Integer blog_id, @RequestParam Integer person_id) {
		Person person = personDAO.findPersonByPrimaryKey(person_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("person", person);
		mav.setViewName("blog/person/viewPerson.jsp");

		return mav;
	}

	/**
	* Create a new Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/newBlog%7Bac1fa321-283d-46f1-8a6a-1db13e65eef1%7D/.properties.swoperation]
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
	* Select the child Blogpost entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/confirmDeleteBlogBlogposts%7Bc36c2d88-566d-45c1-9175-83acf3f69e6e%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteBlogBlogposts")
	public ModelAndView confirmDeleteBlogBlogposts(@RequestParam Integer blog_id, @RequestParam Integer related_blogposts_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blogpost", blogpostDAO.findBlogpostByPrimaryKey(related_blogposts_id));
		mav.addObject("blog_id", blog_id);
		mav.setViewName("blog/blogposts/deleteBlogposts.jsp");

		return mav;
	}

	/**
	* Select an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/selectBlog%7B67c962e7-06ea-4629-aff5-ad85be701b6b%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectBlog")
	public ModelAndView selectBlog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/viewBlog.jsp");

		return mav;
	}

	/**
	* Show all Blog entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/listBlogs%7Bc8a911e5-de1a-403b-a1c9-cca64abf8bb3%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexBlog")
	public ModelAndView listBlogs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blogs", blogService.loadBlogs());

		mav.setViewName("blog/listBlogs.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/streamBinary%7B86f7a117-6166-46b6-b38d-6e4cf67f4cb4%7D/.properties.swoperation]
	*/
	@RequestMapping("/blogController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select the Blog entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/confirmDeleteBlog%7Bd6174369-fba0-4b2d-9b7a-cd9784af2def%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteBlog")
	public ModelAndView confirmDeleteBlog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("blog", blogDAO.findBlogByPrimaryKey(idKey));
		mav.setViewName("blog/deleteBlog.jsp");

		return mav;
	}

	/**
	* Delete an existing Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/deleteBlogBlogposts%7B5196228a-aabd-4207-87c1-59dd734e86f0%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteBlogBlogposts")
	public ModelAndView deleteBlogBlogposts(@RequestParam Integer blog_id, @RequestParam Integer related_blogposts_id) {
		ModelAndView mav = new ModelAndView();

		Blog blog = blogService.deleteBlogBlogposts(blog_id, related_blogposts_id);

		mav.addObject("blog_id", blog_id);
		mav.addObject("blog", blog);
		mav.setViewName("blog/viewBlog.jsp");

		return mav;
	}

	/**
	* Save an existing Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/saveBlogBlogposts%7B7673e57f-af77-4959-b188-d58c68235e21%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveBlogBlogposts")
	public ModelAndView saveBlogBlogposts(@RequestParam Integer blog_id, @ModelAttribute Blogpost blogposts) {
		Blog parent_blog = blogService.saveBlogBlogposts(blog_id, blogposts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("blog", parent_blog);
		mav.setViewName("blog/viewBlog.jsp");

		return mav;
	}

	/**
	* Create a new Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/newBlogPerson%7B1cee05aa-a3bd-4859-931e-13898ed9362e%7D/.properties.swoperation]
	*/
	@RequestMapping("/newBlogPerson")
	public ModelAndView newBlogPerson(@RequestParam Integer blog_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("person", new Person());
		mav.addObject("newFlag", true);
		mav.setViewName("blog/person/editPerson.jsp");

		return mav;
	}

	/**
	* Create a new Blogpost entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/BlogController/newBlogBlogposts%7Bb3f9bc5a-13bc-4b27-b88a-10b0a4135863%7D/.properties.swoperation]
	*/
	@RequestMapping("/newBlogBlogposts")
	public ModelAndView newBlogBlogposts(@RequestParam Integer blog_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("blog_id", blog_id);
		mav.addObject("blogpost", new Blogpost());
		mav.addObject("newFlag", true);
		mav.setViewName("blog/blogposts/editBlogposts.jsp");

		return mav;
	}
}