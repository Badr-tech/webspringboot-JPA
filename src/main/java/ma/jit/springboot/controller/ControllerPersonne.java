package ma.jit.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.jit.springboot.dao.IPersonneDaoJpa;
import ma.jit.springboot.entities.Personne;
import ma.jit.springboot.service.IServiceJpa;

@Controller
public class ControllerPersonne {
	@Autowired
	IServiceJpa service;
	@RequestMapping("/resultat")
	public String getPersonne(Model model, @RequestParam("firstName") String nom, @RequestParam("lastName") String prenom, @RequestParam("email") String email){
//		ModelAndView modelAndView = new ModelAndView();
	Personne personne = new Personne(nom,prenom,email);
//		modelAndView.addObject("personnes", personne);
//		modelAndView.setViewName("hello");
		model.addAttribute("personnes", personne);
		 service.create(personne);
		 
		return "resultat";
	}
	@RequestMapping("/personne")
	public String nextpage() {
		return "personne";
	}
	@RequestMapping("/allpersonne")
	public String findAllpersonne(Model model, @RequestParam("page") int page,@RequestParam("size") int size) {
		  List<Personne> mylist = service.findAll(page,size);
		  model.addAttribute("mylists",mylist);
		  
		return "resultatall";
		
		
	}

}
