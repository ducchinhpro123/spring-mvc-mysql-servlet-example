package com.website.controller;

import com.website.model.Book;
import com.website.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private BookService bookService;
    private final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/hello")
    public String homePage(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("message", "Hello");
        model.addAttribute("books", books);
        return "welcome";
    }
}
