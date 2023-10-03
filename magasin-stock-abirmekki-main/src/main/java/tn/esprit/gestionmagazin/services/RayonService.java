package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.Rayon;
import tn.esprit.gestionmagazin.repositories.RayonRepository;

import java.util.List;
@Service
public class RayonService implements IRayonService{
    RayonRepository rayonRepository;
    public RayonService(RayonRepository rayonRepository){
        this.rayonRepository=rayonRepository;
    }
    @Override
    public Rayon ajouterRayon(Rayon rayon) {
        return rayonRepository.save(rayon);
    }

    @Override
    public Rayon modifierRayon(Rayon rayon) {
        return rayonRepository.save(rayon);
    }

    @Override
    public List<Rayon> afficherRayons() {
        return rayonRepository.findAll();
    }

    @Override
    public Rayon afficherRayon(long id) {
        return rayonRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerRayon(long id) {
        rayonRepository.deleteById(id);
    }
}
