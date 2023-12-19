package com.springmvc.repository;

import com.springmvc.domain.Book;

import java.util.List;

public interface BookRepository {

    //도서 전체 리스트 출력
    List<Book> getAllBookList();

    //도서 검색 , category 정보를 줘서 검색기능만들기
    List<Book> getBookListByCategory(String category);

    //@RequestParam 이용해서 도서 ID와 일치하는 도서 정보 출력 요청 처리 메서드
    Book getBookByID(String bookId);

}
