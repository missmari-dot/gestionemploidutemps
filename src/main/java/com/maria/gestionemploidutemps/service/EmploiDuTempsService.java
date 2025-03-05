package com.maria.gestionemploidutemps.service;

import com.maria.gestionemploidutemps.model.EmploiDuTemps;
import com.maria.gestionemploidutemps.repository.EmploiDuTempsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmploiDuTempsService {

    private final EmploiDuTempsRepository emploiDuTempsRepository;

    public EmploiDuTempsService(EmploiDuTempsRepository emploiDuTempsRepository) {
        this.emploiDuTempsRepository = emploiDuTempsRepository;
    }

    // Récupérer tous les emplois du temps
    public List<EmploiDuTemps> getAllEmploiDuTemps() {
        return emploiDuTempsRepository.findAll();
    }

    // Récupérer un emploi du temps par ID
    public Optional<EmploiDuTemps> getEmploiDuTempsById(Long id) {
        return emploiDuTempsRepository.findById(id);
    }

    // Ajouter un emploi du temps
    public EmploiDuTemps ajouterEmploiDuTemps(EmploiDuTemps emploiDuTemps) {
        return emploiDuTempsRepository.save(emploiDuTemps);
    }

    // Supprimer un emploi du temps par ID
    public void supprimerEmploiDuTemps(Long id) {
        emploiDuTempsRepository.deleteById(id);
    }
}
