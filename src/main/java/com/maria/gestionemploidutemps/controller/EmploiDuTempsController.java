package com.maria.gestionemploidutemps.controller;

import com.maria.gestionemploidutemps.model.EmploiDuTemps;
import com.maria.gestionemploidutemps.service.EmploiDuTempsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/emplois-du-temps")
public class EmploiDuTempsController {

    private final EmploiDuTempsService emploiDuTempsService;

    public EmploiDuTempsController(EmploiDuTempsService emploiDuTempsService) {
        this.emploiDuTempsService = emploiDuTempsService;
    }

    // Récupérer tous les emplois du temps
    @GetMapping
    public List<EmploiDuTemps> getAllEmploiDuTemps() {
        return emploiDuTempsService.getAllEmploiDuTemps();
    }

    // Récupérer un emploi du temps par ID
    @GetMapping("/{id}")
    public ResponseEntity<EmploiDuTemps> getEmploiDuTempsById(@PathVariable Long id) {
        Optional<EmploiDuTemps> emploiDuTemps = emploiDuTempsService.getEmploiDuTempsById(id);
        return emploiDuTemps.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Ajouter un nouvel emploi du temps
    @PostMapping
    public ResponseEntity<EmploiDuTemps> ajouterEmploiDuTemps(@RequestBody EmploiDuTemps emploiDuTemps) {
        EmploiDuTemps createdEmploiDuTemps = emploiDuTempsService.ajouterEmploiDuTemps(emploiDuTemps);
        return new ResponseEntity<>(createdEmploiDuTemps, HttpStatus.CREATED);
    }

    // Supprimer un emploi du temps
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerEmploiDuTemps(@PathVariable Long id) {
        emploiDuTempsService.supprimerEmploiDuTemps(id);
        return ResponseEntity.noContent().build();
    }
}
