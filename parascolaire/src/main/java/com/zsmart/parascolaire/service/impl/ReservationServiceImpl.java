package com.zsmart.parascolaire.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Club;
import com.zsmart.parascolaire.bean.Reservation;
import com.zsmart.parascolaire.dao.ReservationDao;
import com.zsmart.parascolaire.service.facade.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao reservationDao;

	@Override
	public int save(Reservation reservation) {

		if (reservation == null) {
			return 0;

		} else {
			reservationDao.save(reservation);
			return 1;
		}

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
		if (reservation == null) {
			return -1;
		} else {
			reservationDao.delete(reservation);
			return 1;
		}
	}

	@Override
	public void deleteById(Long id) {
		reservationDao.deleteById(id);

	}

	public ReservationDao getReservationDao() {
		return reservationDao;
	}

	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}

}
