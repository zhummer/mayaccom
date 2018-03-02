
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
public class UsersServiceTest {

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
	protected UsersService service;

	/**
	 * Instantiates a new UsersServiceTest.
	 *
	* @generated
	 */
	public UsersServiceTest() {
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
	public void findUsersByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUsersByPrimaryKey 
		String id = null;
		Users response = null;
		response = service.findUsersByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findUsersByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all Users entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findAllUserss() {
		// TODO: JUnit - Populate test inputs for operation: findAllUserss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Users> response = null;
		response = service.findAllUserss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUserss
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
	public void deleteUsersAuthoritieses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsersAuthoritieses 
		String users_id = null;
		String related_authoritieses_id = null;
		Users response = null;
		response = service.deleteUsersAuthoritieses(users_id, related_authoritieses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsersAuthoritieses
	}

	/**
	 * Operation Unit Test
	* Load an existing Users entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadUserss() {
		Set<Users> response = null;
		response = service.loadUserss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUserss
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
	public void saveUsers() {
		// TODO: JUnit - Populate test inputs for operation: saveUsers 
		Users users = new com.mayaccom.domain.Users();
		service.saveUsers(users);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Users entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countUserss() {
		Integer response = null;
		response = service.countUserss();
		// TODO: JUnit - Add assertions to test outputs of operation: countUserss
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
	public void deleteUsers() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsers 
		Users users_1 = new com.mayaccom.domain.Users();
		service.deleteUsers(users_1);
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
	public void saveUsersAuthoritieses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsersAuthoritieses 
		String id_1 = null;
		Authorities related_authoritieses = new com.mayaccom.domain.Authorities();
		Users response = null;
		response = service.saveUsersAuthoritieses(id_1, related_authoritieses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsersAuthoritieses
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
