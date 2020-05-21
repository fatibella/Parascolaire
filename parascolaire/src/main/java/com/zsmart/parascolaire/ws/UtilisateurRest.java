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

import com.zsmart.parascolaire.bean.Utilisateur;
import com.zsmart.parascolaire.service.facade.UtilisateurService;

@Controller
@RequestMapping("parascolaire/utilisateur")
public class UtilisateurRest {

	@Autowired
	private UtilisateurService utilisateurService;

	@GetMapping("/id/{id}")
	public Utilisateur findById(@PathVariable Long id) {
		return utilisateurService.findById(id);
	}

	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		utilisateurService.deleteById(id);
	}

	@PostMapping("/")
	public void save(@RequestBody Utilisateur utilisateur) {
		utilisateurService.save(utilisateur);

	}

	@GetMapping("/")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

}
