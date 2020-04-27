package com.rodrigopeleias.bookstoremanager.repository;

import com.rodrigopeleias.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
