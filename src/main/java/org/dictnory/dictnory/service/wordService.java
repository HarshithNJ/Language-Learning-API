package org.dictnory.dictnory.service;

import java.util.HashMap;
import java.util.List;
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

    public ResponseEntity<Object> addMultipleWords(List<word> words) {
        for(word word : words){
            if(repository.existsByWord(word)){
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("error", "word already exists");
    
                return new ResponseEntity<Object>(map, HttpStatus.BAD_REQUEST);
            }
        }
        repository.saveAll(words);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", "word added successfully");
        map.put("Word", words);

        return new ResponseEntity<Object>(map, HttpStatus.CREATED);
    }








    public ResponseEntity<Object> getAllWords() {
        List<word> words = repository.findAll();

        if(words.isEmpty()){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error", "no words found");

            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        }else{
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", "words found");
            map.put("words", words);

            return new ResponseEntity<Object>(map, HttpStatus.FOUND);
        }
    }
    
}
