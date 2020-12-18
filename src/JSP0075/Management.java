/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0075;

/**
 *
 * @author LONG
 */
public class Management {
    public static int Menu() {
        System.out.println("**********************MAIN MENU*********************");
        System.out.println("@_@ Choice 1: Check path\t\t\t   $");
        System.out.println("@_@ Choice 2: Get file name with type java\t   $");
        System.out.println("@_@ Choice 3: Get file with size greater than input$");
        System.out.println("@_@ Choice 4: Write more content to file\t   $");
        System.out.println("@_@ Choice 5: Read file and count characters\t   $");
        System.out.println("@_@ Choice 6: Exit\t\t\t\t   $");
        System.out.println("****************************************************");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkIntLimit(1,6 );
        return choice;
    }
}
