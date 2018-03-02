
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAccomodationByAddress", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.address = ?1"),
		@NamedQuery(name = "findAccomodationByAddressContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.address like ?1"),
		@NamedQuery(name = "findAccomodationByAreaM2", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.areaM2 = ?1"),
		@NamedQuery(name = "findAccomodationByCapacity", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.capacity = ?1"),
		@NamedQuery(name = "findAccomodationByCity", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.city = ?1"),
		@NamedQuery(name = "findAccomodationByCityContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.city like ?1"),
		@NamedQuery(name = "findAccomodationById", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.id = ?1"),
		@NamedQuery(name = "findAccomodationByLink1", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link1 = ?1"),
		@NamedQuery(name = "findAccomodationByLink1Containing", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link1 like ?1"),
		@NamedQuery(name = "findAccomodationByLink2", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link2 = ?1"),
		@NamedQuery(name = "findAccomodationByLink2Containing", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link2 like ?1"),
		@NamedQuery(name = "findAccomodationByLink3", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link3 = ?1"),
		@NamedQuery(name = "findAccomodationByLink3Containing", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.link3 like ?1"),
		@NamedQuery(name = "findAccomodationByName", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.name = ?1"),
		@NamedQuery(name = "findAccomodationByNameContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.name like ?1"),
		@NamedQuery(name = "findAccomodationByPrimaryKey", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.id = ?1"),
		@NamedQuery(name = "findAccomodationByZipCode", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.zipCode = ?1"),
		@NamedQuery(name = "findAccomodationByZipCodeContaining", query = "select myAccomodation from Accomodation myAccomodation where myAccomodation.zipCode like ?1"),
		@NamedQuery(name = "findAllAccomodations", query = "select myAccomodation from Accomodation myAccomodation") })

@Table(catalog = "mayaccom", name = "accomodation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Accomodation")
@XmlRootElement(namespace = "Mayaccom/com/mayaccom/domain")
public class Accomodation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='name'%5D]
	 */

	@Column(name = "name", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='address'%5D]
	 */

	@Column(name = "address", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String address;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='city'%5D]
	 */

	@Column(name = "city", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String city;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='zipCode'%5D]
	 */

	@Column(name = "zip_code", length = 10)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String zipCode;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='capacity'%5D]
	 */

	@Column(name = "capacity")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer capacity;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='link1'%5D]
	 */

	@Column(name = "link1", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String link1;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='link2'%5D]
	 */

	@Column(name = "link2", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String link2;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='link3'%5D]
	 */

	@Column(name = "link3", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String link3;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@fields%5Bname='areaM2'%5D]
	 */

	@Column(name = "area_m2")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer areaM2;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@relationships%5Bname='host'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "host_id", referencedColumnName = "id") })
	@XmlTransient
	Host host;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Accomodation.datatype#//@relationships%5Bname='contents'%5D]
	 */
	@OneToMany(mappedBy = "accomodation", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Content> contents;

	/**
	* @generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	* @generated
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	* @generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	* @generated
	 */
	public String getName() {
		return this.name;
	}

	/**
	* @generated
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	* @generated
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	* @generated
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	* @generated
	 */
	public String getCity() {
		return this.city;
	}

	/**
	* @generated
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	* @generated
	 */
	public String getZipCode() {
		return this.zipCode;
	}

	/**
	* @generated
	 */
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	/**
	* @generated
	 */
	public Integer getCapacity() {
		return this.capacity;
	}

	/**
	* @generated
	 */
	public void setLink1(String link1) {
		this.link1 = link1;
	}

	/**
	* @generated
	 */
	public String getLink1() {
		return this.link1;
	}

	/**
	* @generated
	 */
	public void setLink2(String link2) {
		this.link2 = link2;
	}

	/**
	* @generated
	 */
	public String getLink2() {
		return this.link2;
	}

	/**
	* @generated
	 */
	public void setLink3(String link3) {
		this.link3 = link3;
	}

	/**
	* @generated
	 */
	public String getLink3() {
		return this.link3;
	}

	/**
	* @generated
	 */
	public void setAreaM2(Integer areaM2) {
		this.areaM2 = areaM2;
	}

	/**
	* @generated
	 */
	public Integer getAreaM2() {
		return this.areaM2;
	}

	/**
	* @generated
	 */
	public void setHost(Host host) {
		this.host = host;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Host getHost() {
		return host;
	}

	/**
	* @generated
	 */
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Content> getContents() {
		if (contents == null) {
			contents = new java.util.LinkedHashSet<com.mayaccom.domain.Content>();
		}
		return contents;
	}

	/**
	* @generated
	 */
	public Accomodation() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Accomodation that) {
		setId(that.getId());
		setName(that.getName());
		setAddress(that.getAddress());
		setCity(that.getCity());
		setZipCode(that.getZipCode());
		setCapacity(that.getCapacity());
		setLink1(that.getLink1());
		setLink2(that.getLink2());
		setLink3(that.getLink3());
		setAreaM2(that.getAreaM2());
		setHost(that.getHost());
		setContents(new java.util.LinkedHashSet<com.mayaccom.domain.Content>(that.getContents()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("city=[").append(city).append("] ");
		buffer.append("zipCode=[").append(zipCode).append("] ");
		buffer.append("capacity=[").append(capacity).append("] ");
		buffer.append("link1=[").append(link1).append("] ");
		buffer.append("link2=[").append(link2).append("] ");
		buffer.append("link3=[").append(link3).append("] ");
		buffer.append("areaM2=[").append(areaM2).append("] ");

		return buffer.toString();
	}

	/**
	* @generated
	* @AuxiliaryModelComponent
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	* @generated
	* @AuxiliaryModelComponent
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
