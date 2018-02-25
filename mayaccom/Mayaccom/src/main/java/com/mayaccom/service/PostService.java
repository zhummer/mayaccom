
package com.mayaccom.service;

import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Post entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/.properties.srv]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface PostService {

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/deletePost%7B5747860c-f1fd-47f5-b057-b0556d60a213%7D/.properties.swoperation]
	 */
	public void deletePost(Post post);

	/**
	* Load an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/loadPosts%7Bc747cd91-ab9e-4ead-a97d-666c9e31cf24%7D/.properties.swoperation]
	 */
	public Set<Post> loadPosts();

	/**
	* Return a count of all Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/countPosts%7Bf5396992-68c0-4828-8d8c-677f0d680790%7D/.properties.swoperation]
	 */
	public Integer countPosts();

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/deletePostHost%7Bf082a6fa-5ab6-46d9-b66b-57c76b2c5c93%7D/.properties.swoperation]
	 */
	public Post deletePostHost(Integer post_id, Integer related_host_id);

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/savePostTopic%7B670885be-8f2f-4b86-b584-b22b002c6de1%7D/.properties.swoperation]
	 */
	public Post savePostTopic(Integer id, Topic related_topic);

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/findPostByPrimaryKey%7Bc1d93362-8eac-4504-a60d-bc49337d5942%7D/.properties.swoperation]
	 */
	public Post findPostByPrimaryKey(Integer id_1);

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/savePostHost%7B0b220d49-e095-4cc5-996c-8c8dacf17388%7D/.properties.swoperation]
	 */
	public Post savePostHost(Integer id_2, Host related_host);

	/**
	* Return all Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/findAllPosts%7B742fdce4-e97c-47e8-82a5-8a239f949a9e%7D/.properties.swoperation]
	 */
	public List<Post> findAllPosts(Integer startResult, Integer maxRows);

	/**
	* Save an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/savePost%7B77d147de-a811-4e15-a888-b9cc138ab4a1%7D/.properties.swoperation]
	 */
	public void savePost(Post post_1);

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/PostService/deletePostTopic%7B6bb51d99-4212-4f47-b3d6-16366045e97c%7D/.properties.swoperation]
	 */
	public Post deletePostTopic(Integer post_id_1, Integer related_topic_id);
}