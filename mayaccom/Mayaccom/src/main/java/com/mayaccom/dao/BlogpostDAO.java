
package com.mayaccom.dao;

import com.mayaccom.domain.Blogpost;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Blogpost entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface BlogpostDAO extends JpaDao<Blogpost> {

	/**
	 * JPQL Query - findAllBlogposts
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findAllBlogposts.query]JPASelect
	 */
	public Set<Blogpost> findAllBlogposts() throws DataAccessException;

	/**
	 * JPQL Query - findAllBlogposts
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findAllBlogposts.query]JPASelectWithPagination
	 */
	public Set<Blogpost> findAllBlogposts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogpostByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findBlogpostByPrimaryKey.query]JPASelect
	 */
	public Blogpost findBlogpostByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findBlogpostByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findBlogpostByPrimaryKey.query]JPASelectWithPagination
	 */
	public Blogpost findBlogpostByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

}