// EvenementRepository.java
package com.werkstukentrepriseapplication.repository;

import com.werkstukentrepriseapplication.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {

    // De 10 laatste op basis van tijdstip — Spring vertaalt de naam automatisch
    List<Evenement> findTop10ByOrderByTijdstipDesc();
}