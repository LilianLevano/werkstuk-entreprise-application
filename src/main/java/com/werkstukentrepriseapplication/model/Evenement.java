package com.werkstukentrepriseapplication.model;

import com.werkstukentrepriseapplication.model.Locatie;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "evenementen")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Titel is verplicht")
    private String titel;

    @NotBlank(message = "Omschrijving is verplicht")
    private String omschrijving;

    @NotNull(message = "Tijdstip is verplicht")
    private LocalDateTime tijdstip;

    @NotBlank(message = "Organisatie is verplicht")
    private String organisatie;

    @NotBlank(message = "E-mailadres is verplicht")
    @Email(message = "Geen geldig e-mailadres")
    private String mailContactpersoon;

    // Relatie naar Locatie — @ManyToOne = veel evenementen, één locatie
    @ManyToOne
    @JoinColumn(name = "locatie_id")   // kolom in de evenementen-tabel
    @NotNull(message = "Locatie is verplicht")
    private Locatie locatie;

    public Evenement() {}

    // Getters en setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    public String getOmschrijving() { return omschrijving; }
    public void setOmschrijving(String omschrijving) { this.omschrijving = omschrijving; }

    public LocalDateTime getTijdstip() { return tijdstip; }
    public void setTijdstip(LocalDateTime tijdstip) { this.tijdstip = tijdstip; }

    public String getOrganisatie() { return organisatie; }
    public void setOrganisatie(String organisatie) { this.organisatie = organisatie; }

    public String getMailContactpersoon() { return mailContactpersoon; }
    public void setMailContactpersoon(String mail) { this.mailContactpersoon = mail; }

    public Locatie getLocatie() { return locatie; }
    public void setLocatie(Locatie locatie) { this.locatie = locatie; }
}