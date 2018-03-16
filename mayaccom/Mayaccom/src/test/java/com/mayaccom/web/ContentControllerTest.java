
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
 * Unit test for the <code>ContentController</code> controller.
 *
 * @see com.mayaccom.web.ContentController
 * @generated
 * @AuxiliaryModelComponent
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class ContentControllerTest {
	/**
	 * The Spring application context.
	 *
	* @generated
	 */
	private ApplicationContext context;

	/**
	 * Test <code>confirmDeleteContentAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteContentAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteContentAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteContent()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteContent() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteContent");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteContentAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteContentAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteContentAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteContent()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteContent() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteContent");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editContentAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditContentAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editContentAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editContent()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditContent() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editContent");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listContentAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistContentAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listContentAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexContent()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexContent() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexContent");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newContentAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewContentAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newContentAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newContent()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewContent() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newContent");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveContentAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveContentAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveContentAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveContent()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveContent() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveContent");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectContentAccomodation()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectContentAccomodation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectContentAccomodation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectContent()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectContent() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectContent");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>contentControllerbinaryaction()</code>.
	* @generated
	 *
	 * TO AVOID LOSING MANUAL CHANGES, turn generation off for this file or method.
	 * Generation of the entire file can be disabled on the Code Generation tab of the Spring DSL editor.
	 * Alternately, you can add the NOT keyword after the @generated annotation above the class declaration.
	 * Add the NOT keyword after the @generated annotation on this method to preserve changes to this method only.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcontentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/contentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContentController controller = (ContentController) context.getBean("ContentController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	* @generated
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
	* @generated
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}