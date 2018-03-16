
package com.mayaccom.service;

import com.mayaccom.domain.Forum;
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
public class TopicServiceTest {

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
	protected TopicService service;

	/**
	 * Instantiates a new TopicServiceTest.
	 *
	* @generated
	 */
	public TopicServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all Topic entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findAllTopics() {
		// TODO: JUnit - Populate test inputs for operation: findAllTopics 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Topic> response = null;
		response = service.findAllTopics(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTopics
	}

	/**
	 * Operation Unit Test
	* Load an existing Topic entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadTopics() {
		Set<Topic> response = null;
		response = service.loadTopics();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTopics
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
	public void deleteTopicForum() {
		// TODO: JUnit - Populate test inputs for operation: deleteTopicForum 
		Integer topic_id = 0;
		Integer related_forum_id = 0;
		Topic response = null;
		response = service.deleteTopicForum(topic_id, related_forum_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTopicForum
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
	public void saveTopicPosts() {
		// TODO: JUnit - Populate test inputs for operation: saveTopicPosts 
		Integer id = 0;
		Post related_posts = new com.mayaccom.domain.Post();
		Topic response = null;
		response = service.saveTopicPosts(id, related_posts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTopicPosts
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
	public void saveTopicHost() {
		// TODO: JUnit - Populate test inputs for operation: saveTopicHost 
		Integer id_1 = 0;
		Host related_host = new com.mayaccom.domain.Host();
		Topic response = null;
		response = service.saveTopicHost(id_1, related_host);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTopicHost
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
	public void deleteTopic() {
		// TODO: JUnit - Populate test inputs for operation: deleteTopic 
		Topic topic = new com.mayaccom.domain.Topic();
		service.deleteTopic(topic);
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
	public void deleteTopicHost() {
		// TODO: JUnit - Populate test inputs for operation: deleteTopicHost 
		Integer topic_id_1 = 0;
		Integer related_host_id = 0;
		Topic response = null;
		response = service.deleteTopicHost(topic_id_1, related_host_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTopicHost
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
	public void saveTopicForum() {
		// TODO: JUnit - Populate test inputs for operation: saveTopicForum 
		Integer id_2 = 0;
		Forum related_forum = new com.mayaccom.domain.Forum();
		Topic response = null;
		response = service.saveTopicForum(id_2, related_forum);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTopicForum
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
	public void findTopicByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTopicByPrimaryKey 
		Integer id_3 = 0;
		Topic response = null;
		response = service.findTopicByPrimaryKey(id_3);
		// TODO: JUnit - Add assertions to test outputs of operation: findTopicByPrimaryKey
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
	public void saveTopic() {
		// TODO: JUnit - Populate test inputs for operation: saveTopic 
		Topic topic_1 = new com.mayaccom.domain.Topic();
		service.saveTopic(topic_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Topic entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countTopics() {
		Integer response = null;
		response = service.countTopics();
		// TODO: JUnit - Add assertions to test outputs of operation: countTopics
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
	public void deleteTopicPosts() {
		// TODO: JUnit - Populate test inputs for operation: deleteTopicPosts 
		Integer topic_id_2 = 0;
		Integer related_posts_id = 0;
		Topic response = null;
		response = service.deleteTopicPosts(topic_id_2, related_posts_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTopicPosts
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
