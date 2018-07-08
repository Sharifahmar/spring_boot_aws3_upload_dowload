package com.aws3demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** An entity that stores file meta data into database */
@Entity
@Table(name = "document_metadata")
public class FileUploadMetaData {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="course_seq")
	@SequenceGenerator(
	    name="course_seq",
	    sequenceName="course_sequence",
	    allocationSize=1
	)
	
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "content_type")
	private String contentType;
	
	@Column(name = "content_size")
	private long contentSize;
	
	@Column(name = "path")
	private String path;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getContentSize() {
		return contentSize;
	}

	public void setContentSize(long contentSize) {
		this.contentSize = contentSize;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
