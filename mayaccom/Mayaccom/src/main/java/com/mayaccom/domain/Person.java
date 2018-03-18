
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "mayaccom", name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Person")

public class Person implements Serializable {
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

	@Column(name = "firstname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String firstname;
	/**
	 */

	@Column(name = "lastname", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lastname;
	/**
	 */

	@Column(name = "email", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String email;
	/**
	 */

	@Column(name = "address", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String address;
	/**
	 */

	@Column(name = "city", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String city;
	/**
	 */

	@Column(name = "password", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;
	/**
	 */

	@Column(name = "dtype", length = 31)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String dtype;
	/**
	 */

	@Column(name = "enabled")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean enabled;
	/**
	 */

	@Column(name = "contact_person", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String contactPerson;
	/**
	 */

	@Column(name = "phone1", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String phone1;
	/**
	 */

	@Column(name = "phone2", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String phone2;
	/**
	 */

	@Column(name = "phone3", length = 15)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String phone3;
	/**
	 */

	@Column(name = "username", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String username;

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
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 */
	public String getLastname() {
		return this.lastname;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
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
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	/**
	 */
	public String getDtype() {
		return this.dtype;
	}

	/**
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 */
	public Boolean getEnabled() {
		return this.enabled;
	}

	/**
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 */
	public String getContactPerson() {
		return this.contactPerson;
	}

	/**
	 */
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	/**
	 */
	public String getPhone1() {
		return this.phone1;
	}

	/**
	 */
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	/**
	 */
	public String getPhone2() {
		return this.phone2;
	}

	/**
	 */
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	/**
	 */
	public String getPhone3() {
		return this.phone3;
	}

	/**
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 */
	public Person() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Person that) {
		setId(that.getId());
		setFirstname(that.getFirstname());
		setLastname(that.getLastname());
		setEmail(that.getEmail());
		setAddress(that.getAddress());
		setCity(that.getCity());
		setPassword(that.getPassword());
		setDtype(that.getDtype());
		setEnabled(that.getEnabled());
		setContactPerson(that.getContactPerson());
		setPhone1(that.getPhone1());
		setPhone2(that.getPhone2());
		setPhone3(that.getPhone3());
		setUsername(that.getUsername());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("firstname=[").append(firstname).append("] ");
		buffer.append("lastname=[").append(lastname).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("city=[").append(city).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("dtype=[").append(dtype).append("] ");
		buffer.append("enabled=[").append(enabled).append("] ");
		buffer.append("contactPerson=[").append(contactPerson).append("] ");
		buffer.append("phone1=[").append(phone1).append("] ");
		buffer.append("phone2=[").append(phone2).append("] ");
		buffer.append("phone3=[").append(phone3).append("] ");
		buffer.append("username=[").append(username).append("] ");

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
		if (!(obj instanceof Person))
			return false;
		Person equalCheck = (Person) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
