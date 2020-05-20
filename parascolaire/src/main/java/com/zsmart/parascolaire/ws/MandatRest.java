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

import com.zsmart.parascolaire.bean.Mandat;

import com.zsmart.parascolaire.model.facade.MandatService;


@Controller
@RequestMapping("parascolaire/mandat")
public class MandatRest {
	
	@Autowired
	private MandatService mandatService;
	
	@GetMapping("/id/{id}")
	public Mandat findById(@PathVariable int id) {
		return mandatService.findById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable int id) {
		return mandatService.deleteById(id);
	}
	
	@PostMapping("/")
	public void save(@RequestBody Mandat mandat) {
		mandatService.save(mandat);
		

	}
	@GetMapping("/")
	public List<Mandat> findAll() {
		return mandatService.findAll();
	}

}
