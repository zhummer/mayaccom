
package com.mayaccom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blog.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllBlogs", query = "select myBlog from Blog myBlog"),
		@NamedQuery(name = "findBlogByDescription", query = "select myBlog from Blog myBlog where myBlog.description = ?1"),
		@NamedQuery(name = "findBlogById", query = "select myBlog from Blog myBlog where myBlog.id = ?1"),
		@NamedQuery(name = "findBlogByPrimaryKey", query = "select myBlog from Blog myBlog where myBlog.id = ?1"),
		@NamedQuery(name = "findBlogByTitle", query = "select myBlog from Blog myBlog where myBlog.title = ?1"),
		@NamedQuery(name = "findBlogByTitleContaining", query = "select myBlog from Blog myBlog where myBlog.title like ?1") })

@Table(catalog = "mayaccom", name = "blog")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Blog")
@XmlRootElement(namespace = "Mayaccom/com/mayaccom/domain")
public class Blog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blog.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blog.datatype#//@fields%5Bname='title'%5D]
	 */

	@Column(name = "title", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String title;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blog.datatype#//@fields%5Bname='description'%5D]
	 */

	@Column(name = "description", columnDefinition = "LONGTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String description;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blog.datatype#//@relationships%5Bname='person'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "owner", referencedColumnName = "id") })
	@XmlTransient
	Person person;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Blog.datatype#//@relationships%5Bname='blogposts'%5D]
	 */
	@OneToMany(mappedBy = "blog", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Blogpost> blogposts;

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
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	* @generated
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	* @generated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	* @generated
	 */
	public String getDescription() {
		return this.description;
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
	public void setBlogposts(Set<Blogpost> blogposts) {
		this.blogposts = blogposts;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Blogpost> getBlogposts() {
		if (blogposts == null) {
			blogposts = new java.util.LinkedHashSet<com.mayaccom.domain.Blogpost>();
		}
		return blogposts;
	}

	/**
	* @generated
	 */
	public Blog() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Blog that) {
		setId(that.getId());
		setTitle(that.getTitle());
		setDescription(that.getDescription());
		setPerson(that.getPerson());
		setBlogposts(new java.util.LinkedHashSet<com.mayaccom.domain.Blogpost>(that.getBlogposts()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("title=[").append(title).append("] ");
		buffer.append("description=[").append(description).append("] ");

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
		if (!(obj instanceof Blog))
			return false;
		Blog equalCheck = (Blog) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
