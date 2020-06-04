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

import com.zsmart.parascolaire.bean.EvenementConsommation;
import com.zsmart.parascolaire.service.facade.ClubService;
import com.zsmart.parascolaire.service.facade.EvenementConsommationService;

@Controller
@RequestMapping("/parascolaire/EvenementConsommation")
@CrossOrigin(origins = { "http://localhost:4200" })
public class EvenementConsommationRest {

	@Autowired
	private EvenementConsommationService evenementConsommationService;

	@GetMapping("/id/{id}")
	public EvenementConsommation findById(@PathVariable Long id) {
		return evenementConsommationService.findById(id);
	}

	@GetMapping("/")
	public List<EvenementConsommation> findAll() {
		return evenementConsommationService.findAll();
	}

	@PostMapping("/")
	public int save(@RequestBody EvenementConsommation evenementConsommation) {
		return evenementConsommationService.save(evenementConsommation);
	}

	@DeleteMapping("/")
	@Transactional
	public int delete(@RequestBody EvenementConsommation evenementConsommation) {
		return evenementConsommationService.delete(evenementConsommation);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void deleteById(@PathVariable Long id) {
		evenementConsommationService.deleteById(id);
	}

    public EvenementConsommationService getEvenementConsommationService() {
        return evenementConsommationService;
    }

    public void setEvenementConsommationService(EvenementConsommationService evenementConsommationService) {
        this.evenementConsommationService = evenementConsommationService;
    }

}
