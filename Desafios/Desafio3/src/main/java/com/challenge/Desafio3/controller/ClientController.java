package com.challenge.Desafio3.controller;

import com.challenge.Desafio3.exception.ClientAlreadyExistsException;
import com.challenge.Desafio3.model.ClientModel;
import com.challenge.Desafio3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping(path = "api/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping(path = "/")
    public ResponseEntity<ClientModel> create(@RequestBody ClientModel client) throws ClientAlreadyExistsException {
        return new ResponseEntity<>(this.clientService.create(client), HttpStatus.OK);
    }
    @GetMapping(path = "/")
    public ResponseEntity<List<ClientModel>> findAll(){
        return new ResponseEntity<>(this.clientService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientModel> findById(@PathVariable Long id) throws Exception{
        return new ResponseEntity<>(this.clientService.findById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/age/{id}")
    public ResponseEntity<LinkedHashMap<String, String>> getAge(@PathVariable Long id) throws Exception{
        return new ResponseEntity<>(this.clientService.getAge(id), HttpStatus.OK);
    }
}
