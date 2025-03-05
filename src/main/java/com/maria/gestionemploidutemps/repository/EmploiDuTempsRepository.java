package com.maria.gestionemploidutemps.repository;

import com.maria.gestionemploidutemps.model.EmploiDuTemps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploiDuTempsRepository extends JpaRepository<EmploiDuTemps, Long> {
    // Tu peux ajouter des méthodes spécifiques à ta logique de gestion si nécessaire
}
