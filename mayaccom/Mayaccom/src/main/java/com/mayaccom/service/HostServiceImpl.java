package com.mayaccom.service;

import com.mayaccom.dao.AccomodationDAO;
import com.mayaccom.dao.HostDAO;
import com.mayaccom.dao.PostDAO;
import com.mayaccom.dao.TopicDAO;

import com.mayaccom.domain.Accomodation;
import com.mayaccom.domain.Host;
import com.mayaccom.domain.Post;
import com.mayaccom.domain.Topic;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Host entities
 * 
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/.properties.srv]
 * @generated
 */

@Service("HostService")

@Transactional
public class HostServiceImpl implements HostService {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/.properties.srv#//@variables%5Bname='accomodationDAO'%5D]
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * DAO injected by Spring that manages Host entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/.properties.srv#//@variables%5Bname='hostDAO'%5D]
	 */
	@Autowired
	private HostDAO hostDAO;

	/**
	 * DAO injected by Spring that manages Post entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/.properties.srv#//@variables%5Bname='postDAO'%5D]
	 */
	@Autowired
	private PostDAO postDAO;

	/**
	 * DAO injected by Spring that manages Topic entities
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/.properties.srv#//@variables%5Bname='topicDAO'%5D]
	 */
	@Autowired
	private TopicDAO topicDAO;

	/**
	 * Instantiates a new HostServiceImpl.
	 *
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/.properties.srv]
	* @AuxiliaryModelComponent
	 */
	public HostServiceImpl() {
	}

	/**
	 * Delete an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/deleteHostTopics%7Bbf6ca92e-42e4-4d1a-89df-3bd84786ffb3%7D/.properties.swoperation]
	 */
	@Transactional
	public Host deleteHostTopics(Integer host_id, Integer related_topics_id) {
		Topic related_topics = topicDAO.findTopicByPrimaryKey(related_topics_id, -1, -1);

		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		related_topics.setHost(null);
		host.getTopics().remove(related_topics);

		topicDAO.remove(related_topics);
		topicDAO.flush();

		return host;
	}

	/**
	 * Save an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/saveHostAccomodations%7Bb1967949-5fcc-4d96-8e1c-227f45146dfd%7D/.properties.swoperation]
	 */
	@Transactional
	public Host saveHostAccomodations(Integer id, Accomodation related_accomodations) {
		Host host = hostDAO.findHostByPrimaryKey(id, -1, -1);
		Accomodation existingaccomodations = accomodationDAO.findAccomodationByPrimaryKey(related_accomodations.getId());

		// copy into the existing record to preserve existing relationships
		if (existingaccomodations != null) {
			existingaccomodations.setId(related_accomodations.getId());
			existingaccomodations.setName(related_accomodations.getName());
			existingaccomodations.setAddress(related_accomodations.getAddress());
			existingaccomodations.setCity(related_accomodations.getCity());
			existingaccomodations.setZipCode(related_accomodations.getZipCode());
			existingaccomodations.setCapacity(related_accomodations.getCapacity());
			existingaccomodations.setLink1(related_accomodations.getLink1());
			existingaccomodations.setLink2(related_accomodations.getLink2());
			existingaccomodations.setLink3(related_accomodations.getLink3());
			existingaccomodations.setAreaM2(related_accomodations.getAreaM2());
			related_accomodations = existingaccomodations;
		} else {
			related_accomodations = accomodationDAO.store(related_accomodations);
			accomodationDAO.flush();
		}

		related_accomodations.setHost(host);
		host.getAccomodations().add(related_accomodations);
		related_accomodations = accomodationDAO.store(related_accomodations);
		accomodationDAO.flush();

		host = hostDAO.store(host);
		hostDAO.flush();

		return host;
	}

	/**
	 * Load an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/loadHosts%7Bc0b2948b-f8e4-420f-972b-7d8290d20fa7%7D/.properties.swoperation]
	 */
	@Transactional
	public Set<Host> loadHosts() {
		return hostDAO.findAllHosts();
	}

	/**
	 * Delete an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/deleteHostPosts%7B11ca16b3-388d-40be-ad33-621636949dc6%7D/.properties.swoperation]
	 */
	@Transactional
	public Host deleteHostPosts(Integer host_id, Integer related_posts_id) {
		Post related_posts = postDAO.findPostByPrimaryKey(related_posts_id, -1, -1);

		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		related_posts.setHost(null);
		host.getPosts().remove(related_posts);

		postDAO.remove(related_posts);
		postDAO.flush();

		return host;
	}

	/**
	 * Return a count of all Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/countHosts%7Bca59dc83-3aa9-4e4f-b160-4659fa04fe3d%7D/.properties.swoperation]
	 */
	@Transactional
	public Integer countHosts() {
		return ((Long) hostDAO.createQuerySingleResult("select count(o) from Host o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Post entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/saveHostPosts%7B0ebb7b5a-2f85-45e8-a062-a3fb8d9c36ca%7D/.properties.swoperation]
	 */
	@Transactional
	public Host saveHostPosts(Integer id, Post related_posts) {
		Host host = hostDAO.findHostByPrimaryKey(id, -1, -1);
		Post existingposts = postDAO.findPostByPrimaryKey(related_posts.getId());

		// copy into the existing record to preserve existing relationships
		if (existingposts != null) {
			existingposts.setId(related_posts.getId());
			existingposts.setContent(related_posts.getContent());
			related_posts = existingposts;
		}

		related_posts.setHost(host);
		host.getPosts().add(related_posts);
		related_posts = postDAO.store(related_posts);
		postDAO.flush();

		host = hostDAO.store(host);
		hostDAO.flush();

		return host;
	}

	/**
	 * Delete an existing Accomodation entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/deleteHostAccomodations%7B4e98dd72-5a4f-4f82-9cb7-ead3984ea9af%7D/.properties.swoperation]
	 */
	@Transactional
	public Host deleteHostAccomodations(Integer host_id, Integer related_accomodations_id) {
		Accomodation related_accomodations = accomodationDAO.findAccomodationByPrimaryKey(related_accomodations_id, -1, -1);

		Host host = hostDAO.findHostByPrimaryKey(host_id, -1, -1);

		related_accomodations.setHost(null);
		host.getAccomodations().remove(related_accomodations);

		accomodationDAO.remove(related_accomodations);
		accomodationDAO.flush();

		return host;
	}

	/**
	 * Save an existing Topic entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/saveHostTopics%7Bd889a24e-4568-4b8f-8830-2327628229a9%7D/.properties.swoperation]
	 */
	@Transactional
	public Host saveHostTopics(Integer id, Topic related_topics) {
		Host host = hostDAO.findHostByPrimaryKey(id, -1, -1);
		Topic existingtopics = topicDAO.findTopicByPrimaryKey(related_topics.getId());

		// copy into the existing record to preserve existing relationships
		if (existingtopics != null) {
			existingtopics.setId(related_topics.getId());
			existingtopics.setName(related_topics.getName());
			existingtopics.setLastPosterId(related_topics.getLastPosterId());
			existingtopics.setLastPostAt(related_topics.getLastPostAt());
			related_topics = existingtopics;
		}

		related_topics.setHost(host);
		host.getTopics().add(related_topics);
		related_topics = topicDAO.store(related_topics);
		topicDAO.flush();

		host = hostDAO.store(host);
		hostDAO.flush();

		return host;
	}

	/**
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/findHostByPrimaryKey%7B612fd1c7-0c27-4e1b-8973-be8af0b06a44%7D/.properties.swoperation]
	 */
	@Transactional
	public Host findHostByPrimaryKey(Integer id) {
		return hostDAO.findHostByPrimaryKey(id);
	}

	/**
	 * Save an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/saveHost%7B1dce66d7-4d0b-4888-9b1b-f4535412619b%7D/.properties.swoperation]
	 */
	@Transactional
	public void saveHost(Host host) {
		Host existingHost = hostDAO.findHostByPrimaryKey(host.getId());

		if (existingHost != null) {
			if (existingHost != host) {
				existingHost.setId(host.getId());
				existingHost.setContactPerson(host.getContactPerson());
				existingHost.setPhone1(host.getPhone1());
				existingHost.setPhone2(host.getPhone2());
				existingHost.setPhone3(host.getPhone3());
				existingHost.setEmail(host.getEmail());
				existingHost.setUsername(host.getUsername());
				existingHost.setPassword(host.getPassword());
			}
			host = hostDAO.store(existingHost);
		} else {
			host = hostDAO.store(host);
		}
		hostDAO.flush();
	}

	/**
	 * Return all Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/findAllHosts%7B7dd8c1b6-7b11-4d0c-9b82-ef0508c58437%7D/.properties.swoperation]
	 */
	@Transactional
	public List<Host> findAllHosts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Host>(hostDAO.findAllHosts(startResult, maxRows));
	}

	/**
	 * Delete an existing Host entity
	 * 
	 * @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/service/HostService/deleteHost%7B95bf8ae7-ff45-4e97-866a-3bfb60b17191%7D/.properties.swoperation]
	 */
	@Transactional
	public void deleteHost(Host host) {
		hostDAO.remove(host);
		hostDAO.flush();
	}
}
