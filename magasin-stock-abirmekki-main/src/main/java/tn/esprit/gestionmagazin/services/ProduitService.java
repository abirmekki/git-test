package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.Produit;
import tn.esprit.gestionmagazin.repositories.ProduitRepository;

import java.util.List;
@Service
public class ProduitService implements IProduitService{
    ProduitRepository produitRepository;
    public ProduitService(ProduitRepository produitRepository){
        this.produitRepository=produitRepository;
    }

    @Override
    public Produit ajouterProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit modifierProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> afficherProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit afficherProduit(long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerProduit(long id) {
        produitRepository.deleteById(id);
    }
}
