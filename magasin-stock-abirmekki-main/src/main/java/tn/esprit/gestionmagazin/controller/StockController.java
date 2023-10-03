package tn.esprit.gestionmagazin.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.Stock;
import tn.esprit.gestionmagazin.services.IStockService;


import java.util.List;
@RestController
public class StockController {
    IStockService IStockService;
    public StockController(tn.esprit.gestionmagazin.services.IStockService IStockService){
        this.IStockService=IStockService;
    }
    @PostMapping("/stock")
    Stock ajouterStock(Stock stock){return IStockService.ajouterStock(stock);}
    @PutMapping("/stock")
    Stock modifierStock(Stock stock){return IStockService.modifierStock(stock);}
    @GetMapping("/stock")
    List<Stock> afficherStocks(){return IStockService.afficherStocks();}
    @GetMapping("/stock/50")
    Stock afficherStock(@PathVariable long id){return IStockService.afficherStock(id);}
    @DeleteMapping("/stock/50")
    void supprimerStock(@PathVariable long id){IStockService.supprimerStock(id);}
}
