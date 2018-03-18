
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "mayaccom", name = "blogpost")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Blogpost")

public class Blogpost implements Serializable {
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

	@Column(name = "content", columnDefinition = "LONGTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String content;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "creationts")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar creationts;
	/**
	 */

	@Column(name = "blog_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer blogId;

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
	public void setCreationts(Calendar creationts) {
		this.creationts = creationts;
	}

	/**
	 */
	public Calendar getCreationts() {
		return this.creationts;
	}

	/**
	 */
	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	/**
	 */
	public Integer getBlogId() {
		return this.blogId;
	}

	/**
	 */
	public Blogpost() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Blogpost that) {
		setId(that.getId());
		setContent(that.getContent());
		setCreationts(that.getCreationts());
		setBlogId(that.getBlogId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("creationts=[").append(creationts).append("] ");
		buffer.append("blogId=[").append(blogId).append("] ");

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
		if (!(obj instanceof Blogpost))
			return false;
		Blogpost equalCheck = (Blogpost) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
