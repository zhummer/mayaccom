
package com.mayaccom.dao;

import com.mayaccom.domain.Blogcomment;

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
 * DAO to manage Blogcomment entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/.properties.datastore]
 * @generated
 */
@Repository("BlogcommentDAO")

@Transactional
public class BlogcommentDAOImpl extends AbstractJpaDao<Blogcomment> implements BlogcommentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Blogcomment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BlogcommentDAOImpl
	 *
	* @generated
	 */
	public BlogcommentDAOImpl() {
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
	 * JPQL Query - findAllBlogcomments
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findAllBlogcomments.query]JPASelect
	 */
	@Transactional
	public Set<Blogcomment> findAllBlogcomments() throws DataAccessException {

		return findAllBlogcomments(-1, -1);
	}

	/**
	 * JPQL Query - findAllBlogcomments
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findAllBlogcomments.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Blogcomment> findAllBlogcomments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBlogcomments", startResult, maxRows);
		return new LinkedHashSet<Blogcomment>(query.getResultList());
	}

	/**
	 * JPQL Query - findBlogcommentByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findBlogcommentByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Blogcomment findBlogcommentByPrimaryKey(Integer id) throws DataAccessException {

		return findBlogcommentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBlogcommentByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogcommentDAO/findBlogcommentByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Blogcomment findBlogcommentByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBlogcommentByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Blogcomment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Blogcomment entity) {
		return true;
	}
}
