
package com.mayaccom.dao;

import com.mayaccom.domain.Blog;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Blog entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface BlogDAO extends JpaDao<Blog> {

	/**
	 * JPQL Query - findBlogByDescription
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByDescription.query]JPASelect
	 */
	public Set<Blog> findBlogByDescription(String description1) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByDescription
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByDescription.query]JPASelectWithPagination
	 */
	public Set<Blog> findBlogByDescription(String description1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBlogs
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findAllBlogs.query]JPASelect
	 */
	public Set<Blog> findAllBlogs() throws DataAccessException;

	/**
	 * JPQL Query - findAllBlogs
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findAllBlogs.query]JPASelectWithPagination
	 */
	public Set<Blog> findAllBlogs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogById
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogById.query]JPASelect
	 */
	public Blog findBlogById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findBlogById
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogById.query]JPASelectWithPagination
	 */
	public Blog findBlogById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByPrimaryKey.query]JPASelect
	 */
	public Blog findBlogByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByPrimaryKey.query]JPASelectWithPagination
	 */
	public Blog findBlogByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitleContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitleContaining.query]JPASelect
	 */
	public Set<Blog> findBlogByTitleContaining(String title) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitleContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitleContaining.query]JPASelectWithPagination
	 */
	public Set<Blog> findBlogByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitle
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitle.query]JPASelect
	 */
	public Set<Blog> findBlogByTitle(String title_1) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitle
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitle.query]JPASelectWithPagination
	 */
	public Set<Blog> findBlogByTitle(String title_1, int startResult, int maxRows) throws DataAccessException;

}