package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Reservation;

public interface ReservationService {

	public void save(Reservation reservation);

	public List<Reservation> findAll();

	public Reservation findById(Long id);

	public int delete(Reservation reservation);

	public void deleteById(Long id);

}
