package com.mayaccom.web;

import com.mayaccom.dao.ForumDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Topic;

import com.mayaccom.service.ForumService;

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
 * Spring MVC controller that handles CRUD requests for Forum entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/.properties.webcontroller]
 * @generated
 */

@Controller("ForumController")

public class ForumController {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/.properties.webcontroller#//@variables%5Bname='forumDAO'%5D]
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/.properties.webcontroller#//@variables%5Bname='forumService'%5D]
	 */
	@Autowired
	private ForumService forumService;

	/**
	 * Show all Topic entities by Forum
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/listForumTopics%7B23c3be94-28bf-4510-8b9e-2ae8216a23fd%7D/.properties.swoperation]
	 */
	@RequestMapping("/listForumTopics")
	public ModelAndView listForumTopics(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(idKey));
		mav.setViewName("forum/topics/listTopics.jsp");

		return mav;
	}

	/**
	* View an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/selectForumTopics%7Bf6c6cad4-bb5c-41b3-9ffc-f9c972573a00%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectForumTopics")
	public ModelAndView selectForumTopics(@RequestParam Integer forum_id, @RequestParam Integer topics_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topics_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("forum_id", forum_id);
		mav.addObject("topic", topic);
		mav.setViewName("forum/topics/viewTopics.jsp");

		return mav;
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/saveForumTopics%7B6331840c-e3cc-4a2e-ad75-353d9b2b8274%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveForumTopics")
	public ModelAndView saveForumTopics(@RequestParam Integer forum_id, @ModelAttribute Topic topics) {
		Forum parent_forum = forumService.saveForumTopics(forum_id, topics);

		ModelAndView mav = new ModelAndView();
		mav.addObject("forum_id", forum_id);
		mav.addObject("forum", parent_forum);
		mav.setViewName("forum/viewForum.jsp");

		return mav;
	}

	/**
	* Select the Forum entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/confirmDeleteForum%7B2830af87-961a-4363-a6b4-079bb89f62d5%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteForum")
	public ModelAndView confirmDeleteForum(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(idKey));
		mav.setViewName("forum/deleteForum.jsp");

		return mav;
	}

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/deleteForumTopics%7B4777ed7c-756e-406c-b539-11767ec9d3c3%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteForumTopics")
	public ModelAndView deleteForumTopics(@RequestParam Integer forum_id, @RequestParam Integer related_topics_id) {
		ModelAndView mav = new ModelAndView();

		Forum forum = forumService.deleteForumTopics(forum_id, related_topics_id);

		mav.addObject("forum_id", forum_id);
		mav.addObject("forum", forum);
		mav.setViewName("forum/viewForum.jsp");

		return mav;
	}

	/**
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/newForumTopics%7B8261a596-fedd-41a9-9cd8-77a4070bd398%7D/.properties.swoperation]
	*/
	@RequestMapping("/newForumTopics")
	public ModelAndView newForumTopics(@RequestParam Integer forum_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("forum_id", forum_id);
		mav.addObject("topic", new Topic());
		mav.addObject("newFlag", true);
		mav.setViewName("forum/topics/editTopics.jsp");

		return mav;
	}

	/**
	* Show all Forum entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/listForums%7B2d06809e-e5a8-40be-80b8-c577d19f82a9%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexForum")
	public ModelAndView listForums() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forums", forumService.loadForums());

		mav.setViewName("forum/listForums.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/streamBinary%7Be9256f8f-f353-449d-884a-016cc063481e%7D/.properties.swoperation]
	*/
	@RequestMapping("/forumController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Edit an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/editForumTopics%7Be823148d-87d5-4c74-baa4-c40c8f2ddaa4%7D/.properties.swoperation]
	*/
	@RequestMapping("/editForumTopics")
	public ModelAndView editForumTopics(@RequestParam Integer forum_id, @RequestParam Integer topics_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topics_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("forum_id", forum_id);
		mav.addObject("topic", topic);
		mav.setViewName("forum/topics/editTopics.jsp");

		return mav;
	}

	/**
	* Edit an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/editForum%7B33b11b5c-7b3e-4a24-97ad-3ef01b05cfb6%7D/.properties.swoperation]
	*/
	@RequestMapping("/editForum")
	public ModelAndView editForum(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(idKey));
		mav.setViewName("forum/editForum.jsp");

		return mav;
	}

	/**
	* Create a new Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/newForum%7B0561ae21-5661-431a-9739-1e232c6a0894%7D/.properties.swoperation]
	*/
	@RequestMapping("/newForum")
	public ModelAndView newForum() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", new Forum());
		mav.addObject("newFlag", true);
		mav.setViewName("forum/editForum.jsp");

		return mav;
	}

	/**
	* Select an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/selectForum%7B02a046c3-9d4a-462f-ae0d-3853217a92da%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectForum")
	public ModelAndView selectForum(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("forum", forumDAO.findForumByPrimaryKey(idKey));
		mav.setViewName("forum/viewForum.jsp");

		return mav;
	}

	/**
	* Delete an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/deleteForum%7Bcc1ab2ca-45e6-4f4a-9dae-47ea0dc4bbe3%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteForum")
	public String deleteForum(@RequestParam Integer idKey) {
		Forum forum = forumDAO.findForumByPrimaryKey(idKey);
		forumService.deleteForum(forum);
		return "forward:/indexForum";
	}

	/**
	* Entry point to show all Forum entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/indexForum%7B8434850a-34ac-4c71-91e1-d7ae46ef4d39%7D/.properties.swoperation]
	*/
	public String indexForum() {
		return "redirect:/indexForum";
	}

	/**
	* Select the child Topic entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/confirmDeleteForumTopics%7Bfa3ab839-2fb1-4293-b5eb-74419266e21e%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteForumTopics")
	public ModelAndView confirmDeleteForumTopics(@RequestParam Integer forum_id, @RequestParam Integer related_topics_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(related_topics_id));
		mav.addObject("forum_id", forum_id);
		mav.setViewName("forum/topics/deleteTopics.jsp");

		return mav;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/initBinder%7B338f770e-a1dd-487d-a951-b819652e1091%7D/.properties.swoperation]
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
	* Save an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ForumController/saveForum%7B9ae3e628-5d54-4d40-88be-393a5cc97bc1%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveForum")
	public String saveForum(@ModelAttribute Forum forum) {
		forumService.saveForum(forum);
		return "forward:/indexForum";
	}
}