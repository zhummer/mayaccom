
package com.mayaccom.service;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Topic entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/.properties.srv]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface TopicService {

	/**
	* Return all Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/findAllTopics%7Bf2245278-cb96-4268-94ba-fdf8ceb93b75%7D/.properties.swoperation]
	 */
	public List<Topic> findAllTopics(Integer startResult, Integer maxRows);

	/**
	* Load an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/loadTopics%7Ba06d2503-1ebd-4d00-821c-e06af26ca228%7D/.properties.swoperation]
	 */
	public Set<Topic> loadTopics();

	/**
	* Delete an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopicForum%7B35159c76-c107-4596-83e8-201384003d0d%7D/.properties.swoperation]
	 */
	public Topic deleteTopicForum(Integer topic_id, Integer related_forum_id);

	/**
	* Save an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopicPosts%7Bb7e4795c-e0de-4edb-965b-986d970174f6%7D/.properties.swoperation]
	 */
	public Topic saveTopicPosts(Integer id, Post related_posts);

	/**
	* Save an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopicHost%7Bcea4b662-0d66-48c3-a0b3-5e5236431237%7D/.properties.swoperation]
	 */
	public Topic saveTopicHost(Integer id_1, Host related_host);

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopic%7Be9592c46-b701-4305-a2ae-1870e3d5ef98%7D/.properties.swoperation]
	 */
	public void deleteTopic(Topic topic);

	/**
	* Delete an existing Host entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopicHost%7B70e8d936-1dbb-43e6-81ae-61502d814747%7D/.properties.swoperation]
	 */
	public Topic deleteTopicHost(Integer topic_id_1, Integer related_host_id);

	/**
	* Save an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopicForum%7B05401b37-443c-42ca-8f19-7c4e9aa7e7db%7D/.properties.swoperation]
	 */
	public Topic saveTopicForum(Integer id_2, Forum related_forum);

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/findTopicByPrimaryKey%7Bbe530ad6-477f-4fd8-9b9e-39aead0e6a3c%7D/.properties.swoperation]
	 */
	public Topic findTopicByPrimaryKey(Integer id_3);

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/saveTopic%7B81efd983-48c0-42cd-8fcf-dd2ce83dc708%7D/.properties.swoperation]
	 */
	public void saveTopic(Topic topic_1);

	/**
	* Return a count of all Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/countTopics%7B1ee2de96-94e8-474a-9553-87bb1a266285%7D/.properties.swoperation]
	 */
	public Integer countTopics();

	/**
	* Delete an existing Post entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/TopicService/deleteTopicPosts%7B390c33ba-c9ae-4a65-8599-18f0d6700727%7D/.properties.swoperation]
	 */
	public Topic deleteTopicPosts(Integer topic_id_2, Integer related_posts_id);
}