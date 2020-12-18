/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0075;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author LONG
 */
public class Validation {
    private static final Scanner in = new Scanner(System.in);

    public static int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            try {
                String result = in.nextLine().trim();
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Not empty");
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Size is digit");
            }
        }
    }

    public static void checkPath() {
        System.out.print("Enter path: ");
        String path = checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("Path to File.");
        } else if (file.exists() && file.isDirectory()) {
            System.out.println("Path to Directory");
        } else {
            System.out.println("Path doesn't exist");
        }
    }
}
