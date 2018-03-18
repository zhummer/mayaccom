
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */
@IdClass(com.mayaccom.domain.PersonAuthoritiesPK.class)
@Entity

@Table(catalog = "mayaccom", name = "person_authorities")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "PersonAuthorities")

public class PersonAuthorities implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "person_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer personId;
	/**
	 */

	@Column(name = "authorities_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String authoritiesId;

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
	public void setAuthoritiesId(String authoritiesId) {
		this.authoritiesId = authoritiesId;
	}

	/**
	 */
	public String getAuthoritiesId() {
		return this.authoritiesId;
	}

	/**
	 */
	public PersonAuthorities() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(PersonAuthorities that) {
		setPersonId(that.getPersonId());
		setAuthoritiesId(that.getAuthoritiesId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("personId=[").append(personId).append("] ");
		buffer.append("authoritiesId=[").append(authoritiesId).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((personId == null) ? 0 : personId.hashCode()));
		result = (int) (prime * result + ((authoritiesId == null) ? 0 : authoritiesId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof PersonAuthorities))
			return false;
		PersonAuthorities equalCheck = (PersonAuthorities) obj;
		if ((personId == null && equalCheck.personId != null) || (personId != null && equalCheck.personId == null))
			return false;
		if (personId != null && !personId.equals(equalCheck.personId))
			return false;
		if ((authoritiesId == null && equalCheck.authoritiesId != null) || (authoritiesId != null && equalCheck.authoritiesId == null))
			return false;
		if (authoritiesId != null && !authoritiesId.equals(equalCheck.authoritiesId))
			return false;
		return true;
	}
}
