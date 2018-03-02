
package com.mayaccom.service;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogcomment;
import com.mayaccom.domain.Person;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 * @generated
 * @AuxiliaryModelComponent
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
@Transactional
public class PersonServiceTest {

	/**
	 * The Spring application context.
	 *
	* @generated
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	* @generated
	 */
	@Autowired
	protected PersonService service;

	/**
	 * Instantiates a new PersonServiceTest.
	 *
	* @generated
	 */
	public PersonServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing Blogcomment entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deletePersonBlogcomments() {
		// TODO: JUnit - Populate test inputs for operation: deletePersonBlogcomments 
		Integer person_id = 0;
		Integer related_blogcomments_id = 0;
		Person response = null;
		response = service.deletePersonBlogcomments(person_id, related_blogcomments_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePersonBlogcomments
	}

	/**
	 * Operation Unit Test
	* Save an existing Person entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void savePerson() {
		// TODO: JUnit - Populate test inputs for operation: savePerson 
		Person person = new com.mayaccom.domain.Person();
		service.savePerson(person);
	}

	/**
	 * Operation Unit Test
	* Save an existing Blog entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void savePersonBlogs() {
		// TODO: JUnit - Populate test inputs for operation: savePersonBlogs 
		Integer id = 0;
		Blog related_blogs = new com.mayaccom.domain.Blog();
		Person response = null;
		response = service.savePersonBlogs(id, related_blogs);
		// TODO: JUnit - Add assertions to test outputs of operation: savePersonBlogs
	}

	/**
	 * Operation Unit Test
	* Delete an existing Person entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deletePerson() {
		// TODO: JUnit - Populate test inputs for operation: deletePerson 
		Person person_1 = new com.mayaccom.domain.Person();
		service.deletePerson(person_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Person entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countPersons() {
		Integer response = null;
		response = service.countPersons();
		// TODO: JUnit - Add assertions to test outputs of operation: countPersons
	}

	/**
	 * Operation Unit Test
	* Load an existing Person entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadPersons() {
		Set<Person> response = null;
		response = service.loadPersons();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPersons
	}

	/**
	 * Operation Unit Test
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findPersonByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPersonByPrimaryKey 
		Integer id_1 = 0;
		Person response = null;
		response = service.findPersonByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findPersonByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all Person entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findAllPersons() {
		// TODO: JUnit - Populate test inputs for operation: findAllPersons 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Person> response = null;
		response = service.findAllPersons(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPersons
	}

	/**
	 * Operation Unit Test
	* Delete an existing Blog entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deletePersonBlogs() {
		// TODO: JUnit - Populate test inputs for operation: deletePersonBlogs 
		Integer person_id_1 = 0;
		Integer related_blogs_id = 0;
		Person response = null;
		response = service.deletePersonBlogs(person_id_1, related_blogs_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePersonBlogs
	}

	/**
	 * Operation Unit Test
	* Save an existing Blogcomment entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void savePersonBlogcomments() {
		// TODO: JUnit - Populate test inputs for operation: savePersonBlogcomments 
		Integer id_2 = 0;
		Blogcomment related_blogcomments = new com.mayaccom.domain.Blogcomment();
		Person response = null;
		response = service.savePersonBlogcomments(id_2, related_blogcomments);
		// TODO: JUnit - Add assertions to test outputs of operation: savePersonBlogcomments
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	* @generated
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	* @generated
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
