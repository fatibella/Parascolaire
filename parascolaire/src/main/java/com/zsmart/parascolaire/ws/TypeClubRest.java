package com.zsmart.parascolaire.ws;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsmart.parascolaire.bean.TypeClub;
import com.zsmart.parascolaire.service.facade.TypeClubService;

@Controller
@RequestMapping("/parascolaire/TypeClub")
@CrossOrigin(origins = { "http://localhost:4200" })
public class TypeClubRest {

	@Autowired
	private TypeClubService typeClubService;

	@GetMapping("/id/{id}")
	public TypeClub findById(@PathVariable Long id) {
		return typeClubService.findById(id);
	}

	@GetMapping("/libelle/{libelle}/")
	public TypeClub findByLibelle(@PathVariable String libelle) {
		return typeClubService.findByLibelle(libelle);
	}

	@GetMapping("/")
	public List<TypeClub> findAll() {
		return typeClubService.findAll();
	}

	@PostMapping("/")
	public int save(@RequestBody TypeClub typeClub) {
		return typeClubService.save(typeClub);
	}

	@DeleteMapping("/")
	@Transactional
	public int delete(@RequestBody TypeClub typeClub) {
		return typeClubService.delete(typeClub);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void deleteById(@PathVariable Long id) {
		typeClubService.deleteById(id);
	}

	@DeleteMapping("/{libelle}")
	@Transactional
	public void deleteByLibelle(@PathVariable String libelle) {
		typeClubService.deleteByLibelle(libelle);
	}

}
