package com.springmvc.service;

import com.springmvc.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBookList();
    //카테고리 검색
    List<Book> getBookListByCategory(String category);
    //@RequestParam 이용해서 도서 ID와 일치하는 도서 정보 출력 요청 처리 메서드
    Book getBookById(String bookId);
}
