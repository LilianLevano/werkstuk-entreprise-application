package com.werkstukentrepriseapplication.controller;

import com.werkstukentrepriseapplication.model.Evenement;
import com.werkstukentrepriseapplication.model.Locatie;
import com.werkstukentrepriseapplication.services.EvenementService;
import com.werkstukentrepriseapplication.services.LocatieService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LocatieController {

    private LocatieService locatieService;

    public LocatieController(LocatieService locatieService) {
        this.locatieService = locatieService;
    }

    @GetMapping("/locaties/new")
    public String newLocatie(Model model) {
        model.addAttribute("locatie", new Locatie());
        return "locaties/new";
    }


    @PostMapping("/locaties/new")
    public String locatieOpslaan(@Valid Locatie locatie, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "locaties/new";
        }

        locatieService.opslaan(locatie);

        return "redirect:/new";
    }
}
