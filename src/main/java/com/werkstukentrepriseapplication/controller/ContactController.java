// ContactController.java
package com.werkstukentrepriseapplication.controller;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    private final JavaMailSender mailSender;

    public ContactController(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @GetMapping("/contact")
    public String contact() { return "contact"; }

    @PostMapping("/contact")
    public String verstuur(@RequestParam String naam,
                           @RequestParam String email,
                           @RequestParam String bericht) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("lilian.levano6@gmail.com");
        mail.setSubject("Nieuw bericht van " + naam);
        mail.setText("Van: " + naam + " <" + email + ">\n\n" + bericht);
        mailSender.send(mail);

        return "redirect:/contact?verzonden=true";
    }
}