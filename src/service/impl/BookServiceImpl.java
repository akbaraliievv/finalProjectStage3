package service.impl;

import enums.Genre;
import enums.Language;
import model.Book;
import service.BookService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    private List<Book>bookList = new ArrayList<>();
    @Override
    public List<Book> createBooks(List<Book> books) {
        this.bookList = books;
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList.stream().toList();
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookList.stream().filter(x->x.getGenre().equals(genre)).toList();
    }

    @Override
    public Book removeBookById(Long id) {
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        bookList.stream().sorted(Comparator.comparing(Book::getPrice)).forEach(System.out::println);
        return bookList.stream().sorted(Comparator.comparing(Book::getPrice)).toList();
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        bookList.stream().filter(x->x.getPublishedYear().isLeapYear()).forEach(System.out::println);
        return bookList.stream().filter(x->x.getPublishedYear().isLeapYear()).toList();
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        Scanner scanner = new Scanner(System.in);
        String alfavit = scanner.nextLine();
        bookList.stream().filter(x->x.getName().startsWith(alfavit)).forEach(System.out::println);
        return bookList.stream().filter(x->x.getName().startsWith(alfavit)).toList();
    }

    @Override
    public Book maxPriceBook() {
        return null;
    }
}
