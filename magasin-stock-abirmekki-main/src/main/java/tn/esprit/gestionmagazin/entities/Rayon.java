package tn.esprit.gestionmagazin.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idRayon;
     String codeRayon;
     String libelleRayon;
    @OneToMany(mappedBy = "rayon")
     List<Produit> produits;

    public long getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(long idRayon) {
        this.idRayon = idRayon;
    }

    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public String getLibelleRayon() {
        return libelleRayon;
    }

    public void setLibelleRayon(String libelleRayon) {
        this.libelleRayon = libelleRayon;
    }

    @Override
    public String toString() {
        return "Rayon{" +
                "idRayon=" + idRayon +
                ", codeRayon='" + codeRayon + '\'' +
                ", libelleRayon='" + libelleRayon + '\'' +
                ", produits=" + produits +
                '}';
    }
}
