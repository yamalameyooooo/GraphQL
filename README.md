# graphql-java-spring-boot-example

To access the database, [http://localhost:8080/h2-console/login.jsp](http://localhost:8080/h2-console/login.jsp):
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Password: <blank>

[http://localhost:8080/graphiql](http://localhost:8080/graphiql) to start.
Example:
```
{
  findAllBooks {
    id
    isbn
    title
    pageCount
    author {
      firstName
      lastName
    }
  }
  findAllAuthors{
    firstName
    lastName
  }
  countBooks
  countAuthors
}
```

Or:
```
mutation {
  newBook(title: "Let us C", isbn: "1234567890", pageCount: 790, author: 1) {
    id
    title
    isbn
    pageCount
    author{
      id
      firstName
      lastName
    }
  }
  deleteBook(id: 3)
  updateBookPageCount(pageCount: 788, id: 4){
    id
    title
    isbn
    pageCount
    author{
      id
      firstName
      lastName
    }
  }
  newAuthor(firstName: "Joseph", lastName: "Barun"){
    id
    firstName
    lastName
  }
}
```

# Bookmarks

    * [GraphiQL](http://localhost:8080/graphiql)
    * [Altair](http://localhost:8080/altair)
    * [Playground](http://localhost:8080/playground)  
    * [Voyager](http://localhost:8080/voyager)
