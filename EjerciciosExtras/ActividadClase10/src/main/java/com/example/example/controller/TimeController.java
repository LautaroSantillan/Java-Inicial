package com.example.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static java.rmi.server.LogStream.log;

@Slf4j
@RestController //
@RequestMapping(path = "api/time") // indica la ruta de la api
public class TimeController {
    int counter = 0;
    @GetMapping(path = "/")
    public ResponseEntity<?>getDate(){
        LocalDateTime now = LocalDateTime.now();

        log.info("cantidad de llamadas " + ++counter);
        Map<String, String> timeMap = new HashMap<String, String>();

        timeMap.put( "counter", String.valueOf(counter));
        timeMap.put( "time", now.toString());

        return new ResponseEntity<>(timeMap,HttpStatus.OK);
    }
}
