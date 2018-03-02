
package com.mayaccom.dao;

import com.mayaccom.domain.Users;

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
 * DAO to manage Users entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/.properties.datastore]
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
	 * JPQL Query - findUsersByPassword
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByPassword.query]JPASelect
	 */
	@Transactional
	public Set<Users> findUsersByPassword(String password) throws DataAccessException {

		return findUsersByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByPassword.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Users findUsersByPrimaryKey(String id) throws DataAccessException {

		return findUsersByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Users findUsersByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByPasswordContaining.query]JPASelect
	 */
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password) throws DataAccessException {

		return findUsersByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByPasswordContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersById.query]JPASelect
	 */
	@Transactional
	public Users findUsersById(String id) throws DataAccessException {

		return findUsersById(id, -1, -1);
	}

	/**
	 * JPQL Query - findUsersById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersById.query]JPASelectWithPagination
	 */

	@Transactional
	public Users findUsersById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersById", startResult, maxRows, id);
			return (com.mayaccom.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByUsernameContaining.query]JPASelect
	 */
	@Transactional
	public Set<Users> findUsersByUsernameContaining(String username) throws DataAccessException {

		return findUsersByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByUsernameContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByIdContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByIdContaining.query]JPASelect
	 */
	@Transactional
	public Set<Users> findUsersByIdContaining(String id) throws DataAccessException {

		return findUsersByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByIdContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByIdContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findAllUserss.query]JPASelect
	 */
	@Transactional
	public Set<Users> findAllUserss() throws DataAccessException {

		return findAllUserss(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findAllUserss.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserss", startResult, maxRows);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByEnabled.query]JPASelect
	 */
	@Transactional
	public Set<Users> findUsersByEnabled(Boolean enabled) throws DataAccessException {

		return findUsersByEnabled(enabled, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByEnabled.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByEnabled", startResult, maxRows, enabled);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByUsername.query]JPASelect
	 */
	@Transactional
	public Set<Users> findUsersByUsername(String username) throws DataAccessException {

		return findUsersByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/UsersDAO/findUsersByUsername.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUsername", startResult, maxRows, username);
		return new LinkedHashSet<Users>(query.getResultList());
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
