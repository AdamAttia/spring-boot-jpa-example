package com.hexaware.springjpa.springbootjpaexample.repository;

import com.hexaware.springjpa.springbootjpaexample.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {


}
