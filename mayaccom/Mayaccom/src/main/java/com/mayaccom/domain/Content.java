
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Content.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllContents", query = "select myContent from Content myContent"),
		@NamedQuery(name = "findContentByContentName", query = "select myContent from Content myContent where myContent.contentName = ?1"),
		@NamedQuery(name = "findContentByContentNameContaining", query = "select myContent from Content myContent where myContent.contentName like ?1"),
		@NamedQuery(name = "findContentByEditorContent", query = "select myContent from Content myContent where myContent.editorContent = ?1"),
		@NamedQuery(name = "findContentById", query = "select myContent from Content myContent where myContent.id = ?1"),
		@NamedQuery(name = "findContentByPrimaryKey", query = "select myContent from Content myContent where myContent.id = ?1") })

@Table(catalog = "mayaccom", name = "content")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Content")

public class Content implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Content.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Content.datatype#//@fields%5Bname='editorContent'%5D]
	 */

	@Column(name = "editor_content", columnDefinition = "LONGTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String editorContent;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Content.datatype#//@fields%5Bname='contentName'%5D]
	 */

	@Column(name = "content_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String contentName;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Content.datatype#//@relationships%5Bname='accomodation'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "accomodation_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Accomodation accomodation;

	/**
	* @generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	* @generated
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	* @generated
	 */
	public void setEditorContent(String editorContent) {
		this.editorContent = editorContent;
	}

	/**
	* @generated
	 */
	public String getEditorContent() {
		return this.editorContent;
	}

	/**
	* @generated
	 */
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	/**
	* @generated
	 */
	public String getContentName() {
		return this.contentName;
	}

	/**
	* @generated
	 */
	public void setAccomodation(Accomodation accomodation) {
		this.accomodation = accomodation;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Accomodation getAccomodation() {
		return accomodation;
	}

	/**
	* @generated
	 */
	public Content() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Content that) {
		setId(that.getId());
		setEditorContent(that.getEditorContent());
		setContentName(that.getContentName());
		setAccomodation(that.getAccomodation());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("editorContent=[").append(editorContent).append("] ");
		buffer.append("contentName=[").append(contentName).append("] ");

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
