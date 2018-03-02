
package com.mayaccom.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>UsersRestController</code> controller.
 *
 * @see com.mayaccom.web.rest.UsersRestController
 * @generated
 * @AuxiliaryModelComponent
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class UsersRestControllerTest {
	/**
	 * The Spring application context.
	 *
	* @generated
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Usersusers_idauthoritiesesauthorities_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_idauthoritiesesauthorities_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses/{authorities_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritieses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idauthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritiesesauthorities_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idauthoritiesesauthorities_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses/{authorities_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritieses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsersusers_idauthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritieses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsersusers_idauthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	* @generated
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	* @generated
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}