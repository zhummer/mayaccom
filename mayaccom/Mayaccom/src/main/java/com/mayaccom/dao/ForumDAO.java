
package com.mayaccom.dao;

import com.mayaccom.domain.Forum;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Forum entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface ForumDAO extends JpaDao<Forum> {

	/**
	 * JPQL Query - findForumById
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumById.query]JPASelect
	 */
	public Forum findForumById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findForumById
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumById.query]JPASelectWithPagination
	 */
	public Forum findForumById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByName
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByName.query]JPASelect
	 */
	public Set<Forum> findForumByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findForumByName
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByName.query]JPASelectWithPagination
	 */
	public Set<Forum> findForumByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescription
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByDescription.query]JPASelect
	 */
	public Set<Forum> findForumByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescription
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByDescription.query]JPASelectWithPagination
	 */
	public Set<Forum> findForumByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllForums
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findAllForums.query]JPASelect
	 */
	public Set<Forum> findAllForums() throws DataAccessException;

	/**
	 * JPQL Query - findAllForums
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findAllForums.query]JPASelectWithPagination
	 */
	public Set<Forum> findAllForums(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescriptionContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByDescriptionContaining.query]JPASelect
	 */
	public Set<Forum> findForumByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findForumByDescriptionContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByDescriptionContaining.query]JPASelectWithPagination
	 */
	public Set<Forum> findForumByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByNameContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByNameContaining.query]JPASelect
	 */
	public Set<Forum> findForumByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findForumByNameContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByNameContaining.query]JPASelectWithPagination
	 */
	public Set<Forum> findForumByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findForumByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByPrimaryKey.query]JPASelect
	 */
	public Forum findForumByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findForumByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ForumDAO/findForumByPrimaryKey.query]JPASelectWithPagination
	 */
	public Forum findForumByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}