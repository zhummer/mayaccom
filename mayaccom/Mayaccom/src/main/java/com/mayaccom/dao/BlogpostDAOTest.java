
package com.mayaccom.dao;

import com.mayaccom.domain.Blogpost;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

/**
 * Class used to test the basic Data Store Functionality
 *
 * @generated
 * @AuxiliaryModelComponent
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:./src/main/resources/Mayaccom-security-context.xml",
		"file:./src/main/resources/Mayaccom-service-context.xml",
		"file:./src/main/resources/Mayaccom-dao-context.xml",
		"file:./src/main/resources/Mayaccom-web-context.xml" })
public class BlogpostDAOTest {
	/**
	 * The DAO being tested, injected by Spring
	 *
	* @generated
	 */
	private BlogpostDAO dataStore;

	/**
	 * Instantiates a new BlogpostDAOTest.
	 *
	* @generated
	 */
	public BlogpostDAOTest() {
	}

	/**
	* Method to test Blogpost domain object.
	*
	* @generated
	*/
	@Rollback(false)
	@Test
	public void Blogpost() {
		Blogpost instance = new Blogpost();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested
	 *
	* @generated
	*/
	@Autowired
	public void setDataStore(BlogpostDAO dataStore) {
		this.dataStore = dataStore;
	}
}
