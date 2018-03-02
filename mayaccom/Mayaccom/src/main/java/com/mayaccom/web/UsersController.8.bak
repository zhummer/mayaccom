package com.mayaccom.web;

import com.mayaccom.dao.AuthoritiesDAO;
import com.mayaccom.dao.UsersDAO;

import com.mayaccom.domain.Authorities;
import com.mayaccom.domain.Users;

import com.mayaccom.service.UsersService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Users entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/.properties.webcontroller]
 * @generated
 */

@Controller("UsersController")

public class UsersController {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/.properties.webcontroller#//@variables%5Bname='authoritiesDAO'%5D]
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/.properties.webcontroller#//@variables%5Bname='usersDAO'%5D]
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/.properties.webcontroller#//@variables%5Bname='usersService'%5D]
	 */
	@Autowired
	private UsersService usersService;

	/**
	 * View an existing Authorities entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/selectUsersAuthoritieses%7B7382839f-335b-41a9-ab01-357b6f373dc1%7D/.properties.swoperation]
	 */
	@RequestMapping("/selectUsersAuthoritieses")
	public ModelAndView selectUsersAuthoritieses(@RequestParam String users_id, @RequestParam String authoritieses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authoritieses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("authorities", authorities);
		mav.setViewName("users/authoritieses/viewAuthoritieses.jsp");

		return mav;
	}

	/**
	* Create a new Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/newUsers%7Bc08034b2-6189-427f-8974-29434b6480a0%7D/.properties.swoperation]
	*/
	@RequestMapping("/newUsers")
	public ModelAndView newUsers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", new Users());
		mav.addObject("newFlag", true);
		mav.setViewName("users/editUsers.jsp");

		return mav;
	}

	/**
	* Select the Users entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/confirmDeleteUsers%7B7b8708fe-87d0-4078-9dea-1956da921eab%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteUsers")
	public ModelAndView confirmDeleteUsers(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/deleteUsers.jsp");

		return mav;
	}

	/**
	* Entry point to show all Users entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/indexUsers%7B6b654480-0986-4288-9fd0-66c8017e57a7%7D/.properties.swoperation]
	*/
	public String indexUsers() {
		return "redirect:/indexUsers";
	}

	/**
	* Edit an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/editUsersAuthoritieses%7B3ea15558-4d0e-45ed-9e33-b9cd261cc606%7D/.properties.swoperation]
	*/
	@RequestMapping("/editUsersAuthoritieses")
	public ModelAndView editUsersAuthoritieses(@RequestParam String users_id, @RequestParam String authoritieses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authoritieses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("authorities", authorities);
		mav.setViewName("users/authoritieses/editAuthoritieses.jsp");

		return mav;
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/initBinder%7Bd809a214-2025-495e-8fcc-f95e1f4e3a4c%7D/.properties.swoperation]
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
	* Select an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/selectUsers%7Ba7708fa6-256f-4a21-a393-36053de5b37c%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectUsers")
	public ModelAndView selectUsers(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	* Delete an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/deleteUsersAuthoritieses%7B9bdee5e4-5c53-4727-a318-9f014fe9c8eb%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteUsersAuthoritieses")
	public ModelAndView deleteUsersAuthoritieses(@RequestParam String users_id, @RequestParam String related_authoritieses_id) {
		ModelAndView mav = new ModelAndView();

		Users users = usersService.deleteUsersAuthoritieses(users_id, related_authoritieses_id);

		mav.addObject("users_id", users_id);
		mav.addObject("users", users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	* Select the child Authorities entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/confirmDeleteUsersAuthoritieses%7B2253b3b7-8a91-4977-ad82-a25f053f01e7%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteUsersAuthoritieses")
	public ModelAndView confirmDeleteUsersAuthoritieses(@RequestParam String users_id, @RequestParam String related_authoritieses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses_id));
		mav.addObject("users_id", users_id);
		mav.setViewName("users/authoritieses/deleteAuthoritieses.jsp");

		return mav;
	}

	/**
	* Create a new Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/newUsersAuthoritieses%7B8ad081aa-8bfd-4e25-9bec-fc1ca1bc6ff8%7D/.properties.swoperation]
	*/
	@RequestMapping("/newUsersAuthoritieses")
	public ModelAndView newUsersAuthoritieses(@RequestParam String users_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("authorities", new Authorities());
		mav.addObject("newFlag", true);
		mav.setViewName("users/authoritieses/editAuthoritieses.jsp");

		return mav;
	}

	/**
	* Save an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/saveUsersAuthoritieses%7B2ce642ae-5269-4c0f-b6f8-106c5b65157b%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveUsersAuthoritieses")
	public ModelAndView saveUsersAuthoritieses(@RequestParam String users_id, @ModelAttribute Authorities authoritieses) {
		Users parent_users = usersService.saveUsersAuthoritieses(users_id, authoritieses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("users", parent_users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	* Edit an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/editUsers%7Bd3c317e2-11a5-42ae-ae93-c3a8ae236586%7D/.properties.swoperation]
	*/
	@RequestMapping("/editUsers")
	public ModelAndView editUsers(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/editUsers.jsp");

		return mav;
	}

	/**
	* Save an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/saveUsers%7B1a6aeed6-9794-46bf-8014-de9a09d2a577%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveUsers")
	public String saveUsers(@ModelAttribute Users users) {
		usersService.saveUsers(users);
		return "forward:/indexUsers";
	}

	/**
	* Show all Authorities entities by Users
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/listUsersAuthoritieses%7B2e7886a4-788d-4792-b514-518c251135aa%7D/.properties.swoperation]
	*/
	@RequestMapping("/listUsersAuthoritieses")
	public ModelAndView listUsersAuthoritieses(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/authoritieses/listAuthoritieses.jsp");

		return mav;
	}

	/**
	* Show all Users entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/listUserss%7Bd9b1b16a-819f-4c05-b3cd-9bceb36441e1%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexUsers")
	public ModelAndView listUserss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userss", usersService.loadUserss());

		mav.setViewName("users/listUserss.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/streamBinary%7B58d86bed-e886-4b73-8cd0-5fdcdc00e7ed%7D/.properties.swoperation]
	*/
	@RequestMapping("/usersController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/UsersController/deleteUsers%7B33db9234-c801-4b94-808c-356596683327%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteUsers")
	public String deleteUsers(@RequestParam String idKey) {
		Users users = usersDAO.findUsersByPrimaryKey(idKey);
		usersService.deleteUsers(users);
		return "forward:/indexUsers";
	}
}