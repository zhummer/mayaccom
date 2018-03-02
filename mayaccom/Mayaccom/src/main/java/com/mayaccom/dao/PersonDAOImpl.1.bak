
package com.mayaccom.dao;

import com.mayaccom.domain.Person;

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
 * DAO to manage Person entities.
 * 
 */
@Repository("PersonDAO")

@Transactional
public class PersonDAOImpl extends AbstractJpaDao<Person> implements PersonDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Person.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PersonDAOImpl
	 *
	 */
	public PersonDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findPersonByFirstname
	 *
	 */
	@Transactional
	public Set<Person> findPersonByFirstname(String firstname) throws DataAccessException {

		return findPersonByFirstname(firstname, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByFirstname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByFirstname(String firstname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByFirstname", startResult, maxRows, firstname);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByDtype
	 *
	 */
	@Transactional
	public Set<Person> findPersonByDtype(String dtype) throws DataAccessException {

		return findPersonByDtype(dtype, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByDtype
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByDtype(String dtype, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByDtype", startResult, maxRows, dtype);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByEmail
	 *
	 */
	@Transactional
	public Set<Person> findPersonByEmail(String email) throws DataAccessException {

		return findPersonByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByCityContaining
	 *
	 */
	@Transactional
	public Set<Person> findPersonByCityContaining(String city) throws DataAccessException {

		return findPersonByCityContaining(city, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByCityContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByCityContaining(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByCityContaining", startResult, maxRows, city);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByDtypeContaining
	 *
	 */
	@Transactional
	public Set<Person> findPersonByDtypeContaining(String dtype) throws DataAccessException {

		return findPersonByDtypeContaining(dtype, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByDtypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByDtypeContaining(String dtype, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByDtypeContaining", startResult, maxRows, dtype);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllPersons
	 *
	 */
	@Transactional
	public Set<Person> findAllPersons() throws DataAccessException {

		return findAllPersons(-1, -1);
	}

	/**
	 * JPQL Query - findAllPersons
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findAllPersons(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPersons", startResult, maxRows);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByCity
	 *
	 */
	@Transactional
	public Set<Person> findPersonByCity(String city) throws DataAccessException {

		return findPersonByCity(city, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByCity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByCity(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByCity", startResult, maxRows, city);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByPrimaryKey
	 *
	 */
	@Transactional
	public Person findPersonByPrimaryKey(Integer id) throws DataAccessException {

		return findPersonByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByPrimaryKey
	 *
	 */

	@Transactional
	public Person findPersonByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPersonByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Person) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPersonByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Person> findPersonByPasswordContaining(String password) throws DataAccessException {

		return findPersonByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonById
	 *
	 */
	@Transactional
	public Person findPersonById(Integer id) throws DataAccessException {

		return findPersonById(id, -1, -1);
	}

	/**
	 * JPQL Query - findPersonById
	 *
	 */

	@Transactional
	public Person findPersonById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPersonById", startResult, maxRows, id);
			return (com.mayaccom.domain.Person) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPersonByEmailContaining
	 *
	 */
	@Transactional
	public Set<Person> findPersonByEmailContaining(String email) throws DataAccessException {

		return findPersonByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByPassword
	 *
	 */
	@Transactional
	public Set<Person> findPersonByPassword(String password) throws DataAccessException {

		return findPersonByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByLastnameContaining
	 *
	 */
	@Transactional
	public Set<Person> findPersonByLastnameContaining(String lastname) throws DataAccessException {

		return findPersonByLastnameContaining(lastname, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByLastnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByLastnameContaining(String lastname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByLastnameContaining", startResult, maxRows, lastname);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByAddress
	 *
	 */
	@Transactional
	public Set<Person> findPersonByAddress(String address) throws DataAccessException {

		return findPersonByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByLastname
	 *
	 */
	@Transactional
	public Set<Person> findPersonByLastname(String lastname) throws DataAccessException {

		return findPersonByLastname(lastname, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByLastname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByLastname(String lastname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByLastname", startResult, maxRows, lastname);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByAddressContaining
	 *
	 */
	@Transactional
	public Set<Person> findPersonByAddressContaining(String address) throws DataAccessException {

		return findPersonByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * JPQL Query - findPersonByFirstnameContaining
	 *
	 */
	@Transactional
	public Set<Person> findPersonByFirstnameContaining(String firstname) throws DataAccessException {

		return findPersonByFirstnameContaining(firstname, -1, -1);
	}

	/**
	 * JPQL Query - findPersonByFirstnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Person> findPersonByFirstnameContaining(String firstname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPersonByFirstnameContaining", startResult, maxRows, firstname);
		return new LinkedHashSet<Person>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Person entity) {
		return true;
	}
}
