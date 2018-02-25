package com.mayaccom.web;

import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import com.mayaccom.service.PostService;

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
 * Spring MVC controller that handles CRUD requests for Post entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/.properties.webcontroller]
 * @generated
 */

@Controller("PostController")

public class PostController {

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/.properties.webcontroller#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/.properties.webcontroller#//@variables%5Bname='postService'%5D]
	 */
	@Autowired
	private PostService postService;

	/**
	 * Register custom, context-specific property editors
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/initBinder%7Bda35bc66-1527-4e76-a32b-38ece2d9ec0f%7D/.properties.swoperation]
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
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/streamBinary%7B94602406-c7c2-472f-bd2e-f4ee2cdeb3eb%7D/.properties.swoperation]
	*/
	@RequestMapping("/postController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Edit an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/editPostHost%7B2a8bec93-4b02-4703-aae5-d0abbc3c7e3e%7D/.properties.swoperation]
	*/
	@RequestMapping("/editPostHost")
	public ModelAndView editPostHost(@RequestParam Integer post_id, @RequestParam Integer host_id) {
		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("host", host);
		mav.setViewName("post/host/editHost.jsp");

		return mav;
	}

	/**
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/newPostHost%7Bb7ed4181-38f9-4077-8a09-ce4d5dff5068%7D/.properties.swoperation]
	*/
	@RequestMapping("/newPostHost")
	public ModelAndView newPostHost(@RequestParam Integer post_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("host", new Host());
		mav.addObject("newFlag", true);
		mav.setViewName("post/host/editHost.jsp");

		return mav;
	}

	/**
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/newPostTopic%7B19a9c16b-961f-4f4a-a0d5-09995c9eacef%7D/.properties.swoperation]
	*/
	@RequestMapping("/newPostTopic")
	public ModelAndView newPostTopic(@RequestParam Integer post_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("topic", new Topic());
		mav.addObject("newFlag", true);
		mav.setViewName("post/topic/editTopic.jsp");

		return mav;
	}

	/**
	* Select the child Topic entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/confirmDeletePostTopic%7Ba1b1f084-1710-4025-9dbf-a2945d71175b%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeletePostTopic")
	public ModelAndView confirmDeletePostTopic(@RequestParam Integer post_id, @RequestParam Integer related_topic_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(related_topic_id));
		mav.addObject("post_id", post_id);
		mav.setViewName("post/topic/deleteTopic.jsp");

		return mav;
	}

	/**
	* Edit an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/editPostTopic%7B06245337-2e58-4814-8cc1-fe935596393b%7D/.properties.swoperation]
	*/
	@RequestMapping("/editPostTopic")
	public ModelAndView editPostTopic(@RequestParam Integer post_id, @RequestParam Integer topic_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topic_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("topic", topic);
		mav.setViewName("post/topic/editTopic.jsp");

		return mav;
	}

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/deletePostTopic%7B965c88d7-e107-4380-abc0-22c4df5e51d0%7D/.properties.swoperation]
	*/
	@RequestMapping("/deletePostTopic")
	public ModelAndView deletePostTopic(@RequestParam Integer post_id, @RequestParam Integer related_topic_id) {
		ModelAndView mav = new ModelAndView();

		Post post = postService.deletePostTopic(post_id, related_topic_id);

		mav.addObject("post_id", post_id);
		mav.addObject("post", post);
		mav.setViewName("post/viewPost.jsp");

		return mav;
	}

	/**
	* Select an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/selectPost%7B5b847810-553a-424e-b42a-49d407781eda%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectPost")
	public ModelAndView selectPost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", postDAO.findPostByPrimaryKey(idKey));
		mav.setViewName("post/viewPost.jsp");

		return mav;
	}

	/**
	* View an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/selectPostTopic%7Bb2c08843-9f0d-49e4-a79b-279ec8b3e470%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectPostTopic")
	public ModelAndView selectPostTopic(@RequestParam Integer post_id, @RequestParam Integer topic_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topic_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("topic", topic);
		mav.setViewName("post/topic/viewTopic.jsp");

		return mav;
	}

	/**
	* Select the child Host entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/confirmDeletePostHost%7B8bc70f65-0a51-4ccc-8824-c57648d682f6%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeletePostHost")
	public ModelAndView confirmDeletePostHost(@RequestParam Integer post_id, @RequestParam Integer related_host_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(related_host_id));
		mav.addObject("post_id", post_id);
		mav.setViewName("post/host/deleteHost.jsp");

		return mav;
	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/savePostHost%7B8fac3eeb-9363-4e05-9000-ea7304cd850c%7D/.properties.swoperation]
	*/
	@RequestMapping("/savePostHost")
	public ModelAndView savePostHost(@RequestParam Integer post_id, @ModelAttribute Host host) {
		Post parent_post = postService.savePostHost(post_id, host);

		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("post", parent_post);
		mav.setViewName("post/viewPost.jsp");

		return mav;
	}

	/**
	* Create a new Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/newPost%7B0d363a85-1a71-4fd8-9ce1-16c9aebefa9c%7D/.properties.swoperation]
	*/
	@RequestMapping("/newPost")
	public ModelAndView newPost() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", new Post());
		mav.addObject("newFlag", true);
		mav.setViewName("post/editPost.jsp");

		return mav;
	}

	/**
	* Show all Topic entities by Post
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/listPostTopic%7B170424b7-8d78-4ee9-ba81-17e665043944%7D/.properties.swoperation]
	*/
	@RequestMapping("/listPostTopic")
	public ModelAndView listPostTopic(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", postDAO.findPostByPrimaryKey(idKey));
		mav.setViewName("post/topic/listTopic.jsp");

		return mav;
	}

	/**
	* Show all Post entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/listPosts%7B3910468c-74d2-47d1-a394-44198e907fa2%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexPost")
	public ModelAndView listPosts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("posts", postService.loadPosts());

		mav.setViewName("post/listPosts.jsp");

		return mav;
	}

	/**
	* Save an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/savePost%7Be4a83ac1-b8c3-4c03-a7d3-93800bc53553%7D/.properties.swoperation]
	*/
	@RequestMapping("/savePost")
	public String savePost(@ModelAttribute Post post) {
		postService.savePost(post);
		return "forward:/indexPost";
	}

	/**
	* Select the Post entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/confirmDeletePost%7B34fc0a85-bb32-46a2-bbb6-ee066cf3456b%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeletePost")
	public ModelAndView confirmDeletePost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", postDAO.findPostByPrimaryKey(idKey));
		mav.setViewName("post/deletePost.jsp");

		return mav;
	}

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/deletePost%7B4e0a3bbb-608f-4aaa-963c-2059fe495184%7D/.properties.swoperation]
	*/
	@RequestMapping("/deletePost")
	public String deletePost(@RequestParam Integer idKey) {
		Post post = postDAO.findPostByPrimaryKey(idKey);
		postService.deletePost(post);
		return "forward:/indexPost";
	}

	/**
	* Edit an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/editPost%7B7082697d-b033-44f6-86c4-b8b594251405%7D/.properties.swoperation]
	*/
	@RequestMapping("/editPost")
	public ModelAndView editPost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", postDAO.findPostByPrimaryKey(idKey));
		mav.setViewName("post/editPost.jsp");

		return mav;
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/savePostTopic%7B5ba12e55-e6cf-4380-b3cd-0729acddec2f%7D/.properties.swoperation]
	*/
	@RequestMapping("/savePostTopic")
	public ModelAndView savePostTopic(@RequestParam Integer post_id, @ModelAttribute Topic topic) {
		Post parent_post = postService.savePostTopic(post_id, topic);

		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("post", parent_post);
		mav.setViewName("post/viewPost.jsp");

		return mav;
	}

	/**
	* Show all Host entities by Post
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/listPostHost%7B3a0d62de-2148-4db1-a53f-2e4cd7565617%7D/.properties.swoperation]
	*/
	@RequestMapping("/listPostHost")
	public ModelAndView listPostHost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", postDAO.findPostByPrimaryKey(idKey));
		mav.setViewName("post/host/listHost.jsp");

		return mav;
	}

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/deletePostHost%7B4d3607ec-310f-4c9b-99fe-4bdcb83cfb78%7D/.properties.swoperation]
	*/
	@RequestMapping("/deletePostHost")
	public ModelAndView deletePostHost(@RequestParam Integer post_id, @RequestParam Integer related_host_id) {
		ModelAndView mav = new ModelAndView();

		Post post = postService.deletePostHost(post_id, related_host_id);

		mav.addObject("post_id", post_id);
		mav.addObject("post", post);
		mav.setViewName("post/viewPost.jsp");

		return mav;
	}

	/**
	* View an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/selectPostHost%7Bc012bc8c-00c3-4b4e-95db-1436ed125ed1%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectPostHost")
	public ModelAndView selectPostHost(@RequestParam Integer post_id, @RequestParam Integer host_id) {
		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("post_id", post_id);
		mav.addObject("host", host);
		mav.setViewName("post/host/viewHost.jsp");

		return mav;
	}

	/**
	* Entry point to show all Post entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/PostController/indexPost%7B61c6df31-d936-4472-9005-959161a77db7%7D/.properties.swoperation]
	*/
	public String indexPost() {
		return "redirect:/indexPost";
	}
}