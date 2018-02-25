
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Users.datatype]
 * @generated
 */

@Entity

@Table(name = "Users")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/security", name = "Users")

public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Users.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id")
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Users.datatype#//@fields%5Bname='username'%5D]
	 */

	@Column(name = "username")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String username;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Users.datatype#//@fields%5Bname='password'%5D]
	 */

	@Column(name = "password")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Users.datatype#//@fields%5Bname='enabled'%5D]
	 */

	@Column(name = "enabled")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean enabled;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/security/Users.datatype#//@relationships%5Bname='authorities'%5D]
	 */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.security.Authorities> authorities;

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
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	* @generated
	 */
	public Boolean getEnabled() {
		return this.enabled;
	}

	/**
	* @generated
	 */
	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Authorities> getAuthorities() {
		if (authorities == null) {
			authorities = new java.util.LinkedHashSet<com.mayaccom.security.Authorities>();
		}
		return authorities;
	}

	/**
	* @generated
	 */
	public Users() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Users that) {
		setId(that.getId());
		setUsername(that.getUsername());
		setPassword(that.getPassword());
		setEnabled(that.getEnabled());
		setAuthorities(new java.util.LinkedHashSet<com.mayaccom.security.Authorities>(that.getAuthorities()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("username=[").append(username).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("enabled=[").append(enabled).append("] ");

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
		if (!(obj instanceof Users))
			return false;
		Users equalCheck = (Users) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
