package tn.esprit.gestionmagazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.Produit;
import tn.esprit.gestionmagazin.services.IProduitService;

import java.util.List;
@RestController
public class ProduitController {

    IProduitService iProduitService;
    public ProduitController(tn.esprit.gestionmagazin.services.IProduitService IProduitService){
        this.iProduitService=IProduitService;
    }
    @PostMapping("/produit")
    Produit ajouterProduit(@RequestBody Produit produit){return iProduitService.ajouterProduit(produit);}
    @PutMapping("/produit")
    Produit modifierProduit(@RequestBody Produit produit){return iProduitService.modifierProduit(produit);}
    @GetMapping("/produit")
    List<Produit> afficherProduits(){return iProduitService.afficherProduits();}
    @GetMapping("/produit/50")
    Produit afficherProduit(@PathVariable long id){return iProduitService.afficherProduit(id);}
    @DeleteMapping("/produit/50")
    void supprimerProduit(@PathVariable long id){ iProduitService.supprimerProduit(id);}
}
