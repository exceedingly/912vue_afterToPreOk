package com.mcd.service.impl;

import com.mcd.mapper.BooksMapper;
import com.mcd.pojo.Books;
import com.mcd.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    BooksMapper booksMapper;


    @Override
    public List<Books> selAll() {
        return booksMapper.selAll();
    }

    @Override
    public int insBook(Books book) {

        return booksMapper.insBook(book);
    }
}
