package com.zsmart.parascolaire.ws.rest.provided;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsmart.parascolaire.bean.Reservation;
import com.zsmart.parascolaire.service.facade.ReservationService;

@Controller
@RequestMapping("parascolaire/Reservation")
public class ReservationRest {

	@Autowired
	private ReservationService reservationService;

	@GetMapping("/id/{id}")
	public Reservation findById(@PathVariable Long id) {
		return reservationService.findById(id);
	}

	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		reservationService.deleteById(id);
	}

	@PostMapping("/")
	public int save(@RequestBody Reservation reservation) {
		return reservationService.save(reservation);

	}

	@GetMapping("/")
	public List<Reservation> findAll() {
		return reservationService.findAll();
	}

	public ReservationService getReservationService() {
		return reservationService;
	}

	public void setReservationService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

}
