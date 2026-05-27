// LocatieRepository.java
package com.werkstukentrepriseapplication.repository;

import com.werkstukentrepriseapplication.model.Locatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocatieRepository extends JpaRepository<Locatie, Long> {}