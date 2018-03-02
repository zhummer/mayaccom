
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllTopics", query = "select myTopic from Topic myTopic"),
		@NamedQuery(name = "findTopicById", query = "select myTopic from Topic myTopic where myTopic.id = ?1"),
		@NamedQuery(name = "findTopicByLastPostAt", query = "select myTopic from Topic myTopic where myTopic.lastPostAt = ?1"),
		@NamedQuery(name = "findTopicByLastPosterId", query = "select myTopic from Topic myTopic where myTopic.lastPosterId = ?1"),
		@NamedQuery(name = "findTopicByName", query = "select myTopic from Topic myTopic where myTopic.name = ?1"),
		@NamedQuery(name = "findTopicByNameContaining", query = "select myTopic from Topic myTopic where myTopic.name like ?1"),
		@NamedQuery(name = "findTopicByPrimaryKey", query = "select myTopic from Topic myTopic where myTopic.id = ?1") })

@Table(catalog = "mayaccom", name = "topic")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Topic")
@XmlRootElement(namespace = "Mayaccom/com/mayaccom/domain")
public class Topic implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype#//@fields%5Bname='name'%5D]
	 */

	@Column(name = "name", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype#//@fields%5Bname='lastPosterId'%5D]
	 */

	@Column(name = "last_poster_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer lastPosterId;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype#//@fields%5Bname='lastPostAt'%5D]
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_post_at")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar lastPostAt;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype#//@relationships%5Bname='host'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Host host;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype#//@relationships%5Bname='forum'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "forum_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Forum forum;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Topic.datatype#//@relationships%5Bname='posts'%5D]
	 */
	@OneToMany(mappedBy = "topic", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.mayaccom.domain.Post> posts;

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
	public void setLastPosterId(Integer lastPosterId) {
		this.lastPosterId = lastPosterId;
	}

	/**
	* @generated
	 */
	public Integer getLastPosterId() {
		return this.lastPosterId;
	}

	/**
	* @generated
	 */
	public void setLastPostAt(Calendar lastPostAt) {
		this.lastPostAt = lastPostAt;
	}

	/**
	* @generated
	 */
	public Calendar getLastPostAt() {
		return this.lastPostAt;
	}

	/**
	* @generated
	 */
	public void setHost(Host host) {
		this.host = host;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Host getHost() {
		return host;
	}

	/**
	* @generated
	 */
	public void setForum(Forum forum) {
		this.forum = forum;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Forum getForum() {
		return forum;
	}

	/**
	* @generated
	 */
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Set<Post> getPosts() {
		if (posts == null) {
			posts = new java.util.LinkedHashSet<com.mayaccom.domain.Post>();
		}
		return posts;
	}

	/**
	* @generated
	 */
	public Topic() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Topic that) {
		setId(that.getId());
		setName(that.getName());
		setLastPosterId(that.getLastPosterId());
		setLastPostAt(that.getLastPostAt());
		setHost(that.getHost());
		setForum(that.getForum());
		setPosts(new java.util.LinkedHashSet<com.mayaccom.domain.Post>(that.getPosts()));
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
		buffer.append("lastPosterId=[").append(lastPosterId).append("] ");
		buffer.append("lastPostAt=[").append(lastPostAt).append("] ");

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
		if (!(obj instanceof Topic))
			return false;
		Topic equalCheck = (Topic) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
