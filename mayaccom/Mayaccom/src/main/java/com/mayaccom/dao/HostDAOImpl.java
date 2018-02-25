
package com.mayaccom.dao;

import com.mayaccom.domain.Host;

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
 * DAO to manage Host entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/.properties.datastore]
 * @generated
 */
@Repository("HostDAO")

@Transactional
public class HostDAOImpl extends AbstractJpaDao<Host> implements HostDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Host.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new HostDAOImpl
	 *
	* @generated
	 */
	public HostDAOImpl() {
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
	 * JPQL Query - findHostByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Host findHostByPrimaryKey(Integer id) throws DataAccessException {

		return findHostByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Host findHostByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findHostByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Host) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllHosts
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findAllHosts.query]JPASelect
	 */
	@Transactional
	public Set<Host> findAllHosts() throws DataAccessException {

		return findAllHosts(-1, -1);
	}

	/**
	 * JPQL Query - findAllHosts
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findAllHosts.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findAllHosts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllHosts", startResult, maxRows);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByContactPerson
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByContactPerson.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByContactPerson(String contactPerson) throws DataAccessException {

		return findHostByContactPerson(contactPerson, -1, -1);
	}

	/**
	 * JPQL Query - findHostByContactPerson
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByContactPerson.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByContactPerson(String contactPerson, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByContactPerson", startResult, maxRows, contactPerson);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByEmail
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByEmail.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByEmail(String email) throws DataAccessException {

		return findHostByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findHostByEmail
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByEmail.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByPhone1
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone1.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPhone1(String phone1) throws DataAccessException {

		return findHostByPhone1(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPhone1
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone1.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPhone1", startResult, maxRows, phone1);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByUsername
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByUsername.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByUsername(String username) throws DataAccessException {

		return findHostByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findHostByUsername
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByUsername.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByUsername", startResult, maxRows, username);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByEmailContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByEmailContaining.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByEmailContaining(String email) throws DataAccessException {

		return findHostByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findHostByEmailContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByEmailContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByPhone2Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone2Containing.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPhone2Containing(String phone2) throws DataAccessException {

		return findHostByPhone2Containing(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPhone2Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone2Containing.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPhone2Containing(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPhone2Containing", startResult, maxRows, phone2);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByPhone2
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone2.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPhone2(String phone2) throws DataAccessException {

		return findHostByPhone2(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPhone2
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone2.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPhone2", startResult, maxRows, phone2);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByContactPersonContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByContactPersonContaining.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByContactPersonContaining(String contactPerson) throws DataAccessException {

		return findHostByContactPersonContaining(contactPerson, -1, -1);
	}

	/**
	 * JPQL Query - findHostByContactPersonContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByContactPersonContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByContactPersonContaining(String contactPerson, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByContactPersonContaining", startResult, maxRows, contactPerson);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByUsernameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByUsernameContaining.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByUsernameContaining(String username) throws DataAccessException {

		return findHostByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findHostByUsernameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByUsernameContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByPassword
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPassword.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPassword(String password) throws DataAccessException {

		return findHostByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPassword
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPassword.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByPhone3Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone3Containing.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPhone3Containing(String phone3) throws DataAccessException {

		return findHostByPhone3Containing(phone3, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPhone3Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone3Containing.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPhone3Containing(String phone3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPhone3Containing", startResult, maxRows, phone3);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByPasswordContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPasswordContaining.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPasswordContaining(String password) throws DataAccessException {

		return findHostByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPasswordContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPasswordContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostByPhone1Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone1Containing.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPhone1Containing(String phone1) throws DataAccessException {

		return findHostByPhone1Containing(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPhone1Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone1Containing.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPhone1Containing(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPhone1Containing", startResult, maxRows, phone1);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * JPQL Query - findHostById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostById.query]JPASelect
	 */
	@Transactional
	public Host findHostById(Integer id) throws DataAccessException {

		return findHostById(id, -1, -1);
	}

	/**
	 * JPQL Query - findHostById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostById.query]JPASelectWithPagination
	 */

	@Transactional
	public Host findHostById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findHostById", startResult, maxRows, id);
			return (com.mayaccom.domain.Host) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findHostByPhone3
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone3.query]JPASelect
	 */
	@Transactional
	public Set<Host> findHostByPhone3(String phone3) throws DataAccessException {

		return findHostByPhone3(phone3, -1, -1);
	}

	/**
	 * JPQL Query - findHostByPhone3
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/HostDAO/findHostByPhone3.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Host> findHostByPhone3(String phone3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findHostByPhone3", startResult, maxRows, phone3);
		return new LinkedHashSet<Host>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Host entity) {
		return true;
	}
}
