package com.oc.moko.lade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oc.moko.lade.repository.UtilisateurRepository;

@Controller
public class UtilisateurController {
	
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @RequestMapping("/liste_utilisateurs")
    public String home(Model model) {
         model.addAttribute("liste_utilisateurs", utilisateurRepository.findAll());
         return "index";
    }
}
