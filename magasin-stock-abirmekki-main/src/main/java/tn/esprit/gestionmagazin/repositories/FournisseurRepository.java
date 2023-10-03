package tn.esprit.gestionmagazin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagazin.entities.Fournisseur;
import tn.esprit.gestionmagazin.entities.Produit;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long>  {
}
