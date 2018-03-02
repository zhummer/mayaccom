package com.mayaccom.web.rest;

import com.mayaccom.dao.PersonDAO;

import com.mayaccom.domain.Person;

import com.mayaccom.service.PersonService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Person entities
 * 
 */

@Controller("PersonRestController")

public class PersonRestController {

	/**
	 * DAO injected by Spring that manages Person entities
	 * 
	 */
	@Autowired
	private PersonDAO personDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Person entities
	 * 
	 */
	@Autowired
	private PersonService personService;

	/**
	 * Delete an existing Person entity
	 * 
	 */
	@RequestMapping(value = "/Person/{person_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePerson(@PathVariable Integer person_id) {
		Person person = personDAO.findPersonByPrimaryKey(person_id);
		personService.deletePerson(person);
	}

	/**
	* Save an existing Person entity
	* 
	*/
	@RequestMapping(value = "/Person", method = RequestMethod.PUT)
	@ResponseBody
	public Person savePerson(@RequestBody Person person) {
		personService.savePerson(person);
		return personDAO.findPersonByPrimaryKey(person.getId());
	}

	/**
	* Select an existing Person entity
	* 
	*/
	@RequestMapping(value = "/Person/{person_id}", method = RequestMethod.GET)
	@ResponseBody
	public Person loadPerson(@PathVariable Integer person_id) {
		return personDAO.findPersonByPrimaryKey(person_id);
	}

	/**
	* Register custom, context-specific property editors
	* 
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Create a new Person entity
	* 
	*/
	@RequestMapping(value = "/Person", method = RequestMethod.POST)
	@ResponseBody
	public Person newPerson(@RequestBody Person person) {
		personService.savePerson(person);
		return personDAO.findPersonByPrimaryKey(person.getId());
	}

	/**
	* Show all Person entities
	* 
	*/
	@RequestMapping(value = "/Person", method = RequestMethod.GET)
	@ResponseBody
	public List<Person> listPersons() {
		return new java.util.ArrayList<Person>(personService.loadPersons());
	}
}