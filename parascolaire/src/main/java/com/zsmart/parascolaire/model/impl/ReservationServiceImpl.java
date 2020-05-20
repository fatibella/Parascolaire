package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Reservation;
import com.zsmart.parascolaire.dao.ReservationDao;
import com.zsmart.parascolaire.model.facade.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	private ReservationDao reservationDao;

	

	@Override
	public void save(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationDao.save(reservation);
	}

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return reservationDao.findAll();
	}
}
