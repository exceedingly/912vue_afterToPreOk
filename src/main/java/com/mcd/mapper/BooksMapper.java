package com.mcd.mapper;

import com.mcd.pojo.Books;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BooksMapper {

    @Select("select * from books")
    List<Books> selAll();

    @Insert("insert into books(bookID,bookName,bookCounts,detail) values(#{bookID},#{bookName},#{bookCounts},#{detail})")
    int insBook(Books book);
}
