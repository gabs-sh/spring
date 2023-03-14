package io.github.com.gabrielsilvan.dtos;

import io.github.com.gabrielsilvan.annotations.NameValidator;
import io.github.com.gabrielsilvan.enums.Books;

public class ICreatePersonDTO {
    @NameValidator
    private String name;
    private Integer age;

    private Books book;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Books getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "ICreatePersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
