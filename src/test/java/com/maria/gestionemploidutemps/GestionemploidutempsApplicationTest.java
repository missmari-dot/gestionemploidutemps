package com.maria.gestionemploidutemps;

import com.maria.gestionemploidutemps.model.EmploiDuTemps;
import com.maria.gestionemploidutemps.repository.EmploiDuTempsRepository;
import com.maria.gestionemploidutemps.service.EmploiDuTempsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GestionemploidutempsApplicationTest {

	@Mock
	private EmploiDuTempsRepository emploiDuTempsRepository;

	@InjectMocks
	private EmploiDuTempsService emploiDuTempsService;

	@BeforeEach
	void setUp() {
		// Initialisation avant chaque test (optionnel)
	}


	@Test
	void testGetAllEmploiDuTemps() {
		// Simuler un retour vide de la base de données
		when(emploiDuTempsRepository.findAll()).thenReturn(new ArrayList<>());

		// Appeler le service
		List<EmploiDuTemps> emplois = emploiDuTempsService.getAllEmploiDuTemps();

		// Vérifications
		assertNotNull(emplois); // Vérifie que la liste retournée n'est pas nulle
		assertEquals(0, emplois.size()); // Vérifie que la liste est bien vide
	}

}
