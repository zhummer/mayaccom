package com.mayaccom.web.rest;

import com.mayaccom.dao.AuthoritiesDAO;
import com.mayaccom.dao.UsersDAO;

import com.mayaccom.domain.Authorities;
import com.mayaccom.domain.Users;

import com.mayaccom.service.AuthoritiesService;

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
 * Spring Rest controller that handles CRUD requests for Authorities entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/.properties.webcontroller]
 * @generated
 */

@Controller("AuthoritiesRestController")

public class AuthoritiesRestController {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/.properties.webcontroller#//@variables%5Bname='authoritiesDAO'%5D]
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/.properties.webcontroller#//@variables%5Bname='usersDAO'%5D]
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/.properties.webcontroller#//@variables%5Bname='authoritiesService'%5D]
	 */
	@Autowired
	private AuthoritiesService authoritiesService;

	/**
	 * Select an existing Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/loadAuthorities%7B081654f0-d926-402d-836a-efcdfa265533%7D/.properties.swoperation]
	 */
	@RequestMapping(value = "/Authorities/{authorities_id}", method = RequestMethod.GET)
	@ResponseBody
	public Authorities loadAuthorities(@PathVariable String authorities_id) {
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id);
	}

	/**
	* View an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/loadAuthoritiesUserses%7Be88e26ec-57ca-4f69-b286-a975a8a1f134%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities/{authorities_id}/userses/{users_id}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadAuthoritiesUserses(@PathVariable String authorities_id, @PathVariable String related_userses_id) {
		Users users = usersDAO.findUsersByPrimaryKey(related_userses_id, -1, -1);

		return users;
	}

	/**
	* Create a new Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/newAuthorities%7B95f75530-f36c-4437-9332-63da04753f90%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities", method = RequestMethod.POST)
	@ResponseBody
	public Authorities newAuthorities(@RequestBody Authorities authorities) {
		authoritiesService.saveAuthorities(authorities);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());
	}

	/**
	* Delete an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/deleteAuthoritiesUserses%7B45dc0434-b243-44e4-afe0-e7263b42939b%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities/{authorities_id}/userses/{users_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAuthoritiesUserses(@PathVariable String authorities_id, @PathVariable String related_userses_id) {
		authoritiesService.deleteAuthoritiesUserses(authorities_id, related_userses_id);
	}

	/**
	* Save an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/saveAuthoritiesUserses%7B7f957f3e-6456-4b56-a569-b0f81074b34e%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities/{authorities_id}/userses", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveAuthoritiesUserses(@PathVariable String authorities_id, @RequestBody Users userses) {
		authoritiesService.saveAuthoritiesUserses(authorities_id, userses);
		return usersDAO.findUsersByPrimaryKey(userses.getId());
	}

	/**
	* Save an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/saveAuthorities%7Bf184f444-dc61-4439-82c0-9f8de265136d%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities", method = RequestMethod.PUT)
	@ResponseBody
	public Authorities saveAuthorities(@RequestBody Authorities authorities) {
		authoritiesService.saveAuthorities(authorities);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());
	}

	/**
	* Show all Authorities entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/listAuthoritiess%7B6275127c-0c31-441e-819a-e565da62d222%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities", method = RequestMethod.GET)
	@ResponseBody
	public List<Authorities> listAuthoritiess() {
		return new java.util.ArrayList<Authorities>(authoritiesService.loadAuthoritiess());
	}

	/**
	* Delete an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/deleteAuthorities%7Bbc5bd8b0-7b45-4499-ad81-9c55abafcd40%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities/{authorities_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAuthorities(@PathVariable String authorities_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id);
		authoritiesService.deleteAuthorities(authorities);
	}

	/**
	* Create a new Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/newAuthoritiesUserses%7Be2bb2dbd-3d31-4940-894f-ed69b99933e5%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities/{authorities_id}/userses", method = RequestMethod.POST)
	@ResponseBody
	public Users newAuthoritiesUserses(@PathVariable String authorities_id, @RequestBody Users users) {
		authoritiesService.saveAuthoritiesUserses(authorities_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	* Show all Users entities by Authorities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/getAuthoritiesUserses%7Ba4dcbc4a-e312-4f47-8e4c-7b54086f310f%7D/.properties.swoperation]
	*/
	@RequestMapping(value = "/Authorities/{authorities_id}/userses", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> getAuthoritiesUserses(@PathVariable String authorities_id) {
		return new java.util.ArrayList<Users>(authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id).getUserses());
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/rest/AuthoritiesRestController/initBinder%7Bbc7c0b9f-2564-4732-abdc-b67a117400a5%7D/.properties.swoperation]
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
}