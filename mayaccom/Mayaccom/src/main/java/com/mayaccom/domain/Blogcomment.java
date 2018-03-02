
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogcomment.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllBlogcomments", query = "select myBlogcomment from Blogcomment myBlogcomment"),
		@NamedQuery(name = "findBlogcommentByPrimaryKey", query = "select myBlogcomment from Blogcomment myBlogcomment where myBlogcomment.id = ?1") })

@Table(catalog = "mayaccom", name = "blogcomment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Blogcomment")

public class Blogcomment implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogcomment.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogcomment.datatype#//@fields%5Bname='commentText'%5D]
	 */

	@Column(name = "commentText", columnDefinition = "TEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String commentText;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogcomment.datatype#//@fields%5Bname='commentTs'%5D]
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "commentTS")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar commentTs;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogcomment.datatype#//@relationships%5Bname='person'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "id") })
	@XmlTransient
	Person person;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogcomment.datatype#//@relationships%5Bname='blogpost'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "blogpost_id", referencedColumnName = "id") })
	@XmlTransient
	Blogpost blogpost;

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
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	/**
	* @generated
	 */
	public String getCommentText() {
		return this.commentText;
	}

	/**
	* @generated
	 */
	public void setCommentTs(Calendar commentTs) {
		this.commentTs = commentTs;
	}

	/**
	* @generated
	 */
	public Calendar getCommentTs() {
		return this.commentTs;
	}

	/**
	* @generated
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Person getPerson() {
		return person;
	}

	/**
	* @generated
	 */
	public void setBlogpost(Blogpost blogpost) {
		this.blogpost = blogpost;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Blogpost getBlogpost() {
		return blogpost;
	}

	/**
	* @generated
	 */
	public Blogcomment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Blogcomment that) {
		setId(that.getId());
		setCommentText(that.getCommentText());
		setCommentTs(that.getCommentTs());
		setPerson(that.getPerson());
		setBlogpost(that.getBlogpost());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("commentText=[").append(commentText).append("] ");
		buffer.append("commentTs=[").append(commentTs).append("] ");

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
