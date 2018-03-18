
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
		@NamedQuery(name = "findAllBlogs", query = "select myBlog from Blog myBlog"),
		@NamedQuery(name = "findBlogByDescription", query = "select myBlog from Blog myBlog where myBlog.description = ?1"),
		@NamedQuery(name = "findBlogById", query = "select myBlog from Blog myBlog where myBlog.id = ?1"),
		@NamedQuery(name = "findBlogByOwner", query = "select myBlog from Blog myBlog where myBlog.owner = ?1"),
		@NamedQuery(name = "findBlogByPrimaryKey", query = "select myBlog from Blog myBlog where myBlog.id = ?1"),
		@NamedQuery(name = "findBlogByTitle", query = "select myBlog from Blog myBlog where myBlog.title = ?1"),
		@NamedQuery(name = "findBlogByTitleContaining", query = "select myBlog from Blog myBlog where myBlog.title like ?1") })

@Table(catalog = "mayaccom", name = "blog")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Blog")

public class Blog implements Serializable {
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

	@Column(name = "description", columnDefinition = "LONGTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "title", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String title;
	/**
	 */

	@Column(name = "owner")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer owner;

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
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 */
	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	/**
	 */
	public Integer getOwner() {
		return this.owner;
	}

	/**
	 */
	public Blog() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Blog that) {
		setId(that.getId());
		setDescription(that.getDescription());
		setTitle(that.getTitle());
		setOwner(that.getOwner());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("title=[").append(title).append("] ");
		buffer.append("owner=[").append(owner).append("] ");

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
