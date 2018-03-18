package com.mayaccom.service;

import com.mayaccom.dao.ForumDAO;

import com.mayaccom.domain.Forum;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Forum entities
 * 
 */

@Service("ForumService")

@Transactional
public class ForumServiceImpl implements ForumService {

	/**
	 * DAO injected by Spring that manages Forum entities
	 * 
	 */
	@Autowired
	private ForumDAO forumDAO;

	/**
	 * Instantiates a new ForumServiceImpl.
	 *
	 */
	public ForumServiceImpl() {
	}

	/**
	 * Return all Forum entity
	 * 
	 */
	@Transactional
	public List<Forum> findAllForums(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Forum>(forumDAO.findAllForums(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Forum findForumByPrimaryKey(Integer id) {
		return forumDAO.findForumByPrimaryKey(id);
	}

	/**
	 * Delete an existing Forum entity
	 * 
	 */
	@Transactional
	public void deleteForum(Forum forum) {
		forumDAO.remove(forum);
		forumDAO.flush();
	}

	/**
	 * Save an existing Forum entity
	 * 
	 */
	@Transactional
	public void saveForum(Forum forum) {
		Forum existingForum = forumDAO.findForumByPrimaryKey(forum.getId());

		if (existingForum != null) {
			if (existingForum != forum) {
				existingForum.setId(forum.getId());
				existingForum.setDescription(forum.getDescription());
				existingForum.setName(forum.getName());
			}
			forum = forumDAO.store(existingForum);
		} else {
			forum = forumDAO.store(forum);
		}
		forumDAO.flush();
	}

	/**
	 * Load an existing Forum entity
	 * 
	 */
	@Transactional
	public Set<Forum> loadForums() {
		return forumDAO.findAllForums();
	}

	/**
	 * Return a count of all Forum entity
	 * 
	 */
	@Transactional
	public Integer countForums() {
		return ((Long) forumDAO.createQuerySingleResult("select count(o) from Forum o").getSingleResult()).intValue();
	}
}
