
package com.mayaccom.web;

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
 * Unit test for the <code>AuthoritiesController</code> controller.
 *
 * @see com.mayaccom.web.AuthoritiesController
 * @generated
 * @AuxiliaryModelComponent
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class AuthoritiesControllerTest {
	/**
	 * The Spring application context.
	 *
	* @generated
	 */
	private ApplicationContext context;

	/**
	 * Test <code>confirmDeleteAuthoritiesUserses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAuthorities()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAuthoritiesUserses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAuthorities()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAuthoritiesUserses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAuthorities()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAuthoritiesUserses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAuthorities()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAuthoritiesUserses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAuthorities()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAuthoritiesUserses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAuthorities()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAuthoritiesUserses()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAuthorities()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>authoritiesControllerbinaryaction()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetauthoritiesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/authoritiesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

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