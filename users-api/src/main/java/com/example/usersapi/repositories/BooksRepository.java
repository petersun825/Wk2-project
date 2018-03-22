package com.example.usersapi.repositories;

import com.example.usersapi.models.Books;
import java.util.Date;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepository extends CrudRepository<Books, Long> {
    List<Books> findByDay(Date day);
}