package com.complaint.service;


import java.util.List;

import com.complaint.model.Complaint;


public interface ComplaintService {
	public void addComplaint( Complaint c);
	public List<Complaint> searchComplaints();
	public Complaint TrackstatusbyID(String complaintId);
	
}





