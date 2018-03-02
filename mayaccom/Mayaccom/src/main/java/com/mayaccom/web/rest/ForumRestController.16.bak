package com.mayaccom.web.rest;

import com.mayaccom.dao.ForumDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Topic;

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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/.properties.webcontroller]
 * @generated
 */

@Controller("ForumRestController")

public class ForumRestController {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/.properties.webcontroller#//@variables%5Bname='forumDAO'%5D]
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/.properties.webcontroller#//@variables%5Bname='forumService'%5D]
	 */
	@Autowired
	private ForumService forumService;

	/**
	 * Create a new Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/newForum%7B7c96f6f2-89aa-4450-ba4e-faf96c1bc12b%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Forum", method = RequestMethod.POST)
	@ResponseBody
	public Forum newForum(@RequestBody Forum forum) {
		forumService.saveForum(forum);
		return forumDAO.findForumByPrimaryKey(forum.getId());
	}

	/**
	* Show all Topic entities by Forum
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/getForumTopics%7Bce414422-e809-4773-ac37-8341e5966cb8%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum/{forum_id}/topics", method = RequestMethod.GET)
	@ResponseBody
	public List<Topic> getForumTopics(@PathVariable Integer forum_id) {
		return new java.util.ArrayList<Topic>(forumDAO.findForumByPrimaryKey(forum_id).getTopics());
	}

	/**
	* Delete an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/deleteForum%7Ba82797ff-9e12-4c73-90e4-a17733e5b0c5%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum/{forum_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteForum(@PathVariable Integer forum_id) {
		Forum forum = forumDAO.findForumByPrimaryKey(forum_id);
		forumService.deleteForum(forum);
	}

	/**
	* Save an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/saveForum%7Bcdd035e9-c080-4545-add7-7ca48ef3d1e6%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum", method = RequestMethod.PUT)
	@ResponseBody
	public Forum saveForum(@RequestBody Forum forum) {
		forumService.saveForum(forum);
		return forumDAO.findForumByPrimaryKey(forum.getId());
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/saveForumTopics%7Bd2c646d2-2b64-4df8-983e-d4c9503124fc%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum/{forum_id}/topics", method = RequestMethod.PUT)
	@ResponseBody
	public Topic saveForumTopics(@PathVariable Integer forum_id, @RequestBody Topic topics) {
		forumService.saveForumTopics(forum_id, topics);
		return topicDAO.findTopicByPrimaryKey(topics.getId());
	}

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/deleteForumTopics%7B2da8d95d-d970-4a61-8b01-66f3d162bc21%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum/{forum_id}/topics/{topic_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteForumTopics(@PathVariable Integer forum_id, @PathVariable Integer related_topics_id) {
		forumService.deleteForumTopics(forum_id, related_topics_id);
	}

	/**
	* Select an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/loadForum%7B17cf7bfc-307d-4d69-8901-6599768aef91%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum/{forum_id}", method = RequestMethod.GET)
	@ResponseBody
	public Forum loadForum(@PathVariable Integer forum_id) {
		return forumDAO.findForumByPrimaryKey(forum_id);
	}

	/**
	* Show all Forum entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/listForums%7B3c45fdfe-1b21-4593-bc61-0b411bc04b6d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum", method = RequestMethod.GET)
	@ResponseBody
	public List<Forum> listForums() {
		return new java.util.ArrayList<Forum>(forumService.loadForums());
	}

	/**
	* View an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/loadForumTopics%7B449d6a5e-0947-436f-924c-ec2b92874e53%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum/{forum_id}/topics/{topic_id}", method = RequestMethod.GET)
	@ResponseBody
	public Topic loadForumTopics(@PathVariable Integer forum_id, @PathVariable Integer related_topics_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(related_topics_id, -1, -1);

		return topic;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/initBinder%7B6ca77c04-edf7-48f0-9558-3f5a0a667651%7D/.properties.swoperation]
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
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/ForumRestController/newForumTopics%7Bbb65857a-ba2f-42a2-949b-a94e18b007a7%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Forum/{forum_id}/topics", method = RequestMethod.POST)
	@ResponseBody
	public Topic newForumTopics(@PathVariable Integer forum_id, @RequestBody Topic topic) {
		forumService.saveForumTopics(forum_id, topic);
		return topicDAO.findTopicByPrimaryKey(topic.getId());
	}
}