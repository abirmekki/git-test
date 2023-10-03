package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.Facture;

import java.util.List;

public interface IFactureService {
    Facture ajouterFacture(Facture facture);
    Facture modifierFacture(Facture facture);
    List<Facture> afficherFactures();
    Facture afficherFacture(long id);
    void supprimerFacture(long id);
}
