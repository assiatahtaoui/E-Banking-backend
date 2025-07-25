# 💳 E-Banking Backend API - Spring Boot

Ce projet est une application **E-banking** développée avec **Spring Boot**, offrant des services RESTful pour la gestion des comptes bancaires, des clients et des opérations (crédit, débit , virement).

## 🧾 Fonctionnalités principales

- 🔐 Authentification et autorisation via Spring Security (JWT)
- 🧑‍💼 Gestion des clients (CRUD)
- 🏦 Gestion des comptes bancaires (courant / épargne)
- 💸 Opérations bancaires : crédit, débit, virement
- 📊 Consultation des historiques de transactions
- 🌐 API REST bien structurée avec documentation Swagger/OpenAPI

---

## 🛠️ Stack technique

- Java 21
- Spring Boot 3+
- Spring Data JPA
- Spring Security + JWT
- Hibernate
- H2 / MySQL (selon profil)
- Swagger UI / OpenAPI
- Maven
- Lombok
- MapStruct (pour le mapping DTO <-> Entités)

---

## 📁 Architecture

```bash
src
└── main
    ├── java
    │   └── ma.enset.ebanking
    │       ├── controller      # API REST Controllers
    │       ├── service         # Business logic
    │       ├── repository      # Spring Data JPA Repositories
    │       ├── dto             # Data Transfer Objects
    │       ├── mapper          # DTO <-> Entity mapping
    │       ├── entity          # JPA Entities
    │       └── security        # Configuration JWT, filters, user details
    └── resources
        ├── application.properties
        └── data.sql / schema.sql (si nécessaire)
