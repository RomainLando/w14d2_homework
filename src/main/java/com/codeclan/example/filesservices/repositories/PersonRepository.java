package com.codeclan.example.filesservices.repositories;

import com.codeclan.example.filesservices.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
