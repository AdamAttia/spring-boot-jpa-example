package com.hexaware.springjpa.springbootjpaexample.controller;

import com.hexaware.springjpa.springbootjpaexample.entity.Book;
import com.hexaware.springjpa.springbootjpaexample.entity.Library;
import com.hexaware.springjpa.springbootjpaexample.service.BookeService;
import com.hexaware.springjpa.springbootjpaexample.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookeService service;

    @PostMapping("/addBook")
    public Book addLibrary(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addLibraries(@RequestBody List<Book> books) {
        return service.saveAllBooks(books);
    }

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return service.getBooks();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> findBookById(@PathVariable String id) {
        return service.getBook(id);
    }
}
