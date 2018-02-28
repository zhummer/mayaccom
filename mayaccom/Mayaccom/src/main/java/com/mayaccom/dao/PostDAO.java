
package com.mayaccom.dao;

import com.mayaccom.domain.Post;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Post entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface PostDAO extends JpaDao<Post> {

	/**
	 * JPQL Query - findPostById
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostById.query]JPASelect
	 */
	public Post findPostById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findPostById
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostById.query]JPASelectWithPagination
	 */
	public Post findPostById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostByContent
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByContent.query]JPASelect
	 */
	public Set<Post> findPostByContent(String content1) throws DataAccessException;

	/**
	 * JPQL Query - findPostByContent
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByContent.query]JPASelectWithPagination
	 */
	public Set<Post> findPostByContent(String content1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPosts
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findAllPosts.query]JPASelect
	 */
	public Set<Post> findAllPosts() throws DataAccessException;

	/**
	 * JPQL Query - findAllPosts
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findAllPosts.query]JPASelectWithPagination
	 */
	public Set<Post> findAllPosts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPostByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByPrimaryKey.query]JPASelect
	 */
	public Post findPostByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findPostByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByPrimaryKey.query]JPASelectWithPagination
	 */
	public Post findPostByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}