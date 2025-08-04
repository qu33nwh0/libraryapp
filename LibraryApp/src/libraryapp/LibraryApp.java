/*
Student Name:	Melanie Hinkley
Student ID:	30010518
Version:	1.0
Description:	A Library borrowing app with the ability to borrow, return and search books.
Date:		2025.04.08
*/

package libraryapp;
import java.util.Scanner;
public class LibraryApp {

    public static void main(String[] args) {
    //   Create scanner object to read input from console
       Scanner scanner = new Scanner(System.in); 
       
    //  Display message of options to user
        
       System.out.println("Please enter a number");
       System.out.println("1. Borrow a Book");
       System.out.println("2. Return a Book");
       System.out.println("3. Search Books");
       System.out.println("4. See Books on Loan");
       System.out.println("5. Exit");
       
       int menuOption = scanner.nextInt();
       
       
       //   Not sure - scanner ?
       //   String menuOption = userInput        
        //    Action based on user input
        switch (menuOption) {
            case 1:
                System.out.println("What book would you like to borrow?");
                break;
            case 2:
                System.out.println("What book would you like to return?");
                break;
            case 3:
                System.out.println("Please enter the book title");
                break;
            case 4:
                System.out.println("These are your books on loan:");
                break;
            case 5:
                System.out.println("Goodbye.");
        }
    }
    
    
}
