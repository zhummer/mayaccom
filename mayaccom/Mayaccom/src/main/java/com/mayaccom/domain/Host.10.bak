
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllHosts", query = "select myHost from Host myHost"),
		@NamedQuery(name = "findHostByContactPerson", query = "select myHost from Host myHost where myHost.contactPerson = ?1"),
		@NamedQuery(name = "findHostByContactPersonContaining", query = "select myHost from Host myHost where myHost.contactPerson like ?1"),
		@NamedQuery(name = "findHostByEmail", query = "select myHost from Host myHost where myHost.email = ?1"),
		@NamedQuery(name = "findHostByEmailContaining", query = "select myHost from Host myHost where myHost.email like ?1"),
		@NamedQuery(name = "findHostById", query = "select myHost from Host myHost where myHost.id = ?1"),
		@NamedQuery(name = "findHostByPassword", query = "select myHost from Host myHost where myHost.password = ?1"),
		@NamedQuery(name = "findHostByPasswordContaining", query = "select myHost from Host myHost where myHost.password like ?1"),
		@NamedQuery(name = "findHostByPhone1", query = "select myHost from Host myHost where myHost.phone1 = ?1"),
		@NamedQuery(name = "findHostByPhone1Containing", query = "select myHost from Host myHost where myHost.phone1 like ?1"),
		@NamedQuery(name = "findHostByPhone2", query = "select myHost from Host myHost where myHost.phone2 = ?1"),
		@NamedQuery(name = "findHostByPhone2Containing", query = "select myHost from Host myHost where myHost.phone2 like ?1"),
		@NamedQuery(name = "findHostByPhone3", query = "select myHost from Host myHost where myHost.phone3 = ?1"),
		@NamedQuery(name = "findHostByPhone3Containing", query = "select myHost from Host myHost where myHost.phone3 like ?1"),
		@NamedQuery(name = "findHostByPrimaryKey", query = "select myHost from Host myHost where myHost.id = ?1"),
		@NamedQuery(name = "findHostByUsername", query = "select myHost from Host myHost where myHost.username = ?1"),
		@NamedQuery(name = "findHostByUsernameContaining", query = "select myHost from Host myHost where myHost.username like ?1") })

@Table(catalog = "mayaccom", name = "host")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Host")
@XmlRootElement(namespace = "Mayaccom/com/mayaccom/domain")
public class Host implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='contactPerson'%5D]
	 */

	@Column(name = "contact_person", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String contactPerson;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='phone1'%5D]
	 */

	@Column(name = "phone1", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String phone1;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='phone2'%5D]
	 */

	@Column(name = "phone2", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String phone2;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='phone3'%5D]
	 */

	@Column(name = "phone3", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String phone3;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='email'%5D]
	 */

	@Column(name = "email", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String email;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='username'%5D]
	 */

	@Column(name = "username", length = 20, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String username;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@fields%5Bname='password'%5D]
	 */

	@Column(name = "password", length = 60, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@relationships%5Bname='posts'%5D]
	 */
	@OneToMany(mappedBy = "host", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Post> posts;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@relationships%5Bname='topics'%5D]
	 */
	@OneToMany(mappedBy = "host", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Topic> topics;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Host.datatype#//@relationships%5Bname='accomodations'%5D]
	 */
	@OneToMany(mappedBy = "host", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Accomodation> accomodations;

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
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	* @generated
	 */
	public String getContactPerson() {
		return this.contactPerson;
	}

	/**
	* @generated
	 */
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	/**
	* @generated
	 */
	public String getPhone1() {
		return this.phone1;
	}

	/**
	* @generated
	 */
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	/**
	* @generated
	 */
	public String getPhone2() {
		return this.phone2;
	}

	/**
	* @generated
	 */
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	/**
	* @generated
	 */
	public String getPhone3() {
		return this.phone3;
	}

	/**
	* @generated
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	* @generated
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	* @generated
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	* @generated
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	* @generated
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	* @generated
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	* @generated
	 */
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Post> getPosts() {
		if (posts == null) {
			posts = new java.util.LinkedHashSet<com.mayaccom.domain.Post>();
		}
		return posts;
	}

	/**
	* @generated
	 */
	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Topic> getTopics() {
		if (topics == null) {
			topics = new java.util.LinkedHashSet<com.mayaccom.domain.Topic>();
		}
		return topics;
	}

	/**
	* @generated
	 */
	public void setAccomodations(Set<Accomodation> accomodations) {
		this.accomodations = accomodations;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Accomodation> getAccomodations() {
		if (accomodations == null) {
			accomodations = new java.util.LinkedHashSet<com.mayaccom.domain.Accomodation>();
		}
		return accomodations;
	}

	/**
	* @generated
	 */
	public Host() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Host that) {
		setId(that.getId());
		setContactPerson(that.getContactPerson());
		setPhone1(that.getPhone1());
		setPhone2(that.getPhone2());
		setPhone3(that.getPhone3());
		setEmail(that.getEmail());
		setUsername(that.getUsername());
		setPassword(that.getPassword());
		setPosts(new java.util.LinkedHashSet<com.mayaccom.domain.Post>(that.getPosts()));
		setTopics(new java.util.LinkedHashSet<com.mayaccom.domain.Topic>(that.getTopics()));
		setAccomodations(new java.util.LinkedHashSet<com.mayaccom.domain.Accomodation>(that.getAccomodations()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("contactPerson=[").append(contactPerson).append("] ");
		buffer.append("phone1=[").append(phone1).append("] ");
		buffer.append("phone2=[").append(phone2).append("] ");
		buffer.append("phone3=[").append(phone3).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("username=[").append(username).append("] ");
		buffer.append("password=[").append(password).append("] ");

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
		if (!(obj instanceof Host))
			return false;
		Host equalCheck = (Host) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
