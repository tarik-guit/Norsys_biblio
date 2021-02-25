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

public class BibliothequeRecupererByIDTest {


    @InjectMocks
    private ServiceBibliothequeImpl service;
    @Mock
    private BibliothequeRepository repository;

    @BeforeEach
    public void instantierService() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void shouldRecupererLivreParId() {
        Livre livre = new Livre(1L, "livre1", "edition1", "tarik", 1200, "resume");
        when(this.repository.findById(1L)).thenReturn(java.util.Optional.of(livre));
        Livre livre1 = this.service.recupererLivreParId(1L);
        assertEquals(livre1,livre);

        verify(repository, times(1)).findById(1L);
    }

    @Test
    public void shouldRecupererLivreParId2() {
        Livre livre = new Livre(2L, "livre1", "edition1", "tarik", 1200, "resume");
        when(this.repository.findById(2L)).thenReturn(java.util.Optional.of(livre));
        Livre livre1 = this.service.recupererLivreParId(2L);
        assertEquals(livre1.getId(),2);

        verify(repository, times(1)).findById(2L);
    }
}
