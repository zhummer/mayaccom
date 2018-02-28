
package com.mayaccom.service;

import com.mayaccom.domain.Forum;
import com.mayaccom.domain.Topic;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Forum entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/.properties.srv]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface ForumService {

	/**
	* Save an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/saveForum%7Be72a2de7-dd50-4768-bed0-6dc65a1d66ef%7D/.properties.swoperation]
	 */
	public void saveForum(Forum forum);

	/**
	* Delete an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/deleteForumTopics%7Be755e238-c2f5-4fbd-8998-8120e0900441%7D/.properties.swoperation]
	 */
	public Forum deleteForumTopics(Integer forum_id, Integer related_topics_id);

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/findForumByPrimaryKey%7B841ce4e3-7ce9-4622-a202-6ae982146761%7D/.properties.swoperation]
	 */
	public Forum findForumByPrimaryKey(Integer id);

	/**
	* Save an existing Topic entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/saveForumTopics%7B75fd64b4-4a34-404f-b0c5-b1a14d10aeb6%7D/.properties.swoperation]
	 */
	public Forum saveForumTopics(Integer id_1, Topic related_topics);

	/**
	* Return a count of all Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/countForums%7B73aecef3-8ad7-42d5-9f71-833f22a1b4c7%7D/.properties.swoperation]
	 */
	public Integer countForums();

	/**
	* Load an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/loadForums%7Bfd333c44-70b1-427d-bfd9-df513678cdf6%7D/.properties.swoperation]
	 */
	public Set<Forum> loadForums();

	/**
	* Delete an existing Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/deleteForum%7B50bac5a1-5631-4615-b00d-e2c6bea3dc25%7D/.properties.swoperation]
	 */
	public void deleteForum(Forum forum_1);

	/**
	* Return all Forum entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/ForumService/findAllForums%7B9f089776-6481-4cfe-9052-e99d4a2d8a9c%7D/.properties.swoperation]
	 */
	public List<Forum> findAllForums(Integer startResult, Integer maxRows);
}