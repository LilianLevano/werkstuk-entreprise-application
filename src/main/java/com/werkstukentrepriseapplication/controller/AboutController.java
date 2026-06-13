package com.werkstukentrepriseapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AboutController {

    @GetMapping("/about")
    public String about() { return "about"; }


}
