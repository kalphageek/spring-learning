package me.kalpha.springjpabook.book;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@RequiredArgsConstructor
public class Book {
    @Id @GeneratedValue
    private Long Id;

    @NonNull
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
}
