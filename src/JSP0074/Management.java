/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0074;

/**
 *
 * @author LONG
 */
public class Management {
    public static int Menu() {
        System.out.println("**********************MAIN MENU******************");
        System.out.println("@_@ Choice 1: Addition Matrix\t\t\t$");
        System.out.println("@_@ Choice 2: Subtraction Matrix\t\t$");
        System.out.println("@_@ Choice 3: Multiplication Matrix\t\t$");
        System.out.println("@_@ Choice 4: Exit\t\t\t\t$");
        System.out.println("*************************************************");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkIntLimit(1,4 );
        return choice;
    }
}
