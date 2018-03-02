
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype]
 * @generated
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
@XmlRootElement(namespace = "Mayaccom/com/mayaccom/domain")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='firstname'%5D]
	 */

	@Column(name = "firstname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String firstname;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='lastname'%5D]
	 */

	@Column(name = "lastname", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lastname;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='email'%5D]
	 */

	@Column(name = "email", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String email;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='address'%5D]
	 */

	@Column(name = "address", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String address;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='city'%5D]
	 */

	@Column(name = "city", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String city;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='password'%5D]
	 */

	@Column(name = "password", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@fields%5Bname='dtype'%5D]
	 */

	@Column(name = "dtype", length = 31)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String dtype;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@relationships%5Bname='blogs'%5D]
	 */
	@OneToMany(mappedBy = "person", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Blog> blogs;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Person.datatype#//@relationships%5Bname='blogcomments'%5D]
	 */
	@OneToMany(mappedBy = "person", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Blogcomment> blogcomments;

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
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	* @generated
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	* @generated
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	* @generated
	 */
	public String getLastname() {
		return this.lastname;
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
	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	/**
	* @generated
	 */
	public String getDtype() {
		return this.dtype;
	}

	/**
	* @generated
	 */
	public void setBlogs(Set<Blog> blogs) {
		this.blogs = blogs;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Blog> getBlogs() {
		if (blogs == null) {
			blogs = new java.util.LinkedHashSet<com.mayaccom.domain.Blog>();
		}
		return blogs;
	}

	/**
	* @generated
	 */
	public void setBlogcomments(Set<Blogcomment> blogcomments) {
		this.blogcomments = blogcomments;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Blogcomment> getBlogcomments() {
		if (blogcomments == null) {
			blogcomments = new java.util.LinkedHashSet<com.mayaccom.domain.Blogcomment>();
		}
		return blogcomments;
	}

	/**
	* @generated
	 */
	public Person() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
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
		setBlogs(new java.util.LinkedHashSet<com.mayaccom.domain.Blog>(that.getBlogs()));
		setBlogcomments(new java.util.LinkedHashSet<com.mayaccom.domain.Blogcomment>(that.getBlogcomments()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
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
