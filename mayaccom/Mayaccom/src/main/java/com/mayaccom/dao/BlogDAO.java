
package com.mayaccom.dao;

import com.mayaccom.domain.Blog;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Blog entities.
 * 
 */
public interface BlogDAO extends JpaDao<Blog> {

	/**
	 * JPQL Query - findAllBlogs
	 *
	 */
	public Set<Blog> findAllBlogs() throws DataAccessException;

	/**
	 * JPQL Query - findAllBlogs
	 *
	 */
	public Set<Blog> findAllBlogs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByDescription
	 *
	 */
	public Set<Blog> findBlogByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByDescription
	 *
	 */
	public Set<Blog> findBlogByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitle
	 *
	 */
	public Set<Blog> findBlogByTitle(String title) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitle
	 *
	 */
	public Set<Blog> findBlogByTitle(String title, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitleContaining
	 *
	 */
	public Set<Blog> findBlogByTitleContaining(String title_1) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByTitleContaining
	 *
	 */
	public Set<Blog> findBlogByTitleContaining(String title_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogById
	 *
	 */
	public Blog findBlogById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findBlogById
	 *
	 */
	public Blog findBlogById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByPrimaryKey
	 *
	 */
	public Blog findBlogByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByPrimaryKey
	 *
	 */
	public Blog findBlogByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByOwner
	 *
	 */
	public Set<Blog> findBlogByOwner(Integer owner) throws DataAccessException;

	/**
	 * JPQL Query - findBlogByOwner
	 *
	 */
	public Set<Blog> findBlogByOwner(Integer owner, int startResult, int maxRows) throws DataAccessException;

}