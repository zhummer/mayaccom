
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
 * Unit test for the <code>AccomodationController</code> controller.
 *
 * @see com.mayaccom.web.AccomodationController
 * @generated
 * @AuxiliaryModelComponent
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class AccomodationControllerTest {
	/**
	 * The Spring application context.
	 *
	* @generated
	 */
	private ApplicationContext context;

	/**
	 * Test <code>confirmDeleteAccomodationContents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccomodationContents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccomodationContents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccomodationHost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccomodationHost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccomodationHost");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccomodationContents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccomodationContents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccomodationContents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccomodationHost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccomodationHost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccomodationHost");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAccomodationContents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccomodationContents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccomodationContents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAccomodationHost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccomodationHost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccomodationHost");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAccomodationContents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAccomodationContents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAccomodationContents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAccomodationHost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAccomodationHost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAccomodationHost");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccomodationContents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccomodationContents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccomodationContents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccomodationHost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccomodationHost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccomodationHost");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccomodationContents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccomodationContents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccomodationContents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccomodationHost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccomodationHost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccomodationHost");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccomodationContents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccomodationContents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccomodationContents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccomodationHost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccomodationHost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccomodationHost");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>accomodationControllerbinaryaction()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetaccomodationControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/accomodationController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationController controller = (AccomodationController) context.getBean("AccomodationController");

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