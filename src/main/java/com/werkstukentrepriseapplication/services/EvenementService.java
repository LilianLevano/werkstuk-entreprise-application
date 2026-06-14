// EvenementService.java
package com.werkstukentrepriseapplication.services;

import com.werkstukentrepriseapplication.model.Evenement;
import com.werkstukentrepriseapplication.repository.EvenementRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EvenementService {

    private final EvenementRepository repository;

    public EvenementService(EvenementRepository repository) {
        this.repository = repository;
    }

    public List<Evenement> getLaatsteTien() {
        return repository.findTop10ByOrderByTijdstipDesc();
    }

    public Evenement getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Niet gevonden: " + id));
    }

    public void opslaan(Evenement evenement) {
        repository.save(evenement);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}