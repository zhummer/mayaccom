
package com.mayaccom.service;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogpost;
import com.mayaccom.domain.Person;

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
public class BlogServiceTest {

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
	protected BlogService service;

	/**
	 * Instantiates a new BlogServiceTest.
	 *
	* @generated
	 */
	public BlogServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Blogpost entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveBlogBlogposts() {
		// TODO: JUnit - Populate test inputs for operation: saveBlogBlogposts 
		Integer id = 0;
		Blogpost related_blogposts = new com.mayaccom.domain.Blogpost();
		Blog response = null;
		response = service.saveBlogBlogposts(id, related_blogposts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveBlogBlogposts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Blog entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteBlog() {
		// TODO: JUnit - Populate test inputs for operation: deleteBlog 
		Blog blog = new com.mayaccom.domain.Blog();
		service.deleteBlog(blog);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Blog entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void countBlogs() {
		Integer response = null;
		response = service.countBlogs();
		// TODO: JUnit - Add assertions to test outputs of operation: countBlogs
	}

	/**
	 * Operation Unit Test
	* Save an existing Blog entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveBlog() {
		// TODO: JUnit - Populate test inputs for operation: saveBlog 
		Blog blog_1 = new com.mayaccom.domain.Blog();
		service.saveBlog(blog_1);
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
	public void findBlogByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findBlogByPrimaryKey 
		Integer id_1 = 0;
		Blog response = null;
		response = service.findBlogByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findBlogByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing Blog entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void loadBlogs() {
		Set<Blog> response = null;
		response = service.loadBlogs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadBlogs
	}

	/**
	 * Operation Unit Test
	* Delete an existing Blogpost entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteBlogBlogposts() {
		// TODO: JUnit - Populate test inputs for operation: deleteBlogBlogposts 
		Integer blog_id = 0;
		Integer related_blogposts_id = 0;
		Blog response = null;
		response = service.deleteBlogBlogposts(blog_id, related_blogposts_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteBlogBlogposts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Person entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void deleteBlogPerson() {
		// TODO: JUnit - Populate test inputs for operation: deleteBlogPerson 
		Integer blog_id_1 = 0;
		Integer related_person_id = 0;
		Blog response = null;
		response = service.deleteBlogPerson(blog_id_1, related_person_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteBlogPerson
	}

	/**
	 * Operation Unit Test
	* Save an existing Person entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	public void saveBlogPerson() {
		// TODO: JUnit - Populate test inputs for operation: saveBlogPerson 
		Integer id_2 = 0;
		Person related_person = new com.mayaccom.domain.Person();
		Blog response = null;
		response = service.saveBlogPerson(id_2, related_person);
		// TODO: JUnit - Add assertions to test outputs of operation: saveBlogPerson
	}

	/**
	 * Operation Unit Test
	* Return all Blog entity
	* 
	* @generated
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
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
