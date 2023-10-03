package tn.esprit.gestionmagazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.DetailFacture;
import tn.esprit.gestionmagazin.services.IDetailFactureService;

import java.util.List;
@RestController
public class DetailFactureController {

   IDetailFactureService iDetailFactureService;

    public DetailFactureController(IDetailFactureService iDetailFactureService){this.iDetailFactureService=iDetailFactureService;}
    @PostMapping("/DetailFacture")
    DetailFacture ajouterDetailFacture(DetailFacture detailFacture){return iDetailFactureService.ajouterDetailFacture(detailFacture);}
    @PutMapping("/DetailFacture")
    DetailFacture modifierDetailFacture(DetailFacture detailFacture){return iDetailFactureService.modifierDetailFacture(detailFacture);}
    @GetMapping("/DetailFacture")
    List<DetailFacture> afficherDetailFacture(){return  iDetailFactureService.afficherDetailFacture();}
    @GetMapping("/DetailFacture")
    DetailFacture afficherDetailFacture(long id){return iDetailFactureService.afficherDetailFacture(id);}
    @DeleteMapping("/DetailFacture")
    void supprimerDetailFacture(long id){ iDetailFactureService.supprimerDetailFacture(id);}
}
