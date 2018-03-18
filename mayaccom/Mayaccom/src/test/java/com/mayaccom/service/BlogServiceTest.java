
package com.mayaccom.service;

import com.mayaccom.domain.Blog;

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
public class BlogServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected BlogService service;

	/**
	 * Instantiates a new BlogServiceTest.
	 *
	 */
	public BlogServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing Blog entity
	* 
	 */
	@Test
	public void deleteBlog() {
		// TODO: JUnit - Populate test inputs for operation: deleteBlog 
		Blog blog = new com.mayaccom.domain.Blog();
		service.deleteBlog(blog);
	}

	/**
	 * Operation Unit Test
	* Return all Blog entity
	* 
	 */
	@Test
	public void findAllBlogs() {
		// TODO: JUnit - Populate test inputs for operation: findAllBlogs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Blog> response = null;
		response = service.findAllBlogs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllBlogs
	}

	/**
	 * Operation Unit Test
	* Load an existing Blog entity
	* 
	 */
	@Test
	public void loadBlogs() {
		Set<Blog> response = null;
		response = service.loadBlogs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadBlogs
	}

	/**
	 * Operation Unit Test
	* Save an existing Blog entity
	* 
	 */
	@Test
	public void saveBlog() {
		// TODO: JUnit - Populate test inputs for operation: saveBlog 
		Blog blog_1 = new com.mayaccom.domain.Blog();
		service.saveBlog(blog_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Blog entity
	* 
	 */
	@Test
	public void countBlogs() {
		Integer response = null;
		response = service.countBlogs();
		// TODO: JUnit - Add assertions to test outputs of operation: countBlogs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findBlogByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findBlogByPrimaryKey 
		Integer id = 0;
		Blog response = null;
		response = service.findBlogByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findBlogByPrimaryKey
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
