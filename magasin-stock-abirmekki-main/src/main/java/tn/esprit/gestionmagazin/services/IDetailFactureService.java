package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.DetailFacture;

import java.util.List;

public interface IDetailFactureService {
    DetailFacture ajouterDetailFacture(DetailFacture detailFacture);
    DetailFacture modifierDetailFacture(DetailFacture detailFacture);
    List<DetailFacture> afficherDetailFacture();
    DetailFacture afficherDetailFacture(long id);
    void supprimerDetailFacture(long id);
}
