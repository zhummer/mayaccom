
package com.mayaccom.dao;

import com.mayaccom.domain.Blog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Blog entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/.properties.datastore]
 * @generated
 */
@Repository("BlogDAO")

@Transactional
public class BlogDAOImpl extends AbstractJpaDao<Blog> implements BlogDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Blog.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BlogDAOImpl
	 *
	* @generated
	 */
	public BlogDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	* @generated
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	* @generated
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findBlogByDescription
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByDescription.query]JPASelect
	 */
	@Transactional
	public Set<Blog> findBlogByDescription(String description1) throws DataAccessException {

		return findBlogByDescription(description1, -1, -1);
	}

	/**
	 * JPQL Query - findBlogByDescription
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByDescription.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Blog> findBlogByDescription(String description1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBlogByDescription", startResult, maxRows, description1);
		return new LinkedHashSet<Blog>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllBlogs
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findAllBlogs.query]JPASelect
	 */
	@Transactional
	public Set<Blog> findAllBlogs() throws DataAccessException {

		return findAllBlogs(-1, -1);
	}

	/**
	 * JPQL Query - findAllBlogs
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findAllBlogs.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Blog> findAllBlogs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBlogs", startResult, maxRows);
		return new LinkedHashSet<Blog>(query.getResultList());
	}

	/**
	 * JPQL Query - findBlogById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogById.query]JPASelect
	 */
	@Transactional
	public Blog findBlogById(Integer id) throws DataAccessException {

		return findBlogById(id, -1, -1);
	}

	/**
	 * JPQL Query - findBlogById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogById.query]JPASelectWithPagination
	 */

	@Transactional
	public Blog findBlogById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBlogById", startResult, maxRows, id);
			return (com.mayaccom.domain.Blog) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBlogByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Blog findBlogByPrimaryKey(Integer id) throws DataAccessException {

		return findBlogByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBlogByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Blog findBlogByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBlogByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Blog) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBlogByTitleContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitleContaining.query]JPASelect
	 */
	@Transactional
	public Set<Blog> findBlogByTitleContaining(String title) throws DataAccessException {

		return findBlogByTitleContaining(title, -1, -1);
	}

	/**
	 * JPQL Query - findBlogByTitleContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitleContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Blog> findBlogByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBlogByTitleContaining", startResult, maxRows, title);
		return new LinkedHashSet<Blog>(query.getResultList());
	}

	/**
	 * JPQL Query - findBlogByTitle
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitle.query]JPASelect
	 */
	@Transactional
	public Set<Blog> findBlogByTitle(String title) throws DataAccessException {

		return findBlogByTitle(title, -1, -1);
	}

	/**
	 * JPQL Query - findBlogByTitle
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogDAO/findBlogByTitle.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Blog> findBlogByTitle(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBlogByTitle", startResult, maxRows, title);
		return new LinkedHashSet<Blog>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Blog entity) {
		return true;
	}
}
