package com.hexaware.springjpa.springbootjpaexample.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name ="book")
public class Book {

    @Id
    @Column(name ="book_id")
    private String bookId;

    @Column(name ="book_name")
    private String bookName;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }


}
