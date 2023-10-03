package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.Produit;

import java.util.List;

public interface IProduitService {
    Produit ajouterProduit(Produit produit);
    Produit modifierProduit(Produit produit);
    List<Produit> afficherProduits();
    Produit afficherProduit(long id);
    void supprimerProduit(long id);
}
