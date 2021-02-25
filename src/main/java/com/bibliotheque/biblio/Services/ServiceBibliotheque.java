package com.bibliotheque.biblio.Services;

import com.bibliotheque.biblio.Entities.Livre;

import java.util.List;

public interface ServiceBibliotheque {

    public Livre creerLivre(Livre livre);

    List<Livre> recupererTousLivre();

    Livre recupererLivreParId(long l);


    String supprimerLivreParId(long l);

    Livre modifierLivre(Livre livre);
}
