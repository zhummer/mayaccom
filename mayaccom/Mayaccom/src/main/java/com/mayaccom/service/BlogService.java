
package com.mayaccom.service;

import com.mayaccom.domain.Blog;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Blog entities
 * 
 */
public interface BlogService {

	/**
	* Delete an existing Blog entity
	* 
	 */
	public void deleteBlog(Blog blog);

	/**
	* Return all Blog entity
	* 
	 */
	public List<Blog> findAllBlogs(Integer startResult, Integer maxRows);

	/**
	* Load an existing Blog entity
	* 
	 */
	public Set<Blog> loadBlogs();

	/**
	* Save an existing Blog entity
	* 
	 */
	public void saveBlog(Blog blog_1);

	/**
	* Return a count of all Blog entity
	* 
	 */
	public Integer countBlogs();

	/**
	 */
	public Blog findBlogByPrimaryKey(Integer id);
}