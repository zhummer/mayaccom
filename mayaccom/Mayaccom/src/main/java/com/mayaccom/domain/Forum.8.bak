
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Forum.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllForums", query = "select myForum from Forum myForum"),
		@NamedQuery(name = "findForumByDescription", query = "select myForum from Forum myForum where myForum.description = ?1"),
		@NamedQuery(name = "findForumByDescriptionContaining", query = "select myForum from Forum myForum where myForum.description like ?1"),
		@NamedQuery(name = "findForumById", query = "select myForum from Forum myForum where myForum.id = ?1"),
		@NamedQuery(name = "findForumByName", query = "select myForum from Forum myForum where myForum.name = ?1"),
		@NamedQuery(name = "findForumByNameContaining", query = "select myForum from Forum myForum where myForum.name like ?1"),
		@NamedQuery(name = "findForumByPrimaryKey", query = "select myForum from Forum myForum where myForum.id = ?1") })

@Table(catalog = "mayaccom", name = "forum")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Forum")
@XmlRootElement(namespace = "Mayaccom/com/mayaccom/domain")
public class Forum implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Forum.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Forum.datatype#//@fields%5Bname='name'%5D]
	 */

	@Column(name = "name", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Forum.datatype#//@fields%5Bname='description'%5D]
	 */

	@Column(name = "description", length = 300)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Forum.datatype#//@relationships%5Bname='topics'%5D]
	 */
	@OneToMany(mappedBy = "forum", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Topic> topics;

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
	public void setName(String name) {
		this.name = name;
	}

	/**
	* @generated
	 */
	public String getName() {
		return this.name;
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
	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Topic> getTopics() {
		if (topics == null) {
			topics = new java.util.LinkedHashSet<com.mayaccom.domain.Topic>();
		}
		return topics;
	}

	/**
	* @generated
	 */
	public Forum() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Forum that) {
		setId(that.getId());
		setName(that.getName());
		setDescription(that.getDescription());
		setTopics(new java.util.LinkedHashSet<com.mayaccom.domain.Topic>(that.getTopics()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	* @generated
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
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
		if (!(obj instanceof Forum))
			return false;
		Forum equalCheck = (Forum) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
