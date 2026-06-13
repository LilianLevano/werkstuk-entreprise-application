# Werkstuk Entreprise Application
**Anderlecht NGO — Evenementenbeheer**

Een Spring Boot webapplicatie voor het beheren van evenementen van de NGO Anderlecht. Gebruikers kunnen evenementen aanmaken, bekijken en locaties toevoegen via een gebruiksvriendelijke webinterface.

---

## Inhoudsopgave

- [Technologieën & Libraries](#technologieën--libraries)
- [Installatie & uitvoering](#installatie--uitvoering)
- [Gebruikte tutorials & documentatie](#gebruikte-tutorials--documentatie)
- [AI-gebruik](#ai-gebruik)

---

## Technologieën & Libraries

| Technologie | Versie | Gebruik |
|---|---|---|
| Java | 25 | Programmeertaal |
| Spring Boot | 4.0.6 | Backend framework |
| Spring Web MVC | (via Boot) | Controllers & routing |
| Spring Data JPA | (via Boot) | Database toegang via Hibernate |
| Thymeleaf | (via Boot) | HTML templating engine |
| Spring Boot Validation | (via Boot) | Formuliervalidatie (`@Valid`, `@NotBlank`, ...) |
| Spring Boot Mail | (via Boot) | E-mail versturen via contactformulier |
| H2 Database | (via Boot) | In-file database (`data/ngodb.mv.db`) |
| Spring Boot DevTools | (via Boot) | Hot reload tijdens ontwikkeling |
| Tailwind CSS | CDN (v3) | Frontend styling |
| Apache Maven | 3.9.16 | Build tool & dependency management |


---

## Installatie & uitvoering

### Vereisten

- **Java 21+** geïnstalleerd ([download](https://adoptium.net/))
- **Maven** (of gebruik de meegeleverde `mvnw`)
- **IntelliJ IDEA** (aanbevolen) of een andere IDE

### Stappen

**1. Repository klonen**
```bash
git clone <repository-url>
cd werkstuk-entreprise-application
```

**2. Project uitvoeren**

Via Maven Wrapper (geen Maven-installatie nodig):
```bash
# Linux / macOS
./mvn spring-boot:run

# Windows
mvn spring-boot:run
```

Via IntelliJ:
- Open het project
- Wacht tot Maven de dependencies downloadt
- Klik op de groene ▶ knop of druk `Shift+F10`

**3. Applicatie openen**

Ga naar [http://localhost:8080](http://localhost:8080) in de browser.

### Database resetten

De database wordt opgeslagen in `data/ngodb.mv.db`. Om te resetten, verwijder dit bestand en herstart de applicatie — de `DataLoader` vult automatisch voorbeelddata in.

---

## Gebruikte tutorials & documentatie

| Bron | Onderwerp |
|---|---|
| [Spring Boot officiële docs](https://docs.spring.io/spring-boot/docs/current/reference/html/) | Algemene Spring Boot configuratie |
| [Spring MVC docs](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html) | Controllers, routing, formulieren |
| [Thymeleaf documentatie](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html) | Templating, `th:field`, `th:each`, fragmenten |
| [Tailwind CSS docs](https://tailwindcss.com/docs) | Frontend styling via CDN |



---

## AI-gebruik

Tijdens de ontwikkeling van dit project werd **Claude (Anthropic)** gebruikt als hulpmiddel. Hieronder een overzicht van de chats:

- Chat log om fundamentele concepten van Spring Boot te leren: https://claude.ai/share/c6e7cfbe-7a90-4b53-93b0-4553c3d73784

> De AI werd gebruikt voor het opsporen van bugs en het uitleggen van concepten. Alle code werd begrepen, aangepast en geïntegreerd door de student zelf.