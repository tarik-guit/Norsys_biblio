package com.bibliotheque.biblio.Services;

import com.bibliotheque.biblio.Entities.Livre;
import com.bibliotheque.biblio.Repositories.BibliothequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiceBibliothequeImpl implements ServiceBibliotheque {

    @Autowired
    private BibliothequeRepository repository;


    @Override
    public Livre creerLivre(Livre livre) {
        return repository.save(livre);
    }

    @Override
    public List<Livre> recupererTousLivre() {
        return repository.findAll();
    }

    @Override
    public Livre recupererLivreParId(long id) {
        return repository.findById(id).get();
    }

    @Override
    public String supprimerLivreParId(long id) {
       this.repository.deleteById(id);
        return "supprime";
    }

    @Override
    public Livre modifierLivre(Livre livre) {

        return repository.save(livre);
    }

}
