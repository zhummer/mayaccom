
package com.mayaccom.dao;

import com.mayaccom.domain.Authorities;

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
 * DAO to manage Authorities entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/.properties.datastore]
 * @generated
 */
@Repository("AuthoritiesDAO")

@Transactional
public class AuthoritiesDAOImpl extends AbstractJpaDao<Authorities> implements AuthoritiesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Authorities.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AuthoritiesDAOImpl
	 *
	* @generated
	 */
	public AuthoritiesDAOImpl() {
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
	 * JPQL Query - findAuthoritiesByAuthoritynameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthoritynameContaining.query]JPASelect
	 */
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthoritynameContaining(String authorityname) throws DataAccessException {

		return findAuthoritiesByAuthoritynameContaining(authorityname, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByAuthoritynameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthoritynameContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthoritynameContaining(String authorityname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAuthoritiesByAuthoritynameContaining", startResult, maxRows, authorityname);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Authorities findAuthoritiesByPrimaryKey(String id) throws DataAccessException {

		return findAuthoritiesByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Authorities findAuthoritiesByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAuthoritiesByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Authorities) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAllAuthoritiess.query]JPASelect
	 */
	@Transactional
	public Set<Authorities> findAllAuthoritiess() throws DataAccessException {

		return findAllAuthoritiess(-1, -1);
	}

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAllAuthoritiess.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAllAuthoritiess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAuthoritiess", startResult, maxRows);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesById.query]JPASelect
	 */
	@Transactional
	public Authorities findAuthoritiesById(String id) throws DataAccessException {

		return findAuthoritiesById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesById.query]JPASelectWithPagination
	 */

	@Transactional
	public Authorities findAuthoritiesById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAuthoritiesById", startResult, maxRows, id);
			return (com.mayaccom.domain.Authorities) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAuthoritiesByIdContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByIdContaining.query]JPASelect
	 */
	@Transactional
	public Set<Authorities> findAuthoritiesByIdContaining(String id) throws DataAccessException {

		return findAuthoritiesByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByIdContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByIdContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAuthoritiesByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAuthoritiesByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAuthoritiesByAuthorityname
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthorityname.query]JPASelect
	 */
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthorityname(String authorityname) throws DataAccessException {

		return findAuthoritiesByAuthorityname(authorityname, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByAuthorityname
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthorityname.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthorityname(String authorityname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAuthoritiesByAuthorityname", startResult, maxRows, authorityname);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Authorities entity) {
		return true;
	}
}
