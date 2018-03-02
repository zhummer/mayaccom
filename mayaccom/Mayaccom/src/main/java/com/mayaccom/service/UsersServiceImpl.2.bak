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
 * Spring service that handles CRUD requests for Users entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/.properties.srv]
 * @generated
 */

@Service("UsersService")

@Transactional
public class UsersServiceImpl implements UsersService {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/.properties.srv#//@variables%5Bname='authoritiesDAO'%5D]
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/.properties.srv#//@variables%5Bname='usersDAO'%5D]
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new UsersServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public UsersServiceImpl() {
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/findUsersByPrimaryKey%7Ba64df0bd-738b-4ec4-8372-0fc4ac820d2f%7D/.properties.swoperation]
	 */
	@Transactional
	public Users findUsersByPrimaryKey(String id) {
		return usersDAO.findUsersByPrimaryKey(id);
	}

	/**
	 * Return all Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/findAllUserss%7B74273527-cfe8-4388-80e3-811b25c4c9ce%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Users> findAllUserss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Users>(usersDAO.findAllUserss(startResult, maxRows));
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/deleteUsersAuthoritieses%7B1387ba11-a4dd-4b0b-a850-06dd3c3fdf09%7D/.properties.swoperation]
	 */
	@Transactional
	public Users deleteUsersAuthoritieses(String users_id, String related_authoritieses_id) {
		Authorities related_authoritieses = authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses_id, -1, -1);

		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		related_authoritieses.getUserses().remove(users);
		users.getAuthoritieses().remove(related_authoritieses);

		authoritiesDAO.remove(related_authoritieses);
		authoritiesDAO.flush();

		return users;
	}

	/**
	 * Load an existing Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/loadUserss%7B561dde73-3be1-4582-8cfa-b3094e6c4a89%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Users> loadUserss() {
		return usersDAO.findAllUserss();
	}

	/**
	 * Save an existing Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/saveUsers%7Bba32b05c-2dd7-43a7-a346-a86987e383f1%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveUsers(Users users) {
		Users existingUsers = usersDAO.findUsersByPrimaryKey(users.getId());

		if (existingUsers != null) {
			if (existingUsers != users) {
				existingUsers.setId(users.getId());
				existingUsers.setEnabled(users.getEnabled());
				existingUsers.setPassword(users.getPassword());
				existingUsers.setUsername(users.getUsername());
			}
			users = usersDAO.store(existingUsers);
		} else {
			users = usersDAO.store(users);
		}
		usersDAO.flush();
	}

	/**
	 * Return a count of all Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/countUserss%7Bdf07ad49-468a-468c-9905-156852cbcd3b%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countUserss() {
		return ((Long) usersDAO.createQuerySingleResult("select count(o) from Users o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/deleteUsers%7B40108b36-33b7-4dc6-a3e4-a19b62deb2fc%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteUsers(Users users) {
		usersDAO.remove(users);
		usersDAO.flush();
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/UsersService/saveUsersAuthoritieses%7Bd2a6c0fd-ee8a-4bc0-8cc8-fe56cf1cca4d%7D/.properties.swoperation]
	 */
	@Transactional
	public Users saveUsersAuthoritieses(String id, Authorities related_authoritieses) {
		Users users = usersDAO.findUsersByPrimaryKey(id, -1, -1);
		Authorities existingauthoritieses = authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingauthoritieses != null) {
			existingauthoritieses.setId(related_authoritieses.getId());
			existingauthoritieses.setAuthorityname(related_authoritieses.getAuthorityname());
			related_authoritieses = existingauthoritieses;
		} else {
			related_authoritieses = authoritiesDAO.store(related_authoritieses);
			authoritiesDAO.flush();
		}

		related_authoritieses.getUserses().add(users);
		users.getAuthoritieses().add(related_authoritieses);
		related_authoritieses = authoritiesDAO.store(related_authoritieses);
		authoritiesDAO.flush();

		users = usersDAO.store(users);
		usersDAO.flush();

		return users;
	}
}
