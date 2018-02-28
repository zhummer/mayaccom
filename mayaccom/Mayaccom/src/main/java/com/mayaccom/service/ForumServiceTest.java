
package com.mayaccom.service;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Topic;

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
 * @generated
 * @AuxiliaryModelComponent
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
	* @generated
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	* @generated
	 */
	@Autowired
	protected ForumService service;

	/**
	 * Instantiates a new ForumServiceTest.
	 *
	* @generated
	 */
	public ForumServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Forum entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveForum() {
		// TODO: JUnit - Populate test inputs for operation: saveForum 
		Forum forum = new com.mayaccom.domain.Forum();
		service.saveForum(forum);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Topic entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteForumTopics() {
		// TODO: JUnit - Populate test inputs for operation: deleteForumTopics 
		Integer forum_id = 0;
		Integer related_topics_id = 0;
		Forum response = null;
		response = service.deleteForumTopics(forum_id, related_topics_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteForumTopics
	}

	/**
	 * Operation Unit Test
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
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
	* Save an existing Topic entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveForumTopics() {
		// TODO: JUnit - Populate test inputs for operation: saveForumTopics 
		Integer id_1 = 0;
		Topic related_topics = new com.mayaccom.domain.Topic();
		Forum response = null;
		response = service.saveForumTopics(id_1, related_topics);
		// TODO: JUnit - Add assertions to test outputs of operation: saveForumTopics
	}

	/**
	 * Operation Unit Test
	* Return a count of all Forum entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countForums() {
		Integer response = null;
		response = service.countForums();
		// TODO: JUnit - Add assertions to test outputs of operation: countForums
	}

	/**
	 * Operation Unit Test
	* Load an existing Forum entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadForums() {
		Set<Forum> response = null;
		response = service.loadForums();
		// TODO: JUnit - Add assertions to test outputs of operation: loadForums
	}

	/**
	 * Operation Unit Test
	* Delete an existing Forum entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteForum() {
		// TODO: JUnit - Populate test inputs for operation: deleteForum 
		Forum forum_1 = new com.mayaccom.domain.Forum();
		service.deleteForum(forum_1);
	}

	/**
	 * Operation Unit Test
	* Return all Forum entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
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
	 * Sets Up the Request context
	 *
	* @generated
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
