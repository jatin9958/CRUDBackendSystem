package com.CRUDOperation.Project.Controller;

import com.CRUDOperation.Project.Repository.BookRepository;
import com.CRUDOperation.Project.Services.BookService;
import com.CRUDOperation.Project.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/library/")
public class HomeController {

    @Autowired
    private BookService bookService;

    @GetMapping("books")
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookEntity getBookById(@PathVariable Integer id) {
        return bookService.getBooksById(id);
    }

    @PostMapping
    public void saveBook(@RequestBody BookEntity book) {
        bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    public void updateBook (@PathVariable Integer id, @RequestBody BookEntity book){
        bookService.updateBook(id,book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }

}
