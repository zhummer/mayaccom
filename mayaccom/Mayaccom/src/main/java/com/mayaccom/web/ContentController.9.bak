package com.mayaccom.web;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.ContentDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Content;

import com.mayaccom.service.ContentService;

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
 * Spring MVC controller that handles CRUD requests for Content entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/.properties.webcontroller]
 * @generated
 */

@Controller("ContentController")

public class ContentController {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/.properties.webcontroller#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/.properties.webcontroller#//@variables%5Bname='contentDAO'%5D]
	 */
	@Autowired
	private ContentDAO contentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Content entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/.properties.webcontroller#//@variables%5Bname='contentService'%5D]
	 */
	@Autowired
	private ContentService contentService;

	/**
	 * Save an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/saveContentAccomodation%7Be8bf01c4-859a-477e-9933-5d6f326fbb27%7D/.properties.swoperation]
	 */
	@RequestMapping("/saveContentAccomodation")
	public ModelAndView saveContentAccomodation(@RequestParam Integer content_id, @ModelAttribute Accomodation accomodation) {
		Content parent_content = contentService.saveContentAccomodation(content_id, accomodation);

		ModelAndView mav = new ModelAndView();
		mav.addObject("content_id", content_id);
		mav.addObject("content", parent_content);
		mav.setViewName("content/viewContent.jsp");

		return mav;
	}

	/**
	* Delete an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/deleteContentAccomodation%7Bcd6b416e-144b-4f9a-ba67-eb1e2c205772%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteContentAccomodation")
	public ModelAndView deleteContentAccomodation(@RequestParam Integer content_id, @RequestParam Integer related_accomodation_id) {
		ModelAndView mav = new ModelAndView();

		Content content = contentService.deleteContentAccomodation(content_id, related_accomodation_id);

		mav.addObject("content_id", content_id);
		mav.addObject("content", content);
		mav.setViewName("content/viewContent.jsp");

		return mav;
	}

	/**
	* Create a new Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/newContent%7B786de939-7bf5-4487-b946-1537ec0d9b6b%7D/.properties.swoperation]
	*/
	@RequestMapping("/newContent")
	public ModelAndView newContent() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("content", new Content());
		mav.addObject("newFlag", true);
		mav.setViewName("content/editContent.jsp");

		return mav;
	}

	/**
	* Select the child Accomodation entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/confirmDeleteContentAccomodation%7B0a86e0e2-9e35-43f9-9448-030e1fd496d2%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteContentAccomodation")
	public ModelAndView confirmDeleteContentAccomodation(@RequestParam Integer content_id, @RequestParam Integer related_accomodation_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accomodation", accomodationDAO.findAccomodationByPrimaryKey(related_accomodation_id));
		mav.addObject("content_id", content_id);
		mav.setViewName("content/accomodation/deleteAccomodation.jsp");

		return mav;
	}

	/**
	* Select the Content entity for display allowing the user to confirm that they would like to delete the entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/confirmDeleteContent%7B2c732e5c-498b-46f1-810b-72f620620634%7D/.properties.swoperation]
	*/
	@RequestMapping("/confirmDeleteContent")
	public ModelAndView confirmDeleteContent(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("content", contentDAO.findContentByPrimaryKey(idKey));
		mav.setViewName("content/deleteContent.jsp");

		return mav;
	}

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/streamBinary%7B095b6294-cd3a-4d61-bedc-30fa6a494160%7D/.properties.swoperation]
	*/
	@RequestMapping("/contentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Register custom, context-specific property editors
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/initBinder%7B0e98dc78-1f39-455c-9e15-ac4f3f682c85%7D/.properties.swoperation]
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
	* Create a new Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/newContentAccomodation%7B37f8bcdd-bd96-406a-8df3-21bced436d2a%7D/.properties.swoperation]
	*/
	@RequestMapping("/newContentAccomodation")
	public ModelAndView newContentAccomodation(@RequestParam Integer content_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("content_id", content_id);
		mav.addObject("accomodation", new Accomodation());
		mav.addObject("newFlag", true);
		mav.setViewName("content/accomodation/editAccomodation.jsp");

		return mav;
	}

	/**
	* Select an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/selectContent%7Bf678e5da-9ea1-4487-80b0-2647916b302d%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectContent")
	public ModelAndView selectContent(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("content", contentDAO.findContentByPrimaryKey(idKey));
		mav.setViewName("content/viewContent.jsp");

		return mav;
	}

	/**
	* Edit an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/editContent%7B0c7ff778-84b3-4daf-a71c-ab774acf2046%7D/.properties.swoperation]
	*/
	@RequestMapping("/editContent")
	public ModelAndView editContent(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("content", contentDAO.findContentByPrimaryKey(idKey));
		mav.setViewName("content/editContent.jsp");

		return mav;
	}

	/**
	* Edit an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/editContentAccomodation%7B1724fd7a-c370-4969-86ae-3cf3e640884f%7D/.properties.swoperation]
	*/
	@RequestMapping("/editContentAccomodation")
	public ModelAndView editContentAccomodation(@RequestParam Integer content_id, @RequestParam Integer accomodation_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("content_id", content_id);
		mav.addObject("accomodation", accomodation);
		mav.setViewName("content/accomodation/editAccomodation.jsp");

		return mav;
	}

	/**
	* Show all Content entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/listContents%7B238a94fd-e8ef-4f35-87ca-14a21e8a0c67%7D/.properties.swoperation]
	*/
	@RequestMapping("/indexContent")
	public ModelAndView listContents() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contents", contentService.loadContents());

		mav.setViewName("content/listContents.jsp");

		return mav;
	}

	/**
	* Entry point to show all Content entities
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/indexContent%7Bf2aae5cd-fa04-416c-9d4e-4743901fec5c%7D/.properties.swoperation]
	*/
	public String indexContent() {
		return "redirect:/indexContent";
	}

	/**
	* Delete an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/deleteContent%7B2d24403b-5329-45f9-bacb-d3769e300252%7D/.properties.swoperation]
	*/
	@RequestMapping("/deleteContent")
	public String deleteContent(@RequestParam Integer idKey) {
		Content content = contentDAO.findContentByPrimaryKey(idKey);
		contentService.deleteContent(content);
		return "forward:/indexContent";
	}

	/**
	* Show all Accomodation entities by Content
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/listContentAccomodation%7B9e81c2b7-fb8f-45da-9843-5e0b47e732ec%7D/.properties.swoperation]
	*/
	@RequestMapping("/listContentAccomodation")
	public ModelAndView listContentAccomodation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("content", contentDAO.findContentByPrimaryKey(idKey));
		mav.setViewName("content/accomodation/listAccomodation.jsp");

		return mav;
	}

	/**
	* View an existing Accomodation entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/selectContentAccomodation%7Bd5c0109f-45f6-4a69-9d39-14fb02308041%7D/.properties.swoperation]
	*/
	@RequestMapping("/selectContentAccomodation")
	public ModelAndView selectContentAccomodation(@RequestParam Integer content_id, @RequestParam Integer accomodation_id) {
		Accomodation accomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("content_id", content_id);
		mav.addObject("accomodation", accomodation);
		mav.setViewName("content/accomodation/viewAccomodation.jsp");

		return mav;
	}

	/**
	* Save an existing Content entity
	* 
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/web/ContentController/saveContent%7B8ba86fdc-9d5c-4e41-91fd-6a93c3b9194c%7D/.properties.swoperation]
	*/
	@RequestMapping("/saveContent")
	public String saveContent(@ModelAttribute Content content) {
		contentService.saveContent(content);
		return "forward:/indexContent";
	}
}