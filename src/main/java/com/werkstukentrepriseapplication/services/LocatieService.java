// LocatieService.java
package com.werkstukentrepriseapplication.services;

import com.werkstukentrepriseapplication.model.Evenement;
import com.werkstukentrepriseapplication.model.Locatie;
import com.werkstukentrepriseapplication.repository.LocatieRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocatieService {

    private final LocatieRepository repository;

    public LocatieService(LocatieRepository repository) {
        this.repository = repository;
    }

    public List<Locatie> getAlleLocaties() {
        return repository.findAll();
    }

    public void opslaan(Locatie locatie) {
        repository.save(locatie);
    }
}