
package com.mayaccom.security;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Authorities.datatype]
 * @generated
 */

@Entity

@Table(name = "Authorities")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/security", name = "Authorities")

public class Authorities implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Authorities.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id")
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Authorities.datatype#//@fields%5Bname='authorityname'%5D]
	 */

	@Column(name = "authorityname")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String authorityname;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Authorities.datatype#//@relationships%5Bname='user'%5D]
	 */
	@ManyToMany(mappedBy = "authorities", cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.security.Users> user;

	/**
	* @generated
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	* @generated
	 */
	public String getId() {
		return this.id;
	}

	/**
	* @generated
	 */
	public void setAuthorityname(String authorityname) {
		this.authorityname = authorityname;
	}

	/**
	* @generated
	 */
	public String getAuthorityname() {
		return this.authorityname;
	}

	/**
	* @generated
	 */
	public void setUser(Set<Users> user) {
		this.user = user;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Users> getUser() {
		if (user == null) {
			user = new java.util.LinkedHashSet<com.mayaccom.security.Users>();
		}
		return user;
	}

	/**
	* @generated
	 */
	public Authorities() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Authorities that) {
		setId(that.getId());
		setAuthorityname(that.getAuthorityname());
		setUser(new java.util.LinkedHashSet<com.mayaccom.security.Users>(that.getUser()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("authorityname=[").append(authorityname).append("] ");

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
		if (!(obj instanceof Authorities))
			return false;
		Authorities equalCheck = (Authorities) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
