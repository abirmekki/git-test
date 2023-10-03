package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.DetailProduit;
import tn.esprit.gestionmagazin.entities.DetailProduit;

import java.util.List;

public interface IDetailProduitService {
    DetailProduit ajouterDetailProduit(DetailProduit detailProduit);
    DetailProduit modifierDetailProduit(DetailProduit detailProduit);
    List<DetailProduit> afficherDetailProduits();
    DetailProduit afficherDetailProduit(long id);
    void supprimerDetailProduit(long id);
}
