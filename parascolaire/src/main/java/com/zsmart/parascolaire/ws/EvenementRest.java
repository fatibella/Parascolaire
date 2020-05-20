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

import com.zsmart.parascolaire.bean.Evenement;
import com.zsmart.parascolaire.model.facade.EvenementService;

@Controller
@RequestMapping("parascolaire/evenement")
public class EvenementRest {
	
	

	@Autowired
	private EvenementService evenementService;
	
	@GetMapping("/id/{id}")
	public Evenement findById(@PathVariable int id) {
		return evenementService.findById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable int id) {
		return evenementService.deleteById(id);
	}
	
	@PostMapping("/")
	public void save(@RequestBody Evenement evenement) {
		evenementService.save(evenement);
		

	}
	@GetMapping("/")
	public List<Evenement> findAll() {
		return evenementService.findAll();
	}
	
}
