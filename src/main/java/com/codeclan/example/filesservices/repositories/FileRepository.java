package com.codeclan.example.filesservices.repositories;

import com.codeclan.example.filesservices.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
