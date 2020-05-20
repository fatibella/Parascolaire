package com.zsmart.parascolaire.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Reservation;

@Repository
public interface ReservationDao extends JpaRepository<Reservation, Long> {

	
	   public List<Reservation> findAll();
}
