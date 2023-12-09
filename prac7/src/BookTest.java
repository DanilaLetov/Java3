import java.util.Scanner;

public class BookTest {
    public static void Creationist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details of book 1:");
        Book book1 = createBook(scanner);
        System.out.println("Enter the details of book 2:");
        Book book2 = createBook(scanner);
        System.out.println("Enter the details of book 3:");
        Book book3 = createBook(scanner);
        PrintBook[] books = {book1, book2, book3};
        printBooks(books);
    }

    public static Book createBook(Scanner scanner) {
        Book book = new Book();

        System.out.print("Enter the title: ");
        String title = scanner.nextLine();
        book.setTitle(title);
        System.out.print("Enter the author: ");
        String author = scanner.nextLine();
        book.setAuthor(author);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        book.setYear(year);
        System.out.print("Was it burned by the Inquisition? (true/false): ");
        boolean burnedByInquisition = scanner.nextBoolean();
        book.setBurnedByInquisition(burnedByInquisition);
        scanner.nextLine();
        return book;
    }

    public static void printBooks(PrintBook[] printable) {
        for (PrintBook item : printable) {
            if (item instanceof Book) {
                Book book = (Book) item;
                book.print();
            }
        }
    }
}