package com.mayaccom.service;

import com.mayaccom.dao.AuthoritiesDAO;
import com.mayaccom.dao.UsersDAO;

import com.mayaccom.domain.Authorities;
import com.mayaccom.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Authorities entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/.properties.srv]
 * @generated
 */

@Service("AuthoritiesService")

@Transactional
public class AuthoritiesServiceImpl implements AuthoritiesService {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/.properties.srv#//@variables%5Bname='authoritiesDAO'%5D]
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/.properties.srv#//@variables%5Bname='usersDAO'%5D]
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new AuthoritiesServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public AuthoritiesServiceImpl() {
	}

	/**
	 * Load an existing Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/loadAuthoritiess%7B766949fd-91fd-4ae9-8b98-9740af5f0f75%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Authorities> loadAuthoritiess() {
		return authoritiesDAO.findAllAuthoritiess();
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/saveAuthorities%7B13833ebd-f05b-4198-9c2f-c3d02f6a4546%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveAuthorities(Authorities authorities) {
		Authorities existingAuthorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());

		if (existingAuthorities != null) {
			if (existingAuthorities != authorities) {
				existingAuthorities.setId(authorities.getId());
				existingAuthorities.setAuthorityname(authorities.getAuthorityname());
			}
			authorities = authoritiesDAO.store(existingAuthorities);
		} else {
			authorities = authoritiesDAO.store(authorities);
		}
		authoritiesDAO.flush();
	}

	/**
	 * Return all Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/findAllAuthoritiess%7B1600f5b8-7985-4d21-a956-7de5cafbe462%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Authorities> findAllAuthoritiess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Authorities>(authoritiesDAO.findAllAuthoritiess(startResult, maxRows));
	}

	/**
	 * Delete an existing Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/deleteAuthoritiesUserses%7Bfbc2c628-91dc-4745-ab47-3751fad4cc60%7D/.properties.swoperation]
	 */
	@Transactional
	public Authorities deleteAuthoritiesUserses(String authorities_id, String related_userses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id, -1, -1);
		Users related_userses = usersDAO.findUsersByPrimaryKey(related_userses_id, -1, -1);

		authorities.getUserses().remove(related_userses);
		related_userses.getAuthoritieses().remove(authorities);
		authorities = authoritiesDAO.store(authorities);
		authoritiesDAO.flush();

		related_userses = usersDAO.store(related_userses);
		usersDAO.flush();

		usersDAO.remove(related_userses);
		usersDAO.flush();

		return authorities;
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/findAuthoritiesByPrimaryKey%7B65b32962-8b9d-490c-83b3-98b25e7ed0cb%7D/.properties.swoperation]
	 */
	@Transactional
	public Authorities findAuthoritiesByPrimaryKey(String id) {
		return authoritiesDAO.findAuthoritiesByPrimaryKey(id);
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/deleteAuthorities%7B21c84b35-64ec-4cac-a3b2-f64a5211c04d%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteAuthorities(Authorities authorities) {
		authoritiesDAO.remove(authorities);
		authoritiesDAO.flush();
	}

	/**
	 * Return a count of all Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/countAuthoritiess%7Bc9b09932-21a1-44af-9063-3b42e2350275%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countAuthoritiess() {
		return ((Long) authoritiesDAO.createQuerySingleResult("select count(o) from Authorities o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/AuthoritiesService/saveAuthoritiesUserses%7B19c143fd-0946-4f9e-923d-2f20d1e13f9c%7D/.properties.swoperation]
	 */
	@Transactional
	public Authorities saveAuthoritiesUserses(String id, Users related_userses) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(id, -1, -1);
		Users existinguserses = usersDAO.findUsersByPrimaryKey(related_userses.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguserses != null) {
			existinguserses.setId(related_userses.getId());
			existinguserses.setEnabled(related_userses.getEnabled());
			existinguserses.setPassword(related_userses.getPassword());
			existinguserses.setUsername(related_userses.getUsername());
			related_userses = existinguserses;
		} else {
			related_userses = usersDAO.store(related_userses);
			usersDAO.flush();
		}

		authorities.getUserses().add(related_userses);
		related_userses.getAuthoritieses().add(authorities);
		authorities = authoritiesDAO.store(authorities);
		authoritiesDAO.flush();

		related_userses = usersDAO.store(related_userses);
		usersDAO.flush();

		return authorities;
	}
}
