package com.zsmart.parascolaire.ws;

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
import com.zsmart.parascolaire.model.facade.ReservationService;

@Controller
@RequestMapping("parascolaire/reservation")
public class ReservationRest {

	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/id/{id}")
	public Reservation findById(@PathVariable int id) {
		return reservationService.findById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable int id) {
		return reservationService.deleteById(id);
	}
	
	@PostMapping("/")
	public void save(@RequestBody Reservation reservation) {
		reservationService.save(reservation);
		

	}
	@GetMapping("/")
	public List<Reservation> findAll() {
		return reservationService.findAll();
	}

}
