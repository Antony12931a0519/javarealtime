package com.realtimejava.friendbook.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.realtimejava.friendbook.dao.DonorsDAO;
import com.realtimejava.friendbook.entities.Donors;

@Component
public class DonorManger {
	
	@Autowired
	private DonorsDAO donorsDAO;
	
	public List<Donors> getDonors(){
		return (List<Donors>) donorsDAO.findAll();
	}
	

}
