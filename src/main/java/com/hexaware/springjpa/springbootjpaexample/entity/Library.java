package com.hexaware.springjpa.springbootjpaexample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "library")

public class Library {

    @Id
    @Column(name = "library_id")
    private int libraryId;

    @Column(name ="library_name")
    private String libraryName;



    public Library(int libraryId, String bookId, String bookName) {
        this.libraryId = libraryId;

    }

    public Library() {
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}
