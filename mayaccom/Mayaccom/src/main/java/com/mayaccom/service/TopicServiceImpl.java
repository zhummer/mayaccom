package com.mayaccom.service;

import com.mayaccom.dao.ForumDAO;
import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Topic entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/.properties.srv]
 * @generated
 */

@Service("TopicService")

@Transactional
public class TopicServiceImpl implements TopicService {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/.properties.srv#//@variables%5Bname='forumDAO'%5D]
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/.properties.srv#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/.properties.srv#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/.properties.srv#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Instantiates a new TopicServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public TopicServiceImpl() {
	}

	/**
	 * Load an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/loadTopics%7Ba06d2503-1ebd-4d00-821c-e06af26ca228%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Topic> loadTopics() {
		return topicDAO.findAllTopics();
	}

	/**
	 * Save an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopicHost%7Bcea4b662-0d66-48c3-a0b3-5e5236431237%7D/.properties.swoperation]
	 */
	@Transactional
	public Topic saveTopicHost(Integer id, Host related_host) {
		Topic topic = topicDAO.findTopicByPrimaryKey(id, -1, -1);
		Host existinghost = hostDAO.findHostByPrimaryKey(related_host.getId());

		// copy into the existing record to preserve existing relationships
		if (existinghost != null) {
			existinghost.setId(related_host.getId());
			existinghost.setContactPerson(related_host.getContactPerson());
			existinghost.setPhone1(related_host.getPhone1());
			existinghost.setPhone2(related_host.getPhone2());
			existinghost.setPhone3(related_host.getPhone3());
			existinghost.setEmail(related_host.getEmail());
			existinghost.setUsername(related_host.getUsername());
			existinghost.setPassword(related_host.getPassword());
			related_host = existinghost;
		}

		topic.setHost(related_host);
		related_host.getTopics().add(topic);
		topic = topicDAO.store(topic);
		topicDAO.flush();

		related_host = hostDAO.store(related_host);
		hostDAO.flush();

		return topic;
	}

	/**
	 * Save an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopic%7B81efd983-48c0-42cd-8fcf-dd2ce83dc708%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveTopic(Topic topic) {
		Topic existingTopic = topicDAO.findTopicByPrimaryKey(topic.getId());

		if (existingTopic != null) {
			if (existingTopic != topic) {
				existingTopic.setId(topic.getId());
				existingTopic.setName(topic.getName());
				existingTopic.setLastPosterId(topic.getLastPosterId());
				existingTopic.setLastPostAt(topic.getLastPostAt());
			}
			topic = topicDAO.store(existingTopic);
		} else {
			topic = topicDAO.store(topic);
		}
		topicDAO.flush();
	}

	/**
	 * Save an existing Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopicForum%7B05401b37-443c-42ca-8f19-7c4e9aa7e7db%7D/.properties.swoperation]
	 */
	@Transactional
	public Topic saveTopicForum(Integer id, Forum related_forum) {
		Topic topic = topicDAO.findTopicByPrimaryKey(id, -1, -1);
		Forum existingforum = forumDAO.findForumByPrimaryKey(related_forum.getId());

		// copy into the existing record to preserve existing relationships
		if (existingforum != null) {
			existingforum.setId(related_forum.getId());
			existingforum.setName(related_forum.getName());
			existingforum.setDescription(related_forum.getDescription());
			related_forum = existingforum;
		}

		topic.setForum(related_forum);
		related_forum.getTopics().add(topic);
		topic = topicDAO.store(topic);
		topicDAO.flush();

		related_forum = forumDAO.store(related_forum);
		forumDAO.flush();

		return topic;
	}

	/**
	 * Delete an existing Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopicForum%7B35159c76-c107-4596-83e8-201384003d0d%7D/.properties.swoperation]
	 */
	@Transactional
	public Topic deleteTopicForum(Integer topic_id, Integer related_forum_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topic_id, -1, -1);
		Forum related_forum = forumDAO.findForumByPrimaryKey(related_forum_id, -1, -1);

		topic.setForum(null);
		related_forum.getTopics().remove(topic);
		topic = topicDAO.store(topic);
		topicDAO.flush();

		related_forum = forumDAO.store(related_forum);
		forumDAO.flush();

		forumDAO.remove(related_forum);
		forumDAO.flush();

		return topic;
	}

	/**
	 * Delete an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopicHost%7B70e8d936-1dbb-43e6-81ae-61502d814747%7D/.properties.swoperation]
	 */
	@Transactional
	public Topic deleteTopicHost(Integer topic_id, Integer related_host_id) {
		Topic topic = topicDAO.findTopicByPrimaryKey(topic_id, -1, -1);
		Host related_host = hostDAO.findHostByPrimaryKey(related_host_id, -1, -1);

		topic.setHost(null);
		related_host.getTopics().remove(topic);
		topic = topicDAO.store(topic);
		topicDAO.flush();

		related_host = hostDAO.store(related_host);
		hostDAO.flush();

		hostDAO.remove(related_host);
		hostDAO.flush();

		return topic;
	}

	/**
	 * Delete an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopicPosts%7B390c33ba-c9ae-4a65-8599-18f0d6700727%7D/.properties.swoperation]
	 */
	@Transactional
	public Topic deleteTopicPosts(Integer topic_id, Integer related_posts_id) {
		Post related_posts = postDAO.findPostByPrimaryKey(related_posts_id, -1, -1);

		Topic topic = topicDAO.findTopicByPrimaryKey(topic_id, -1, -1);

		related_posts.setTopic(null);
		topic.getPosts().remove(related_posts);

		postDAO.remove(related_posts);
		postDAO.flush();

		return topic;
	}

	/**
	 * Delete an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopic%7Be9592c46-b701-4305-a2ae-1870e3d5ef98%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteTopic(Topic topic) {
		topicDAO.remove(topic);
		topicDAO.flush();
	}

	/**
	 * Return all Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/findAllTopics%7Bf2245278-cb96-4268-94ba-fdf8ceb93b75%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Topic> findAllTopics(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Topic>(topicDAO.findAllTopics(startResult, maxRows));
	}

	/**
	 * Return a count of all Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/countTopics%7B1ee2de96-94e8-474a-9553-87bb1a266285%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countTopics() {
		return ((Long) topicDAO.createQuerySingleResult("select count(o) from Topic o").getSingleResult()).intValue();
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/findTopicByPrimaryKey%7Bbe530ad6-477f-4fd8-9b9e-39aead0e6a3c%7D/.properties.swoperation]
	 */
	@Transactional
	public Topic findTopicByPrimaryKey(Integer id) {
		return topicDAO.findTopicByPrimaryKey(id);
	}

	/**
	 * Save an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopicPosts%7Bb7e4795c-e0de-4edb-965b-986d970174f6%7D/.properties.swoperation]
	 */
	@Transactional
	public Topic saveTopicPosts(Integer id, Post related_posts) {
		Topic topic = topicDAO.findTopicByPrimaryKey(id, -1, -1);
		Post existingposts = postDAO.findPostByPrimaryKey(related_posts.getId());

		// copy into the existing record to preserve existing relationships
		if (existingposts != null) {
			existingposts.setId(related_posts.getId());
			existingposts.setContent(related_posts.getContent());
			related_posts = existingposts;
		}

		related_posts.setTopic(topic);
		topic.getPosts().add(related_posts);
		related_posts = postDAO.store(related_posts);
		postDAO.flush();

		topic = topicDAO.store(topic);
		topicDAO.flush();

		return topic;
	}
}
