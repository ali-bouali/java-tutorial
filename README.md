# Java Project - Functional Programming using Stream API, Optional, Date API
This Java project demonstrates the use of functional programming concepts using Stream API, Optional, and Date API.

## Stream API
Stream API is a new feature in Java 8 that provides a powerful way to process data collections. It allows you to perform operations on data collections, such as filtering, sorting, and mapping, in a concise and declarative way.

In this project, we have used Stream API to demonstrate the filtering and mapping operations on a collection of books. We have created a Book class with attributes such as title, author, publication date, and price. We have also created a Bookstore class that stores a collection of books and provides methods to filter and map the book data using Stream API.

## Optional
Optional is a container object that may or may not contain a non-null value. It provides a way to handle null values without throwing NullPointerException.

In this project, we have used Optional to handle null values when retrieving book data. We have created a method in the Bookstore class that retrieves a book by its title. If the book is not found, the method returns an empty Optional object.

## Date API
Date API is a new feature in Java 8 that provides a powerful way to work with dates and times. It allows you to perform operations on dates and times, such as parsing, formatting, and calculating differences, in a concise and declarative way.

In this project, we have used Date API to demonstrate the formatting and parsing of date and time data. We have created a method in the Book class that formats the publication date of a book in a user-friendly way. We have also created a method in the Bookstore class that retrieves a list of books published after a specified date.

## How to use the project
* Clone the repository using the following command:

```
git clone https://github.com/your-username/your-repo.git
```

* Open the project in your IDE.

* Run the tests in the src/test/java folder to see the Stream API, Optional, and Date API in action.

## Conclusion
This Java project demonstrates the use of functional programming concepts using Stream API, Optional, and Date API. By using these features, you can write more concise and declarative code that is easier to read and maintain.