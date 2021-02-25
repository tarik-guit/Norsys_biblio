package com.bibliotheque.biblio.BibliothequeServiceTest;

import com.bibliotheque.biblio.Entities.Livre;
import com.bibliotheque.biblio.Repositories.BibliothequeRepository;
import com.bibliotheque.biblio.Services.ServiceBibliothequeImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class BibliothequeRecupererToutLesLivres {

    @InjectMocks
    private ServiceBibliothequeImpl service;
    @Mock
    private BibliothequeRepository repository;

    @BeforeEach
    public void instantierService() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void shouldRecupererTousLivre() {
        Livre livre1 = new Livre(null, "livre1", "edition1", "tarik", 1200, "resume");
        Livre livre2 = new Livre(null, "livre2", "edition2", "tarik2", 4100, "resume2");
       List<Livre> list = new ArrayList();
       list.add(livre1);
        list.add(livre2);
        when(this.repository.findAll()).thenReturn(list);
        List<Livre> list2 = this.service.recupererTousLivre();
        assertNotNull(list2);

        verify(repository, times(1)).findAll();
    }

}
