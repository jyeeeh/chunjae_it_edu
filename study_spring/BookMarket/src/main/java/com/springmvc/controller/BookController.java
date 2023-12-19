package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/books", method= RequestMethod.GET)
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping
    public String requestBookList(Model model){
        List<Book> list = bookService.getAllBookList();
        model.addAttribute("bookList",list);
        return "books";
    }

    @RequestMapping(value="/all")
    public ModelAndView requestAllBookList(Model model){
        ModelAndView modelAndView = new ModelAndView();
        List<Book> list = bookService.getAllBookList();
        modelAndView.addObject("bookList", list);
        modelAndView.setViewName("books");
        return modelAndView;
    }

    //카테고리 검색 기능
    @GetMapping("/{category}")
    public String requestBooksByCategory(@PathVariable("category") String bookCategory, Model model){
        List<Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
        model.addAttribute("bookList",booksByCategory);
        return "books";
    }

    //@RequestParam 이용해서 도서 ID와 일치하는 도서 정보 출력 요청 처리 메서드
    @GetMapping("/book")
    public String requestBookById(@RequestParam("id") String bookId, Model model){
        Book bookById = bookService.getBookById(bookId);
        model.addAttribute("book",bookById);
        return "book";
    }

    //신규 도서 정보 등록(도서 등록 페이지)
    @GetMapping("/add")
    public String requestAddBookForm(Book book){
        return "addBook";
    }

}
