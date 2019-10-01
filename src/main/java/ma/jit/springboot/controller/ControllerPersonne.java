package ma.jit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.jit.springboot.entities.Personne;

@Controller
public class ControllerPersonne {
	@RequestMapping("/personne")
	public String getPersonne(Model model){
//		ModelAndView modelAndView = new ModelAndView();
		Personne personne = new Personne("issam","ismail", "ismail@gmail.com");
//		modelAndView.addObject("personnes", personne);
//		modelAndView.setViewName("hello");
		model.addAttribute("personnes",personne);
		return "personne";
	}

}
