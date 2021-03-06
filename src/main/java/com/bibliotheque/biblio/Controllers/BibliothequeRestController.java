package com.bibliotheque.biblio.Controllers;


import com.bibliotheque.biblio.Entities.Livre;
import com.bibliotheque.biblio.Repositories.BibliothequeRepository;
import com.bibliotheque.biblio.Services.ServiceBibliothequeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BibliothequeRestController {

    @Autowired
    private BibliothequeRepository rep;
    @Autowired
    private ServiceBibliothequeImpl service;




    @GetMapping("/livres")
    public List<Livre> recupererToutLivre(){
        return  this.service.recupererTousLivre();


    }

    @GetMapping("/livre/{id}")
    public Livre recupererLivreParId(@PathVariable Long id){
        return  this.service.recupererLivreParId(id);


    }

    @DeleteMapping("/livre/{id}")
    public String supprimerLivreParI(@PathVariable Long id){
        return  this.service.supprimerLivreParId(id);
    }

    @PostMapping("/creerlivre")
    public Livre create(@RequestBody Livre livre){
        return this.service.creerLivre(livre);


    }
    @PutMapping("/modifierlivre")
    public Livre modifierlivre(@RequestBody Livre livre){
        return this.service.modifierLivre(livre);


    }
}
