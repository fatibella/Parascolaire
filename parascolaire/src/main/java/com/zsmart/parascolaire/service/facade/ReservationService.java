package com.zsmart.parascolaire.service.facade;

import java.util.Date;
import java.util.List;

import com.zsmart.parascolaire.bean.Reservation;

public interface ReservationService {

	public int save(Reservation reservation);

	public List<Reservation> findAll();

	public Reservation findById(Long id);

	public int delete(Reservation reservation);

	public void deleteById(Long id);

	public List<Reservation> findByDate(Date dateDebut, Date dateFin);
}
