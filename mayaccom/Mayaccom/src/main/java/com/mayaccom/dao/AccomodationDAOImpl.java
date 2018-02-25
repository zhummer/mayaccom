
package com.mayaccom.dao;

import com.mayaccom.domain.Accomodation;

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
 * DAO to manage Accomodation entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/.properties.datastore]
 * @generated
 */
@Repository("AccomodationDAO")

@Transactional
public class AccomodationDAOImpl extends AbstractJpaDao<Accomodation> implements AccomodationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Accomodation.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AccomodationDAOImpl
	 *
	* @generated
	 */
	public AccomodationDAOImpl() {
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
	 * JPQL Query - findAccomodationByLink1
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink1(String link1) throws DataAccessException {

		return findAccomodationByLink1(link1, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink1
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink1(String link1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink1", startResult, maxRows, link1);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddressContaining.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByAddressContaining(String address) throws DataAccessException {

		return findAccomodationByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddressContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCode.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByZipCode(String zipCode) throws DataAccessException {

		return findAccomodationByZipCode(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCode.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByZipCode", startResult, maxRows, zipCode);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3Containing.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink3Containing(String link3) throws DataAccessException {

		return findAccomodationByLink3Containing(link3, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3Containing.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink3Containing(String link3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink3Containing", startResult, maxRows, link3);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCity.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByCity(String city) throws DataAccessException {

		return findAccomodationByCity(city, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCity.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByCity(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByCity", startResult, maxRows, city);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationById.query]JPASelect
	 */
	@Transactional
	public Accomodation findAccomodationById(Integer id) throws DataAccessException {

		return findAccomodationById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationById.query]JPASelectWithPagination
	 */

	@Transactional
	public Accomodation findAccomodationById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccomodationById", startResult, maxRows, id);
			return (com.mayaccom.domain.Accomodation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink2(String link2) throws DataAccessException {

		return findAccomodationByLink2(link2, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink2(String link2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink2", startResult, maxRows, link2);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Accomodation findAccomodationByPrimaryKey(Integer id) throws DataAccessException {

		return findAccomodationByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Accomodation findAccomodationByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccomodationByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Accomodation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1Containing.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink1Containing(String link1) throws DataAccessException {

		return findAccomodationByLink1Containing(link1, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1Containing.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink1Containing(String link1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink1Containing", startResult, maxRows, link1);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCapacity.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity) throws DataAccessException {

		return findAccomodationByCapacity(capacity, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCapacity.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByCapacity", startResult, maxRows, capacity);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCityContaining.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByCityContaining(String city) throws DataAccessException {

		return findAccomodationByCityContaining(city, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCityContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByCityContaining(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByCityContaining", startResult, maxRows, city);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAccomodations
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAllAccomodations.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAllAccomodations() throws DataAccessException {

		return findAllAccomodations(-1, -1);
	}

	/**
	 * JPQL Query - findAllAccomodations
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAllAccomodations.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAllAccomodations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAccomodations", startResult, maxRows);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByName
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByName.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByName(String name) throws DataAccessException {

		return findAccomodationByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByName
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByName.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByName", startResult, maxRows, name);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByNameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByNameContaining.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByNameContaining(String name) throws DataAccessException {

		return findAccomodationByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByNameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByNameContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddress.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByAddress(String address) throws DataAccessException {

		return findAccomodationByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddress.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAreaM2.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2) throws DataAccessException {

		return findAccomodationByAreaM2(areaM2, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAreaM2.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByAreaM2", startResult, maxRows, areaM2);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink3(String link3) throws DataAccessException {

		return findAccomodationByLink3(link3, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink3(String link3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink3", startResult, maxRows, link3);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCodeContaining.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode) throws DataAccessException {

		return findAccomodationByZipCodeContaining(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCodeContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByZipCodeContaining", startResult, maxRows, zipCode);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2Containing.query]JPASelect
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink2Containing(String link2) throws DataAccessException {

		return findAccomodationByLink2Containing(link2, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2Containing.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink2Containing(String link2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink2Containing", startResult, maxRows, link2);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Accomodation entity) {
		return true;
	}
}
