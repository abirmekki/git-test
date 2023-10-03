package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.Rayon;

import java.util.List;

public interface IRayonService {
    Rayon ajouterRayon(Rayon rayon);
    Rayon modifierRayon(Rayon rayon);
    List<Rayon> afficherRayons();
    Rayon afficherRayon(long id);
    void supprimerRayon(long id);
}
