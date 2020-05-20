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

import com.zsmart.parascolaire.bean.Salle;
import com.zsmart.parascolaire.model.facade.SalleService;

@Controller
@RequestMapping("parascolaire/salle")
public class SalleRest {

	@Autowired
	private SalleService salleService;
	
	@GetMapping("/id/{id}")
	public Salle findById(@PathVariable int id) {
		return salleService.findById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable int id) {
		return salleService.deleteById(id);
	}
	
	@PostMapping("/")
	public void save(@RequestBody Salle salle) {
		salleService.save(salle);
		

	}
	@GetMapping("/")
	public List<Salle> findAll() {
		return salleService.findAll();
	}

}
