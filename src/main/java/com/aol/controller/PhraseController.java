package com.aol.controller;


import com.aol.dto.PhraseDto;
import com.aol.service.PhraseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/phrase")
public class PhraseController {

    @Autowired
    PhraseService service;

    @PostMapping(path = "/convert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String,String>> convert(@RequestBody PhraseDto phDTO) {
        String jobId = service.convert(phDTO);
        Map<String,String> response = new LinkedHashMap<>();
        response.put("jobId",jobId);
        return ResponseEntity.ok(response);

    }

    @GetMapping(path = "/test")
    public ResponseEntity<String> test() {

        return ResponseEntity.ok("success ");

    }

}
