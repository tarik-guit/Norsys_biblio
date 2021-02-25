package com.bibliotheque.biblio.BibliothequeServiceTest;

import com.bibliotheque.biblio.Entities.Livre;
import com.bibliotheque.biblio.Repositories.BibliothequeRepository;
import com.bibliotheque.biblio.Services.ServiceBibliothequeImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class BibliothequeSupprimerLivreParIdTest {

    @InjectMocks
    private ServiceBibliothequeImpl service;
    @Mock
    private BibliothequeRepository repository;

    @BeforeEach
    public void instantierService() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void shouldSupprimerLivreParId() {
        Livre livre = new Livre(1L, "livre1", "edition1", "tarik", 1200, "resume");
        doNothing().when(this.repository).deleteById(1L);
       String string = this.service.supprimerLivreParId(1L);
        assertEquals(string,"supprime");

        verify(repository, times(1)).deleteById(1L);
    }


}
