package com.example.usersapi.controllers;

import com.example.usersapi.models.Books;
import com.example.usersapi.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/books")
    public Iterable<Books> findAllBooks() {
        return booksRepository.findAll();
    }

    @DeleteMapping("/books/{booksId}")
    public HttpStatus deleteById(@PathVariable Long booksId) {
        booksRepository.delete(booksId);
        return HttpStatus.OK;
    }

    @PostMapping("/books")
    public Books createNewBookTrx(@RequestBody Books newBookTrx) {
        return booksRepository.save(newBookTrx);
    }

//    @GetMapping("/books/region/{name}")
//    public List<Books> getByRegion(@PathVariable String name ) {
//        return booksRepository.getByRegion(name);
//    }
}