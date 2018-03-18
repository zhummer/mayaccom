
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "mayaccom", name = "topic")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Topic")

public class Topic implements Serializable {
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

	@Column(name = "last_post_at")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lastPostAt;
	/**
	 */

	@Column(name = "name", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	 */

	@Column(name = "forum_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer forumId;
	/**
	 */

	@Column(name = "last_poster_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer lastPosterId;
	/**
	 */

	@Column(name = "person_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer personId;

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
	public void setLastPostAt(String lastPostAt) {
		this.lastPostAt = lastPostAt;
	}

	/**
	 */
	public String getLastPostAt() {
		return this.lastPostAt;
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
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}

	/**
	 */
	public Integer getForumId() {
		return this.forumId;
	}

	/**
	 */
	public void setLastPosterId(Integer lastPosterId) {
		this.lastPosterId = lastPosterId;
	}

	/**
	 */
	public Integer getLastPosterId() {
		return this.lastPosterId;
	}

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
	public Topic() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Topic that) {
		setId(that.getId());
		setLastPostAt(that.getLastPostAt());
		setName(that.getName());
		setForumId(that.getForumId());
		setLastPosterId(that.getLastPosterId());
		setPersonId(that.getPersonId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("lastPostAt=[").append(lastPostAt).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("forumId=[").append(forumId).append("] ");
		buffer.append("lastPosterId=[").append(lastPosterId).append("] ");
		buffer.append("personId=[").append(personId).append("] ");

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
		if (!(obj instanceof Topic))
			return false;
		Topic equalCheck = (Topic) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
