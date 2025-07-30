# 🧑‍💼 JobPortal Webanwendung (Spring Boot)

Dies ist eine vollständige Webanwendung zur Verwaltung von Jobangeboten, Bewerbungen und Benutzerprofilen — entwickelt mit **Spring Boot**, **Thymeleaf**, **Hibernate (JPA)** und **MySQL**. Sie ermöglicht Unternehmen, Stellenangebote zu erstellen, und Bewerbern, sich zu registrieren und zu bewerben.

## 🔧 Technologien

- Java 21
- Spring Boot 3.x
- Spring Security
- Thymeleaf
- Spring Data JPA (Hibernate)
- MySQL / H2
- Maven

## ✨ Funktionen

### 👨‍💼 Bewerber (Jobseeker)
- Registrierung und Login
- Lebenslauf und Profilfoto hochladen
- Auf Stellen bewerben
- Gespeicherte Jobs verwalten

### 🏢 Recruiter
- Registrierung und Login
- Firmenprofil erstellen mit Logo
- Jobanzeigen erstellen, bearbeiten und löschen
- Bewerbungen einsehen

### 🔐 Sicherheit
- Passwortverschlüsselung mit BCrypt
- Rollenbasiertes Login (Recruiter / Jobseeker)
- Individueller Authentifizierungs-Handler

## 📁 Projektstruktur

```bash
src
├── controller        # Webcontroller (MVC)
├── entity            # JPA-Entitäten
├── repository        # Spring Data JPA Repositories
├── config            # Sicherheit & Konfiguration
├── templates         # Thymeleaf-HTML-Seiten
└── static            # CSS, JS, Bilder

```


▶️ Projekt starten

Voraussetzungen
JDK 21

Maven

MySQL (mit Schema jobportal)

🧠 Motivation
Dieses Projekt wurde im Rahmen des folgenden Udemy-Kurses erstellt und weiterentwickelt:

📚 Spring Boot Project - Job Portal Web App

Es dient als Portfolio-Projekt zur Demonstration von Kenntnissen in Spring Boot, JPA, Thymeleaf und Webentwicklung mit Java.

🛠 Autor: Radosław Debosz
