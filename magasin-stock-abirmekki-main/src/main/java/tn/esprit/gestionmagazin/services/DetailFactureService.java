package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.DetailFacture;
import tn.esprit.gestionmagazin.repositories.ClientRepository;
import tn.esprit.gestionmagazin.repositories.DetailFactureRepository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
@Service
public class DetailFactureService implements IDetailFactureService{

    tn.esprit.gestionmagazin.repositories.DetailFactureRepository DetailFactureRepository;

    public DetailFactureService(DetailFactureRepository DetailFactureRepository) {

        this.DetailFactureRepository = DetailFactureRepository;
    }

    @Override
    public DetailFacture ajouterDetailFacture(DetailFacture detailFacture) { return DetailFactureRepository.save(detailFacture);
    }

    @Override
    public DetailFacture modifierDetailFacture(DetailFacture detailFacture) {
        return DetailFactureRepository.save(detailFacture);
    }

    @Override
    public List<DetailFacture> afficherDetailFacture() {
        return DetailFactureRepository.findAll();
    }

    @Override
    public DetailFacture afficherDetailFacture(long id) {
        return DetailFactureRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerDetailFacture(long id) {
        DetailFactureRepository.deleteById(id);
    }
}
