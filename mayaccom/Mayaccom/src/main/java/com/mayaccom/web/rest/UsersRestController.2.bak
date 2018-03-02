package com.mayaccom.web.rest;

import com.mayaccom.dao.AuthoritiesDAO;
import com.mayaccom.dao.UsersDAO;

import com.mayaccom.domain.Authorities;
import com.mayaccom.domain.Users;

import com.mayaccom.service.UsersService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Users entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/.properties.webcontroller]
 * @generated
 */

@Controller("UsersRestController")

public class UsersRestController {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/.properties.webcontroller#//@variables%5Bname='authoritiesDAO'%5D]
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/.properties.webcontroller#//@variables%5Bname='usersDAO'%5D]
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/.properties.webcontroller#//@variables%5Bname='usersService'%5D]
	 */
	@Autowired
	private UsersService usersService;

	/**
	 * Register custom, context-specific property editors
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/initBinder%7Bde6cf5a3-fd84-40a8-8e3e-942029888127%7D/.properties.swoperation]
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Show all Authorities entities by Users
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/getUsersAuthoritieses%7B2d338000-bb37-4e00-bf23-c4b2cdf62f26%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users/{users_id}/authoritieses", method = RequestMethod.GET)
	@ResponseBody
	public List<Authorities> getUsersAuthoritieses(@PathVariable String users_id) {
		return new java.util.ArrayList<Authorities>(usersDAO.findUsersByPrimaryKey(users_id).getAuthoritieses());
	}

	/**
	* Create a new Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/newUsersAuthoritieses%7B527e2a14-9d2d-4a09-a9ab-3fad2da2a767%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users/{users_id}/authoritieses", method = RequestMethod.POST)
	@ResponseBody
	public Authorities newUsersAuthoritieses(@PathVariable String users_id, @RequestBody Authorities authorities) {
		usersService.saveUsersAuthoritieses(users_id, authorities);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());
	}

	/**
	* Save an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/saveUsersAuthoritieses%7B69ac0f3d-5772-4267-94c7-ebb292989c43%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users/{users_id}/authoritieses", method = RequestMethod.PUT)
	@ResponseBody
	public Authorities saveUsersAuthoritieses(@PathVariable String users_id, @RequestBody Authorities authoritieses) {
		usersService.saveUsersAuthoritieses(users_id, authoritieses);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authoritieses.getId());
	}

	/**
	* Select an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/loadUsers%7B9c308316-280f-42cc-898e-1439c669954e%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users/{users_id}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadUsers(@PathVariable String users_id) {
		return usersDAO.findUsersByPrimaryKey(users_id);
	}

	/**
	* Create a new Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/newUsers%7B6fc3ea80-c7a4-4ff0-af33-5ee0320a15d1%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users", method = RequestMethod.POST)
	@ResponseBody
	public Users newUsers(@RequestBody Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	* Save an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/saveUsers%7Be31fc520-e6b1-4cd2-b1b3-f15532507e19%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveUsers(@RequestBody Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	* Show all Users entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/listUserss%7Bbb0de1ea-4a35-4014-bb11-2ba4955028b6%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> listUserss() {
		return new java.util.ArrayList<Users>(usersService.loadUserss());
	}

	/**
	* Delete an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/deleteUsers%7B1f8a599f-710d-452e-b085-c6752580ecda%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users/{users_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsers(@PathVariable String users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(users_id);
		usersService.deleteUsers(users);
	}

	/**
	* Delete an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/deleteUsersAuthoritieses%7B0a482af9-acd4-48df-94a5-d4647ad84bec%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users/{users_id}/authoritieses/{authorities_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsersAuthoritieses(@PathVariable String users_id, @PathVariable String related_authoritieses_id) {
		usersService.deleteUsersAuthoritieses(users_id, related_authoritieses_id);
	}

	/**
	* View an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/UsersRestController/loadUsersAuthoritieses%7B33c25f2f-221b-4180-8cb4-0528afd36bf6%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Users/{users_id}/authoritieses/{authorities_id}", method = RequestMethod.GET)
	@ResponseBody
	public Authorities loadUsersAuthoritieses(@PathVariable String users_id, @PathVariable String related_authoritieses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses_id, -1, -1);

		return authorities;
	}
}