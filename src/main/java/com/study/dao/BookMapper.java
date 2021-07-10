package com.study.dao;

import com.study.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBookById(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询全部书
    List<Books> queryAllBook();

    //根据书名模糊查询一本书
    List<Books> queryBookByName(@Param("bookName") String bookName);
}
