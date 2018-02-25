
package com.mayaccom.dao;

import com.mayaccom.domain.Topic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Topic entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/.properties.datastore]
 * @generated
 */
@Repository("TopicDAO")

@Transactional
public class TopicDAOImpl extends AbstractJpaDao<Topic> implements TopicDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Topic.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TopicDAOImpl
	 *
	* @generated
	 */
	public TopicDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	* @generated
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	* @generated
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findTopicByLastPosterId
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPosterId.query]JPASelect
	 */
	@Transactional
	public Set<Topic> findTopicByLastPosterId(Integer lastPosterId) throws DataAccessException {

		return findTopicByLastPosterId(lastPosterId, -1, -1);
	}

	/**
	 * JPQL Query - findTopicByLastPosterId
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPosterId.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Topic> findTopicByLastPosterId(Integer lastPosterId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTopicByLastPosterId", startResult, maxRows, lastPosterId);
		return new LinkedHashSet<Topic>(query.getResultList());
	}

	/**
	 * JPQL Query - findTopicById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicById.query]JPASelect
	 */
	@Transactional
	public Topic findTopicById(Integer id) throws DataAccessException {

		return findTopicById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTopicById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicById.query]JPASelectWithPagination
	 */

	@Transactional
	public Topic findTopicById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTopicById", startResult, maxRows, id);
			return (com.mayaccom.domain.Topic) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTopicByLastPostAt
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPostAt.query]JPASelect
	 */
	@Transactional
	public Set<Topic> findTopicByLastPostAt(java.util.Calendar lastPostAt) throws DataAccessException {

		return findTopicByLastPostAt(lastPostAt, -1, -1);
	}

	/**
	 * JPQL Query - findTopicByLastPostAt
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByLastPostAt.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Topic> findTopicByLastPostAt(java.util.Calendar lastPostAt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTopicByLastPostAt", startResult, maxRows, lastPostAt);
		return new LinkedHashSet<Topic>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTopics
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findAllTopics.query]JPASelect
	 */
	@Transactional
	public Set<Topic> findAllTopics() throws DataAccessException {

		return findAllTopics(-1, -1);
	}

	/**
	 * JPQL Query - findAllTopics
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findAllTopics.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Topic> findAllTopics(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTopics", startResult, maxRows);
		return new LinkedHashSet<Topic>(query.getResultList());
	}

	/**
	 * JPQL Query - findTopicByNameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByNameContaining.query]JPASelect
	 */
	@Transactional
	public Set<Topic> findTopicByNameContaining(String name) throws DataAccessException {

		return findTopicByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findTopicByNameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByNameContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Topic> findTopicByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTopicByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Topic>(query.getResultList());
	}

	/**
	 * JPQL Query - findTopicByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Topic findTopicByPrimaryKey(Integer id) throws DataAccessException {

		return findTopicByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTopicByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Topic findTopicByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTopicByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Topic) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTopicByName
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByName.query]JPASelect
	 */
	@Transactional
	public Set<Topic> findTopicByName(String name) throws DataAccessException {

		return findTopicByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findTopicByName
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/TopicDAO/findTopicByName.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Topic> findTopicByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTopicByName", startResult, maxRows, name);
		return new LinkedHashSet<Topic>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Topic entity) {
		return true;
	}
}
