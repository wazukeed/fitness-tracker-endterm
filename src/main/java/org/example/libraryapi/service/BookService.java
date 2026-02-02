package org.example.libraryapi.service;

import org.example.libraryapi.model.Book;
import org.example.libraryapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book create(Book book) {
        return repository.save(book);
    }

    public List<Book> getAll() {
        return repository.findAll();
    }

    public Book getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public Book update(Long id, Book book) {
        Book existing = getById(id);
        existing.setName(book.getName());
        existing.setPrice(book.getPrice());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
