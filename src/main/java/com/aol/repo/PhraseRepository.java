package com.aol.repo;

import com.aol.domain.Phrase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhraseRepository extends MongoRepository<Phrase, String> {

}

