package com.cg.complaint.controller;



import java.util.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.complaint.model.Complaint;
import com.cg.complaint.service.ComplaintServiceImpl;

@RestController
@RequestMapping("/consumers/Complaint")
public class ComplaintController {

	@Autowired
	ComplaintServiceImpl cserv;
	

	@GetMapping("/list")
	public List<Complaint> searchComplaint(Complaint c){
		return cserv.searchComplaints();
	}
	
	@PostMapping("/add")
	public String addComplaint(@RequestBody Complaint c) {
		cserv.addComplaint(c);
		return c.getComplaintId()+" is added sucessfuly";
	}
	@GetMapping("/track/{id}")
	public Complaint TrackstatusbyID(@PathVariable("id") String complaintId) {
		Consumer consumer=rtemp.getForObject("http://Advisor-service/Consumer/"+id,Consumer.class);
		return null ;
	}

}
