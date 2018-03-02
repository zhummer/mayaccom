package com.mayaccom.web.rest;

import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import com.mayaccom.service.PostService;

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
 * Spring Rest controller that handles CRUD requests for Post entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/.properties.webcontroller]
 * @generated
 */

@Controller("PostRestController")

public class PostRestController {

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/.properties.webcontroller#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/.properties.webcontroller#//@variables%5Bname='postService'%5D]
	 */
	@Autowired
	private PostService postService;

	/**
	 * Save an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/savePost%7B54eb9c9e-b458-4795-bf21-834a3c3d6608%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Post", method = RequestMethod.PUT)
	@ResponseBody
	public Post savePost(@RequestBody Post post) {
		postService.savePost(post);
		return postDAO.findPostByPrimaryKey(post.getId());
	}

	/**
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/newPostTopic%7B4e86edd5-0740-4779-ad76-9c8986134c61%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/topic", method = RequestMethod.POST)
	@ResponseBody
	public Topic newPostTopic(@PathVariable Integer post_id, @RequestBody Topic topic) {
		postService.savePostTopic(post_id, topic);
		return topicDAO.findTopicByPrimaryKey(topic.getId());
	}

	/**
	* Create a new Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/newPost%7Bcc587f5a-c435-493f-9e32-36692c207254%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post", method = RequestMethod.POST)
	@ResponseBody
	public Post newPost(@RequestBody Post post) {
		postService.savePost(post);
		return postDAO.findPostByPrimaryKey(post.getId());
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/savePostTopic%7Be0a338f2-d8a6-430b-a10d-5d28f5a73736%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/topic", method = RequestMethod.PUT)
	@ResponseBody
	public Topic savePostTopic(@PathVariable Integer post_id, @RequestBody Topic topic) {
		postService.savePostTopic(post_id, topic);
		return topicDAO.findTopicByPrimaryKey(topic.getId());
	}

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/deletePost%7B21329c08-26da-457f-a9da-227f1214e8ee%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePost(@PathVariable Integer post_id) {
		Post post = postDAO.findPostByPrimaryKey(post_id);
		postService.deletePost(post);
	}

	/**
	* Select an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/loadPost%7B6185c418-5a31-4168-a459-f13fbc447cfe%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}", method = RequestMethod.GET)
	@ResponseBody
	public Post loadPost(@PathVariable Integer post_id) {
		return postDAO.findPostByPrimaryKey(post_id);
	}

	/**
	* Get Host entity by Post
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/getPostHost%7B713727a8-2611-48da-b0ae-50cd9ec4d843%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/host", method = RequestMethod.GET)
	@ResponseBody
	public Host getPostHost(@PathVariable Integer post_id) {
		return postDAO.findPostByPrimaryKey(post_id).getHost();
	}

	/**
	* Get Topic entity by Post
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/getPostTopic%7B731908bb-373f-4bfa-91ce-e5d5b2df1db0%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/topic", method = RequestMethod.GET)
	@ResponseBody
	public Topic getPostTopic(@PathVariable Integer post_id) {
		return postDAO.findPostByPrimaryKey(post_id).getTopic();
	}

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/deletePostTopic%7B2cf6de15-a2c7-41c7-b615-93cb9e2618d2%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/topic/{topic_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePostTopic(@PathVariable Integer post_id, @PathVariable Integer related_topic_id) {
		postService.deletePostTopic(post_id, related_topic_id);
	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/savePostHost%7B838b31b4-db99-487b-9c03-fb5cead86953%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/host", method = RequestMethod.PUT)
	@ResponseBody
	public Host savePostHost(@PathVariable Integer post_id, @RequestBody Host host) {
		postService.savePostHost(post_id, host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/newPostHost%7B4ca4a629-3aa7-4bcc-b43f-c99b85d24715%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/host", method = RequestMethod.POST)
	@ResponseBody
	public Host newPostHost(@PathVariable Integer post_id, @RequestBody Host host) {
		postService.savePostHost(post_id, host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* Show all Post entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/listPosts%7B0f2aa7c3-85e8-4d22-afa5-45f50d8cce0d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post", method = RequestMethod.GET)
	@ResponseBody
	public List<Post> listPosts() {
		return new java.util.ArrayList<Post>(postService.loadPosts());
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/initBinder%7Bdc24c6e6-81f5-4aad-b0ed-d0ff4b50ebb5%7D/.properties.swoperation]
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
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/deletePostHost%7Bf1ad0c82-e25d-41f4-a0ef-f4ca5564e77b%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/host/{host_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePostHost(@PathVariable Integer post_id, @PathVariable Integer related_host_id) {
		postService.deletePostHost(post_id, related_host_id);
	}

	/**
	* View an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/loadPostHost%7B870fb729-16bc-4064-a2a1-0c57feac4b97%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/host/{host_id}", method = RequestMethod.GET)
	@ResponseBody
	public Host loadPostHost(@PathVariable Integer post_id, @PathVariable Integer related_host_id) {
		Host host = hostDAO.findHostByPrimaryKey(related_host_id, -1, -1);

		return host;
	}

	/**
	* View an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/PostRestController/loadPostTopic%7Ba89774cd-5237-413e-8443-1eb4fd796278%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Post/{post_id}/topic/{topic_id}", method = RequestMethod.GET)
	@ResponseBody
	public Topic loadPostTopic(@PathVariable Integer post_id, @PathVariable Integer related_topic_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(related_topic_id, -1, -1);

		return topic;
	}
}