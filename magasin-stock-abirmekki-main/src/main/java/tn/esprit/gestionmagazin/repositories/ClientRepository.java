package tn.esprit.gestionmagazin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagazin.entities.Client;
import tn.esprit.gestionmagazin.entities.Produit;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
