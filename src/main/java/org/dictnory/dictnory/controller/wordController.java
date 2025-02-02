package org.dictnory.dictnory.controller;

import java.util.List;

import org.dictnory.dictnory.dto.word;
import org.dictnory.dictnory.service.wordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wordController {

    @Autowired
    wordService service;

    // To Add a word into a dictionary
    @PostMapping("/words")
    public ResponseEntity<Object> addWord(@RequestBody word word){
        return service.addWord(word);
    }
    
    @PostMapping("/words/multiple")
    public ResponseEntity<Object> addMultipleWord(@RequestBody List<word> words){
        return service.addMultipleWords(words);
    }
}
