
package com.mayaccom.dao;

import com.mayaccom.domain.Forum;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Forum entities.
 * 
 */
public interface ForumDAO extends JpaDao<Forum> {

	/**
	 * JPQL Query - findForumByNameContaining
	 *
	 */
	public Set<Forum> findForumByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findForumByNameContaining
	 *
	 */
	public Set<Forum> findForumByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumById
	 *
	 */
	public Forum findForumById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findForumById
	 *
	 */
	public Forum findForumById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescriptionContaining
	 *
	 */
	public Set<Forum> findForumByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescriptionContaining
	 *
	 */
	public Set<Forum> findForumByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByName
	 *
	 */
	public Set<Forum> findForumByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findForumByName
	 *
	 */
	public Set<Forum> findForumByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByPrimaryKey
	 *
	 */
	public Forum findForumByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findForumByPrimaryKey
	 *
	 */
	public Forum findForumByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllForums
	 *
	 */
	public Set<Forum> findAllForums() throws DataAccessException;

	/**
	 * JPQL Query - findAllForums
	 *
	 */
	public Set<Forum> findAllForums(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescription
	 *
	 */
	public Set<Forum> findForumByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescription
	 *
	 */
	public Set<Forum> findForumByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

}