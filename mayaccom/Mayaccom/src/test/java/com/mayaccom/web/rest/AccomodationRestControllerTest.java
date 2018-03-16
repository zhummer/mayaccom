
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
 * Unit test for the <code>AccomodationRestController</code> controller.
 *
 * @see com.mayaccom.web.rest.AccomodationRestController
 * @generated
 * @AuxiliaryModelComponent
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class AccomodationRestControllerTest {
	/**
	 * The Spring application context.
	 *
	* @generated
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Accomodationaccomodation_idcontentscontent_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAccomodationaccomodation_idcontentscontent_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/contents/{content_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idhosthost_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAccomodationaccomodation_idhosthost_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/host/{host_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAccomodationaccomodation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idcontents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccomodationaccomodation_idcontents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/contents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idhost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccomodationaccomodation_idhost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/host");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idcontentscontent_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccomodationaccomodation_idcontentscontent_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/contents/{content_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idhosthost_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccomodationaccomodation_idhosthost_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/host/{host_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_id()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccomodationaccomodation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idcontents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAccomodationaccomodation_idcontents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/contents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idhost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAccomodationaccomodation_idhost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/host");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idcontents()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAccomodationaccomodation_idcontents() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/contents");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodationaccomodation_idhost()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAccomodationaccomodation_idhost() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation/{accomodation_id}/host");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Accomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Accomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccomodationRestController controller = (AccomodationRestController) context.getBean("AccomodationRestController");

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