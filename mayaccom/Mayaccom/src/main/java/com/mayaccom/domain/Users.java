
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Users.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllUserss", query = "select myUsers from Users myUsers"),
		@NamedQuery(name = "findUsersByEnabled", query = "select myUsers from Users myUsers where myUsers.enabled = ?1"),
		@NamedQuery(name = "findUsersById", query = "select myUsers from Users myUsers where myUsers.id = ?1"),
		@NamedQuery(name = "findUsersByIdContaining", query = "select myUsers from Users myUsers where myUsers.id like ?1"),
		@NamedQuery(name = "findUsersByPassword", query = "select myUsers from Users myUsers where myUsers.password = ?1"),
		@NamedQuery(name = "findUsersByPasswordContaining", query = "select myUsers from Users myUsers where myUsers.password like ?1"),
		@NamedQuery(name = "findUsersByPrimaryKey", query = "select myUsers from Users myUsers where myUsers.id = ?1"),
		@NamedQuery(name = "findUsersByUsername", query = "select myUsers from Users myUsers where myUsers.username = ?1"),
		@NamedQuery(name = "findUsersByUsernameContaining", query = "select myUsers from Users myUsers where myUsers.username like ?1") })

@Table(catalog = "mayaccom", name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Users")

public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Users.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Users.datatype#//@fields%5Bname='enabled'%5D]
	 */

	@Column(name = "enabled")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean enabled;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Users.datatype#//@fields%5Bname='password'%5D]
	 */

	@Column(name = "password")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Users.datatype#//@fields%5Bname='username'%5D]
	 */

	@Column(name = "username")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String username;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Users.datatype#//@relationships%5Bname='authoritieses'%5D]
	 */
	@ManyToMany(fetch = FetchType.LAZY)

	@JoinTable(catalog = "mayaccom", name = "users_authorities", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "authorities_id", referencedColumnName = "id", nullable = false, updatable = false) })
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Authorities> authoritieses;

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
	public void setAuthoritieses(Set<Authorities> authoritieses) {
		this.authoritieses = authoritieses;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Authorities> getAuthoritieses() {
		if (authoritieses == null) {
			authoritieses = new java.util.LinkedHashSet<com.mayaccom.domain.Authorities>();
		}
		return authoritieses;
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
		setEnabled(that.getEnabled());
		setPassword(that.getPassword());
		setUsername(that.getUsername());
		setAuthoritieses(new java.util.LinkedHashSet<com.mayaccom.domain.Authorities>(that.getAuthoritieses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("enabled=[").append(enabled).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("username=[").append(username).append("] ");

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