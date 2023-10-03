package tn.esprit.gestionmagazin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.DetailProduit;
import tn.esprit.gestionmagazin.services.DetailProduitService;
import tn.esprit.gestionmagazin.services.IDetailProduitService;

import java.util.List;

@RestController
public class DetailProduitController {

    IDetailProduitService iDetailProduitService;

    public DetailProduitController(tn.esprit.gestionmagazin.services.IDetailProduitService IDetailProduitService){
        this.iDetailProduitService = IDetailProduitService;
    }

    @PostMapping("/detailProduit")
    DetailProduit ajouterDetailProduit(@RequestBody DetailProduit detailProduit){return iDetailProduitService.ajouterDetailProduit(detailProduit);}
    @PutMapping("/detailProduit")
    DetailProduit modifierDetailProduit(@RequestBody DetailProduit detailProduit){return iDetailProduitService.modifierDetailProduit(detailProduit);}
    @GetMapping("/detailProduit")
    List<DetailProduit> afficherDetailProduits(){return  iDetailProduitService.afficherDetailProduits();}
    @DeleteMapping("/detailProduit")
    void supprimerDetailProduit(@PathVariable long id){ iDetailProduitService.supprimerDetailProduit(id);}

}
