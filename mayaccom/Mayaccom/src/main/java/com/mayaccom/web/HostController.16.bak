package com.mayaccom.web;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import com.mayaccom.service.HostService;

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
 * Spring MVC controller that handles CRUD requests for Host entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/.properties.webcontroller]
 * @generated
 */

@Controller("HostController")

public class HostController {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/.properties.webcontroller#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/.properties.webcontroller#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/.properties.webcontroller#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/.properties.webcontroller#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/.properties.webcontroller#//@variables%5Bname='hostService'%5D]
	 */
	@Autowired
	private HostService hostService;

	/**
	 * Show all Accomodation entities by Host
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/listHostAccomodations%7B435787cf-f0b7-4124-acc7-fea1716b7b5b%7D/.properties.swoperation]
	 */
	@RequestMapping("/listHostAccomodations")
	public ModelAndView listHostAccomodations(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(idKey));
		mav.setViewName("host/accomodations/listAccomodations.jsp");

		return mav;
	}

	/**
	* View an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/selectHostPosts%7Baba8a8b7-61f7-4048-bd5e-f3eced4319ae%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectHostPosts")
	public ModelAndView selectHostPosts(@RequestParam Integer host_id, @RequestParam Integer posts_id) {
		Post post = postDAO.findPostByPrimaryKey(posts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("post", post);
		mav.setViewName("host/posts/viewPosts.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/streamBinary%7B2ab7e309-a92b-45f4-827f-38921d3e0676%7D/.properties.swoperation]
	*/
	@RequestMapping("/hostController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select the Host entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/confirmDeleteHost%7B0a6b325e-c357-497c-9868-20238ca4121f%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteHost")
	public ModelAndView confirmDeleteHost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(idKey));
		mav.setViewName("host/deleteHost.jsp");

		return mav;
	}

	/**
	* Entry point to show all Host entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/indexHost%7Bc76e9e77-f331-4407-ad04-e08795ebb02f%7D/.properties.swoperation]
	*/
	public String indexHost() {
		return "redirect:/indexHost";
	}

	/**
	* Save an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/saveHostAccomodations%7Be5fba1e9-d29a-41d1-9879-cf57166ac57f%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveHostAccomodations")
	public ModelAndView saveHostAccomodations(@RequestParam Integer host_id, @ModelAttribute Accomodation accomodations) {
		Host parent_host = hostService.saveHostAccomodations(host_id, accomodations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("host", parent_host);
		mav.setViewName("host/viewHost.jsp");

		return mav;
	}

	/**
	* Save an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/saveHostPosts%7B98ea47d9-6903-47b4-b3d9-1ef178465e00%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveHostPosts")
	public ModelAndView saveHostPosts(@RequestParam Integer host_id, @ModelAttribute Post posts) {
		Host parent_host = hostService.saveHostPosts(host_id, posts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("host", parent_host);
		mav.setViewName("host/viewHost.jsp");

		return mav;
	}

	/**
	* Select the child Post entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/confirmDeleteHostPosts%7B59316e06-21ca-4973-b67f-d0c17bea4765%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteHostPosts")
	public ModelAndView confirmDeleteHostPosts(@RequestParam Integer host_id, @RequestParam Integer related_posts_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("post", postDAO.findPostByPrimaryKey(related_posts_id));
		mav.addObject("host_id", host_id);
		mav.setViewName("host/posts/deletePosts.jsp");

		return mav;
	}

	/**
	* Create a new Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/newHostTopics%7B0e923dbe-5724-49fb-b78a-446486d108a4%7D/.properties.swoperation]
	*/
	@RequestMapping("/newHostTopics")
	public ModelAndView newHostTopics(@RequestParam Integer host_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("topic", new Topic());
		mav.addObject("newFlag", true);
		mav.setViewName("host/topics/editTopics.jsp");

		return mav;
	}

	/**
	* Show all Post entities by Host
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/listHostPosts%7Bf2bf2cfe-3fe6-410c-83b4-46214ef4be1d%7D/.properties.swoperation]
	*/
	@RequestMapping("/listHostPosts")
	public ModelAndView listHostPosts(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(idKey));
		mav.setViewName("host/posts/listPosts.jsp");

		return mav;
	}

	/**
	* Create a new Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/newHostAccomodations%7B002af6fb-ce78-42ce-b350-7a7623c4b3d6%7D/.properties.swoperation]
	*/
	@RequestMapping("/newHostAccomodations")
	public ModelAndView newHostAccomodations(@RequestParam Integer host_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("accomodation", new Accomodation());
		mav.addObject("newFlag", true);
		mav.setViewName("host/accomodations/editAccomodations.jsp");

		return mav;
	}

	/**
	* Show all Host entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/listHosts%7B6a98b3e0-88b7-49f6-9fd4-7038465dbb43%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexHost")
	public ModelAndView listHosts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("hosts", hostService.loadHosts());

		mav.setViewName("host/listHosts.jsp");

		return mav;
	}

	/**
	* Select the child Topic entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/confirmDeleteHostTopics%7B6d3abb44-dcb0-4b34-9222-ba29d2cc6c57%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteHostTopics")
	public ModelAndView confirmDeleteHostTopics(@RequestParam Integer host_id, @RequestParam Integer related_topics_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("topic", topicDAO.findTopicByPrimaryKey(related_topics_id));
		mav.addObject("host_id", host_id);
		mav.setViewName("host/topics/deleteTopics.jsp");

		return mav;
	}

	/**
	* Edit an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/editHost%7Be0965005-0839-4dac-aa38-64835c48f8e6%7D/.properties.swoperation]
	*/
	@RequestMapping("/editHost")
	public ModelAndView editHost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(idKey));
		mav.setViewName("host/editHost.jsp");

		return mav;
	}

	/**
	* View an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/selectHostAccomodations%7Bbc2c70e6-1e6b-4c3d-9702-227bc2338f80%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectHostAccomodations")
	public ModelAndView selectHostAccomodations(@RequestParam Integer host_id, @RequestParam Integer accomodations_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodations_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("accomodation", accomodation);
		mav.setViewName("host/accomodations/viewAccomodations.jsp");

		return mav;
	}

	/**
	* Edit an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/editHostPosts%7Ba42a2ef1-f3d3-461e-b23e-b97bd8e0a269%7D/.properties.swoperation]
	*/
	@RequestMapping("/editHostPosts")
	public ModelAndView editHostPosts(@RequestParam Integer host_id, @RequestParam Integer posts_id) {
		Post post = postDAO.findPostByPrimaryKey(posts_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("post", post);
		mav.setViewName("host/posts/editPosts.jsp");

		return mav;
	}

	/**
	* Show all Topic entities by Host
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/listHostTopics%7B8d1074ba-3151-4bab-996b-888b989f81f4%7D/.properties.swoperation]
	*/
	@RequestMapping("/listHostTopics")
	public ModelAndView listHostTopics(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(idKey));
		mav.setViewName("host/topics/listTopics.jsp");

		return mav;
	}

	/**
	* Select the child Accomodation entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/confirmDeleteHostAccomodations%7B3680928d-e3aa-4037-8e2b-e5df61c3c4f1%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteHostAccomodations")
	public ModelAndView confirmDeleteHostAccomodations(@RequestParam Integer host_id, @RequestParam Integer related_accomodations_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(related_accomodations_id));
		mav.addObject("host_id", host_id);
		mav.setViewName("host/accomodations/deleteAccomodations.jsp");

		return mav;
	}

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/deleteHost%7B64dc8a10-6710-4e4b-a71b-44ee5c738d91%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteHost")
	public String deleteHost(@RequestParam Integer idKey) {
		Host host = hostDAO.findHostByPrimaryKey(idKey);
		hostService.deleteHost(host);
		return "forward:/indexHost";
	}

	/**
	* Edit an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/editHostAccomodations%7Be944f41c-3713-4f79-8fdd-b23cfe42c0ac%7D/.properties.swoperation]
	*/
	@RequestMapping("/editHostAccomodations")
	public ModelAndView editHostAccomodations(@RequestParam Integer host_id, @RequestParam Integer accomodations_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodations_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("accomodation", accomodation);
		mav.setViewName("host/accomodations/editAccomodations.jsp");

		return mav;
	}

	/**
	* Create a new Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/newHostPosts%7B1c74fb3a-153a-4800-9eb0-4168dc91a0cc%7D/.properties.swoperation]
	*/
	@RequestMapping("/newHostPosts")
	public ModelAndView newHostPosts(@RequestParam Integer host_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("post", new Post());
		mav.addObject("newFlag", true);
		mav.setViewName("host/posts/editPosts.jsp");

		return mav;
	}

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/saveHost%7B1c8f0f6e-e02a-4caf-97b9-911f3e278671%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveHost")
	public String saveHost(@ModelAttribute Host host) {
		hostService.saveHost(host);
		return "forward:/indexHost";
	}

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/deleteHostTopics%7Be0decddd-381c-4b7c-ab7f-4611abb42e94%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteHostTopics")
	public ModelAndView deleteHostTopics(@RequestParam Integer host_id, @RequestParam Integer related_topics_id) {
		ModelAndView mav = new ModelAndView();

		Host host = hostService.deleteHostTopics(host_id, related_topics_id);

		mav.addObject("host_id", host_id);
		mav.addObject("host", host);
		mav.setViewName("host/viewHost.jsp");

		return mav;
	}

	/**
	* Select an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/selectHost%7B346c1bbc-cc28-46fb-8675-2eb9754c1235%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectHost")
	public ModelAndView selectHost(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", hostDAO.findHostByPrimaryKey(idKey));
		mav.setViewName("host/viewHost.jsp");

		return mav;
	}

	/**
	* View an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/selectHostTopics%7Bf3886c51-5ae5-43c2-b943-3aa75833d729%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectHostTopics")
	public ModelAndView selectHostTopics(@RequestParam Integer host_id, @RequestParam Integer topics_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topics_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("topic", topic);
		mav.setViewName("host/topics/viewTopics.jsp");

		return mav;
	}

	/**
	* Delete an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/deleteHostAccomodations%7Bd9467d24-9f6d-48ba-a6c8-768c14cedfac%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteHostAccomodations")
	public ModelAndView deleteHostAccomodations(@RequestParam Integer host_id, @RequestParam Integer related_accomodations_id) {
		ModelAndView mav = new ModelAndView();

		Host host = hostService.deleteHostAccomodations(host_id, related_accomodations_id);

		mav.addObject("host_id", host_id);
		mav.addObject("host", host);
		mav.setViewName("host/viewHost.jsp");

		return mav;
	}

	/**
	* Edit an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/editHostTopics%7Bce83bd09-94a2-40c1-be59-0ef6d982b12d%7D/.properties.swoperation]
	*/
	@RequestMapping("/editHostTopics")
	public ModelAndView editHostTopics(@RequestParam Integer host_id, @RequestParam Integer topics_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topics_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("topic", topic);
		mav.setViewName("host/topics/editTopics.jsp");

		return mav;
	}

	/**
	* Create a new Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/newHost%7Bcd247cf3-e4d0-46e3-a2f3-82e15577f5cb%7D/.properties.swoperation]
	*/
	@RequestMapping("/newHost")
	public ModelAndView newHost() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("host", new Host());
		mav.addObject("newFlag", true);
		mav.setViewName("host/editHost.jsp");

		return mav;
	}

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/saveHostTopics%7Ba92111cc-2fb4-4fd3-a6d2-ee0dd0e136a9%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveHostTopics")
	public ModelAndView saveHostTopics(@RequestParam Integer host_id, @ModelAttribute Topic topics) {
		Host parent_host = hostService.saveHostTopics(host_id, topics);

		ModelAndView mav = new ModelAndView();
		mav.addObject("host_id", host_id);
		mav.addObject("host", parent_host);
		mav.setViewName("host/viewHost.jsp");

		return mav;
	}

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/deleteHostPosts%7B7c9b1298-97f9-4c01-af1c-84923f8f0710%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteHostPosts")
	public ModelAndView deleteHostPosts(@RequestParam Integer host_id, @RequestParam Integer related_posts_id) {
		ModelAndView mav = new ModelAndView();

		Host host = hostService.deleteHostPosts(host_id, related_posts_id);

		mav.addObject("host_id", host_id);
		mav.addObject("host", host);
		mav.setViewName("host/viewHost.jsp");

		return mav;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/HostController/initBinder%7B989a782a-0f9c-4cfa-9cb4-61a49b09ab02%7D/.properties.swoperation]
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
}