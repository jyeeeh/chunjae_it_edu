package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

//    @RequestMapping(value="/all")
//    public String requestAllBookList(Model model){
//        List<Book> list = bookService.getAllBookList();
//        model.addAttribute("bookList",list);
//        return "books";
//    }

    @RequestMapping(value="/all")
    public ModelAndView requestAllBookList(Model model){
        ModelAndView modelAndView = new ModelAndView();
        List<Book> list = bookService.getAllBookList();
        modelAndView.addObject("bookList", list);
        modelAndView.setViewName("books");
        return modelAndView;
    }

}
