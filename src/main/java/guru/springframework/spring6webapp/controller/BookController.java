package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.service.BookService;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
}
