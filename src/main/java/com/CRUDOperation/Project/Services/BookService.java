package com.CRUDOperation.Project.Services;

import com.CRUDOperation.Project.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
List<BookEntity>getAllBooks();

BookEntity getBooksById(Integer id);

void saveBook(BookEntity book);

void deleteBook(Integer id);

void updateBook(Integer id, BookEntity book);

}
