package com.CRUDOperation.Project.Services;

import com.CRUDOperation.Project.Repository.BookRepository;
import com.CRUDOperation.Project.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookEntity getBooksById(Integer id) {
       return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBook(BookEntity book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Integer id, BookEntity book) {
       BookEntity existBook = getBooksById(id);
        if(existBook != null) {
          existBook.setAuthor(book.getAuthor());
          existBook.setPrice(book.getPrice());
          bookRepository.save(existBook);
        }
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
