package com.zsmart.parascolaire.ws.rest.provided;

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

import com.zsmart.parascolaire.bean.Evenement;
import com.zsmart.parascolaire.service.facade.EvenementService;

@Controller
@RequestMapping("/parascolaire/Evenement")
@CrossOrigin(origins = { "http://localhost:4200" })
public class EvenementRest {

	@Autowired
	private EvenementService evenementService;

	@GetMapping("/id/{id}")
	public Evenement findById(@PathVariable Long id) {
		return evenementService.findById(id);
	}

	@GetMapping("/libelle/{libelle}/")
	public Evenement findByLibelle(@PathVariable String libelle) {
		return evenementService.findByLibelle(libelle);
	}

	@GetMapping("/")
	public List<Evenement> findAll() {
		return evenementService.findAll();
	}

	@PostMapping("/")
	public int save(@RequestBody Evenement evenement) {
		return evenementService.save(evenement);
	}

	@DeleteMapping("/")
	@Transactional
	public int delete(@RequestBody Evenement evenement) {
		return evenementService.delete(evenement);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void deleteById(@PathVariable Long id) {
		evenementService.deleteById(id);
	}

	@DeleteMapping("/{libelle}")
	@Transactional
	public void deleteByLibelle(@PathVariable String libelle) {
		evenementService.deleteByLibelle(libelle);
	}

    public EvenementService getEvenementService() {
        return evenementService;
    }

    public void setEvenementService(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

}
