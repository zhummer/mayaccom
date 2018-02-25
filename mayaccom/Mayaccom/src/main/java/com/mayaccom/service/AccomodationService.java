
package com.mayaccom.service;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;
import com.mayaccom.domain.Host;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Accomodation entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/.properties.srv]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface AccomodationService {

	/**
	* Return a count of all Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/countAccomodations%7Bf118057a-2d9b-464d-822b-4b23ff8121ea%7D/.properties.swoperation]
	 */
	public Integer countAccomodations();

	/**
	* Save an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/saveAccomodationContents%7B957734ca-1a82-4242-8b9a-ce898bd192b1%7D/.properties.swoperation]
	 */
	public Accomodation saveAccomodationContents(Integer id, Content related_contents);

	/**
	* Return all Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/findAllAccomodations%7B3238be09-0c2a-47f5-bb0e-b16d274e45bd%7D/.properties.swoperation]
	 */
	public List<Accomodation> findAllAccomodations(Integer startResult, Integer maxRows);

	/**
	* Delete an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/deleteAccomodation%7B379978f8-54cd-4f7c-8df2-543125612289%7D/.properties.swoperation]
	 */
	public void deleteAccomodation(Accomodation accomodation);

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/deleteAccomodationHost%7B5a9ed9e7-bbf2-442d-8dba-da7c51cfabb6%7D/.properties.swoperation]
	 */
	public Accomodation deleteAccomodationHost(Integer accomodation_id, Integer related_host_id);

	/**
	* Load an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/loadAccomodations%7Bf7dfaa6b-31f3-47e0-8fdf-a7a3289bdf37%7D/.properties.swoperation]
	 */
	public Set<Accomodation> loadAccomodations();

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/saveAccomodationHost%7B35f948b1-0a6f-4efa-aa64-6382a5311273%7D/.properties.swoperation]
	 */
	public Accomodation saveAccomodationHost(Integer id_1, Host related_host);

	/**
	* Save an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/saveAccomodation%7Bf9c97701-cb2a-48e9-a32b-dc9cc6e4dac6%7D/.properties.swoperation]
	 */
	public void saveAccomodation(Accomodation accomodation_1);

	/**
	* Delete an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/deleteAccomodationContents%7B6804927b-f575-4baa-b19f-f601d9b7cb85%7D/.properties.swoperation]
	 */
	public Accomodation deleteAccomodationContents(Integer accomodation_id_1, Integer related_contents_id);

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AccomodationService/findAccomodationByPrimaryKey%7Bb69a3065-18e6-4c4b-ac79-7f69579677a2%7D/.properties.swoperation]
	 */
	public Accomodation findAccomodationByPrimaryKey(Integer id_2);
}