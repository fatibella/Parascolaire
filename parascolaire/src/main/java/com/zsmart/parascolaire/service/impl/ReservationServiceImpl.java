package com.zsmart.parascolaire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Reservation;
import com.zsmart.parascolaire.dao.ReservationDao;
import com.zsmart.parascolaire.service.facade.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao reservationDao;

	@Override
	public void save(Reservation reservation) {
		reservationDao.save(reservation);
	}

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return reservationDao.findAll();
	}

	@Override
	public Reservation findById(Long id) {
		return reservationDao.getOne(id);
	}

	@Override
	public int delete(Reservation reservation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		reservationDao.deleteById(id);

	}
}
