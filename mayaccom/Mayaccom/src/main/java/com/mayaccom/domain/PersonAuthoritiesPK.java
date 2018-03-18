
package com.mayaccom.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class PersonAuthoritiesPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public PersonAuthoritiesPK() {
	}

	/**
	 */

	@Column(name = "person_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer personId;
	/**
	 */

	@Column(name = "authorities_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public String authoritiesId;

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
		if (!(obj instanceof PersonAuthoritiesPK))
			return false;
		PersonAuthoritiesPK equalCheck = (PersonAuthoritiesPK) obj;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("PersonAuthoritiesPK");
		sb.append(" personId: ").append(getPersonId());
		sb.append(" authoritiesId: ").append(getAuthoritiesId());
		return sb.toString();
	}
}
