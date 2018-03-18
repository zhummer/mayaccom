
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
 */
@Repository("AccomodationDAO")

@Transactional
public class AccomodationDAOImpl extends AbstractJpaDao<Accomodation> implements AccomodationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Accomodation.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AccomodationDAOImpl
	 *
	 */
	public AccomodationDAOImpl() {
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
	 * JPQL Query - findAccomodationByType
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByType(String type) throws DataAccessException {

		return findAccomodationByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByType", startResult, maxRows, type);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByActive
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByActive(Boolean active) throws DataAccessException {

		return findAccomodationByActive(active, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByActive
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByActive(Boolean active, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByActive", startResult, maxRows, active);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByDescription
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByDescription(String description) throws DataAccessException {

		return findAccomodationByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink2(String link2) throws DataAccessException {

		return findAccomodationByLink2(link2, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink2(String link2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink2", startResult, maxRows, link2);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByCity(String city) throws DataAccessException {

		return findAccomodationByCity(city, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByCity(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByCity", startResult, maxRows, city);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByAddressContaining(String address) throws DataAccessException {

		return findAccomodationByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByCityContaining(String city) throws DataAccessException {

		return findAccomodationByCityContaining(city, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByCityContaining(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByCityContaining", startResult, maxRows, city);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationById
	 *
	 */
	@Transactional
	public Accomodation findAccomodationById(Integer id) throws DataAccessException {

		return findAccomodationById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationById
	 *
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
	 * JPQL Query - findAccomodationByNameContaining
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByNameContaining(String name) throws DataAccessException {

		return findAccomodationByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity) throws DataAccessException {

		return findAccomodationByCapacity(capacity, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByCapacity", startResult, maxRows, capacity);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink1Containing(String link1) throws DataAccessException {

		return findAccomodationByLink1Containing(link1, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink1Containing(String link1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink1Containing", startResult, maxRows, link1);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2) throws DataAccessException {

		return findAccomodationByAreaM2(areaM2, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByAreaM2", startResult, maxRows, areaM2);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByName
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByName(String name) throws DataAccessException {

		return findAccomodationByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByName", startResult, maxRows, name);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAccomodations
	 *
	 */
	@Transactional
	public Set<Accomodation> findAllAccomodations() throws DataAccessException {

		return findAllAccomodations(-1, -1);
	}

	/**
	 * JPQL Query - findAllAccomodations
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAllAccomodations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAccomodations", startResult, maxRows);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink1
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink1(String link1) throws DataAccessException {

		return findAccomodationByLink1(link1, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink1(String link1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink1", startResult, maxRows, link1);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByComment
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByComment(String comment) throws DataAccessException {

		return findAccomodationByComment(comment, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByComment
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByComment(String comment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByComment", startResult, maxRows, comment);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByAddress(String address) throws DataAccessException {

		return findAccomodationByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink2Containing(String link2) throws DataAccessException {

		return findAccomodationByLink2Containing(link2, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink2Containing(String link2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink2Containing", startResult, maxRows, link2);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink3(String link3) throws DataAccessException {

		return findAccomodationByLink3(link3, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink3(String link3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink3", startResult, maxRows, link3);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByZipCode(String zipCode) throws DataAccessException {

		return findAccomodationByZipCode(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByZipCode", startResult, maxRows, zipCode);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByRate
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByRate(Integer rate) throws DataAccessException {

		return findAccomodationByRate(rate, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByRate(Integer rate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByRate", startResult, maxRows, rate);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
	 */
	@Transactional
	public Accomodation findAccomodationByPrimaryKey(Integer id) throws DataAccessException {

		return findAccomodationByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
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
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByLink3Containing(String link3) throws DataAccessException {

		return findAccomodationByLink3Containing(link3, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByLink3Containing(String link3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByLink3Containing", startResult, maxRows, link3);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByDescriptionContaining(String description) throws DataAccessException {

		return findAccomodationByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByPersonId
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByPersonId(Integer personId) throws DataAccessException {

		return findAccomodationByPersonId(personId, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByPersonId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByPersonId(Integer personId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByPersonId", startResult, maxRows, personId);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByCommentContaining
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByCommentContaining(String comment) throws DataAccessException {

		return findAccomodationByCommentContaining(comment, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByCommentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByCommentContaining(String comment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByCommentContaining", startResult, maxRows, comment);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode) throws DataAccessException {

		return findAccomodationByZipCodeContaining(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByZipCodeContaining", startResult, maxRows, zipCode);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccomodationByTypeContaining
	 *
	 */
	@Transactional
	public Set<Accomodation> findAccomodationByTypeContaining(String type) throws DataAccessException {

		return findAccomodationByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findAccomodationByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Accomodation> findAccomodationByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccomodationByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Accomodation>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Accomodation entity) {
		return true;
	}
}
