package com.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
