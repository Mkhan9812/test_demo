package com.cg.complaint.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.complaint.dao.ComplaintDao;
import com.cg.complaint.model.Complaint;

@Service("cserv")
public class ComplaintServiceImpl implements ComplaintService{

	@Autowired
	ComplaintDao cdao;
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addComplaint(Complaint c) {
		cdao.save(c);
	}

	@Override
	public List<Complaint> searchComplaints() {
		
		return cdao.findAll();
	}

	@Override
	public Complaint TrackstatusbyID(String complaintId) {
		return cdao.findById(complaintId).get();
	}}





