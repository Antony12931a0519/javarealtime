package com.realtimejava.friendbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtimejava.friendbook.entities.Donors;
import com.realtimejava.friendbook.manager.DonorManger;

@RestController
public class DonorsController {
	@Autowired
	private DonorManger donorsManager;

	@GetMapping("list")
	public List<Donors> getDonors() {
		return donorsManager.getDonors();
	}

}
