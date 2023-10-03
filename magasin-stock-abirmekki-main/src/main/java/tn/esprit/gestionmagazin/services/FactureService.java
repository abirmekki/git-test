package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.Facture;
import tn.esprit.gestionmagazin.repositories.FactureRepository;

import java.util.List;
@Service
public class FactureService implements IFactureService{

    FactureRepository factureRepository;
    public FactureService(FactureRepository factureRepository){
        this.factureRepository=factureRepository;
    }

    @Override
    public Facture ajouterFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture modifierFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public List<Facture> afficherFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture afficherFacture(long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerFacture(long id) {
        factureRepository.deleteById(id);
    }
}
