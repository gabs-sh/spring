package io.github.com.gabrielsilvan.repository;

import io.github.com.gabrielsilvan.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
