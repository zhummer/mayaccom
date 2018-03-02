package com.mayaccom.service;

import com.mayaccom.dao.BlogDAO;
import com.mayaccom.dao.BlogcommentDAO;
import com.mayaccom.dao.PersonDAO;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogcomment;
import com.mayaccom.domain.Person;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Person entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/.properties.srv]
 * @generated
 */

@Service("PersonService")

@Transactional
public class PersonServiceImpl implements PersonService {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/.properties.srv#//@variables%5Bname='blogDAO'%5D]
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * DAO injected by Spring that manages Blogcomment entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/.properties.srv#//@variables%5Bname='blogcommentDAO'%5D]
	 */
	@Autowired
	private BlogcommentDAO blogcommentDAO;

	/**
	 * DAO injected by Spring that manages Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/.properties.srv#//@variables%5Bname='personDAO'%5D]
	 */
	@Autowired
	private PersonDAO personDAO;

	/**
	 * Instantiates a new PersonServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public PersonServiceImpl() {
	}

	/**
	 * Delete an existing Blogcomment entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/deletePersonBlogcomments%7B98dcbc80-7f39-4ca6-8473-790605ee4bc4%7D/.properties.swoperation]
	 */
	@Transactional
	public Person deletePersonBlogcomments(Integer person_id, Integer related_blogcomments_id) {
		Blogcomment related_blogcomments = blogcommentDAO.findBlogcommentByPrimaryKey(related_blogcomments_id, -1, -1);

		Person person = personDAO.findPersonByPrimaryKey(person_id, -1, -1);

		related_blogcomments.setPerson(null);
		person.getBlogcomments().remove(related_blogcomments);

		blogcommentDAO.remove(related_blogcomments);
		blogcommentDAO.flush();

		return person;
	}

	/**
	 * Save an existing Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/savePerson%7B3753a36b-676f-4561-910e-99c1dd4d8017%7D/.properties.swoperation]
	 */
	@Transactional
	public void savePerson(Person person) {
		Person existingPerson = personDAO.findPersonByPrimaryKey(person.getId());

		if (existingPerson != null) {
			if (existingPerson != person) {
				existingPerson.setId(person.getId());
				existingPerson.setFirstname(person.getFirstname());
				existingPerson.setLastname(person.getLastname());
				existingPerson.setEmail(person.getEmail());
				existingPerson.setAddress(person.getAddress());
				existingPerson.setCity(person.getCity());
				existingPerson.setPassword(person.getPassword());
				existingPerson.setDtype(person.getDtype());
			}
			person = personDAO.store(existingPerson);
		} else {
			person = personDAO.store(person);
		}
		personDAO.flush();
	}

	/**
	 * Save an existing Blog entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/savePersonBlogs%7Bb8af16ff-2b83-4b9f-9e45-a92d831cab94%7D/.properties.swoperation]
	 */
	@Transactional
	public Person savePersonBlogs(Integer id, Blog related_blogs) {
		Person person = personDAO.findPersonByPrimaryKey(id, -1, -1);
		Blog existingblogs = blogDAO.findBlogByPrimaryKey(related_blogs.getId());

		// copy into the existing record to preserve existing relationships
		if (existingblogs != null) {
			existingblogs.setId(related_blogs.getId());
			existingblogs.setTitle(related_blogs.getTitle());
			existingblogs.setDescription(related_blogs.getDescription());
			related_blogs = existingblogs;
		} else {
			related_blogs = blogDAO.store(related_blogs);
			blogDAO.flush();
		}

		related_blogs.setPerson(person);
		person.getBlogs().add(related_blogs);
		related_blogs = blogDAO.store(related_blogs);
		blogDAO.flush();

		person = personDAO.store(person);
		personDAO.flush();

		return person;
	}

	/**
	 * Delete an existing Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/deletePerson%7Bdc667344-16e3-4e03-b3b2-91d464714c16%7D/.properties.swoperation]
	 */
	@Transactional
	public void deletePerson(Person person) {
		personDAO.remove(person);
		personDAO.flush();
	}

	/**
	 * Return a count of all Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/countPersons%7B18054ac6-564a-447f-b6c5-2ed7eb27865f%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countPersons() {
		return ((Long) personDAO.createQuerySingleResult("select count(o) from Person o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/loadPersons%7Baf7ef118-abbb-43aa-adc5-f3b3ed9a7228%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Person> loadPersons() {
		return personDAO.findAllPersons();
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/findPersonByPrimaryKey%7B6c1cae29-4363-47e0-a5dd-90a30723021f%7D/.properties.swoperation]
	 */
	@Transactional
	public Person findPersonByPrimaryKey(Integer id) {
		return personDAO.findPersonByPrimaryKey(id);
	}

	/**
	 * Return all Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/findAllPersons%7Bbf2ac612-e199-4221-a12d-b90b488db9db%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Person> findAllPersons(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Person>(personDAO.findAllPersons(startResult, maxRows));
	}

	/**
	 * Delete an existing Blog entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/deletePersonBlogs%7B905768fc-25c4-4d78-b620-60352515f6fd%7D/.properties.swoperation]
	 */
	@Transactional
	public Person deletePersonBlogs(Integer person_id, Integer related_blogs_id) {
		Blog related_blogs = blogDAO.findBlogByPrimaryKey(related_blogs_id, -1, -1);

		Person person = personDAO.findPersonByPrimaryKey(person_id, -1, -1);

		related_blogs.setPerson(null);
		person.getBlogs().remove(related_blogs);

		blogDAO.remove(related_blogs);
		blogDAO.flush();

		return person;
	}

	/**
	 * Save an existing Blogcomment entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/savePersonBlogcomments%7Bb7bceb0d-510c-4ebb-a246-1168c8468634%7D/.properties.swoperation]
	 */
	@Transactional
	public Person savePersonBlogcomments(Integer id, Blogcomment related_blogcomments) {
		Person person = personDAO.findPersonByPrimaryKey(id, -1, -1);
		Blogcomment existingblogcomments = blogcommentDAO.findBlogcommentByPrimaryKey(related_blogcomments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingblogcomments != null) {
			existingblogcomments.setId(related_blogcomments.getId());
			existingblogcomments.setCommentText(related_blogcomments.getCommentText());
			existingblogcomments.setCommentTs(related_blogcomments.getCommentTs());
			related_blogcomments = existingblogcomments;
		} else {
			related_blogcomments = blogcommentDAO.store(related_blogcomments);
			blogcommentDAO.flush();
		}

		related_blogcomments.setPerson(person);
		person.getBlogcomments().add(related_blogcomments);
		related_blogcomments = blogcommentDAO.store(related_blogcomments);
		blogcommentDAO.flush();

		person = personDAO.store(person);
		personDAO.flush();

		return person;
	}
}
