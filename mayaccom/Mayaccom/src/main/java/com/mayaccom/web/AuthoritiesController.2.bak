package com.mayaccom.web;

import com.mayaccom.dao.AuthoritiesDAO;
import com.mayaccom.dao.UsersDAO;

import com.mayaccom.domain.Authorities;
import com.mayaccom.domain.Users;

import com.mayaccom.service.AuthoritiesService;

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
 * Spring MVC controller that handles CRUD requests for Authorities entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/.properties.webcontroller]
 * @generated
 */

@Controller("AuthoritiesController")

public class AuthoritiesController {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/.properties.webcontroller#//@variables%5Bname='authoritiesDAO'%5D]
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/.properties.webcontroller#//@variables%5Bname='usersDAO'%5D]
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Authorities entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/.properties.webcontroller#//@variables%5Bname='authoritiesService'%5D]
	 */
	@Autowired
	private AuthoritiesService authoritiesService;

	/**
	 * View an existing Users entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/selectAuthoritiesUserses%7B5cc37425-d613-4a2d-a1eb-e2162c80299b%7D/.properties.swoperation]
	 */
	@RequestMapping("/selectAuthoritiesUserses")
	public ModelAndView selectAuthoritiesUserses(@RequestParam String authorities_id, @RequestParam String userses_id) {
		Users users = usersDAO.findUsersByPrimaryKey(userses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("users", users);
		mav.setViewName("authorities/userses/viewUserses.jsp");

		return mav;
	}

	/**
	* Delete an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/deleteAuthoritiesUserses%7B707c959f-59c2-4f32-aafe-df8227717b46%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteAuthoritiesUserses")
	public ModelAndView deleteAuthoritiesUserses(@RequestParam String authorities_id, @RequestParam String related_userses_id) {
		ModelAndView mav = new ModelAndView();

		Authorities authorities = authoritiesService.deleteAuthoritiesUserses(authorities_id, related_userses_id);

		mav.addObject("authorities_id", authorities_id);
		mav.addObject("authorities", authorities);
		mav.setViewName("authorities/viewAuthorities.jsp");

		return mav;
	}

	/**
	* Show all Users entities by Authorities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/listAuthoritiesUserses%7Bc016dfcf-8193-48c2-bda4-c2a79fb51c11%7D/.properties.swoperation]
	*/
	@RequestMapping("/listAuthoritiesUserses")
	public ModelAndView listAuthoritiesUserses(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/userses/listUserses.jsp");

		return mav;
	}

	/**
	* Select the child Users entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/confirmDeleteAuthoritiesUserses%7Bf48bfaf9-1441-4848-8eee-089acdb2fb98%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteAuthoritiesUserses")
	public ModelAndView confirmDeleteAuthoritiesUserses(@RequestParam String authorities_id, @RequestParam String related_userses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(related_userses_id));
		mav.addObject("authorities_id", authorities_id);
		mav.setViewName("authorities/userses/deleteUserses.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/streamBinary%7Bd12a2fed-14fd-4615-8475-e6a223da12b4%7D/.properties.swoperation]
	*/
	@RequestMapping("/authoritiesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/saveAuthoritiesUserses%7B9dfd2020-a163-442b-b041-683a85bcc8a8%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveAuthoritiesUserses")
	public ModelAndView saveAuthoritiesUserses(@RequestParam String authorities_id, @ModelAttribute Users userses) {
		Authorities parent_authorities = authoritiesService.saveAuthoritiesUserses(authorities_id, userses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("authorities", parent_authorities);
		mav.setViewName("authorities/viewAuthorities.jsp");

		return mav;
	}

	/**
	* Entry point to show all Authorities entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/indexAuthorities%7B12ab47d1-637e-4c10-bd94-08912860934f%7D/.properties.swoperation]
	*/
	public String indexAuthorities() {
		return "redirect:/indexAuthorities";
	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/initBinder%7B68b350b6-7a92-4b45-917e-ab39440191f8%7D/.properties.swoperation]
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
	* Delete an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/deleteAuthorities%7Ba5a516b8-3c93-450c-84f5-4f22ad55f561%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteAuthorities")
	public String deleteAuthorities(@RequestParam String idKey) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(idKey);
		authoritiesService.deleteAuthorities(authorities);
		return "forward:/indexAuthorities";
	}

	/**
	* Create a new Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/newAuthoritiesUserses%7B0838d6df-85a7-4d02-8bf0-df2143c3b7cd%7D/.properties.swoperation]
	*/
	@RequestMapping("/newAuthoritiesUserses")
	public ModelAndView newAuthoritiesUserses(@RequestParam String authorities_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("users", new Users());
		mav.addObject("newFlag", true);
		mav.setViewName("authorities/userses/editUserses.jsp");

		return mav;
	}

	/**
	* Edit an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/editAuthorities%7Bea09fae6-b086-476e-ac62-2b1c04385008%7D/.properties.swoperation]
	*/
	@RequestMapping("/editAuthorities")
	public ModelAndView editAuthorities(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/editAuthorities.jsp");

		return mav;
	}

	/**
	* Select an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/selectAuthorities%7B69a590fb-f434-4e03-993e-e425ef2bc990%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectAuthorities")
	public ModelAndView selectAuthorities(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/viewAuthorities.jsp");

		return mav;
	}

	/**
	* Edit an existing Users entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/editAuthoritiesUserses%7B3c3bfc71-1bc8-4913-80ff-6b72bd9b5b32%7D/.properties.swoperation]
	*/
	@RequestMapping("/editAuthoritiesUserses")
	public ModelAndView editAuthoritiesUserses(@RequestParam String authorities_id, @RequestParam String userses_id) {
		Users users = usersDAO.findUsersByPrimaryKey(userses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("users", users);
		mav.setViewName("authorities/userses/editUserses.jsp");

		return mav;
	}

	/**
	* Create a new Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/newAuthorities%7B2470ba82-0aa7-4322-b8ee-d39e31dd01b8%7D/.properties.swoperation]
	*/
	@RequestMapping("/newAuthorities")
	public ModelAndView newAuthorities() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", new Authorities());
		mav.addObject("newFlag", true);
		mav.setViewName("authorities/editAuthorities.jsp");

		return mav;
	}

	/**
	* Save an existing Authorities entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/saveAuthorities%7B5ed52d17-0aa7-4453-ac6b-f4069c30352b%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveAuthorities")
	public String saveAuthorities(@ModelAttribute Authorities authorities) {
		authoritiesService.saveAuthorities(authorities);
		return "forward:/indexAuthorities";
	}

	/**
	* Show all Authorities entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/listAuthoritiess%7B70340da0-a0bb-4fd5-96d0-a227d88bc984%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexAuthorities")
	public ModelAndView listAuthoritiess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authoritiess", authoritiesService.loadAuthoritiess());

		mav.setViewName("authorities/listAuthoritiess.jsp");

		return mav;
	}

	/**
	* Select the Authorities entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/AuthoritiesController/confirmDeleteAuthorities%7B4f462039-44b8-4976-9962-1a6c56123aa1%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteAuthorities")
	public ModelAndView confirmDeleteAuthorities(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/deleteAuthorities.jsp");

		return mav;
	}
}