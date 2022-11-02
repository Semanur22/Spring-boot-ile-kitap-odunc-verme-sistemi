package com.internetprogramlama.librarymanagement.respositories;

import com.internetprogramlama.librarymanagement.entities.Book;
import com.internetprogramlama.librarymanagement.entities.BorrowedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BorrowedBookRepository extends JpaRepository<BorrowedBook,Long> {
}
