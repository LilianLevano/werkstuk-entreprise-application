package com.werkstukentrepriseapplication;

import com.werkstukentrepriseapplication.model.Evenement;
import com.werkstukentrepriseapplication.model.Locatie;
import com.werkstukentrepriseapplication.repository.EvenementRepository;
import com.werkstukentrepriseapplication.repository.LocatieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final LocatieRepository locatieRepo;
    private final EvenementRepository evenementRepo;

    public DataLoader(LocatieRepository locatieRepo, EvenementRepository evenementRepo) {
        this.locatieRepo = locatieRepo;
        this.evenementRepo = evenementRepo;
    }

    @Override
    public void run(String... args) {
        Locatie l1 = new Locatie();
        l1.setNaam("Campus Kaai");
        l1.setAdres("Quai des Usines 6, 1000 Brussel");
        l1.setCapaciteit(200);
        locatieRepo.save(l1);

        Evenement e1 = new Evenement();
        e1.setTitel("Buurtfeest Anderlecht");
        e1.setOmschrijving("Jaarlijks buurtfeest voor alle bewoners.");
        e1.setTijdstip(LocalDateTime.now().plusDays(10));
        e1.setOrganisatie("NGO Anderlecht");
        e1.setMailContactpersoon("info@ngo-anderlecht.be");
        e1.setLocatie(l1);
        evenementRepo.save(e1);
    }
}