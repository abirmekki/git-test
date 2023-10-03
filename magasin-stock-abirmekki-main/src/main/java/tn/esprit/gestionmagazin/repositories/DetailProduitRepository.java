package tn.esprit.gestionmagazin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagazin.entities.DetailFacture;
import tn.esprit.gestionmagazin.entities.DetailProduit;

public interface DetailProduitRepository extends JpaRepository<DetailProduit,Long> {
}
