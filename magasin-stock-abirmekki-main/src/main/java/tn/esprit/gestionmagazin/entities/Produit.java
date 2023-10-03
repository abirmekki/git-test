package tn.esprit.gestionmagazin.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @ManyToMany
    private List<Fournisseur> fournisseurs;
    @ManyToOne
    private Rayon rayon;
    @ManyToOne
    private Stock stock;
    @OneToOne
    private DetailProduit detailProduit;
    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;

    public long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(long idProduit) {
        this.idProduit = idProduit;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {

        this.prixUnitaire = prixUnitaire;
        this.prixUnitaire = prixUnitaire;
    }
    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", codeProduit='" + codeProduit + '\'' +
                ", libelleProduit='" + libelleProduit + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", fournisseurs=" + fournisseurs +
                ", rayon=" + rayon +
                ", stock=" + stock +
                ", detailProduit=" + detailProduit +
                ", detailFactures=" + detailFactures +
                '}';
    }
}
