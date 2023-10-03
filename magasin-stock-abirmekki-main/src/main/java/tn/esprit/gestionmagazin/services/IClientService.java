package tn.esprit.gestionmagazin.services;

import tn.esprit.gestionmagazin.entities.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    List <Client> afficherClients();
    Client afficherClient(long id);
    void supprimerClient(long id);


}
