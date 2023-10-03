package tn.esprit.gestionmagazin.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idDetailProduit;
    @Temporal(TemporalType.DATE)
     Date dateCreation;
    @Temporal(TemporalType.DATE)
     Date dateDerniereModification;
    @Enumerated(EnumType.STRING)
     CategorieProduit categorieProduit;
    @OneToOne(mappedBy = "detailProduit")
     Produit produit;

    public long getIdDetailProduit() {
        return idDetailProduit;
    }

    public void setIdDetailProduit(long idDetailProduit) {
        this.idDetailProduit = idDetailProduit;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(Date dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }

    @Override
    public String toString() {
        return "DetailProduit{" +
                "idDetailProduit=" + idDetailProduit +
                ", dateCreation=" + dateCreation +
                ", dateDerniereModification=" + dateDerniereModification +
                ", categorieProduit=" + categorieProduit +
                ", produit=" + produit +
                '}';
    }
}
