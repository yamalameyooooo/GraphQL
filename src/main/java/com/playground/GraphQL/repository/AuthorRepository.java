package com.playground.GraphQL.repository;

import com.playground.GraphQL.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>
{
}
