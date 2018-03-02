
package com.mayaccom.service;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;
import com.mayaccom.domain.Host;

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
public class AccomodationServiceTest {

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
	protected AccomodationService service;

	/**
	 * Instantiates a new AccomodationServiceTest.
	 *
	* @generated
	 */
	public AccomodationServiceTest() {
		setupRequestContext();
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
	public void findAccomodationByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAccomodationByPrimaryKey 
		Integer id = 0;
		Accomodation response = null;
		response = service.findAccomodationByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findAccomodationByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Host entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteAccomodationHost() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccomodationHost 
		Integer accomodation_id = 0;
		Integer related_host_id = 0;
		Accomodation response = null;
		response = service.deleteAccomodationHost(accomodation_id, related_host_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAccomodationHost
	}

	/**
	 * Operation Unit Test
	* Return a count of all Accomodation entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countAccomodations() {
		Integer response = null;
		response = service.countAccomodations();
		// TODO: JUnit - Add assertions to test outputs of operation: countAccomodations
	}

	/**
	 * Operation Unit Test
	* Save an existing Content entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveAccomodationContents() {
		// TODO: JUnit - Populate test inputs for operation: saveAccomodationContents 
		Integer id_1 = 0;
		Content related_contents = new com.mayaccom.domain.Content();
		Accomodation response = null;
		response = service.saveAccomodationContents(id_1, related_contents);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAccomodationContents
	}

	/**
	 * Operation Unit Test
	* Return all Accomodation entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findAllAccomodations() {
		// TODO: JUnit - Populate test inputs for operation: findAllAccomodations 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Accomodation> response = null;
		response = service.findAllAccomodations(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAccomodations
	}

	/**
	 * Operation Unit Test
	* Save an existing Accomodation entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveAccomodation() {
		// TODO: JUnit - Populate test inputs for operation: saveAccomodation 
		Accomodation accomodation = new com.mayaccom.domain.Accomodation();
		service.saveAccomodation(accomodation);
	}

	/**
	 * Operation Unit Test
	* Save an existing Host entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveAccomodationHost() {
		// TODO: JUnit - Populate test inputs for operation: saveAccomodationHost 
		Integer id_2 = 0;
		Host related_host = new com.mayaccom.domain.Host();
		Accomodation response = null;
		response = service.saveAccomodationHost(id_2, related_host);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAccomodationHost
	}

	/**
	 * Operation Unit Test
	* Load an existing Accomodation entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadAccomodations() {
		Set<Accomodation> response = null;
		response = service.loadAccomodations();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAccomodations
	}

	/**
	 * Operation Unit Test
	* Delete an existing Accomodation entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteAccomodation() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccomodation 
		Accomodation accomodation_1 = new com.mayaccom.domain.Accomodation();
		service.deleteAccomodation(accomodation_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Content entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteAccomodationContents() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccomodationContents 
		Integer accomodation_id_1 = 0;
		Integer related_contents_id = 0;
		Accomodation response = null;
		response = service.deleteAccomodationContents(accomodation_id_1, related_contents_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAccomodationContents
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
