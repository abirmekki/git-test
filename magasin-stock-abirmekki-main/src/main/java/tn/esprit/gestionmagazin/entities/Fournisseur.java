package tn.esprit.gestionmagazin.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idFournisseur;
     String codeFournisseur;
     String libelleFournisseur;

    public long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getCodeFournisseur() {
        return codeFournisseur;
    }

    public void setCodeFournisseur(String codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public String getLibelleFournisseur() {
        return libelleFournisseur;
    }

    public void setLibelleFournisseur(String libelleFournisseur) {
        this.libelleFournisseur = libelleFournisseur;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "idFournisseur=" + idFournisseur +
                ", codeFournisseur='" + codeFournisseur + '\'' +
                ", libelleFournisseur='" + libelleFournisseur + '\'' +
                '}';
    }
}
