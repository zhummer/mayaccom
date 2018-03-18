
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "mayaccom", name = "post")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Post")

public class Post implements Serializable {
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

	@Column(name = "content", columnDefinition = "TEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String content;
	/**
	 */

	@Column(name = "person_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer personId;
	/**
	 */

	@Column(name = "topic_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer topicId;

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
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 */
	public String getContent() {
		return this.content;
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
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	/**
	 */
	public Integer getTopicId() {
		return this.topicId;
	}

	/**
	 */
	public Post() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Post that) {
		setId(that.getId());
		setContent(that.getContent());
		setPersonId(that.getPersonId());
		setTopicId(that.getTopicId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("personId=[").append(personId).append("] ");
		buffer.append("topicId=[").append(topicId).append("] ");

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
		if (!(obj instanceof Post))
			return false;
		Post equalCheck = (Post) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
