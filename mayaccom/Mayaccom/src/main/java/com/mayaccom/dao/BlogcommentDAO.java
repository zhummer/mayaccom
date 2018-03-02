
package com.mayaccom.dao;

import com.mayaccom.domain.Blogcomment;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Blogcomment entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface BlogcommentDAO extends JpaDao<Blogcomment> {

	/**
	 * JPQL Query - findAllBlogcomments
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findAllBlogcomments.query]JPASelect
	 */
	public Set<Blogcomment> findAllBlogcomments() throws DataAccessException;

	/**
	 * JPQL Query - findAllBlogcomments
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findAllBlogcomments.query]JPASelectWithPagination
	 */
	public Set<Blogcomment> findAllBlogcomments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBlogcommentByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findBlogcommentByPrimaryKey.query]JPASelect
	 */
	public Blogcomment findBlogcommentByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findBlogcommentByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findBlogcommentByPrimaryKey.query]JPASelectWithPagination
	 */
	public Blogcomment findBlogcommentByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

}