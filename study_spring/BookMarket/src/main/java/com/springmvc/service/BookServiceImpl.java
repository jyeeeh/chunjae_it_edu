package com.springmvc.service;

import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepositoryImpl bookRepository;
    @Override
    public List<Book> getAllBookList(){
        return bookRepository.getAllBookList();
    }

    //카테고리 검색 기능
    @Override
    public List<Book> getBookListByCategory(String category) {
        List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
        return booksByCategory;
    }

    //@RequestParam 이용해서 도서 ID와 일치하는 도서 정보 출력 요청 처리 메서드
    @Override
    public Book getBookById(String bookId) {
        Book bookById = bookRepository.getBookByID(bookId);
        return bookById;
    }
}
