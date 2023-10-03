package tn.esprit.gestionmagazin.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idFacture;
     float montantRemise;
     float montantFacture;
    @Temporal(TemporalType.DATE)
     Date dateFacture;
     boolean active;
    @OneToMany(mappedBy = "facture")
     List<DetailFacture> detailFactures;
    @ManyToOne
     Client client;

    public long getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(long idFacture) {
        this.idFacture = idFacture;
    }

    public float getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(float montantRemise) {
        this.montantRemise = montantRemise;
    }

    public float getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(float montantFacture) {
        this.montantFacture = montantFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "idFacture=" + idFacture +
                ", montantRemise=" + montantRemise +
                ", montantFacture=" + montantFacture +
                ", dateFacture=" + dateFacture +
                ", active=" + active +
                ", detailFactures=" + detailFactures +
                ", client=" + client +
                '}';
    }
}
