package com.complaint.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaint {
	@Id
	private String complaintId;
	private String complaintSubject;
	private String complaintDescription;
	private String complaintStatus;
	
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaintSubject() {
		return complaintSubject;
	}

	public void setComplaintSubject(String complaintSubject) {
		this.complaintSubject = complaintSubject;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	
	public Complaint( String complaintId,String complaintSubject, String complaintDescription) {
		this.complaintId = complaintId;
		this.complaintSubject = complaintSubject;
		this.complaintDescription = complaintDescription;
	}
	
	public Complaint() {
		
	}

	public String getComplaintId() {
		return complaintId;
	}



}
