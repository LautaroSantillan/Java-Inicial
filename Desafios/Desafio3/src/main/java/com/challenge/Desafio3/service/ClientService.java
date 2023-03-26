package com.challenge.Desafio3.service;

import com.challenge.Desafio3.exception.ClientAlreadyExistsException;
import com.challenge.Desafio3.exception.ClientNotFoundException;
import com.challenge.Desafio3.model.ClientModel;
import com.challenge.Desafio3.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientModel create(ClientModel newClient) throws ClientAlreadyExistsException {
        Optional<ClientModel> clientOp = this.clientRepository.findById(newClient.getId());

        if(clientOp.isPresent()){
            log.info("El cliente que intenta agregar ya existe en la base de datos : " + newClient);
            throw new ClientAlreadyExistsException("El cliente que intenta agregar ya existe en la base de datos");
        } else {
            return this.clientRepository.save(newClient);
        }
    }

    public List<ClientModel> findAll(){ return this.clientRepository.findAll(); }

    public ClientModel findById(Long id) throws Exception{
        if(id <= 0){
            throw new Exception("El id encontrado no es valido");
        }

        Optional<ClientModel> clientOp = this.clientRepository.findById(id);

        if (clientOp.isEmpty()){
            log.info("El cliente con id "+ id + "  no existe en la base de datos");
            throw new ClientNotFoundException("El cliente no existe");
        } else {
            return clientOp.get();
        }
    }

    public LinkedHashMap<String, String> getAge(Long id) throws Exception{
        log.info("El id ingresado es: "+ id);
        if(id <= 0){
            throw new Exception("El id encontrado no es valido");
        }

        Optional<ClientModel> clientOp = this.clientRepository.findById(id);

        if (clientOp.isEmpty()){
            log.info("El cliente con id "+ id + "  no existe en la base de datos");
            throw new ClientNotFoundException("El cliente no existe");
        } else {
            int age;
            age = Period.between(clientOp.get().getBirthdate(), LocalDate.now()).getYears();

            LinkedHashMap<String, String> json = new LinkedHashMap<>();
            json.put("Nombre: ", clientOp.get().getName());
            json.put("Apellido: ", clientOp.get().getLastname());
            json.put("Años: ", String.valueOf(age));

            return json;
        }
    }
}
