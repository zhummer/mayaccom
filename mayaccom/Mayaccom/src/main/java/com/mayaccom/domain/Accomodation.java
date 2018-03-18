
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAccomodationByActive", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.active = ?1"),
		@NamedQuery(name = "findAccomodationByAddress", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.address = ?1"),
		@NamedQuery(name = "findAccomodationByAddressContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.address like ?1"),
		@NamedQuery(name = "findAccomodationByAreaM2", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.areaM2 = ?1"),
		@NamedQuery(name = "findAccomodationByCapacity", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.capacity = ?1"),
		@NamedQuery(name = "findAccomodationByCity", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.city = ?1"),
		@NamedQuery(name = "findAccomodationByCityContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.city like ?1"),
		@NamedQuery(name = "findAccomodationByComment", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.comment = ?1"),
		@NamedQuery(name = "findAccomodationByCommentContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.comment like ?1"),
		@NamedQuery(name = "findAccomodationByDescription", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.description = ?1"),
		@NamedQuery(name = "findAccomodationByDescriptionContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.description like ?1"),
		@NamedQuery(name = "findAccomodationById", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.id = ?1"),
		@NamedQuery(name = "findAccomodationByLink1", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link1 = ?1"),
		@NamedQuery(name = "findAccomodationByLink1Containing", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link1 like ?1"),
		@NamedQuery(name = "findAccomodationByLink2", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link2 = ?1"),
		@NamedQuery(name = "findAccomodationByLink2Containing", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link2 like ?1"),
		@NamedQuery(name = "findAccomodationByLink3", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link3 = ?1"),
		@NamedQuery(name = "findAccomodationByLink3Containing", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link3 like ?1"),
		@NamedQuery(name = "findAccomodationByName", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.name = ?1"),
		@NamedQuery(name = "findAccomodationByNameContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.name like ?1"),
		@NamedQuery(name = "findAccomodationByPersonId", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.personId = ?1"),
		@NamedQuery(name = "findAccomodationByPrimaryKey", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.id = ?1"),
		@NamedQuery(name = "findAccomodationByRate", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.rate = ?1"),
		@NamedQuery(name = "findAccomodationByType", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.type = ?1"),
		@NamedQuery(name = "findAccomodationByTypeContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.type like ?1"),
		@NamedQuery(name = "findAccomodationByZipCode", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.zipCode = ?1"),
		@NamedQuery(name = "findAccomodationByZipCodeContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.zipCode like ?1"),
		@NamedQuery(name = "findAllAccomodations", query = "select myAccomodation from Accomodation myAccomodation") })

@Table(catalog = "mayaccom", name = "accomodation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Accomodation")

public class Accomodation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "address", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String address;
	/**
	 */

	@Column(name = "area_m2")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer areaM2;
	/**
	 */

	@Column(name = "capacity")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer capacity;
	/**
	 */

	@Column(name = "city", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String city;
	/**
	 */

	@Column(name = "link1", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String link1;
	/**
	 */

	@Column(name = "link2", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String link2;
	/**
	 */

	@Column(name = "link3", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String link3;
	/**
	 */

	@Column(name = "name", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	 */

	@Column(name = "zip_code", length = 10)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String zipCode;
	/**
	 */

	@Column(name = "person_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer personId;
	/**
	 */

	@Column(name = "type", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String type;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "active")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean active;
	/**
	 */

	@Column(name = "image", columnDefinition = "BLOB")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	byte[] image;
	/**
	 */

	@Column(name = "rate")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rate;
	/**
	 */

	@Column(name = "comment", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String comment;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setAreaM2(Integer areaM2) {
		this.areaM2 = areaM2;
	}

	/**
	 */
	public Integer getAreaM2() {
		return this.areaM2;
	}

	/**
	 */
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	/**
	 */
	public Integer getCapacity() {
		return this.capacity;
	}

	/**
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 */
	public void setLink1(String link1) {
		this.link1 = link1;
	}

	/**
	 */
	public String getLink1() {
		return this.link1;
	}

	/**
	 */
	public void setLink2(String link2) {
		this.link2 = link2;
	}

	/**
	 */
	public String getLink2() {
		return this.link2;
	}

	/**
	 */
	public void setLink3(String link3) {
		this.link3 = link3;
	}

	/**
	 */
	public String getLink3() {
		return this.link3;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 */
	public String getZipCode() {
		return this.zipCode;
	}

	/**
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	/**
	 */
	public Integer getPersonId() {
		return this.personId;
	}

	/**
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 */
	public String getType() {
		return this.type;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 */
	public Boolean getActive() {
		return this.active;
	}

	/**
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}

	/**
	 */
	public byte[] getImage() {
		return this.image;
	}

	/**
	 */
	public void setRate(Integer rate) {
		this.rate = rate;
	}

	/**
	 */
	public Integer getRate() {
		return this.rate;
	}

	/**
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 */
	public String getComment() {
		return this.comment;
	}

	/**
	 */
	public Accomodation() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Accomodation that) {
		setId(that.getId());
		setAddress(that.getAddress());
		setAreaM2(that.getAreaM2());
		setCapacity(that.getCapacity());
		setCity(that.getCity());
		setLink1(that.getLink1());
		setLink2(that.getLink2());
		setLink3(that.getLink3());
		setName(that.getName());
		setZipCode(that.getZipCode());
		setPersonId(that.getPersonId());
		setType(that.getType());
		setDescription(that.getDescription());
		setActive(that.getActive());
		setImage(that.getImage());
		setRate(that.getRate());
		setComment(that.getComment());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("areaM2=[").append(areaM2).append("] ");
		buffer.append("capacity=[").append(capacity).append("] ");
		buffer.append("city=[").append(city).append("] ");
		buffer.append("link1=[").append(link1).append("] ");
		buffer.append("link2=[").append(link2).append("] ");
		buffer.append("link3=[").append(link3).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("zipCode=[").append(zipCode).append("] ");
		buffer.append("personId=[").append(personId).append("] ");
		buffer.append("type=[").append(type).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("active=[").append(active).append("] ");
		buffer.append("image=[").append(image).append("] ");
		buffer.append("rate=[").append(rate).append("] ");
		buffer.append("comment=[").append(comment).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Accomodation))
			return false;
		Accomodation equalCheck = (Accomodation) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
