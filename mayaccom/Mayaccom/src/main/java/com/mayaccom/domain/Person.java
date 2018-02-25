
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
		@NamedQuery(name = "findAllPersons", query = "select myPerson from Person myPerson"),
		@NamedQuery(name = "findPersonByAddress", query = "select myPerson from Person myPerson where myPerson.address = ?1"),
		@NamedQuery(name = "findPersonByAddressContaining", query = "select myPerson from Person myPerson where myPerson.address like ?1"),
		@NamedQuery(name = "findPersonByCity", query = "select myPerson from Person myPerson where myPerson.city = ?1"),
		@NamedQuery(name = "findPersonByCityContaining", query = "select myPerson from Person myPerson where myPerson.city like ?1"),
		@NamedQuery(name = "findPersonByDtype", query = "select myPerson from Person myPerson where myPerson.dtype = ?1"),
		@NamedQuery(name = "findPersonByDtypeContaining", query = "select myPerson from Person myPerson where myPerson.dtype like ?1"),
		@NamedQuery(name = "findPersonByEmail", query = "select myPerson from Person myPerson where myPerson.email = ?1"),
		@NamedQuery(name = "findPersonByEmailContaining", query = "select myPerson from Person myPerson where myPerson.email like ?1"),
		@NamedQuery(name = "findPersonByFirstname", query = "select myPerson from Person myPerson where myPerson.firstname = ?1"),
		@NamedQuery(name = "findPersonByFirstnameContaining", query = "select myPerson from Person myPerson where myPerson.firstname like ?1"),
		@NamedQuery(name = "findPersonById", query = "select myPerson from Person myPerson where myPerson.id = ?1"),
		@NamedQuery(name = "findPersonByLastname", query = "select myPerson from Person myPerson where myPerson.lastname = ?1"),
		@NamedQuery(name = "findPersonByLastnameContaining", query = "select myPerson from Person myPerson where myPerson.lastname like ?1"),
		@NamedQuery(name = "findPersonByPassword", query = "select myPerson from Person myPerson where myPerson.password = ?1"),
		@NamedQuery(name = "findPersonByPasswordContaining", query = "select myPerson from Person myPerson where myPerson.password like ?1"),
		@NamedQuery(name = "findPersonByPrimaryKey", query = "select myPerson from Person myPerson where myPerson.id = ?1") })

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
