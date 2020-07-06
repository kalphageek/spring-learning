package me.kalpha.springjpabook.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReposiory extends JpaRepository<Book, Long> {
}
