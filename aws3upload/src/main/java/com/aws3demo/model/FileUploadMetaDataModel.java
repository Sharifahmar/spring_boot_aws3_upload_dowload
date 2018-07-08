package com.aws3demo.model;

public class FileUploadMetaDataModel {

	private long id;

	private String name;

	private String contentType;

	private long contentSize;

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

	@Override
	public String toString() {
		return "FileUploadMetaDataModel [id=" + id + ", name=" + name
				+ ", contentType=" + contentType + ", contentSize="
				+ contentSize + ", path=" + path + "]";
	}

}
