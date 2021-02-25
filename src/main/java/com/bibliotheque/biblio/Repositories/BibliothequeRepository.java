package com.bibliotheque.biblio.Repositories;

import com.bibliotheque.biblio.Entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface BibliothequeRepository extends JpaRepository<Livre,Long> {


}
