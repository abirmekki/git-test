package tn.esprit.gestionmagazin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.gestionmagazin.entities.Produit;

/* public interface ProduitRepository extends CrudRepository<Produit,Long> {
}*/
/* public interface ProduitRepository extends PagingAndSortingRepository<Produit,Long> {
}*/
public interface ProduitRepository extends JpaRepository<Produit,Long> {
}