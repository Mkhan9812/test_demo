package com.cg.complaint.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.complaint.model.Complaint;

@Repository("cdao")
public interface ComplaintDao extends JpaRepository<Complaint,String> {
	
}





