package com.mayaccom.service;

import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Post entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/.properties.srv]
 * @generated
 */

@Service("PostService")

@Transactional
public class PostServiceImpl implements PostService {

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/.properties.srv#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/.properties.srv#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/.properties.srv#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Instantiates a new PostServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public PostServiceImpl() {
	}

	/**
	 * Load an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/loadPosts%7Bc747cd91-ab9e-4ead-a97d-666c9e31cf24%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Post> loadPosts() {
		return postDAO.findAllPosts();
	}

	/**
	 * Delete an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/deletePostTopic%7B6bb51d99-4212-4f47-b3d6-16366045e97c%7D/.properties.swoperation]
	 */
	@Transactional
	public Post deletePostTopic(Integer post_id, Integer related_topic_id) {
		Post post = postDAO.findPostByPrimaryKey(post_id, -1, -1);
		Topic related_topic = topicDAO.findTopicByPrimaryKey(related_topic_id, -1, -1);

		post.setTopic(null);
		related_topic.getPosts().remove(post);
		post = postDAO.store(post);
		postDAO.flush();

		related_topic = topicDAO.store(related_topic);
		topicDAO.flush();

		topicDAO.remove(related_topic);
		topicDAO.flush();

		return post;
	}

	/**
	 * Delete an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/deletePost%7B5747860c-f1fd-47f5-b057-b0556d60a213%7D/.properties.swoperation]
	 */
	@Transactional
	public void deletePost(Post post) {
		postDAO.remove(post);
		postDAO.flush();
	}

	/**
	 * Save an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/savePostHost%7B0b220d49-e095-4cc5-996c-8c8dacf17388%7D/.properties.swoperation]
	 */
	@Transactional
	public Post savePostHost(Integer id, Host related_host) {
		Post post = postDAO.findPostByPrimaryKey(id, -1, -1);
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

		post.setHost(related_host);
		related_host.getPosts().add(post);
		post = postDAO.store(post);
		postDAO.flush();

		related_host = hostDAO.store(related_host);
		hostDAO.flush();

		return post;
	}

	/**
	 * Return all Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/findAllPosts%7B742fdce4-e97c-47e8-82a5-8a239f949a9e%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Post> findAllPosts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Post>(postDAO.findAllPosts(startResult, maxRows));
	}

	/**
	 * Return a count of all Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/countPosts%7Bf5396992-68c0-4828-8d8c-677f0d680790%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countPosts() {
		return ((Long) postDAO.createQuerySingleResult("select count(o) from Post o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/deletePostHost%7Bf082a6fa-5ab6-46d9-b66b-57c76b2c5c93%7D/.properties.swoperation]
	 */
	@Transactional
	public Post deletePostHost(Integer post_id, Integer related_host_id) {
		Post post = postDAO.findPostByPrimaryKey(post_id, -1, -1);
		Host related_host = hostDAO.findHostByPrimaryKey(related_host_id, -1, -1);

		post.setHost(null);
		related_host.getPosts().remove(post);
		post = postDAO.store(post);
		postDAO.flush();

		related_host = hostDAO.store(related_host);
		hostDAO.flush();

		hostDAO.remove(related_host);
		hostDAO.flush();

		return post;
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/findPostByPrimaryKey%7Bc1d93362-8eac-4504-a60d-bc49337d5942%7D/.properties.swoperation]
	 */
	@Transactional
	public Post findPostByPrimaryKey(Integer id) {
		return postDAO.findPostByPrimaryKey(id);
	}

	/**
	 * Save an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/savePostTopic%7B670885be-8f2f-4b86-b584-b22b002c6de1%7D/.properties.swoperation]
	 */
	@Transactional
	public Post savePostTopic(Integer id, Topic related_topic) {
		Post post = postDAO.findPostByPrimaryKey(id, -1, -1);
		Topic existingtopic = topicDAO.findTopicByPrimaryKey(related_topic.getId());

		// copy into the existing record to preserve existing relationships
		if (existingtopic != null) {
			existingtopic.setId(related_topic.getId());
			existingtopic.setName(related_topic.getName());
			existingtopic.setLastPosterId(related_topic.getLastPosterId());
			existingtopic.setLastPostAt(related_topic.getLastPostAt());
			related_topic = existingtopic;
		}

		post.setTopic(related_topic);
		related_topic.getPosts().add(post);
		post = postDAO.store(post);
		postDAO.flush();

		related_topic = topicDAO.store(related_topic);
		topicDAO.flush();

		return post;
	}

	/**
	 * Save an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/savePost%7B77d147de-a811-4e15-a888-b9cc138ab4a1%7D/.properties.swoperation]
	 */
	@Transactional
	public void savePost(Post post) {
		Post existingPost = postDAO.findPostByPrimaryKey(post.getId());

		if (existingPost != null) {
			if (existingPost != post) {
				existingPost.setId(post.getId());
				existingPost.setContent(post.getContent());
			}
			post = postDAO.store(existingPost);
		} else {
			post = postDAO.store(post);
		}
		postDAO.flush();
	}
}
