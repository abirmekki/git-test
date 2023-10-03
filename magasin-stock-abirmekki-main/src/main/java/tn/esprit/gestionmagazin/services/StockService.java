package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.Stock;
import tn.esprit.gestionmagazin.repositories.StockRepository;


import java.util.List;
@Service
public class StockService implements IStockService{
    StockRepository stockRepository;
    public StockService(StockRepository stockRepository){
        this.stockRepository=stockRepository;
    }
    @Override
    public Stock ajouterStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock modifierStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> afficherStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock afficherStock(long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerStock(long id) {
        stockRepository.deleteById(id);
    }
}
