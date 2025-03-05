package com.maria.gestionemploidutemps.model;

import jakarta.persistence.*;

import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emploidutemps")
// Lombok génère automatiquement les getters, setters, toString, etc.
public class EmploiDuTemps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomCours;
    private String professeur;
    private LocalDateTime dateHeure;
    private String salle;

    // Constructeur par défaut généré par Lombok via l'annotation @Data
}
