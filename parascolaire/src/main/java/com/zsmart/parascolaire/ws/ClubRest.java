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

import com.zsmart.parascolaire.bean.Club;
import com.zsmart.parascolaire.model.facade.ClubService;

@Controller
@RequestMapping("parascolaire/club")
public class ClubRest {
	

	@Autowired
	private ClubService clubService;
	
	@GetMapping("/id/{id}")
	public Club findById(@PathVariable int id) {
		return clubService.findById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public int deleteById(@PathVariable int id) {
		return clubService.deleteById(id);
	}
	
	@PostMapping("/")
	public void save(@RequestBody Club club) {
		clubService.save(club);
		

	}
	@GetMapping("/")
	public List<Club> findAll() {
		return clubService.findAll();
	}
	

}
