
package com.mayaccom.service;

import com.mayaccom.domain.Person;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Person entities
 * 
 */
public interface PersonService {

	/**
	 */
	public Person findPersonByPrimaryKey(Integer id);

	/**
	* Return a count of all Person entity
	* 
	 */
	public Integer countPersons();

	/**
	* Save an existing Person entity
	* 
	 */
	public void savePerson(Person person);

	/**
	* Return all Person entity
	* 
	 */
	public List<Person> findAllPersons(Integer startResult, Integer maxRows);

	/**
	* Delete an existing Person entity
	* 
	 */
	public void deletePerson(Person person_1);

	/**
	* Load an existing Person entity
	* 
	 */
	public Set<Person> loadPersons();
}