package com.mayaccom.service;

import com.mayaccom.dao.BlogDAO;

import com.mayaccom.domain.Blog;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Blog entities
 * 
 */

@Service("BlogService")

@Transactional
public class BlogServiceImpl implements BlogService {

	/**
	 * DAO injected by Spring that manages Blog entities
	 * 
	 */
	@Autowired
	private BlogDAO blogDAO;

	/**
	 * Instantiates a new BlogServiceImpl.
	 *
	 */
	public BlogServiceImpl() {
	}

	/**
	 * Delete an existing Blog entity
	 * 
	 */
	@Transactional
	public void deleteBlog(Blog blog) {
		blogDAO.remove(blog);
		blogDAO.flush();
	}

	/**
	 * Return all Blog entity
	 * 
	 */
	@Transactional
	public List<Blog> findAllBlogs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Blog>(blogDAO.findAllBlogs(startResult, maxRows));
	}

	/**
	 * Load an existing Blog entity
	 * 
	 */
	@Transactional
	public Set<Blog> loadBlogs() {
		return blogDAO.findAllBlogs();
	}

	/**
	 * Save an existing Blog entity
	 * 
	 */
	@Transactional
	public void saveBlog(Blog blog) {
		Blog existingBlog = blogDAO.findBlogByPrimaryKey(blog.getId());

		if (existingBlog != null) {
			if (existingBlog != blog) {
				existingBlog.setId(blog.getId());
				existingBlog.setDescription(blog.getDescription());
				existingBlog.setTitle(blog.getTitle());
				existingBlog.setOwner(blog.getOwner());
			}
			blog = blogDAO.store(existingBlog);
		} else {
			blog = blogDAO.store(blog);
		}
		blogDAO.flush();
	}

	/**
	 * Return a count of all Blog entity
	 * 
	 */
	@Transactional
	public Integer countBlogs() {
		return ((Long) blogDAO.createQuerySingleResult("select count(o) from Blog o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Blog findBlogByPrimaryKey(Integer id) {
		return blogDAO.findBlogByPrimaryKey(id);
	}
}
