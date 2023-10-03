package tn.esprit.gestionmagazin.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idDetailFacture;
     int qte;
     float prixTotal;
     int pourcentageRemise;
     int montantRemise;
    @ManyToOne
     Produit produit;
    @ManyToOne
     Facture facture;

    public long getIdDetailFacture() {
        return idDetailFacture;
    }

    public void setIdDetailFacture(long idDetailFacture) {
        this.idDetailFacture = idDetailFacture;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public int getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(int pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public int getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(int montantRemise) {
        this.montantRemise = montantRemise;
    }

    @Override
    public String toString() {
        return "DetailFacture{" +
                "idDetailFacture=" + idDetailFacture +
                ", qte=" + qte +
                ", prixTotal=" + prixTotal +
                ", pourcentageRemise=" + pourcentageRemise +
                ", montantRemise=" + montantRemise +
                ", produit=" + produit +
                ", facture=" + facture +
                '}';
    }
}
