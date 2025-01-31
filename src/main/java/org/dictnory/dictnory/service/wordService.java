package org.dictnory.dictnory.service;

import org.dictnory.dictnory.repository.wordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class wordService {

    @Autowired
    wordRepository repository;
    
}
