
package com.mayaccom.service;

import com.mayaccom.domain.Accomodation;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Accomodation entities
 * 
 */
public interface AccomodationService {

	/**
	 */
	public Accomodation findAccomodationByPrimaryKey(Integer id);

	/**
	* Save an existing Accomodation entity
	* 
	 */
	public void saveAccomodation(Accomodation accomodation);

	/**
	* Delete an existing Accomodation entity
	* 
	 */
	public void deleteAccomodation(Accomodation accomodation_1);

	/**
	* Return all Accomodation entity
	* 
	 */
	public List<Accomodation> findAllAccomodations(Integer startResult, Integer maxRows);

	/**
	* Return a count of all Accomodation entity
	* 
	 */
	public Integer countAccomodations();

	/**
	* Load an existing Accomodation entity
	* 
	 */
	public Set<Accomodation> loadAccomodations();
}