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

import com.zsmart.parascolaire.bean.Club;
import com.zsmart.parascolaire.service.facade.ClubService;

@Controller
@RequestMapping("/parascolaire/Club")
@CrossOrigin(origins = { "http://localhost:4200" })
public class ClubRest {

	@Autowired
	private ClubService clubService;

	@GetMapping("/id/{id}")
	public Club findById(@PathVariable Long id) {
		return clubService.findById(id);
	}

	@GetMapping("/libelle/{libelle}/")
	public Club findByLibelle(@PathVariable String libelle) {
		return clubService.findByLibelle(libelle);
	}

	@GetMapping("/")
	public List<Club> findAll() {
		return clubService.findAll();
	}

	@PostMapping("/")
	public int save(@RequestBody Club club) {
		return clubService.save(club);
	}

	@DeleteMapping("/")
	@Transactional
	public int delete(@RequestBody Club club) {
		return clubService.delete(club);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void deleteById(@PathVariable Long id) {
		clubService.deleteById(id);
	}

	@DeleteMapping("/{libelle}")
	@Transactional
	public void deleteByLibelle(@PathVariable String libelle) {
		clubService.deleteByLibelle(libelle);
	}

    public ClubService getClubService() {
        return clubService;
    }

    public void setClubService(ClubService clubService) {
        this.clubService = clubService;
    }

        
}
