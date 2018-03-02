
package com.mayaccom.service;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogcomment;
import com.mayaccom.domain.Person;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Person entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/.properties.srv]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface PersonService {

	/**
	* Delete an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/deletePersonBlogcomments%7B98dcbc80-7f39-4ca6-8473-790605ee4bc4%7D/.properties.swoperation]
	 */
	public Person deletePersonBlogcomments(Integer person_id, Integer related_blogcomments_id);

	/**
	* Save an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/savePerson%7B3753a36b-676f-4561-910e-99c1dd4d8017%7D/.properties.swoperation]
	 */
	public void savePerson(Person person);

	/**
	* Save an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/savePersonBlogs%7Bb8af16ff-2b83-4b9f-9e45-a92d831cab94%7D/.properties.swoperation]
	 */
	public Person savePersonBlogs(Integer id, Blog related_blogs);

	/**
	* Delete an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/deletePerson%7Bdc667344-16e3-4e03-b3b2-91d464714c16%7D/.properties.swoperation]
	 */
	public void deletePerson(Person person_1);

	/**
	* Return a count of all Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/countPersons%7B18054ac6-564a-447f-b6c5-2ed7eb27865f%7D/.properties.swoperation]
	 */
	public Integer countPersons();

	/**
	* Load an existing Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/loadPersons%7Baf7ef118-abbb-43aa-adc5-f3b3ed9a7228%7D/.properties.swoperation]
	 */
	public Set<Person> loadPersons();

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/findPersonByPrimaryKey%7B6c1cae29-4363-47e0-a5dd-90a30723021f%7D/.properties.swoperation]
	 */
	public Person findPersonByPrimaryKey(Integer id_1);

	/**
	* Return all Person entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/findAllPersons%7Bbf2ac612-e199-4221-a12d-b90b488db9db%7D/.properties.swoperation]
	 */
	public List<Person> findAllPersons(Integer startResult, Integer maxRows);

	/**
	* Delete an existing Blog entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/deletePersonBlogs%7B905768fc-25c4-4d78-b620-60352515f6fd%7D/.properties.swoperation]
	 */
	public Person deletePersonBlogs(Integer person_id_1, Integer related_blogs_id);

	/**
	* Save an existing Blogcomment entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PersonService/savePersonBlogcomments%7Bb7bceb0d-510c-4ebb-a246-1168c8468634%7D/.properties.swoperation]
	 */
	public Person savePersonBlogcomments(Integer id_2, Blogcomment related_blogcomments);
}