
package com.mayaccom.dao;

import com.mayaccom.domain.Content;

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
 * DAO to manage Content entities.
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/.properties.datastore]
 * @generated
 */
@Repository("ContentDAO")

@Transactional
public class ContentDAOImpl extends AbstractJpaDao<Content> implements ContentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	* @generated
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Content.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MayaDB
	 *
	* @generated
	 */
	@PersistenceContext(unitName = "MayaDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ContentDAOImpl
	 *
	* @generated
	 */
	public ContentDAOImpl() {
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
	 * JPQL Query - findContentByContentNameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByContentNameContaining.query]JPASelect
	 */
	@Transactional
	public Set<Content> findContentByContentNameContaining(String contentName) throws DataAccessException {

		return findContentByContentNameContaining(contentName, -1, -1);
	}

	/**
	 * JPQL Query - findContentByContentNameContaining
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByContentNameContaining.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Content> findContentByContentNameContaining(String contentName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContentByContentNameContaining", startResult, maxRows, contentName);
		return new LinkedHashSet<Content>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllContents
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findAllContents.query]JPASelect
	 */
	@Transactional
	public Set<Content> findAllContents() throws DataAccessException {

		return findAllContents(-1, -1);
	}

	/**
	 * JPQL Query - findAllContents
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findAllContents.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Content> findAllContents(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllContents", startResult, maxRows);
		return new LinkedHashSet<Content>(query.getResultList());
	}

	/**
	 * JPQL Query - findContentByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByPrimaryKey.query]JPASelect
	 */
	@Transactional
	public Content findContentByPrimaryKey(Integer id) throws DataAccessException {

		return findContentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findContentByPrimaryKey
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByPrimaryKey.query]JPASelectWithPagination
	 */

	@Transactional
	public Content findContentByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findContentByPrimaryKey", startResult, maxRows, id);
			return (com.mayaccom.domain.Content) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findContentByContentName
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByContentName.query]JPASelect
	 */
	@Transactional
	public Set<Content> findContentByContentName(String contentName) throws DataAccessException {

		return findContentByContentName(contentName, -1, -1);
	}

	/**
	 * JPQL Query - findContentByContentName
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByContentName.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Content> findContentByContentName(String contentName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContentByContentName", startResult, maxRows, contentName);
		return new LinkedHashSet<Content>(query.getResultList());
	}

	/**
	 * JPQL Query - findContentByEditorContent
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByEditorContent.query]JPASelect
	 */
	@Transactional
	public Set<Content> findContentByEditorContent(String editorContent1) throws DataAccessException {

		return findContentByEditorContent(editorContent1, -1, -1);
	}

	/**
	 * JPQL Query - findContentByEditorContent
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentByEditorContent.query]JPASelectWithPagination
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Content> findContentByEditorContent(String editorContent1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findContentByEditorContent", startResult, maxRows, editorContent1);
		return new LinkedHashSet<Content>(query.getResultList());
	}

	/**
	 * JPQL Query - findContentById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentById.query]JPASelect
	 */
	@Transactional
	public Content findContentById(Integer id) throws DataAccessException {

		return findContentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findContentById
	 *
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/dao/ContentDAO/findContentById.query]JPASelectWithPagination
	 */

	@Transactional
	public Content findContentById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findContentById", startResult, maxRows, id);
			return (com.mayaccom.domain.Content) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	* @generated
	 */
	public boolean canBeMerged(Content entity) {
		return true;
	}
}
