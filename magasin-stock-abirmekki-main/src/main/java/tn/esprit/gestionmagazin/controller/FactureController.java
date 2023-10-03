package tn.esprit.gestionmagazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.Facture;
import tn.esprit.gestionmagazin.services.IFactureService;


import java.util.List;

@RestController
public class FactureController {

    IFactureService iFactureService;

    public FactureController(tn.esprit.gestionmagazin.services.IFactureService IFactureService){
        this.iFactureService=IFactureService;
    }
    @PostMapping("/facture")
    Facture ajouterFacture(Facture facture){return iFactureService.ajouterFacture(facture);}
    @PutMapping("/facture")
    Facture modifierFacture(Facture facture){return iFactureService.modifierFacture(facture);}
    @GetMapping("/facture")
    Facture afficherFacture(long id){return iFactureService.afficherFacture(id);}
    @GetMapping("/facture")
    List<Facture> afficherFactures(){return iFactureService.afficherFactures();}
    @DeleteMapping("/facture")
    void supprimerFacture(long id){ iFactureService.supprimerFacture(id);}
}
