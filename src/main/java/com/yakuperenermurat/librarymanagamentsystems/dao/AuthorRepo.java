package com.yakuperenermurat.librarymanagamentsystems.dao;

import com.yakuperenermurat.librarymanagamentsystems.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
