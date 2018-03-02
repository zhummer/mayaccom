package com.mayaccom.service;

import com.mayaccom.dao.ForumDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Topic;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Forum entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/.properties.srv]
 * @generated
 */

@Service("ForumService")

@Transactional
public class ForumServiceImpl implements ForumService {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/.properties.srv#//@variables%5Bname='forumDAO'%5D]
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/.properties.srv#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Instantiates a new ForumServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public ForumServiceImpl() {
	}

	/**
	 * Save an existing Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/saveForum%7Be72a2de7-dd50-4768-bed0-6dc65a1d66ef%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveForum(Forum forum) {
		Forum existingForum = forumDAO.findForumByPrimaryKey(forum.getId());

		if (existingForum != null) {
			if (existingForum != forum) {
				existingForum.setId(forum.getId());
				existingForum.setName(forum.getName());
				existingForum.setDescription(forum.getDescription());
			}
			forum = forumDAO.store(existingForum);
		} else {
			forum = forumDAO.store(forum);
		}
		forumDAO.flush();
	}

	/**
	 * Delete an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/deleteForumTopics%7Be755e238-c2f5-4fbd-8998-8120e0900441%7D/.properties.swoperation]
	 */
	@Transactional
	public Forum deleteForumTopics(Integer forum_id, Integer related_topics_id) {
		Topic related_topics = topicDAO.findTopicByPrimaryKey(related_topics_id, -1, -1);

		Forum forum = forumDAO.findForumByPrimaryKey(forum_id, -1, -1);

		related_topics.setForum(null);
		forum.getTopics().remove(related_topics);

		topicDAO.remove(related_topics);
		topicDAO.flush();

		return forum;
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/findForumByPrimaryKey%7B841ce4e3-7ce9-4622-a202-6ae982146761%7D/.properties.swoperation]
	 */
	@Transactional
	public Forum findForumByPrimaryKey(Integer id) {
		return forumDAO.findForumByPrimaryKey(id);
	}

	/**
	 * Save an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/saveForumTopics%7B75fd64b4-4a34-404f-b0c5-b1a14d10aeb6%7D/.properties.swoperation]
	 */
	@Transactional
	public Forum saveForumTopics(Integer id, Topic related_topics) {
		Forum forum = forumDAO.findForumByPrimaryKey(id, -1, -1);
		Topic existingtopics = topicDAO.findTopicByPrimaryKey(related_topics.getId());

		// copy into the existing record to preserve existing relationships
		if (existingtopics != null) {
			existingtopics.setId(related_topics.getId());
			existingtopics.setName(related_topics.getName());
			existingtopics.setLastPosterId(related_topics.getLastPosterId());
			existingtopics.setLastPostAt(related_topics.getLastPostAt());
			related_topics = existingtopics;
		}

		related_topics.setForum(forum);
		forum.getTopics().add(related_topics);
		related_topics = topicDAO.store(related_topics);
		topicDAO.flush();

		forum = forumDAO.store(forum);
		forumDAO.flush();

		return forum;
	}

	/**
	 * Return a count of all Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/countForums%7B73aecef3-8ad7-42d5-9f71-833f22a1b4c7%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countForums() {
		return ((Long) forumDAO.createQuerySingleResult("select count(o) from Forum o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/loadForums%7Bfd333c44-70b1-427d-bfd9-df513678cdf6%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Forum> loadForums() {
		return forumDAO.findAllForums();
	}

	/**
	 * Delete an existing Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/deleteForum%7B50bac5a1-5631-4615-b00d-e2c6bea3dc25%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteForum(Forum forum) {
		forumDAO.remove(forum);
		forumDAO.flush();
	}

	/**
	 * Return all Forum entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/findAllForums%7B9f089776-6481-4cfe-9052-e99d4a2d8a9c%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Forum> findAllForums(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Forum>(forumDAO.findAllForums(startResult, maxRows));
	}
}
