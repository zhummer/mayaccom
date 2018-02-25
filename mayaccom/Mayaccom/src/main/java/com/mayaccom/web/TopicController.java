package com.mayaccom.web;

import com.mayaccom.dao.ForumDAO;
import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import com.mayaccom.service.TopicService;

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
 * Spring MVC controller that handles CRUD requests for Topic entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/.properties.webcontroller]
 * @generated
 */

@Controller("TopicController")

public class TopicController {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/.properties.webcontroller#//@variables%5Bname='forumDAO'%5D]
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/.properties.webcontroller#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/.properties.webcontroller#//@variables%5Bname='topicService'%5D]
	 */
	@Autowired
	private TopicService topicService;

	/**
	 * Delete an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/deleteTopicHost%7B95e19e0e-99d6-41af-8966-a13200dbec11%7D/.properties.swoperation]
	 */
	@RequestMapping("/deleteTopicHost")
	public ModelAndView deleteTopicHost(@RequestParam Integer topic_id, @RequestParam Integer related_host_id) {
		ModelAndView mav = new ModelAndView();

		Topic topic = topicService.deleteTopicHost(topic_id, related_host_id);

		mav.addObject("topic_id", topic_id);
		mav.addObject("topic", topic);
		mav.setViewName("topic/viewTopic.jsp");

		return mav;
	}

	/**
	* Select the child Post entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/confirmDeleteTopicPosts%7B84819ab8-8e42-4953-b723-ed74a908aee1%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteTopicPosts")
	public ModelAndView confirmDeleteTopicPosts(@RequestParam Integer topic_id, @RequestParam Integer related_posts_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", postDAO.findPostByPrimaryKey(related_posts_id));
		mav.addObject("topic_id", topic_id);
		mav.setViewName("topic/posts/deletePosts.jsp");

		return mav;
	}

	/**
	* Save an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/saveTopicForum%7B0ba67d80-56fd-42eb-aad2-c759df99698f%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveTopicForum")
	public ModelAndView saveTopicForum(@RequestParam Integer topic_id, @ModelAttribute Forum forum) {
		Topic parent_topic = topicService.saveTopicForum(topic_id, forum);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("topic", parent_topic);
		mav.setViewName("topic/viewTopic.jsp");

		return mav;
	}

	/**
	* Edit an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/editTopicForum%7Bea0f9b50-bd28-4e0c-b888-0f14680805b9%7D/.properties.swoperation]
	*/
	@RequestMapping("/editTopicForum")
	public ModelAndView editTopicForum(@RequestParam Integer topic_id, @RequestParam Integer forum_id) {
		Forum forum = forumDAO.findForumByPrimaryKey(forum_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("forum", forum);
		mav.setViewName("topic/forum/editForum.jsp");

		return mav;
	}

	/**
	* Edit an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/editTopicPosts%7B03401668-3484-4c6f-8945-79346aea0fd0%7D/.properties.swoperation]
	*/
	@RequestMapping("/editTopicPosts")
	public ModelAndView editTopicPosts(@RequestParam Integer topic_id, @RequestParam Integer posts_id) {
		Post post = postDAO.findPostByPrimaryKey(posts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("post", post);
		mav.setViewName("topic/posts/editPosts.jsp");

		return mav;
	}

	/**
	* Select the child Forum entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/confirmDeleteTopicForum%7B372c243f-eefc-42f2-b8db-bb2ee127c66c%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteTopicForum")
	public ModelAndView confirmDeleteTopicForum(@RequestParam Integer topic_id, @RequestParam Integer related_forum_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(related_forum_id));
		mav.addObject("topic_id", topic_id);
		mav.setViewName("topic/forum/deleteForum.jsp");

		return mav;
	}

	/**
	* Edit an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/editTopicHost%7B44fa806a-6e0c-4fcf-9f0c-715624a7d376%7D/.properties.swoperation]
	*/
	@RequestMapping("/editTopicHost")
	public ModelAndView editTopicHost(@RequestParam Integer topic_id, @RequestParam Integer host_id) {
		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("host", host);
		mav.setViewName("topic/host/editHost.jsp");

		return mav;
	}

	/**
	* Edit an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/editTopic%7Beec69020-de17-4485-b123-f59f561cbc52%7D/.properties.swoperation]
	*/
	@RequestMapping("/editTopic")
	public ModelAndView editTopic(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(idKey));
		mav.setViewName("topic/editTopic.jsp");

		return mav;
	}

	/**
	* Delete an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/deleteTopicForum%7B41c57cbc-d822-405e-befd-789ad0902beb%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteTopicForum")
	public ModelAndView deleteTopicForum(@RequestParam Integer topic_id, @RequestParam Integer related_forum_id) {
		ModelAndView mav = new ModelAndView();

		Topic topic = topicService.deleteTopicForum(topic_id, related_forum_id);

		mav.addObject("topic_id", topic_id);
		mav.addObject("topic", topic);
		mav.setViewName("topic/viewTopic.jsp");

		return mav;
	}

	/**
	* Entry point to show all Topic entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/indexTopic%7Be66fdac7-fd0b-490a-b77d-239abd1e81e0%7D/.properties.swoperation]
	*/
	public String indexTopic() {
		return "redirect:/indexTopic";
	}

	/**
	* View an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/selectTopicHost%7B89fe4271-67a1-4815-8ff5-21c77ebaf816%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectTopicHost")
	public ModelAndView selectTopicHost(@RequestParam Integer topic_id, @RequestParam Integer host_id) {
		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("host", host);
		mav.setViewName("topic/host/viewHost.jsp");

		return mav;
	}

	/**
	* Show all Topic entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/listTopics%7B8695f03f-307c-4c01-a259-46a28e79bb1a%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexTopic")
	public ModelAndView listTopics() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topics", topicService.loadTopics());

		mav.setViewName("topic/listTopics.jsp");

		return mav;
	}

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/deleteTopic%7B4385868b-d4da-48a6-b2b0-09ffa918d3d7%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteTopic")
	public String deleteTopic(@RequestParam Integer idKey) {
		Topic topic = topicDAO.findTopicByPrimaryKey(idKey);
		topicService.deleteTopic(topic);
		return "forward:/indexTopic";
	}

	/**
	* Create a new Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/newTopicPosts%7Bcd62bec7-fca6-4bab-b6ca-39d475b6a7bc%7D/.properties.swoperation]
	*/
	@RequestMapping("/newTopicPosts")
	public ModelAndView newTopicPosts(@RequestParam Integer topic_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("post", new Post());
		mav.addObject("newFlag", true);
		mav.setViewName("topic/posts/editPosts.jsp");

		return mav;
	}

	/**
	* Show all Forum entities by Topic
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/listTopicForum%7B735f38d8-0d4e-497b-a0f3-2ad3855ac0f4%7D/.properties.swoperation]
	*/
	@RequestMapping("/listTopicForum")
	public ModelAndView listTopicForum(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(idKey));
		mav.setViewName("topic/forum/listForum.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/streamBinary%7B61402c75-adcb-4276-a1d0-b68e84e1c562%7D/.properties.swoperation]
	*/
	@RequestMapping("/topicController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/saveTopicHost%7B7f686ed6-d122-4ca6-a003-d8bcf936e77c%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveTopicHost")
	public ModelAndView saveTopicHost(@RequestParam Integer topic_id, @ModelAttribute Host host) {
		Topic parent_topic = topicService.saveTopicHost(topic_id, host);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("topic", parent_topic);
		mav.setViewName("topic/viewTopic.jsp");

		return mav;
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/saveTopic%7Bb68f4778-980b-476a-af50-9996e267d6c8%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveTopic")
	public String saveTopic(@ModelAttribute Topic topic) {
		topicService.saveTopic(topic);
		return "forward:/indexTopic";
	}

	/**
	* Show all Host entities by Topic
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/listTopicHost%7B2e2c2d84-d13d-4c20-aae0-e221f8cc34f0%7D/.properties.swoperation]
	*/
	@RequestMapping("/listTopicHost")
	public ModelAndView listTopicHost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(idKey));
		mav.setViewName("topic/host/listHost.jsp");

		return mav;
	}

	/**
	* Save an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/saveTopicPosts%7Be20261e7-1215-4920-9411-89ad7e5634fc%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveTopicPosts")
	public ModelAndView saveTopicPosts(@RequestParam Integer topic_id, @ModelAttribute Post posts) {
		Topic parent_topic = topicService.saveTopicPosts(topic_id, posts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("topic", parent_topic);
		mav.setViewName("topic/viewTopic.jsp");

		return mav;
	}

	/**
	* View an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/selectTopicForum%7B23688b59-ef54-4cd7-b2a2-ecb49ecaa7be%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectTopicForum")
	public ModelAndView selectTopicForum(@RequestParam Integer topic_id, @RequestParam Integer forum_id) {
		Forum forum = forumDAO.findForumByPrimaryKey(forum_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("forum", forum);
		mav.setViewName("topic/forum/viewForum.jsp");

		return mav;
	}

	/**
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/newTopic%7B7f591d0d-732f-40ea-a8dd-8b9db2332c59%7D/.properties.swoperation]
	*/
	@RequestMapping("/newTopic")
	public ModelAndView newTopic() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", new Topic());
		mav.addObject("newFlag", true);
		mav.setViewName("topic/editTopic.jsp");

		return mav;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/initBinder%7B5f307083-5db2-4808-a572-ee1373796ed8%7D/.properties.swoperation]
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
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/newTopicHost%7Bda18a3c0-9507-49fd-96ba-27449b8791d6%7D/.properties.swoperation]
	*/
	@RequestMapping("/newTopicHost")
	public ModelAndView newTopicHost(@RequestParam Integer topic_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("host", new Host());
		mav.addObject("newFlag", true);
		mav.setViewName("topic/host/editHost.jsp");

		return mav;
	}

	/**
	* Create a new Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/newTopicForum%7Be7bd9600-cb70-4415-bb2c-2d02058a7381%7D/.properties.swoperation]
	*/
	@RequestMapping("/newTopicForum")
	public ModelAndView newTopicForum(@RequestParam Integer topic_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("forum", new Forum());
		mav.addObject("newFlag", true);
		mav.setViewName("topic/forum/editForum.jsp");

		return mav;
	}

	/**
	* Select the Topic entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/confirmDeleteTopic%7Bb91978bb-50e2-4c7c-88e2-14ff229d33f5%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteTopic")
	public ModelAndView confirmDeleteTopic(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(idKey));
		mav.setViewName("topic/deleteTopic.jsp");

		return mav;
	}

	/**
	* Select an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/selectTopic%7B97dc8169-c29d-4faa-b980-b5ba2f90e549%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectTopic")
	public ModelAndView selectTopic(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(idKey));
		mav.setViewName("topic/viewTopic.jsp");

		return mav;
	}

	/**
	* Show all Post entities by Topic
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/listTopicPosts%7Ba30baa50-68aa-459d-9dd2-57a0deb66c8c%7D/.properties.swoperation]
	*/
	@RequestMapping("/listTopicPosts")
	public ModelAndView listTopicPosts(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(idKey));
		mav.setViewName("topic/posts/listPosts.jsp");

		return mav;
	}

	/**
	* View an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/selectTopicPosts%7B0a9dce6e-7de5-414c-8eef-e337a167a0a5%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectTopicPosts")
	public ModelAndView selectTopicPosts(@RequestParam Integer topic_id, @RequestParam Integer posts_id) {
		Post post = postDAO.findPostByPrimaryKey(posts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("topic_id", topic_id);
		mav.addObject("post", post);
		mav.setViewName("topic/posts/viewPosts.jsp");

		return mav;
	}

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/deleteTopicPosts%7B88d55f16-33a5-49b7-9a8f-ed09d276934e%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteTopicPosts")
	public ModelAndView deleteTopicPosts(@RequestParam Integer topic_id, @RequestParam Integer related_posts_id) {
		ModelAndView mav = new ModelAndView();

		Topic topic = topicService.deleteTopicPosts(topic_id, related_posts_id);

		mav.addObject("topic_id", topic_id);
		mav.addObject("topic", topic);
		mav.setViewName("topic/viewTopic.jsp");

		return mav;
	}

	/**
	* Select the child Host entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/TopicController/confirmDeleteTopicHost%7Be9886490-c6ef-46c1-8fc7-1aad59e56a41%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteTopicHost")
	public ModelAndView confirmDeleteTopicHost(@RequestParam Integer topic_id, @RequestParam Integer related_host_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(related_host_id));
		mav.addObject("topic_id", topic_id);
		mav.setViewName("topic/host/deleteHost.jsp");

		return mav;
	}
}