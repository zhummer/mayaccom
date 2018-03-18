
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
 * Unit test for the <code>BlogController</code> controller.
 *
 * @see com.mayaccom.web.BlogController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class BlogControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexBlog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBlog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBlog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBlog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBlog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBlog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBlog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBlog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBlog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBlog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBlog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBlog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBlog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBlog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBlog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBlog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBlog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBlog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBlog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBlog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBlog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>blogControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetblogControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/blogController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BlogController controller = (BlogController) context.getBean("BlogController");

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