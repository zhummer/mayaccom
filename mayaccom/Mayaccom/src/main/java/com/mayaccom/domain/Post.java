
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
 * @ModelCoreReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Post.datatype]
 * @generated
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllPosts", query = "select myPost from Post myPost"),
		@NamedQuery(name = "findPostByContent", query = "select myPost from Post myPost where myPost.content = ?1"),
		@NamedQuery(name = "findPostById", query = "select myPost from Post myPost where myPost.id = ?1"),
		@NamedQuery(name = "findPostByPrimaryKey", query = "select myPost from Post myPost where myPost.id = ?1") })

@Table(catalog = "mayaccom", name = "post")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Mayaccom/com/mayaccom/domain", name = "Post")

public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Post.datatype#//@fields%5Bname='id'%5D]
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Post.datatype#//@fields%5Bname='content'%5D]
	 */

	@Column(name = "content", columnDefinition = "TEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob

	@XmlElement
	String content;

	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Post.datatype#//@relationships%5Bname='host'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Host host;
	/**
	* @ModelReference [platform:/resource/Mayaccom/.springDSL/com/mayaccom/domain/Post.datatype#//@relationships%5Bname='topic'%5D]
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "topic_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Topic topic;

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
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	/**
	* @generated
	 */
	@JsonIgnore
	public Topic getTopic() {
		return topic;
	}

	/**
	* @generated
	 */
	public Post() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	* @generated
	 */
	public void copy(Post that) {
		setId(that.getId());
		setContent(that.getContent());
		setHost(that.getHost());
		setTopic(that.getTopic());
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
		if (!(obj instanceof Post))
			return false;
		Post equalCheck = (Post) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
