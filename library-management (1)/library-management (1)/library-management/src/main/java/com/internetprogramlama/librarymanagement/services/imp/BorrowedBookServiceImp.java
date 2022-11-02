package com.internetprogramlama.librarymanagement.services.imp;


import com.internetprogramlama.librarymanagement.entities.BorrowedBook;
import com.internetprogramlama.librarymanagement.respositories.BorrowedBookRepository;
import com.internetprogramlama.librarymanagement.services.BorrowedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BorrowedBookServiceImp implements BorrowedBookService {
    @Autowired
    private BorrowedBookRepository borrowedBookRepository;


    public BorrowedBookServiceImp(BorrowedBookRepository borrowedBookRepository) {
        super();
        this.borrowedBookRepository = borrowedBookRepository;
    }


}
