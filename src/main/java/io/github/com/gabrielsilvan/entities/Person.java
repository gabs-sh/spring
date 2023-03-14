package io.github.com.gabrielsilvan.entities;

import io.github.com.gabrielsilvan.enums.Books;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = 4820283941723690190L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    @Column(name = "book")
    private Books book;

    public Person() {}

    public Person(String name, Integer age, Books book) {
        this.age = age;
        this.name = name;
        this.book = book;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Books getBook() {
        return book;
    }

    public void setAge(Integer age) {
        if (age > 0 && age < 100) this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
