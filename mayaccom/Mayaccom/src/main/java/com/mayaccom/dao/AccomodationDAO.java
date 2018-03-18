
package com.mayaccom.dao;

import com.mayaccom.domain.Accomodation;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Accomodation entities.
 * 
 */
public interface AccomodationDAO extends JpaDao<Accomodation> {

	/**
	 * JPQL Query - findAccomodationByType
	 *
	 */
	public Set<Accomodation> findAccomodationByType(String type) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByType
	 *
	 */
	public Set<Accomodation> findAccomodationByType(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByActive
	 *
	 */
	public Set<Accomodation> findAccomodationByActive(Boolean active) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByActive
	 *
	 */
	public Set<Accomodation> findAccomodationByActive(Boolean active, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByDescription
	 *
	 */
	public Set<Accomodation> findAccomodationByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByDescription
	 *
	 */
	public Set<Accomodation> findAccomodationByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	 */
	public Set<Accomodation> findAccomodationByLink2(String link2) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	 */
	public Set<Accomodation> findAccomodationByLink2(String link2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	 */
	public Set<Accomodation> findAccomodationByCity(String city) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	 */
	public Set<Accomodation> findAccomodationByCity(String city, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByCityContaining(String city_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByCityContaining(String city_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationById
	 *
	 */
	public Accomodation findAccomodationById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationById
	 *
	 */
	public Accomodation findAccomodationById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByNameContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByNameContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	 */
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	 */
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	 */
	public Set<Accomodation> findAccomodationByLink1Containing(String link1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	 */
	public Set<Accomodation> findAccomodationByLink1Containing(String link1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	 */
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	 */
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByName
	 *
	 */
	public Set<Accomodation> findAccomodationByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByName
	 *
	 */
	public Set<Accomodation> findAccomodationByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAccomodations
	 *
	 */
	public Set<Accomodation> findAllAccomodations() throws DataAccessException;

	/**
	 * JPQL Query - findAllAccomodations
	 *
	 */
	public Set<Accomodation> findAllAccomodations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink1
	 *
	 */
	public Set<Accomodation> findAccomodationByLink1(String link1_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink1
	 *
	 */
	public Set<Accomodation> findAccomodationByLink1(String link1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByComment
	 *
	 */
	public Set<Accomodation> findAccomodationByComment(String comment) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByComment
	 *
	 */
	public Set<Accomodation> findAccomodationByComment(String comment, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	 */
	public Set<Accomodation> findAccomodationByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	 */
	public Set<Accomodation> findAccomodationByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	 */
	public Set<Accomodation> findAccomodationByLink2Containing(String link2_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	 */
	public Set<Accomodation> findAccomodationByLink2Containing(String link2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	 */
	public Set<Accomodation> findAccomodationByLink3(String link3) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	 */
	public Set<Accomodation> findAccomodationByLink3(String link3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	 */
	public Set<Accomodation> findAccomodationByZipCode(String zipCode) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	 */
	public Set<Accomodation> findAccomodationByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByRate
	 *
	 */
	public Set<Accomodation> findAccomodationByRate(Integer rate) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByRate
	 *
	 */
	public Set<Accomodation> findAccomodationByRate(Integer rate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
	 */
	public Accomodation findAccomodationByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
	 */
	public Accomodation findAccomodationByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	 */
	public Set<Accomodation> findAccomodationByLink3Containing(String link3_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	 */
	public Set<Accomodation> findAccomodationByLink3Containing(String link3_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByDescriptionContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByDescriptionContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByPersonId
	 *
	 */
	public Set<Accomodation> findAccomodationByPersonId(Integer personId) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByPersonId
	 *
	 */
	public Set<Accomodation> findAccomodationByPersonId(Integer personId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCommentContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByCommentContaining(String comment_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCommentContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByCommentContaining(String comment_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByTypeContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByTypeContaining(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByTypeContaining
	 *
	 */
	public Set<Accomodation> findAccomodationByTypeContaining(String type_1, int startResult, int maxRows) throws DataAccessException;

}