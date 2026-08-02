/**
 * ===== Library System =====

1. Add Printed Book
2. Add Ebook
3. Register Member
4. Display Books
5. Display Members
6. Borrow Book
7. Return Book
8. Exit
 */

import java.util.Scanner;

public class LBSConsole 
{
    
    public static void main(String args[])
    {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running)
        {
            System.out.println("===== Library System =====");
            System.out.println("1. Add Printed Book");
            System.out.println("2. Add Ebook");
            System.out.println("3. Register Member");
            System.out.println("4. Display Books");
            System.out.println("5. Display Members");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1: //  Add Printed Book
                    System.out.println("Title:");
                    String newTitle = scanner.nextLine();

                    System.out.println("Author:");
                    String newAuthor = scanner.nextLine();

                    library.addPrintedBook(newTitle, newAuthor);
                    break;

                case 2:// Add Ebook
                    System.out.println("Title:");
                    String ETitle = scanner.nextLine();

                    System.out.println("Author:");
                    String EAuthor = scanner.nextLine();

                    System.out.println("File Size");
                    double fileSize = scanner.nextInt();
                    scanner.nextLine();
                    
                    library.addEBook(ETitle, EAuthor, fileSize);
                    break;

                case 3: // 3. Register Member
                    System.out.println("Name");
                    String newName = scanner.nextLine();

                    library.addMember(newName);
                    break;

                case 4: // 4 Display Books
                    library.displayBooks();
                    break;

                case 5: // display members
                    library.displayMembers();
                    break;

                case 6: // Borrow Book
                    System.out.println("Id of the book: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Id of the member: ");
                    int idMember = scanner.nextInt();
                    scanner.nextLine();

                    library.borrowLibraryBook(bookId, idMember);
                    System.out.println("Borrow Successful!");
                    break;
                
                case 7: // Return Book
                    System.out.println("Id of the book: ");
                    int idBook = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Member returning the book: ");
                    int idReturningMember = scanner.nextInt();
                    scanner.nextLine();

                    library.returnLibraryBook(idBook, idReturningMember);
                    System.out.println("Return successful!");
                    break;

                case 8: //Exit
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option!");    
                    break;
            }
            

        }
        scanner.close();

    }

}
