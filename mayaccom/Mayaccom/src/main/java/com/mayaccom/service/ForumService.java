
package com.mayaccom.service;

import com.mayaccom.domain.Forum;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Forum entities
 * 
 */
public interface ForumService {

	/**
	* Return all Forum entity
	* 
	 */
	public List<Forum> findAllForums(Integer startResult, Integer maxRows);

	/**
	 */
	public Forum findForumByPrimaryKey(Integer id);

	/**
	* Delete an existing Forum entity
	* 
	 */
	public void deleteForum(Forum forum);

	/**
	* Save an existing Forum entity
	* 
	 */
	public void saveForum(Forum forum_1);

	/**
	* Load an existing Forum entity
	* 
	 */
	public Set<Forum> loadForums();

	/**
	* Return a count of all Forum entity
	* 
	 */
	public Integer countForums();
}