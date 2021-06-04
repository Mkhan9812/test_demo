package com.cg.complaint.service;


import java.util.List;

import com.cg.complaint.model.Complaint;


public interface ComplaintService {
	public void addComplaint( Complaint c);
	public List<Complaint> searchComplaints();
	public Complaint TrackstatusbyID(String complaintId);
	
}





