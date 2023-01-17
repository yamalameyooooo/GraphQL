package com.playground.GraphQL.resolver;

import com.playground.GraphQL.model.Author;
import com.playground.GraphQL.model.Book;
import com.playground.GraphQL.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor()
                                             .getId())
                               .orElseThrow(null);
    }
}
