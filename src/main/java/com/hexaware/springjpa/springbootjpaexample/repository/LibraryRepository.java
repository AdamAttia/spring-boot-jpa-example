package com.hexaware.springjpa.springbootjpaexample.repository;

import com.hexaware.springjpa.springbootjpaexample.entity.Library;
import org.springframework.data.repository.CrudRepository;


public interface LibraryRepository extends CrudRepository<Library, Integer> {


}
