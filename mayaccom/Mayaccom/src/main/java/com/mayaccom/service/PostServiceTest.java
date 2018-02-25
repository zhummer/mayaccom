
package com.mayaccom.service;

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
public class PostServiceTest {

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
	protected PostService service;

	/**
	 * Instantiates a new PostServiceTest.
	 *
	* @generated
	 */
	public PostServiceTest() {
		setupRequestContext();
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
	public void deletePost() {
		// TODO: JUnit - Populate test inputs for operation: deletePost 
		Post post = new com.mayaccom.domain.Post();
		service.deletePost(post);
	}

	/**
	 * Operation Unit Test
	* Load an existing Post entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadPosts() {
		Set<Post> response = null;
		response = service.loadPosts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPosts
	}

	/**
	 * Operation Unit Test
	* Return a count of all Post entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countPosts() {
		Integer response = null;
		response = service.countPosts();
		// TODO: JUnit - Add assertions to test outputs of operation: countPosts
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
	public void deletePostHost() {
		// TODO: JUnit - Populate test inputs for operation: deletePostHost 
		Integer post_id = 0;
		Integer related_host_id = 0;
		Post response = null;
		response = service.deletePostHost(post_id, related_host_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePostHost
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
	public void savePostTopic() {
		// TODO: JUnit - Populate test inputs for operation: savePostTopic 
		Integer id = 0;
		Topic related_topic = new com.mayaccom.domain.Topic();
		Post response = null;
		response = service.savePostTopic(id, related_topic);
		// TODO: JUnit - Add assertions to test outputs of operation: savePostTopic
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
	public void findPostByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPostByPrimaryKey 
		Integer id_1 = 0;
		Post response = null;
		response = service.findPostByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findPostByPrimaryKey
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
	public void savePostHost() {
		// TODO: JUnit - Populate test inputs for operation: savePostHost 
		Integer id_2 = 0;
		Host related_host = new com.mayaccom.domain.Host();
		Post response = null;
		response = service.savePostHost(id_2, related_host);
		// TODO: JUnit - Add assertions to test outputs of operation: savePostHost
	}

	/**
	 * Operation Unit Test
	* Return all Post entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void findAllPosts() {
		// TODO: JUnit - Populate test inputs for operation: findAllPosts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Post> response = null;
		response = service.findAllPosts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPosts
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
	public void savePost() {
		// TODO: JUnit - Populate test inputs for operation: savePost 
		Post post_1 = new com.mayaccom.domain.Post();
		service.savePost(post_1);
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
	public void deletePostTopic() {
		// TODO: JUnit - Populate test inputs for operation: deletePostTopic 
		Integer post_id_1 = 0;
		Integer related_topic_id = 0;
		Post response = null;
		response = service.deletePostTopic(post_id_1, related_topic_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePostTopic
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
