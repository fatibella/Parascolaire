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

import com.zsmart.parascolaire.bean.Club;
import com.zsmart.parascolaire.service.facade.ClubService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("cette end point permet de gerer les clubs")
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

	@ApiOperation("cette methode permet de find all clubs")
	@GetMapping("/")
	public List<Club> findAll() { 
		return clubService.findAll();
	}
	@ApiOperation("cette methode permet de save all clubs")
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
