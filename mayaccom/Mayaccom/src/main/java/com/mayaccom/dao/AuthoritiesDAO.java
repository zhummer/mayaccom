
package com.mayaccom.dao;

import com.mayaccom.domain.Authorities;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Authorities entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface AuthoritiesDAO extends JpaDao<Authorities> {

	/**
	 * JPQL Query - findAuthoritiesByAuthoritynameContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthoritynameContaining.query]JPASelect
	 */
	public Set<Authorities> findAuthoritiesByAuthoritynameContaining(String authorityname) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByAuthoritynameContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthoritynameContaining.query]JPASelectWithPagination
	 */
	public Set<Authorities> findAuthoritiesByAuthoritynameContaining(String authorityname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByPrimaryKey.query]JPASelect
	 */
	public Authorities findAuthoritiesByPrimaryKey(String id) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByPrimaryKey.query]JPASelectWithPagination
	 */
	public Authorities findAuthoritiesByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAllAuthoritiess.query]JPASelect
	 */
	public Set<Authorities> findAllAuthoritiess() throws DataAccessException;

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAllAuthoritiess.query]JPASelectWithPagination
	 */
	public Set<Authorities> findAllAuthoritiess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesById.query]JPASelect
	 */
	public Authorities findAuthoritiesById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesById.query]JPASelectWithPagination
	 */
	public Authorities findAuthoritiesById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByIdContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByIdContaining.query]JPASelect
	 */
	public Set<Authorities> findAuthoritiesByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByIdContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByIdContaining.query]JPASelectWithPagination
	 */
	public Set<Authorities> findAuthoritiesByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByAuthorityname
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthorityname.query]JPASelect
	 */
	public Set<Authorities> findAuthoritiesByAuthorityname(String authorityname_1) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByAuthorityname
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/AuthoritiesDAO/findAuthoritiesByAuthorityname.query]JPASelectWithPagination
	 */
	public Set<Authorities> findAuthoritiesByAuthorityname(String authorityname_1, int startResult, int maxRows) throws DataAccessException;

}