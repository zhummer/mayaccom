
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(catalog = "mayaccom", name = "content")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Content")

public class Content implements Serializable {
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

	@Column(name = "content_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String contentName;
	/**
	 */

	@Column(name = "editor_content", columnDefinition = "LONGTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String editorContent;
	/**
	 */

	@Column(name = "accomodation_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer accomodationId;

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
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	/**
	 */
	public String getContentName() {
		return this.contentName;
	}

	/**
	 */
	public void setEditorContent(String editorContent) {
		this.editorContent = editorContent;
	}

	/**
	 */
	public String getEditorContent() {
		return this.editorContent;
	}

	/**
	 */
	public void setAccomodationId(Integer accomodationId) {
		this.accomodationId = accomodationId;
	}

	/**
	 */
	public Integer getAccomodationId() {
		return this.accomodationId;
	}

	/**
	 */
	public Content() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Content that) {
		setId(that.getId());
		setContentName(that.getContentName());
		setEditorContent(that.getEditorContent());
		setAccomodationId(that.getAccomodationId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("contentName=[").append(contentName).append("] ");
		buffer.append("editorContent=[").append(editorContent).append("] ");
		buffer.append("accomodationId=[").append(accomodationId).append("] ");

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
		if (!(obj instanceof Content))
			return false;
		Content equalCheck = (Content) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
