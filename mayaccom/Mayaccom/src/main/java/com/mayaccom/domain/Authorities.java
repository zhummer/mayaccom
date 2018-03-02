
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Authorities.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllAuthoritiess", query = "select myAuthorities from Authorities myAuthorities"),
		@NamedQuery(name = "findAuthoritiesByAuthorityname", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.authorityname = ?1"),
		@NamedQuery(name = "findAuthoritiesByAuthoritynameContaining", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.authorityname like ?1"),
		@NamedQuery(name = "findAuthoritiesById", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.id = ?1"),
		@NamedQuery(name = "findAuthoritiesByIdContaining", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.id like ?1"),
		@NamedQuery(name = "findAuthoritiesByPrimaryKey", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.id = ?1") })

@Table(catalog = "mayaccom", name = "authorities")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Authorities")

public class Authorities implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Authorities.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Authorities.datatype#//@fields%5Bname='authorityname'%5D]
	 */

	@Column(name = "authorityname")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String authorityname;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Authorities.datatype#//@relationships%5Bname='userses'%5D]
	 */
	@ManyToMany(mappedBy = "authoritieses", fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Users> userses;

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
	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Users> getUserses() {
		if (userses == null) {
			userses = new java.util.LinkedHashSet<com.mayaccom.domain.Users>();
		}
		return userses;
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
		setUserses(new java.util.LinkedHashSet<com.mayaccom.domain.Users>(that.getUserses()));
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
