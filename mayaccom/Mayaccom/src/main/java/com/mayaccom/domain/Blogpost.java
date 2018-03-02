
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogpost.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllBlogposts", query = "select myBlogpost from Blogpost myBlogpost"),
		@NamedQuery(name = "findBlogpostByPrimaryKey", query = "select myBlogpost from Blogpost myBlogpost where myBlogpost.id = ?1") })

@Table(catalog = "mayaccom", name = "blogpost")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Blogpost")
@XmlRootElement(namespace = "Mayaccom/com/mayaccom/domain")
public class Blogpost implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogpost.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogpost.datatype#//@fields%5Bname='content'%5D]
	 */

	@Column(name = "content", columnDefinition = "LONGTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String content;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogpost.datatype#//@fields%5Bname='creationTs'%5D]
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creationTS")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar creationTs;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogpost.datatype#//@relationships%5Bname='blog'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "blog_id", referencedColumnName = "id") })
	@XmlTransient
	Blog blog;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blogpost.datatype#//@relationships%5Bname='blogcomments'%5D]
	 */
	@OneToMany(mappedBy = "blogpost", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Blogcomment> blogcomments;

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
	public void setContent(String content) {
		this.content = content;
	}

	/**
	* @generated
	 */
	public String getContent() {
		return this.content;
	}

	/**
	* @generated
	 */
	public void setCreationTs(Calendar creationTs) {
		this.creationTs = creationTs;
	}

	/**
	* @generated
	 */
	public Calendar getCreationTs() {
		return this.creationTs;
	}

	/**
	* @generated
	 */
	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Blog getBlog() {
		return blog;
	}

	/**
	* @generated
	 */
	public void setBlogcomments(Set<Blogcomment> blogcomments) {
		this.blogcomments = blogcomments;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Blogcomment> getBlogcomments() {
		if (blogcomments == null) {
			blogcomments = new java.util.LinkedHashSet<com.mayaccom.domain.Blogcomment>();
		}
		return blogcomments;
	}

	/**
	* @generated
	 */
	public Blogpost() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Blogpost that) {
		setId(that.getId());
		setContent(that.getContent());
		setCreationTs(that.getCreationTs());
		setBlog(that.getBlog());
		setBlogcomments(new java.util.LinkedHashSet<com.mayaccom.domain.Blogcomment>(that.getBlogcomments()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("creationTs=[").append(creationTs).append("] ");

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
