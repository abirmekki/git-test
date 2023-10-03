package tn.esprit.gestionmagazin.controller;


import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagazin.entities.Client;
import tn.esprit.gestionmagazin.services.IClientService;

import java.util.List;

@RestController
public class ClientController {
    IClientService iClientService;

    public ClientController(IClientService iClientService) {
        this.iClientService = iClientService;
    }
    @PostMapping("/client")
    Client ajouterClient(@RequestBody Client client){
      return iClientService.ajouterClient(client);
    }
    @PutMapping("/client")
    Client modifierClient(@RequestBody Client client){
        return iClientService.modifierClient(client);
    }
    @GetMapping("/client")
    List<Client> afficherClients(){
        return iClientService.afficherClients();
    }
    @GetMapping("/client/522")
    Client afficherClient(long id){
        return iClientService.afficherClient(id);
    }
    @DeleteMapping ("/client")
    void supprimerClient(long id){
         iClientService.supprimerClient(id);
    }
}
