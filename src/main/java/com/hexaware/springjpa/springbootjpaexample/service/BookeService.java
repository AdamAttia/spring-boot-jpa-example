package com.hexaware.springjpa.springbootjpaexample.service;

import com.hexaware.springjpa.springbootjpaexample.entity.Book;
import com.hexaware.springjpa.springbootjpaexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookeService {

    @Autowired
    private BookRepository repository;


    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveAllBooks(List<Book> books) {
        return (List<Book>) repository.saveAll(books);
    }

    public List<Book> getBooks() {
        return (List<Book>) repository.findAll();
    }

    public Optional<Book> getBook(String id) {
        return repository.findById(id);
    }

}
