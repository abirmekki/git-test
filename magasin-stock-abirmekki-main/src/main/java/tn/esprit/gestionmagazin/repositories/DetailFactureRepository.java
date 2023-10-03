package tn.esprit.gestionmagazin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagazin.entities.DetailFacture;
import tn.esprit.gestionmagazin.entities.Produit;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
