package com.mayaccom.service;

import com.mayaccom.dao.BlogDAO;
import com.mayaccom.dao.BlogpostDAO;
import com.mayaccom.dao.PersonDAO;

import com.mayaccom.domain.Blog;
import com.mayaccom.domain.Blogpost;
import com.mayaccom.domain.Person;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Blog entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/.properties.srv]
 * @generated
 */

@Service("BlogService")

@Transactional
public class BlogServiceImpl implements BlogService {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/.properties.srv#//@variables%5Bname='blogDAO'%5D]
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * DAO injected by Spring that manages Blogpost entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/.properties.srv#//@variables%5Bname='blogpostDAO'%5D]
	 */
	@Autowired
	private BlogpostDAO blogpostDAO;

	/**
	 * DAO injected by Spring that manages Person entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/.properties.srv#//@variables%5Bname='personDAO'%5D]
	 */
	@Autowired
	private PersonDAO personDAO;

	/**
	 * Instantiates a new BlogServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public BlogServiceImpl() {
	}

	/**
	 * Save an existing Blogpost entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/saveBlogBlogposts%7B7637f005-2b99-4912-96f9-875e6db05fd0%7D/.properties.swoperation]
	 */
	@Transactional
	public Blog saveBlogBlogposts(Integer id, Blogpost related_blogposts) {
		Blog blog = blogDAO.findBlogByPrimaryKey(id, -1, -1);
		Blogpost existingblogposts = blogpostDAO.findBlogpostByPrimaryKey(related_blogposts.getId());

		// copy into the existing record to preserve existing relationships
		if (existingblogposts != null) {
			existingblogposts.setId(related_blogposts.getId());
			existingblogposts.setContent(related_blogposts.getContent());
			existingblogposts.setCreationTs(related_blogposts.getCreationTs());
			related_blogposts = existingblogposts;
		} else {
			related_blogposts = blogpostDAO.store(related_blogposts);
			blogpostDAO.flush();
		}

		related_blogposts.setBlog(blog);
		blog.getBlogposts().add(related_blogposts);
		related_blogposts = blogpostDAO.store(related_blogposts);
		blogpostDAO.flush();

		blog = blogDAO.store(blog);
		blogDAO.flush();

		return blog;
	}

	/**
	 * Delete an existing Blog entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/deleteBlog%7B90999647-3102-4db0-a666-41d63b4b5150%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteBlog(Blog blog) {
		blogDAO.remove(blog);
		blogDAO.flush();
	}

	/**
	 * Return a count of all Blog entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/countBlogs%7B814369ea-9728-41f5-89ab-bf839c422c17%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countBlogs() {
		return ((Long) blogDAO.createQuerySingleResult("select count(o) from Blog o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Blog entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/saveBlog%7B1bd38a07-dcd8-482e-ac0c-66c864429c99%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveBlog(Blog blog) {
		Blog existingBlog = blogDAO.findBlogByPrimaryKey(blog.getId());

		if (existingBlog != null) {
			if (existingBlog != blog) {
				existingBlog.setId(blog.getId());
				existingBlog.setTitle(blog.getTitle());
				existingBlog.setDescription(blog.getDescription());
			}
			blog = blogDAO.store(existingBlog);
		} else {
			blog = blogDAO.store(blog);
		}
		blogDAO.flush();
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/findBlogByPrimaryKey%7B713e3170-4735-4fdb-8a27-04269f0ad6de%7D/.properties.swoperation]
	 */
	@Transactional
	public Blog findBlogByPrimaryKey(Integer id) {
		return blogDAO.findBlogByPrimaryKey(id);
	}

	/**
	 * Load an existing Blog entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/loadBlogs%7Bf1858b80-3b86-4170-8922-66e0e24f287f%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Blog> loadBlogs() {
		return blogDAO.findAllBlogs();
	}

	/**
	 * Delete an existing Blogpost entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/deleteBlogBlogposts%7B7dfd07ad-44cb-46ac-9436-ee1df83576ac%7D/.properties.swoperation]
	 */
	@Transactional
	public Blog deleteBlogBlogposts(Integer blog_id, Integer related_blogposts_id) {
		Blogpost related_blogposts = blogpostDAO.findBlogpostByPrimaryKey(related_blogposts_id, -1, -1);

		Blog blog = blogDAO.findBlogByPrimaryKey(blog_id, -1, -1);

		related_blogposts.setBlog(null);
		blog.getBlogposts().remove(related_blogposts);

		blogpostDAO.remove(related_blogposts);
		blogpostDAO.flush();

		return blog;
	}

	/**
	 * Delete an existing Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/deleteBlogPerson%7B7355fadb-f3f0-4343-a356-2c30ad0965b7%7D/.properties.swoperation]
	 */
	@Transactional
	public Blog deleteBlogPerson(Integer blog_id, Integer related_person_id) {
		Blog blog = blogDAO.findBlogByPrimaryKey(blog_id, -1, -1);
		Person related_person = personDAO.findPersonByPrimaryKey(related_person_id, -1, -1);

		blog.setPerson(null);
		related_person.getBlogs().remove(blog);
		blog = blogDAO.store(blog);
		blogDAO.flush();

		related_person = personDAO.store(related_person);
		personDAO.flush();

		personDAO.remove(related_person);
		personDAO.flush();

		return blog;
	}

	/**
	 * Save an existing Person entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/saveBlogPerson%7Ba7b75098-ec25-4045-81ad-fdd4c29281ab%7D/.properties.swoperation]
	 */
	@Transactional
	public Blog saveBlogPerson(Integer id, Person related_person) {
		Blog blog = blogDAO.findBlogByPrimaryKey(id, -1, -1);
		Person existingperson = personDAO.findPersonByPrimaryKey(related_person.getId());

		// copy into the existing record to preserve existing relationships
		if (existingperson != null) {
			existingperson.setId(related_person.getId());
			existingperson.setFirstname(related_person.getFirstname());
			existingperson.setLastname(related_person.getLastname());
			existingperson.setEmail(related_person.getEmail());
			existingperson.setAddress(related_person.getAddress());
			existingperson.setCity(related_person.getCity());
			existingperson.setPassword(related_person.getPassword());
			existingperson.setDtype(related_person.getDtype());
			related_person = existingperson;
		} else {
			related_person = personDAO.store(related_person);
			personDAO.flush();
		}

		blog.setPerson(related_person);
		related_person.getBlogs().add(blog);
		blog = blogDAO.store(blog);
		blogDAO.flush();

		related_person = personDAO.store(related_person);
		personDAO.flush();

		return blog;
	}

	/**
	 * Return all Blog entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/BlogService/findAllBlogs%7Bb6aae1b5-af89-4e7f-82cb-2279e126d595%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Blog> findAllBlogs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Blog>(blogDAO.findAllBlogs(startResult, maxRows));
	}
}
