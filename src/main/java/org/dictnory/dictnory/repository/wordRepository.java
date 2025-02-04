package org.dictnory.dictnory.repository;

import java.util.List;
import java.util.Optional;

import org.dictnory.dictnory.dto.word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface wordRepository extends JpaRepository<word, Integer> {

    boolean existsByWord(String word);

    List<word> findByStartLetter(char startLetter);

    Optional<word> findByWord(String word);

}
