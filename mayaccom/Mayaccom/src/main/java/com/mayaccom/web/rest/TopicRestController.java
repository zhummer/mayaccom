package com.mayaccom.web.rest;

import com.mayaccom.dao.ForumDAO;
import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import com.mayaccom.service.TopicService;

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
 * Spring Rest controller that handles CRUD requests for Topic entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/.properties.webcontroller]
 * @generated
 */

@Controller("TopicRestController")

public class TopicRestController {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/.properties.webcontroller#//@variables%5Bname='forumDAO'%5D]
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/.properties.webcontroller#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/.properties.webcontroller#//@variables%5Bname='topicService'%5D]
	 */
	@Autowired
	private TopicService topicService;

	/**
	 * Delete an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/deleteTopicHost%7Baecf49ce-6885-4fc9-8fd7-4eab741646c6%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Topic/{topic_id}/host/{host_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTopicHost(@PathVariable Integer topic_id, @PathVariable Integer related_host_id) {
		topicService.deleteTopicHost(topic_id, related_host_id);
	}

	/**
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/newTopic%7Bb067b2c3-5763-4bff-9fd5-af04602c3195%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic", method = RequestMethod.POST)
	@ResponseBody
	public Topic newTopic(@RequestBody Topic topic) {
		topicService.saveTopic(topic);
		return topicDAO.findTopicByPrimaryKey(topic.getId());
	}

	/**
	* Select an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/loadTopic%7B80bd089b-94cb-4bbd-bb0f-7b306f70a6a4%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}", method = RequestMethod.GET)
	@ResponseBody
	public Topic loadTopic(@PathVariable Integer topic_id) {
		return topicDAO.findTopicByPrimaryKey(topic_id);
	}

	/**
	* Get Host entity by Topic
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/getTopicHost%7Be544f280-6218-4122-8e45-2586042112bd%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/host", method = RequestMethod.GET)
	@ResponseBody
	public Host getTopicHost(@PathVariable Integer topic_id) {
		return topicDAO.findTopicByPrimaryKey(topic_id).getHost();
	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/saveTopicHost%7B1dc310d9-c880-4e6d-9ec5-072799c32d7f%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/host", method = RequestMethod.PUT)
	@ResponseBody
	public Host saveTopicHost(@PathVariable Integer topic_id, @RequestBody Host host) {
		topicService.saveTopicHost(topic_id, host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* Save an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/saveTopicPosts%7B950ab313-0b55-4258-a6c6-6cfd20ffc4f1%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/posts", method = RequestMethod.PUT)
	@ResponseBody
	public Post saveTopicPosts(@PathVariable Integer topic_id, @RequestBody Post posts) {
		topicService.saveTopicPosts(topic_id, posts);
		return postDAO.findPostByPrimaryKey(posts.getId());
	}

	/**
	* Save an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/saveTopicForum%7Bc5621a38-f3b9-4d4e-a258-53e119c47c8c%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/forum", method = RequestMethod.PUT)
	@ResponseBody
	public Forum saveTopicForum(@PathVariable Integer topic_id, @RequestBody Forum forum) {
		topicService.saveTopicForum(topic_id, forum);
		return forumDAO.findForumByPrimaryKey(forum.getId());
	}

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/deleteTopicPosts%7B60662039-a7ac-4c9b-8f16-b9081f1931d2%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/posts/{post_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTopicPosts(@PathVariable Integer topic_id, @PathVariable Integer related_posts_id) {
		topicService.deleteTopicPosts(topic_id, related_posts_id);
	}

	/**
	* Show all Topic entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/listTopics%7B1558604c-56ae-4ccb-9d9d-02f68f18ec13%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic", method = RequestMethod.GET)
	@ResponseBody
	public List<Topic> listTopics() {
		return new java.util.ArrayList<Topic>(topicService.loadTopics());
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/saveTopic%7Be8098995-189e-4ef6-b22b-e4fd1c4f1cff%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic", method = RequestMethod.PUT)
	@ResponseBody
	public Topic saveTopic(@RequestBody Topic topic) {
		topicService.saveTopic(topic);
		return topicDAO.findTopicByPrimaryKey(topic.getId());
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/initBinder%7Be43f832e-6e08-43ce-907f-2f045e95895a%7D/.properties.swoperation]
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
	* View an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/loadTopicPosts%7Bf713e2ff-27dd-4602-96c7-966d2a986a1a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/posts/{post_id}", method = RequestMethod.GET)
	@ResponseBody
	public Post loadTopicPosts(@PathVariable Integer topic_id, @PathVariable Integer related_posts_id) {
		Post post = postDAO.findPostByPrimaryKey(related_posts_id, -1, -1);

		return post;
	}

	/**
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/newTopicHost%7Bf45c0033-81b9-4342-b6de-56d14662d8b0%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/host", method = RequestMethod.POST)
	@ResponseBody
	public Host newTopicHost(@PathVariable Integer topic_id, @RequestBody Host host) {
		topicService.saveTopicHost(topic_id, host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* View an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/loadTopicHost%7B4953e589-8ff4-4e24-89e5-c6d3ea8d296c%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/host/{host_id}", method = RequestMethod.GET)
	@ResponseBody
	public Host loadTopicHost(@PathVariable Integer topic_id, @PathVariable Integer related_host_id) {
		Host host = hostDAO.findHostByPrimaryKey(related_host_id, -1, -1);

		return host;
	}

	/**
	* Get Forum entity by Topic
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/getTopicForum%7B1d8b5d02-1da7-46c6-ab97-c92c5db48200%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/forum", method = RequestMethod.GET)
	@ResponseBody
	public Forum getTopicForum(@PathVariable Integer topic_id) {
		return topicDAO.findTopicByPrimaryKey(topic_id).getForum();
	}

	/**
	* Create a new Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/newTopicPosts%7Bd8da2a2e-af60-491a-be5b-39f0f16dd843%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/posts", method = RequestMethod.POST)
	@ResponseBody
	public Post newTopicPosts(@PathVariable Integer topic_id, @RequestBody Post post) {
		topicService.saveTopicPosts(topic_id, post);
		return postDAO.findPostByPrimaryKey(post.getId());
	}

	/**
	* Delete an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/deleteTopicForum%7B4ab36ad0-7e19-4f76-9a59-934337f63191%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/forum/{forum_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTopicForum(@PathVariable Integer topic_id, @PathVariable Integer related_forum_id) {
		topicService.deleteTopicForum(topic_id, related_forum_id);
	}

	/**
	* View an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/loadTopicForum%7B29cf91df-3a20-4215-884a-ceb73f098fee%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/forum/{forum_id}", method = RequestMethod.GET)
	@ResponseBody
	public Forum loadTopicForum(@PathVariable Integer topic_id, @PathVariable Integer related_forum_id) {
		Forum forum = forumDAO.findForumByPrimaryKey(related_forum_id, -1, -1);

		return forum;
	}

	/**
	* Show all Post entities by Topic
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/getTopicPosts%7B25f865b0-1c9f-4862-9a01-9a32ff02772f%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/posts", method = RequestMethod.GET)
	@ResponseBody
	public List<Post> getTopicPosts(@PathVariable Integer topic_id) {
		return new java.util.ArrayList<Post>(topicDAO.findTopicByPrimaryKey(topic_id).getPosts());
	}

	/**
	* Create a new Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/newTopicForum%7B3b5a64ee-5f28-41e7-9f1d-45df41e42919%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}/forum", method = RequestMethod.POST)
	@ResponseBody
	public Forum newTopicForum(@PathVariable Integer topic_id, @RequestBody Forum forum) {
		topicService.saveTopicForum(topic_id, forum);
		return forumDAO.findForumByPrimaryKey(forum.getId());
	}

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/TopicRestController/deleteTopic%7B50391368-9439-49c8-aad6-51bac8c7fccf%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Topic/{topic_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTopic(@PathVariable Integer topic_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topic_id);
		topicService.deleteTopic(topic);
	}
}