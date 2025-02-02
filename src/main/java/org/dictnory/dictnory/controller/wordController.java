package org.dictnory.dictnory.controller;

import java.util.List;

import org.dictnory.dictnory.dto.word;
import org.dictnory.dictnory.service.wordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


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







    // To Get a word from a dictionary
    @GetMapping("/words")
    public ResponseEntity<Object> geAlltWords() {
        return service.getAllWords();
    }

    @GetMapping("/words/{startLetter}")
    public ResponseEntity<Object> getWord(@RequestParam String startLetter){
        return service.getWord(startLetter);
    }

}
