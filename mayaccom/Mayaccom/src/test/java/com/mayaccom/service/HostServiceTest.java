
package com.mayaccom.service;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
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
public class HostServiceTest {

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
	protected HostService service;

	/**
	 * Instantiates a new HostServiceTest.
	 *
	* @generated
	 */
	public HostServiceTest() {
		setupRequestContext();
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
	public void deleteHostTopics() {
		// TODO: JUnit - Populate test inputs for operation: deleteHostTopics 
		Integer host_id = 0;
		Integer related_topics_id = 0;
		Host response = null;
		response = service.deleteHostTopics(host_id, related_topics_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteHostTopics
	}

	/**
	 * Operation Unit Test
	* Save an existing Accomodation entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveHostAccomodations() {
		// TODO: JUnit - Populate test inputs for operation: saveHostAccomodations 
		Integer id = 0;
		Accomodation related_accomodations = new com.mayaccom.domain.Accomodation();
		Host response = null;
		response = service.saveHostAccomodations(id, related_accomodations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveHostAccomodations
	}

	/**
	 * Operation Unit Test
	* Load an existing Host entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadHosts() {
		Set<Host> response = null;
		response = service.loadHosts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadHosts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Post entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteHostPosts() {
		// TODO: JUnit - Populate test inputs for operation: deleteHostPosts 
		Integer host_id_1 = 0;
		Integer related_posts_id = 0;
		Host response = null;
		response = service.deleteHostPosts(host_id_1, related_posts_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteHostPosts
	}

	/**
	 * Operation Unit Test
	* Return a count of all Host entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countHosts() {
		Integer response = null;
		response = service.countHosts();
		// TODO: JUnit - Add assertions to test outputs of operation: countHosts
	}

	/**
	 * Operation Unit Test
	* Save an existing Post entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveHostPosts() {
		// TODO: JUnit - Populate test inputs for operation: saveHostPosts 
		Integer id_1 = 0;
		Post related_posts = new com.mayaccom.domain.Post();
		Host response = null;
		response = service.saveHostPosts(id_1, related_posts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveHostPosts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Accomodation entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteHostAccomodations() {
		// TODO: JUnit - Populate test inputs for operation: deleteHostAccomodations 
		Integer host_id_2 = 0;
		Integer related_accomodations_id = 0;
		Host response = null;
		response = service.deleteHostAccomodations(host_id_2, related_accomodations_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteHostAccomodations
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
	public void saveHostTopics() {
		// TODO: JUnit - Populate test inputs for operation: saveHostTopics 
		Integer id_2 = 0;
		Topic related_topics = new com.mayaccom.domain.Topic();
		Host response = null;
		response = service.saveHostTopics(id_2, related_topics);
		// TODO: JUnit - Add assertions to test outputs of operation: saveHostTopics
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
	public void findHostByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findHostByPrimaryKey 
		Integer id_3 = 0;
		Host response = null;
		response = service.findHostByPrimaryKey(id_3);
		// TODO: JUnit - Add assertions to test outputs of operation: findHostByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Host entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveHost() {
		// TODO: JUnit - Populate test inputs for operation: saveHost 
		Host host = new com.mayaccom.domain.Host();
		service.saveHost(host);
	}

	/**
	 * Operation Unit Test
	* Return all Host entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findAllHosts() {
		// TODO: JUnit - Populate test inputs for operation: findAllHosts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Host> response = null;
		response = service.findAllHosts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllHosts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Host entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteHost() {
		// TODO: JUnit - Populate test inputs for operation: deleteHost 
		Host host_1 = new com.mayaccom.domain.Host();
		service.deleteHost(host_1);
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
