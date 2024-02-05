/*Design an application for managing information of books, i.e. details of the books and number
of copy of each book title. The application should support the following functions:
1. purchase of new book title, which is not purchased earlier (needs to be implemented
using parameterized constructor),
2. purchase of existing book title (needs to be implemented using copy constructor). */
package basicjava_pac.java_prac_quasction;

class Book {
    String title;
    int copies;

    Book() {
    }

    Book(String title) {
        this.title = title;
        this.copies = 1;
    }
}

class BookLibrary {
    int lastBook;
    Book bookList[] = new Book[10];

    BookLibrary() {
        this.lastBook = -1;
    };

    void add(Book newBook) {
        boolean present = false;
        for (int i = 0; i <= lastBook; i++) {
            if (bookList[i].title == newBook.title) {
                bookList[i].copies += 1;
                present = true;
            }
        }
        if (present == false) {
            bookList[++lastBook] = newBook;
        }
    }

    void display() {
        for (int i = 0; i <= this.lastBook; i++) {
            System.out.println("Book title: " + bookList[i].title + ", " + "Number of copies: " + bookList[i].copies);
        }
    }
}

class BookKeeping {
    public static void main(String args[]) {
        BookLibrary library = new BookLibrary();
        Book DSA = new Book("DSA");
        Book OOPS = new Book("OOPS");
        library.add(DSA);
        library.add(DSA);
        library.add(OOPS);
        library.display();
    }
}