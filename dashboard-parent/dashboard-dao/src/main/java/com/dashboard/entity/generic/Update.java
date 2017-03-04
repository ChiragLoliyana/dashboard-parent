package com.dashboard.entity.generic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * This class is the the generic entity for adding details of updation of object.
 * @author Dipak Singh
 *
 */
@MappedSuperclass
public class Update extends Create{

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date", nullable=false)
	private Date updatedDate;
	
	@Column(name="updated_origin", length=10, nullable=false)
	private String updatedOriginType;

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedOriginType() {
		return updatedOriginType;
	}

	public void setUpdatedOriginType(String updatedOriginType) {
		this.updatedOriginType = updatedOriginType;
	}

	@Override
	public String toString() {
		return "Update [updatedDate=" + updatedDate + ", updatedOriginType=" + updatedOriginType + "]";
	}
}
