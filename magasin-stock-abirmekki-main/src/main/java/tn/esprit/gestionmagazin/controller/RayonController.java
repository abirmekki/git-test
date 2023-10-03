package tn.esprit.gestionmagazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.Rayon;
import tn.esprit.gestionmagazin.services.IRayonService;

import java.util.List;
@RestController
public class RayonController {

    IRayonService iRayonService;
    public RayonController(tn.esprit.gestionmagazin.services.IRayonService IRayonService){
        this.iRayonService=IRayonService;
    }
    @PostMapping("/rayon")
    Rayon ajouterRayon(Rayon rayon){return iRayonService.ajouterRayon(rayon);}
    @PutMapping ("/rayon")
    Rayon modifierRayon(Rayon rayon){return iRayonService.modifierRayon(rayon);}
    @GetMapping("/rayon")
    List<Rayon> afficherRayons(){return iRayonService.afficherRayons();}
    @GetMapping("/rayon/15")
    Rayon afficherRayon(@PathVariable long id){return iRayonService.afficherRayon(id);}
    @DeleteMapping("/rayon/15")
    void supprimerRayon(@PathVariable long id){ iRayonService.supprimerRayon(id);}
}