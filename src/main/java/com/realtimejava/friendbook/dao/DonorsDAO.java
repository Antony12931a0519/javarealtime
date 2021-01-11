package com.realtimejava.friendbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.realtimejava.friendbook.entities.Donors;

public interface DonorsDAO extends CrudRepository<Donors, Long> {

}
