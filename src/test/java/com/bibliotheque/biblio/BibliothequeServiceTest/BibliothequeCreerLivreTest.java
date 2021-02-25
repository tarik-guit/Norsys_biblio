package com.bibliotheque.biblio.BibliothequeServiceTest;

import com.bibliotheque.biblio.Entities.Livre;

import com.bibliotheque.biblio.Repositories.BibliothequeRepository;
import com.bibliotheque.biblio.Services.ServiceBibliothequeImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

public class BibliothequeCreerLivreTest {
    @InjectMocks
    private ServiceBibliothequeImpl service;
    @Mock
    private BibliothequeRepository repository;

    @BeforeEach
    public void instantierService() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void shouldCreerLivre() {
        Livre livre = new Livre(null, "livre1", "edition1", "tarik", 1200, "resume");
        when(this.repository.save(any())).thenReturn(livre);
        Livre livre1 = this.service.creerLivre(any());
        assertNotNull(livre1);

        verify(repository, times(1)).save(any());
    }


}

