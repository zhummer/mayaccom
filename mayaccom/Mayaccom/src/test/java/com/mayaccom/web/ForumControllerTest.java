
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
 * Unit test for the <code>ForumController</code> controller.
 *
 * @see com.mayaccom.web.ForumController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class ForumControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexForum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexForum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectForum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectForum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editForum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editForum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveForum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveForum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newForum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newForum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteForum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteForum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteForum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteForum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>forumControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetforumControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/forumController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumController controller = (ForumController) context.getBean("ForumController");

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