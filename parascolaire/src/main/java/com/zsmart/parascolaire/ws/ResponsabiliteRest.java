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

import com.zsmart.parascolaire.bean.Responsabilite;
import com.zsmart.parascolaire.service.facade.ResponsabiliteService;

@Controller
@RequestMapping("parascolaire/Responsabilite")
public class ResponsabiliteRest {

	@Autowired
	private ResponsabiliteService responsabiliteService;

	@GetMapping("/id/{id}")
	public Responsabilite findById(@PathVariable Long id) {
		return responsabiliteService.findById(id);
	}

	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		responsabiliteService.deleteById(id);
	}

	@PostMapping("/")
	public void save(@RequestBody Responsabilite responsabilite) {
		responsabiliteService.save(responsabilite);

	}

	@GetMapping("/")
	public List<Responsabilite> findAll() {
		return responsabiliteService.findAll();
	}

}
