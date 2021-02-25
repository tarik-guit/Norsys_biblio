package com.bibliotheque.biblio.Entities;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Livre implements Serializable {


    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nom;
    @Column
    private String edition;
    @Column
    private String auteur;
    @Column
    private int prix;
    @Column
    private String resume;
}
