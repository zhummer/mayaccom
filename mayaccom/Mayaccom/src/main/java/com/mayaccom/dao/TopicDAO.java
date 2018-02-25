
package com.mayaccom.dao;

import com.mayaccom.domain.Topic;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Topic entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/.properties.datastore]
 * @generated
 * @AuxiliaryModelComponent
 */
public interface TopicDAO extends JpaDao<Topic> {

	/**
	 * JPQL Query - findTopicByLastPosterId
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPosterId.query]JPASelect
	 */
	public Set<Topic> findTopicByLastPosterId(Integer lastPosterId) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByLastPosterId
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPosterId.query]JPASelectWithPagination
	 */
	public Set<Topic> findTopicByLastPosterId(Integer lastPosterId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTopicById
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicById.query]JPASelect
	 */
	public Topic findTopicById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTopicById
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicById.query]JPASelectWithPagination
	 */
	public Topic findTopicById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByLastPostAt
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPostAt.query]JPASelect
	 */
	public Set<Topic> findTopicByLastPostAt(java.util.Calendar lastPostAt) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByLastPostAt
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPostAt.query]JPASelectWithPagination
	 */
	public Set<Topic> findTopicByLastPostAt(Calendar lastPostAt, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTopics
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findAllTopics.query]JPASelect
	 */
	public Set<Topic> findAllTopics() throws DataAccessException;

	/**
	 * JPQL Query - findAllTopics
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findAllTopics.query]JPASelectWithPagination
	 */
	public Set<Topic> findAllTopics(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByNameContaining
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByNameContaining.query]JPASelect
	 */
	public Set<Topic> findTopicByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByNameContaining
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByNameContaining.query]JPASelectWithPagination
	 */
	public Set<Topic> findTopicByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByPrimaryKey
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByPrimaryKey.query]JPASelect
	 */
	public Topic findTopicByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByPrimaryKey
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByPrimaryKey.query]JPASelectWithPagination
	 */
	public Topic findTopicByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByName
	 *
	* @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByName.query]JPASelect
	 */
	public Set<Topic> findTopicByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findTopicByName
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByName.query]JPASelectWithPagination
	 */
	public Set<Topic> findTopicByName(String name_1, int startResult, int maxRows) throws DataAccessException;

}