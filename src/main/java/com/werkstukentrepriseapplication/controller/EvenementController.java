// EvenementController.java
package com.werkstukentrepriseapplication.controller;

import com.werkstukentrepriseapplication.model.Evenement;
import com.werkstukentrepriseapplication.services.EvenementService;
import com.werkstukentrepriseapplication.services.LocatieService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class EvenementController {

    private final EvenementService evenementService;
    private final LocatieService locatieService;

    public EvenementController(EvenementService evenementService, LocatieService locatieService) {
        this.evenementService = evenementService;
        this.locatieService = locatieService;
    }

    // Index — toont 10 laatste evenementen
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("evenementen", evenementService.getLaatsteTien());
        return "index";   // → templates/index.html
    }

    // Formulier openen
    @GetMapping("/new")
    public String nieuwFormulier(Model model) {
        model.addAttribute("evenement", new Evenement());
        model.addAttribute("locaties", locatieService.getAlleLocaties());
        return "events/new";     // → templates/new.html
    }

    // Formulier versturen
    @PostMapping("/new")
    public String nieuwOpslaan(@Valid @ModelAttribute Evenement evenement,
                               BindingResult result,
                               Model model) {
        if (result.hasErrors()) {
            // Validatie mislukt → formulier opnieuw tonen
            model.addAttribute("locaties", locatieService.getAlleLocaties());
            return "events/new";
        }
        evenementService.opslaan(evenement);
        return "redirect:/";  // Terug naar index
    }

    // Detailpagina
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("evenement", evenementService.getById(id));
        return "events/detail";  // → templates/detail.html
    }

    // About en contact
    @GetMapping("/about")
    public String about() { return "about"; }

    @GetMapping("/contact")
    public String contact() { return "contact"; }
}