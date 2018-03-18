
package com.mayaccom.service;

import com.mayaccom.domain.Forum;

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
public class ForumServiceTest {

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
	protected ForumService service;

	/**
	 * Instantiates a new ForumServiceTest.
	 *
	 */
	public ForumServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all Forum entity
	* 
	 */
	@Test
	public void findAllForums() {
		// TODO: JUnit - Populate test inputs for operation: findAllForums 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Forum> response = null;
		response = service.findAllForums(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllForums
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findForumByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findForumByPrimaryKey 
		Integer id = 0;
		Forum response = null;
		response = service.findForumByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findForumByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Forum entity
	* 
	 */
	@Test
	public void deleteForum() {
		// TODO: JUnit - Populate test inputs for operation: deleteForum 
		Forum forum = new com.mayaccom.domain.Forum();
		service.deleteForum(forum);
	}

	/**
	 * Operation Unit Test
	* Save an existing Forum entity
	* 
	 */
	@Test
	public void saveForum() {
		// TODO: JUnit - Populate test inputs for operation: saveForum 
		Forum forum_1 = new com.mayaccom.domain.Forum();
		service.saveForum(forum_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing Forum entity
	* 
	 */
	@Test
	public void loadForums() {
		Set<Forum> response = null;
		response = service.loadForums();
		// TODO: JUnit - Add assertions to test outputs of operation: loadForums
	}

	/**
	 * Operation Unit Test
	* Return a count of all Forum entity
	* 
	 */
	@Test
	public void countForums() {
		Integer response = null;
		response = service.countForums();
		// TODO: JUnit - Add assertions to test outputs of operation: countForums
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
