package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    Fournisseur ajouterFournisseur(Fournisseur fournisseur);
    Fournisseur modifierFournisseur(Fournisseur fournisseur);
    List<Fournisseur> afficherFournisseurs();
    Fournisseur afficherFournisseur(long id);
    void supprimerFournisseur(long id);
}
