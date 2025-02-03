package org.dictnory.dictnory.repository;

import java.util.List;

import org.dictnory.dictnory.dto.word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface wordRepository extends JpaRepository<word, Integer> {

    boolean existsByWord(word word);

}
