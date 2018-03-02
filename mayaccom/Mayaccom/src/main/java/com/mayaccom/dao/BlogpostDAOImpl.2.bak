
package com.mayaccom.dao;

import com.mayaccom.domain.Blogpost;

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
 * DAO to manage Blogpost entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/.properties.datastore]
 * @generated
 */
@Repository("BlogpostDAO")

@Transactional
public class BlogpostDAOImpl extends AbstractJpaDao<Blogpost> implements BlogpostDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Blogpost.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BlogpostDAOImpl
	 *
	* @generated
	 */
	public BlogpostDAOImpl() {
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
	 * JPQL Query - findAllBlogposts
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findAllBlogposts.query]JPASelect
	 */
	@Transactional
	public Set<Blogpost> findAllBlogposts() throws DataAccessException {

		return findAllBlogposts(-1, -1);
	}

	/**
	 * JPQL Query - findAllBlogposts
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findAllBlogposts.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Blogpost> findAllBlogposts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBlogposts", startResult, maxRows);
		return new LinkedHashSet<Blogpost>(query.getResultList());
	}

	/**
	 * JPQL Query - findBlogpostByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findBlogpostByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Blogpost findBlogpostByPrimaryKey(Integer id) throws DataAccessException {

		return findBlogpostByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBlogpostByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/BlogpostDAO/findBlogpostByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Blogpost findBlogpostByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBlogpostByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Blogpost) query.getSingleResult();
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
	public boolean canBeMerged(Blogpost entity) {
		return true;
	}
}
