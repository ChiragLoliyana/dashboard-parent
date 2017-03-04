package com.dashboard.entity.generic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * This class is the the generic entity for adding details of creation of object.
 * @author Dipak Singh
 *
 */
@MappedSuperclass
public class Create {

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date", nullable=false)
	private Date createdDate;
	
	@Column(name="created_origin", length=10, nullable=false)
	private String createdOriginType;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedOriginType() {
		return createdOriginType;
	}

	public void setCreatedOriginType(String createdOriginType) {
		this.createdOriginType = createdOriginType;
	}

	@Override
	public String toString() {
		return "Create [createdDate=" + createdDate + ", createdOriginType=" + createdOriginType + "]";
	}
}
