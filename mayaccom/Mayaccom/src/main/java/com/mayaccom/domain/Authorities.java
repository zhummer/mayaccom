
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "mayaccom", name = "authorities")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Authorities")

public class Authorities implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String id;
	/**
	 */

	@Column(name = "authorityname")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String authorityname;

	/**
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 */
	public String getId() {
		return this.id;
	}

	/**
	 */
	public void setAuthorityname(String authorityname) {
		this.authorityname = authorityname;
	}

	/**
	 */
	public String getAuthorityname() {
		return this.authorityname;
	}

	/**
	 */
	public Authorities() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Authorities that) {
		setId(that.getId());
		setAuthorityname(that.getAuthorityname());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("authorityname=[").append(authorityname).append("] ");

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
