
package com.mayaccom.service;

import com.mayaccom.domain.Authorities;
import com.mayaccom.domain.Users;

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
public class AuthoritiesServiceTest {

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
	protected AuthoritiesService service;

	/**
	 * Instantiates a new AuthoritiesServiceTest.
	 *
	* @generated
	 */
	public AuthoritiesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing Authorities entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadAuthoritiess() {
		Set<Authorities> response = null;
		response = service.loadAuthoritiess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAuthoritiess
	}

	/**
	 * Operation Unit Test
	* Save an existing Authorities entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveAuthorities() {
		// TODO: JUnit - Populate test inputs for operation: saveAuthorities 
		Authorities authorities = new com.mayaccom.domain.Authorities();
		service.saveAuthorities(authorities);
	}

	/**
	 * Operation Unit Test
	* Return all Authorities entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findAllAuthoritiess() {
		// TODO: JUnit - Populate test inputs for operation: findAllAuthoritiess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Authorities> response = null;
		response = service.findAllAuthoritiess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAuthoritiess
	}

	/**
	 * Operation Unit Test
	* Delete an existing Users entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteAuthoritiesUserses() {
		// TODO: JUnit - Populate test inputs for operation: deleteAuthoritiesUserses 
		String authorities_id = null;
		String related_userses_id = null;
		Authorities response = null;
		response = service.deleteAuthoritiesUserses(authorities_id, related_userses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAuthoritiesUserses
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
	public void findAuthoritiesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAuthoritiesByPrimaryKey 
		String id = null;
		Authorities response = null;
		response = service.findAuthoritiesByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findAuthoritiesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Authorities entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteAuthorities() {
		// TODO: JUnit - Populate test inputs for operation: deleteAuthorities 
		Authorities authorities_1 = new com.mayaccom.domain.Authorities();
		service.deleteAuthorities(authorities_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Authorities entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countAuthoritiess() {
		Integer response = null;
		response = service.countAuthoritiess();
		// TODO: JUnit - Add assertions to test outputs of operation: countAuthoritiess
	}

	/**
	 * Operation Unit Test
	* Save an existing Users entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveAuthoritiesUserses() {
		// TODO: JUnit - Populate test inputs for operation: saveAuthoritiesUserses 
		String id_1 = null;
		Users related_userses = new com.mayaccom.domain.Users();
		Authorities response = null;
		response = service.saveAuthoritiesUserses(id_1, related_userses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAuthoritiesUserses
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
