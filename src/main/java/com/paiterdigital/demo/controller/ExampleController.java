package com.paiterdigital.demo.controller;

import com.paiterdigital.demo.domain.ExampleDto;
import com.paiterdigital.demo.exception.NotFoundRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/example")
public class ExampleController {

    List<Integer> idsPresents = List.of(1,2,3,4);

    @GetMapping
    public ResponseEntity<ExampleDto> getExample(@RequestParam Integer id) {
        return idsPresents.stream().filter(id::equals)
                .map(t -> ResponseEntity.ok(new ExampleDto("Id encontrado com sucesso")))
                .findAny().orElseThrow(() -> new NotFoundRegistry("Nossos neuronios não encontraram esse id"));
    }

}
