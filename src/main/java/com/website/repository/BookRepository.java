package com.website.repository;

import com.website.model.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("bookRepository")
public interface BookRepository extends JpaRepository<Book, Integer> {
}
