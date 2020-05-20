package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Reservation;

public interface ReservationService {
	
	
	   public void save(Reservation reservation );
	   public List<Reservation> findAll();

}
