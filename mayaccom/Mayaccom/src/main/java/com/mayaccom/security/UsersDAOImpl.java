
package com.mayaccom.security;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/UsersDAO/.properties.datastore]
 * @generated
 */
@Repository("UsersDAO")

@Transactional
public class UsersDAOImpl extends AbstractJpaDao<Users> implements UsersDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Users.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsersDAOImpl
	 *
	* @generated
	 */
	public UsersDAOImpl() {
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
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Users entity) {
		return true;
	}
}
