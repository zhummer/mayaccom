
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

@Table(catalog = "mayaccom", name = "blogcomment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Blogcomment")

public class Blogcomment implements Serializable {
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

	@Column(name = "comment_text", columnDefinition = "TEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String commentText;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "commentts")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar commentts;
	/**
	 */

	@Column(name = "blogpost_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer blogpostId;
	/**
	 */

	@Column(name = "user_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer userId;

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
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	/**
	 */
	public String getCommentText() {
		return this.commentText;
	}

	/**
	 */
	public void setCommentts(Calendar commentts) {
		this.commentts = commentts;
	}

	/**
	 */
	public Calendar getCommentts() {
		return this.commentts;
	}

	/**
	 */
	public void setBlogpostId(Integer blogpostId) {
		this.blogpostId = blogpostId;
	}

	/**
	 */
	public Integer getBlogpostId() {
		return this.blogpostId;
	}

	/**
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 */
	public Integer getUserId() {
		return this.userId;
	}

	/**
	 */
	public Blogcomment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Blogcomment that) {
		setId(that.getId());
		setCommentText(that.getCommentText());
		setCommentts(that.getCommentts());
		setBlogpostId(that.getBlogpostId());
		setUserId(that.getUserId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("commentText=[").append(commentText).append("] ");
		buffer.append("commentts=[").append(commentts).append("] ");
		buffer.append("blogpostId=[").append(blogpostId).append("] ");
		buffer.append("userId=[").append(userId).append("] ");

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
		if (!(obj instanceof Blogcomment))
			return false;
		Blogcomment equalCheck = (Blogcomment) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
