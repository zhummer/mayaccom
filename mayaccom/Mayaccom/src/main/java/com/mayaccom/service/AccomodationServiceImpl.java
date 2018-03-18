package com.mayaccom.service;

import com.mayaccom.dao.AccomodationDAO;

import com.mayaccom.domain.Accomodation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Accomodation entities
 * 
 */

@Service("AccomodationService")

@Transactional
public class AccomodationServiceImpl implements AccomodationService {

	/**
	 * DAO injected by Spring that manages Accomodation entities
	 * 
	 */
	@Autowired
	private AccomodationDAO accomodationDAO;

	/**
	 * Instantiates a new AccomodationServiceImpl.
	 *
	 */
	public AccomodationServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Accomodation findAccomodationByPrimaryKey(Integer id) {
		return accomodationDAO.findAccomodationByPrimaryKey(id);
	}

	/**
	 * Save an existing Accomodation entity
	 * 
	 */
	@Transactional
	public void saveAccomodation(Accomodation accomodation) {
		Accomodation existingAccomodation = accomodationDAO.findAccomodationByPrimaryKey(accomodation.getId());

		if (existingAccomodation != null) {
			if (existingAccomodation != accomodation) {
				existingAccomodation.setId(accomodation.getId());
				existingAccomodation.setAddress(accomodation.getAddress());
				existingAccomodation.setAreaM2(accomodation.getAreaM2());
				existingAccomodation.setCapacity(accomodation.getCapacity());
				existingAccomodation.setCity(accomodation.getCity());
				existingAccomodation.setLink1(accomodation.getLink1());
				existingAccomodation.setLink2(accomodation.getLink2());
				existingAccomodation.setLink3(accomodation.getLink3());
				existingAccomodation.setName(accomodation.getName());
				existingAccomodation.setZipCode(accomodation.getZipCode());
				existingAccomodation.setPersonId(accomodation.getPersonId());
				existingAccomodation.setType(accomodation.getType());
				existingAccomodation.setDescription(accomodation.getDescription());
				existingAccomodation.setActive(accomodation.getActive());
				existingAccomodation.setImage(accomodation.getImage());
				existingAccomodation.setRate(accomodation.getRate());
				existingAccomodation.setComment(accomodation.getComment());
			}
			accomodation = accomodationDAO.store(existingAccomodation);
		} else {
			accomodation = accomodationDAO.store(accomodation);
		}
		accomodationDAO.flush();
	}

	/**
	 * Delete an existing Accomodation entity
	 * 
	 */
	@Transactional
	public void deleteAccomodation(Accomodation accomodation) {
		accomodationDAO.remove(accomodation);
		accomodationDAO.flush();
	}

	/**
	 * Return all Accomodation entity
	 * 
	 */
	@Transactional
	public List<Accomodation> findAllAccomodations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Accomodation>(accomodationDAO.findAllAccomodations(startResult, maxRows));
	}

	/**
	 * Return a count of all Accomodation entity
	 * 
	 */
	@Transactional
	public Integer countAccomodations() {
		return ((Long) accomodationDAO.createQuerySingleResult("select count(o) from Accomodation o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Accomodation entity
	 * 
	 */
	@Transactional
	public Set<Accomodation> loadAccomodations() {
		return accomodationDAO.findAllAccomodations();
	}
}
