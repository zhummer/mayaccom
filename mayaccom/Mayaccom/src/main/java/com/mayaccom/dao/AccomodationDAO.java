
package com.mayaccom.dao;

import com.mayaccom.domain.Accomodation;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Accomodation entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface AccomodationDAO extends JpaDao<Accomodation> {

	/**
	 * JPQL Query - findAccomodationByLink1
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByLink1(String link1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink1
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByLink1(String link1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddressContaining.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddressContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddressContaining.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCode.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByZipCode(String zipCode) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCode
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCode.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3Containing.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByLink3Containing(String link3) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3Containing
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3Containing.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByLink3Containing(String link3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCity.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByCity(String city) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCity
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCity.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByCity(String city, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationById
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationById.query]JPASelect
	 */
	public Accomodation findAccomodationById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationById
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationById.query]JPASelectWithPagination
	 */
	public Accomodation findAccomodationById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByLink2(String link2) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByLink2(String link2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByPrimaryKey.query]JPASelect
	 */
	public Accomodation findAccomodationByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByPrimaryKey.query]JPASelectWithPagination
	 */
	public Accomodation findAccomodationByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1Containing.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByLink1Containing(String link1_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink1Containing
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink1Containing.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByLink1Containing(String link1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCapacity.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCapacity
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCapacity.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByCapacity(Integer capacity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCityContaining.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByCityContaining(String city_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByCityContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByCityContaining.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByCityContaining(String city_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAccomodations
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAllAccomodations.query]JPASelect
	 */
	public Set<Accomodation> findAllAccomodations() throws DataAccessException;

	/**
	 * JPQL Query - findAllAccomodations
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAllAccomodations.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAllAccomodations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByName
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByName.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByName
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByName.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByNameContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByNameContaining.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByNameContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByNameContaining.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddress.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAddress
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAddress.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAreaM2.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByAreaM2
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByAreaM2.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByAreaM2(Integer areaM2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByLink3(String link3_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink3
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink3.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByLink3(String link3_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCodeContaining.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByZipCodeContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByZipCodeContaining.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByZipCodeContaining(String zipCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2Containing.query]JPASelect
	 */
	public Set<Accomodation> findAccomodationByLink2Containing(String link2_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccomodationByLink2Containing
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AccomodationDAO/findAccomodationByLink2Containing.query]JPASelectWithPagination
	 */
	public Set<Accomodation> findAccomodationByLink2Containing(String link2_1, int startResult, int maxRows) throws DataAccessException;

}