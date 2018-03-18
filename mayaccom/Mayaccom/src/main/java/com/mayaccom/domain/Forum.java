
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
		@NamedQuery(name = "findAllForums", query = "select myForum from Forum myForum"),
		@NamedQuery(name = "findForumByDescription", query = "select myForum from Forum myForum where myForum.description = ?1"),
		@NamedQuery(name = "findForumByDescriptionContaining", query = "select myForum from Forum myForum where myForum.description like ?1"),
		@NamedQuery(name = "findForumById", query = "select myForum from Forum myForum where myForum.id = ?1"),
		@NamedQuery(name = "findForumByName", query = "select myForum from Forum myForum where myForum.name = ?1"),
		@NamedQuery(name = "findForumByNameContaining", query = "select myForum from Forum myForum where myForum.name like ?1"),
		@NamedQuery(name = "findForumByPrimaryKey", query = "select myForum from Forum myForum where myForum.id = ?1") })

@Table(catalog = "mayaccom", name = "forum")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Forum")

public class Forum implements Serializable {
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

	@Column(name = "description", length = 300)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "name", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;

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
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public Forum() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Forum that) {
		setId(that.getId());
		setDescription(that.getDescription());
		setName(that.getName());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("name=[").append(name).append("] ");

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
		if (!(obj instanceof Forum))
			return false;
		Forum equalCheck = (Forum) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
