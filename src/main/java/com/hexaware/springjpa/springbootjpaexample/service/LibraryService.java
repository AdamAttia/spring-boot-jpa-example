package com.hexaware.springjpa.springbootjpaexample.service;

import com.hexaware.springjpa.springbootjpaexample.entity.Library;
import com.hexaware.springjpa.springbootjpaexample.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository repository;


    public Library saveProduct(Library library) {
        return repository.save(library);
    }

    public List<Library> saveAllProducts(List<Library> restonLibraries) {
        return (List<Library>) repository.saveAll(restonLibraries);
    }

    public List<Library> getLibraries() {
        return (List<Library>) repository.findAll();
    }

    public Optional<Library> getLibrary(int id) {
        return repository.findById(id);
    }


}
