package com.mayaccom.web.rest;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import com.mayaccom.service.HostService;

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
 * Spring Rest controller that handles CRUD requests for Host entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/.properties.webcontroller]
 * @generated
 */

@Controller("HostRestController")

public class HostRestController {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/.properties.webcontroller#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/.properties.webcontroller#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/.properties.webcontroller#//@variables%5Bname='hostService'%5D]
	 */
	@Autowired
	private HostService hostService;

	/**
	 * Select an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/loadHost%7B02fd3d62-41d2-4f0d-9ae7-2a9673822ebb%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Host/{host_id}", method = RequestMethod.GET)
	@ResponseBody
	public Host loadHost(@PathVariable Integer host_id) {
		return hostDAO.findHostByPrimaryKey(host_id);
	}

	/**
	* Create a new Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/newHostAccomodations%7B110c84eb-fc40-4a4a-bbb8-1fad5da24cee%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/accomodations", method = RequestMethod.POST)
	@ResponseBody
	public Accomodation newHostAccomodations(@PathVariable Integer host_id, @RequestBody Accomodation accomodation) {
		hostService.saveHostAccomodations(host_id, accomodation);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());
	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/saveHost%7B84b9cf39-688a-40a4-abc4-86177e71d178%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host", method = RequestMethod.PUT)
	@ResponseBody
	public Host saveHost(@RequestBody Host host) {
		hostService.saveHost(host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* View an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/loadHostTopics%7B9e7845e7-9a55-4376-986b-e45fb1c9c80f%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/topics/{topic_id}", method = RequestMethod.GET)
	@ResponseBody
	public Topic loadHostTopics(@PathVariable Integer host_id, @PathVariable Integer related_topics_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(related_topics_id, -1, -1);

		return topic;
	}

	/**
	* View an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/loadHostPosts%7Ba95fa066-839a-462b-b235-54c6aa5c6b36%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/posts/{post_id}", method = RequestMethod.GET)
	@ResponseBody
	public Post loadHostPosts(@PathVariable Integer host_id, @PathVariable Integer related_posts_id) {
		Post post = postDAO.findPostByPrimaryKey(related_posts_id, -1, -1);

		return post;
	}

	/**
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/newHost%7B912f8ef0-0086-4122-823d-dbdf0b4c0f9d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host", method = RequestMethod.POST)
	@ResponseBody
	public Host newHost(@RequestBody Host host) {
		hostService.saveHost(host);
		return hostDAO.findHostByPrimaryKey(host.getId());
	}

	/**
	* Show all Accomodation entities by Host
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/getHostAccomodations%7B3d92c0d5-c54d-4e23-be13-dbe4f6a1ac3c%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/accomodations", method = RequestMethod.GET)
	@ResponseBody
	public List<Accomodation> getHostAccomodations(@PathVariable Integer host_id) {
		return new java.util.ArrayList<Accomodation>(hostDAO.findHostByPrimaryKey(host_id).getAccomodations());
	}

	/**
	* Show all Host entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/listHosts%7Bf10510fa-01c6-417c-96cb-7f9768b7adf6%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host", method = RequestMethod.GET)
	@ResponseBody
	public List<Host> listHosts() {
		return new java.util.ArrayList<Host>(hostService.loadHosts());
	}

	/**
	* Show all Topic entities by Host
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/getHostTopics%7Beb94ea72-9b3a-4403-bed2-86ae7dcfb49b%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/topics", method = RequestMethod.GET)
	@ResponseBody
	public List<Topic> getHostTopics(@PathVariable Integer host_id) {
		return new java.util.ArrayList<Topic>(hostDAO.findHostByPrimaryKey(host_id).getTopics());
	}

	/**
	* Delete an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/deleteHostAccomodations%7Ba82a47e9-7f33-419f-aa74-0f31dcf8a542%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/accomodations/{accomodation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteHostAccomodations(@PathVariable Integer host_id, @PathVariable Integer related_accomodations_id) {
		hostService.deleteHostAccomodations(host_id, related_accomodations_id);
	}

	/**
	* Save an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/saveHostPosts%7B75192626-3bfb-47f2-920e-053f496b1a70%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/posts", method = RequestMethod.PUT)
	@ResponseBody
	public Post saveHostPosts(@PathVariable Integer host_id, @RequestBody Post posts) {
		hostService.saveHostPosts(host_id, posts);
		return postDAO.findPostByPrimaryKey(posts.getId());
	}

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/deleteHostPosts%7Bb81cc3f6-fdab-41fb-b6e0-776247ba1990%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/posts/{post_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteHostPosts(@PathVariable Integer host_id, @PathVariable Integer related_posts_id) {
		hostService.deleteHostPosts(host_id, related_posts_id);
	}

	/**
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/newHostTopics%7B61cd44e1-e851-44cc-af42-ae6dbf45f911%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/topics", method = RequestMethod.POST)
	@ResponseBody
	public Topic newHostTopics(@PathVariable Integer host_id, @RequestBody Topic topic) {
		hostService.saveHostTopics(host_id, topic);
		return topicDAO.findTopicByPrimaryKey(topic.getId());
	}

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/deleteHost%7Ba378f183-91c6-4eb0-b55a-d8fee114174f%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteHost(@PathVariable Integer host_id) {
		Host host = hostDAO.findHostByPrimaryKey(host_id);
		hostService.deleteHost(host);
	}

	/**
	* Save an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/saveHostAccomodations%7Ba72c9c2e-103c-4e64-92ff-029f3811c7ff%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/accomodations", method = RequestMethod.PUT)
	@ResponseBody
	public Accomodation saveHostAccomodations(@PathVariable Integer host_id, @RequestBody Accomodation accomodations) {
		hostService.saveHostAccomodations(host_id, accomodations);
		return accomodationDAO.findAccomodationByPrimaryKey(accomodations.getId());
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/saveHostTopics%7Beb8562c7-74d6-49e2-9f70-dce2c942a17a%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/topics", method = RequestMethod.PUT)
	@ResponseBody
	public Topic saveHostTopics(@PathVariable Integer host_id, @RequestBody Topic topics) {
		hostService.saveHostTopics(host_id, topics);
		return topicDAO.findTopicByPrimaryKey(topics.getId());
	}

	/**
	* Show all Post entities by Host
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/getHostPosts%7B81fc7770-dba0-4659-b69c-0d034e08cb29%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/posts", method = RequestMethod.GET)
	@ResponseBody
	public List<Post> getHostPosts(@PathVariable Integer host_id) {
		return new java.util.ArrayList<Post>(hostDAO.findHostByPrimaryKey(host_id).getPosts());
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/initBinder%7Bcd1983f5-7420-4b41-915f-ae1308393766%7D/.properties.swoperation]
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
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/deleteHostTopics%7B531f3277-baf2-44f5-8739-7846cdaee8b2%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/topics/{topic_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteHostTopics(@PathVariable Integer host_id, @PathVariable Integer related_topics_id) {
		hostService.deleteHostTopics(host_id, related_topics_id);
	}

	/**
	* View an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/loadHostAccomodations%7B90a292d2-e77f-45ed-b804-cc160ade8989%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/accomodations/{accomodation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Accomodation loadHostAccomodations(@PathVariable Integer host_id, @PathVariable Integer related_accomodations_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(related_accomodations_id, -1, -1);

		return accomodation;
	}

	/**
	* Create a new Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/HostRestController/newHostPosts%7B559efda8-dadb-4262-b200-3c98b2394d1c%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Host/{host_id}/posts", method = RequestMethod.POST)
	@ResponseBody
	public Post newHostPosts(@PathVariable Integer host_id, @RequestBody Post post) {
		hostService.saveHostPosts(host_id, post);
		return postDAO.findPostByPrimaryKey(post.getId());
	}
}