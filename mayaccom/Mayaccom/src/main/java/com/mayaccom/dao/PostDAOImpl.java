
package com.mayaccom.dao;

import com.mayaccom.domain.Post;

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
 * DAO to manage Post entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/.properties.datastore]
 * @generated
 */
@Repository("PostDAO")

@Transactional
public class PostDAOImpl extends AbstractJpaDao<Post> implements PostDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Post.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PostDAOImpl
	 *
	* @generated
	 */
	public PostDAOImpl() {
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
	 * JPQL Query - findPostByContent
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByContent.query]JPASelect
	 */
	@Transactional
	public Set<Post> findPostByContent(String content1) throws DataAccessException {

		return findPostByContent(content1, -1, -1);
	}

	/**
	 * JPQL Query - findPostByContent
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByContent.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Post> findPostByContent(String content1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPostByContent", startResult, maxRows, content1);
		return new LinkedHashSet<Post>(query.getResultList());
	}

	/**
	 * JPQL Query - findPostById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostById.query]JPASelect
	 */
	@Transactional
	public Post findPostById(Integer id) throws DataAccessException {

		return findPostById(id, -1, -1);
	}

	/**
	 * JPQL Query - findPostById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostById.query]JPASelectWithPagination
	 */

	@Transactional
	public Post findPostById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPostById", startResult, maxRows, id);
			return (com.mayaccom.domain.Post) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPostByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Post findPostByPrimaryKey(Integer id) throws DataAccessException {

		return findPostByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findPostByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findPostByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Post findPostByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPostByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Post) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllPosts
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findAllPosts.query]JPASelect
	 */
	@Transactional
	public Set<Post> findAllPosts() throws DataAccessException {

		return findAllPosts(-1, -1);
	}

	/**
	 * JPQL Query - findAllPosts
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PostDAO/findAllPosts.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Post> findAllPosts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPosts", startResult, maxRows);
		return new LinkedHashSet<Post>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Post entity) {
		return true;
	}
}
