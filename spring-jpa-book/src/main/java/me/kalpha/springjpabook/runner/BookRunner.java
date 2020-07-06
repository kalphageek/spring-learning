package me.kalpha.springjpabook.runner;

import me.kalpha.springjpabook.book.Book;
import me.kalpha.springjpabook.book.BookReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BookRunner implements ApplicationRunner {
    @Autowired
    BookReposiory bookReposiory;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Book book = new Book("Basic JPA");
        book.setCreated(new Date());
        bookReposiory.save(book);
    }
}
