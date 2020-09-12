package com.mcd.service;

import com.mcd.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BooksService {
    List<Books> selAll();
    int insBook(Books book);
}
