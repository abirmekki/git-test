package tn.esprit.gestionmagazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.Fournisseur;
import tn.esprit.gestionmagazin.services.IFournisseurService;

import java.util.List;

@RestController
public class FournisseurController {

    IFournisseurService iFournisseurService;
    public FournisseurController(tn.esprit.gestionmagazin.services.IFournisseurService IFournisseurService){
        this.iFournisseurService=IFournisseurService;
    }
    @PostMapping("/fournisseur")
    Fournisseur ajouterFournisseur(@RequestBody Fournisseur fournisseur){return iFournisseurService.ajouterFournisseur(fournisseur);}
    @PutMapping("/fournisseur")
    Fournisseur modifierFournisseur(@RequestBody Fournisseur fournisseur){return iFournisseurService.modifierFournisseur(fournisseur);}
    @GetMapping("/fournisseur")
    List<Fournisseur> afficherFournisseurs(){return iFournisseurService.afficherFournisseurs();}
    @GetMapping("/fournisseur/50")
    Fournisseur afficherFournisseur(@PathVariable long id){return iFournisseurService.afficherFournisseur(id);}
    @DeleteMapping("/fournisseur/50")
    void supprimerFournisseur(@PathVariable long id){ iFournisseurService.supprimerFournisseur(id);}
}
