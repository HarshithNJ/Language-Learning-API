package org.dictnory.dictnory.service;

import java.util.HashMap;
import java.util.Map;

import org.dictnory.dictnory.dto.word;
import org.dictnory.dictnory.repository.wordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class wordService {

    @Autowired
    wordRepository repository;

    public ResponseEntity<Object> addWord(word word) {
        if(repository.existsByWord(word)){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error", "word already exists");

            return new ResponseEntity<Object>(map, HttpStatus.BAD_REQUEST);
        }else{
            repository.save(word);

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", "word added successfully");
            map.put("Word", word);

            return new ResponseEntity<Object>(map, HttpStatus.CREATED);
        }
    }
    
}
