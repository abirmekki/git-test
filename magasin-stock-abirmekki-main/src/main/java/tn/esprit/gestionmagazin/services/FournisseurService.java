package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.Fournisseur;
import tn.esprit.gestionmagazin.repositories.FournisseurRepository;

import java.util.List;
@Service
public class FournisseurService implements IFournisseurService{
    FournisseurRepository fournisseurRepository;
    public FournisseurService(FournisseurRepository fournisseurRepository){
        this.fournisseurRepository=fournisseurRepository;
    }

    @Override
    public Fournisseur ajouterFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur modifierFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public List<Fournisseur> afficherFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur afficherFournisseur(long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerFournisseur(long id) {
        fournisseurRepository.deleteById(id);
    }
}
