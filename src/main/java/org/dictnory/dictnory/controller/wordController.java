package org.dictnory.dictnory.controller;

import org.dictnory.dictnory.service.wordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wordController {

    @Autowired
    wordService service;
    
}
