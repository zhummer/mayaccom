
package com.mayaccom.service;

import com.mayaccom.domain.Authorities;
import com.mayaccom.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Authorities entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/.properties.srv]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface AuthoritiesService {

	/**
	* Load an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/loadAuthoritiess%7B766949fd-91fd-4ae9-8b98-9740af5f0f75%7D/.properties.swoperation]
	 */
	public Set<Authorities> loadAuthoritiess();

	/**
	* Save an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/saveAuthorities%7B13833ebd-f05b-4198-9c2f-c3d02f6a4546%7D/.properties.swoperation]
	 */
	public void saveAuthorities(Authorities authorities);

	/**
	* Return all Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/findAllAuthoritiess%7B1600f5b8-7985-4d21-a956-7de5cafbe462%7D/.properties.swoperation]
	 */
	public List<Authorities> findAllAuthoritiess(Integer startResult, Integer maxRows);

	/**
	* Delete an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/deleteAuthoritiesUserses%7Bfbc2c628-91dc-4745-ab47-3751fad4cc60%7D/.properties.swoperation]
	 */
	public Authorities deleteAuthoritiesUserses(String authorities_id, String related_userses_id);

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/findAuthoritiesByPrimaryKey%7B65b32962-8b9d-490c-83b3-98b25e7ed0cb%7D/.properties.swoperation]
	 */
	public Authorities findAuthoritiesByPrimaryKey(String id);

	/**
	* Delete an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/deleteAuthorities%7B21c84b35-64ec-4cac-a3b2-f64a5211c04d%7D/.properties.swoperation]
	 */
	public void deleteAuthorities(Authorities authorities_1);

	/**
	* Return a count of all Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/countAuthoritiess%7Bc9b09932-21a1-44af-9063-3b42e2350275%7D/.properties.swoperation]
	 */
	public Integer countAuthoritiess();

	/**
	* Save an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/saveAuthoritiesUserses%7B19c143fd-0946-4f9e-923d-2f20d1e13f9c%7D/.properties.swoperation]
	 */
	public Authorities saveAuthoritiesUserses(String id_1, Users related_userses);
}