
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
 * Unit test for the <code>ForumRestController</code> controller.
 *
 * @see com.mayaccom.web.rest.ForumRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class ForumRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Forum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Forum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumRestController controller = (ForumRestController) context.getBean("ForumRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Forumforum_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetForumforum_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Forum/{forum_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumRestController controller = (ForumRestController) context.getBean("ForumRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Forum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Forum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumRestController controller = (ForumRestController) context.getBean("ForumRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Forum()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostForum() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Forum");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumRestController controller = (ForumRestController) context.getBean("ForumRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Forumforum_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteForumforum_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Forum/{forum_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ForumRestController controller = (ForumRestController) context.getBean("ForumRestController");

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