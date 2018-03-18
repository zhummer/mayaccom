
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
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexAccomodation()</code>.
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
	 * Test <code>selectAccomodation()</code>.
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
	 * Test <code>editAccomodation()</code>.
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
	 * Test <code>saveAccomodation()</code>.
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
	 * Test <code>newAccomodation()</code>.
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
	 * Test <code>confirmDeleteAccomodation()</code>.
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
	 * Test <code>deleteAccomodation()</code>.
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
	 * Test <code>accomodationControllerbinaryaction()</code>.
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
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}