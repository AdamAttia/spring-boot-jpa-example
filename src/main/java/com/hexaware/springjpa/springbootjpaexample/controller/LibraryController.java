package com.hexaware.springjpa.springbootjpaexample.controller;

import com.hexaware.springjpa.springbootjpaexample.entity.Library;
import com.hexaware.springjpa.springbootjpaexample.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibraryController {

    @Autowired
    private LibraryService service;

    @PostMapping("/addLibrary")
    public Library addLibrary(@RequestBody Library library) {
        return service.saveProduct(library);
    }

    @PostMapping("/addLibraries")
    public List<Library> addLibraries(@RequestBody List<Library> libraries) {
        return service.saveAllProducts(libraries);
    }

    @GetMapping("/libraries")
    public List<Library> findAllLibraries() {
        return service.getLibraries();
    }

    @GetMapping("/library/{id}")
    public Optional<Library> findLibraryById(@PathVariable int id) {
        return service.getLibrary(id);
    }
}
