package com.werkstukentrepriseapplication.controller;

import com.werkstukentrepriseapplication.model.Evenement;
import com.werkstukentrepriseapplication.services.EvenementService;
import com.werkstukentrepriseapplication.services.LocatieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class LocatieController {

    private LocatieService locatieService;

    public LocatieController(LocatieService locatieService) {
        this.locatieService = locatieService;
    }

    @GetMapping("/locatie/new")
    public String newLocatie() {
        return "locatie/newLocatie";
    }
}
