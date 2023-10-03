package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.DetailProduit;
import tn.esprit.gestionmagazin.repositories.DetailProduitRepository;

import java.util.List;
@Service
public class DetailProduitService implements IDetailProduitService{

    DetailProduitRepository detailProduitRepository;
    public DetailProduitService(DetailProduitRepository detailProduitRepository){
        this.detailProduitRepository=detailProduitRepository;
    }
    @Override
    public DetailProduit ajouterDetailProduit(DetailProduit detailProduit) {
        return detailProduitRepository.save(detailProduit);
    }

    @Override
    public DetailProduit modifierDetailProduit(DetailProduit detailProduit) {
        return detailProduitRepository.save(detailProduit);
    }

    @Override
    public List<DetailProduit> afficherDetailProduits() {
        return detailProduitRepository.findAll();
    }

    @Override
    public DetailProduit afficherDetailProduit(long id) {
        return detailProduitRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerDetailProduit(long id) {
        detailProduitRepository.deleteById(id);
    }
}
