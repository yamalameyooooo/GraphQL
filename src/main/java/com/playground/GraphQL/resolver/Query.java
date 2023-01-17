package com.playground.GraphQL.resolver;

import com.playground.GraphQL.model.Author;
import com.playground.GraphQL.model.Book;
import com.playground.GraphQL.repository.AuthorRepository;
import com.playground.GraphQL.repository.BookRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }
}
