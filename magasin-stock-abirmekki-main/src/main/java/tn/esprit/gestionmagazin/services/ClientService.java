package tn.esprit.gestionmagazin.services;

import org.springframework.stereotype.Service;
import tn.esprit.gestionmagazin.entities.Client;
import tn.esprit.gestionmagazin.repositories.ClientRepository;

import java.util.List;
@Service
public class ClientService implements IClientService{
   // @Autowired ////injection par attribut
    ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) { //injection par constructeur
        this.clientRepository = clientRepository;
    }

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> afficherClients() {
        return  clientRepository.findAll();
    }

    @Override
    public Client afficherClient(long id) {
        return  clientRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerClient(long id) {
        clientRepository.deleteById(id);

    }
}
