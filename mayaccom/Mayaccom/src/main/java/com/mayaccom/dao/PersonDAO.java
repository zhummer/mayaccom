
package com.mayaccom.dao;

import com.mayaccom.domain.Person;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Person entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface PersonDAO extends JpaDao<Person> {

	/**
	 * JPQL Query - findPersonByLastname
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByLastname.query]JPASelect
	 */
	public Set<Person> findPersonByLastname(String lastname) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByLastname
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByLastname.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByLastname(String lastname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByEmail
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByEmail.query]JPASelect
	 */
	public Set<Person> findPersonByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByEmail
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByEmail.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByPrimaryKey.query]JPASelect
	 */
	public Person findPersonByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByPrimaryKey.query]JPASelectWithPagination
	 */
	public Person findPersonByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByDtypeContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByDtypeContaining.query]JPASelect
	 */
	public Set<Person> findPersonByDtypeContaining(String dtype) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByDtypeContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByDtypeContaining.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByDtypeContaining(String dtype, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByAddressContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByAddressContaining.query]JPASelect
	 */
	public Set<Person> findPersonByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByAddressContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByAddressContaining.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByLastnameContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByLastnameContaining.query]JPASelect
	 */
	public Set<Person> findPersonByLastnameContaining(String lastname_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByLastnameContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByLastnameContaining.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByLastnameContaining(String lastname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonById
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonById.query]JPASelect
	 */
	public Person findPersonById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonById
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonById.query]JPASelectWithPagination
	 */
	public Person findPersonById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByPasswordContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByPasswordContaining.query]JPASelect
	 */
	public Set<Person> findPersonByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByPasswordContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByPasswordContaining.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByEmailContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByEmailContaining.query]JPASelect
	 */
	public Set<Person> findPersonByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByEmailContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByEmailContaining.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByDtype
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByDtype.query]JPASelect
	 */
	public Set<Person> findPersonByDtype(String dtype_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByDtype
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByDtype.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByDtype(String dtype_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByFirstname
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByFirstname.query]JPASelect
	 */
	public Set<Person> findPersonByFirstname(String firstname) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByFirstname
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByFirstname.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByFirstname(String firstname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPersons
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findAllPersons.query]JPASelect
	 */
	public Set<Person> findAllPersons() throws DataAccessException;

	/**
	 * JPQL Query - findAllPersons
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findAllPersons.query]JPASelectWithPagination
	 */
	public Set<Person> findAllPersons(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByPassword
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByPassword.query]JPASelect
	 */
	public Set<Person> findPersonByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByPassword
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByPassword.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByFirstnameContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByFirstnameContaining.query]JPASelect
	 */
	public Set<Person> findPersonByFirstnameContaining(String firstname_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByFirstnameContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByFirstnameContaining.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByFirstnameContaining(String firstname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByCityContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByCityContaining.query]JPASelect
	 */
	public Set<Person> findPersonByCityContaining(String city) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByCityContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByCityContaining.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByCityContaining(String city, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByCity
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByCity.query]JPASelect
	 */
	public Set<Person> findPersonByCity(String city_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByCity
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByCity.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByCity(String city_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByAddress
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByAddress.query]JPASelect
	 */
	public Set<Person> findPersonByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findPersonByAddress
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/PersonDAO/findPersonByAddress.query]JPASelectWithPagination
	 */
	public Set<Person> findPersonByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

}