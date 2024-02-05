package dev.luismartinez.raylwaygithub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/name")
public record NameController() {

    @GetMapping
    public ResponseEntity<?> findName() {
        return new ResponseEntity<>("Luis Carlos Martinez", HttpStatus.OK);
    }
}
