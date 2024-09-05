import java.util.Scanner;

public class Library {
    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks++] = book;
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = books[--numBooks];
                return;
            }
        }
    }

    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println("Book ID: " + book.getBookID());
                System.out.println("Title: " + book.gettitle());
                System.out.println("Author: " + book.getauthor());
                System.out.println("Availability: " + (book.isAvailable() ? "Yes" : "No"));
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Search book");
            System.out.println("4. Display books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookID = scanner.nextInt();
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter author: ");
                    String author = scanner.next();
                    library.addBook(new Book(bookID, title, author));
                    break;
                case 2:
                    System.out.print("Enter book ID: ");
                    bookID = scanner.nextInt();
                    library.removeBook(bookID);
                    break;
                case 3:
                    System.out.print("Enter book ID: ");
                    bookID = scanner.nextInt();
                    Book book = library.searchBook(bookID);
                    if (book != null) {
                        System.out.println("Book ID: " + book.getBookID());
                        System.out.println("Title: " + book.gettitle());
                        System.out.println("Author: " + book.getauthor());
                        System.out.println("Availability: " + (book.isAvailable() ? "Yes" : "No"));
                    } else {
                        System.out.println("Book not found");
                    }
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
