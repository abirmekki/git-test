package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.Stock;


import java.util.List;

public interface IStockService {
    Stock ajouterStock(Stock stock);
    Stock modifierStock(Stock stock);
    List<Stock> afficherStocks();
    Stock afficherStock(long id);
    void supprimerStock(long id);
}
