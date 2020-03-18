package com.aol.service;

import com.aol.domain.Phrase;

import com.aol.dto.PhraseDto;
import com.aol.repo.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.aol.domain.Status.STARTED;

@Service
public class PhraseService {

    @Autowired
    PhraseRepository repo;

    public String convert(PhraseDto phDTO) {
        Phrase phrase = new Phrase();
        phrase.setPhrase(phDTO.getPhrase());
        phrase.setRoutingKey(phDTO.getRoutingKey());
        phrase.setStatus(STARTED);
        Phrase p = repo.save(phrase);
        return p.getId();

    }
}
