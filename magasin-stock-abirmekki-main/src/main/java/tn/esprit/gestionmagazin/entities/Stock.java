package tn.esprit.gestionmagazin.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idStock;
     int qteStock;
     int qteMin;
     String libelleStock;
    @OneToMany(mappedBy = "stock")
     List<Produit> produits;

    public long getIdStock() {
        return idStock;
    }

    public void setIdStock(long idStock) {
        this.idStock = idStock;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public int getQteMin() {
        return qteMin;
    }

    public void setQteMin(int qteMin) {
        this.qteMin = qteMin;
    }

    public String getLibelleStock() {
        return libelleStock;
    }

    public void setLibelleStock(String libelleStock) {
        this.libelleStock = libelleStock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "idStock=" + idStock +
                ", qteStock=" + qteStock +
                ", qteMin=" + qteMin +
                ", libelleStock='" + libelleStock + '\'' +
                ", produits=" + produits +
                '}';
    }
}
