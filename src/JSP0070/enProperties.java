/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0070;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
 
public class enProperties {
    public static void main(String[] args) throws Exception {
        OutputStream output = null;
        try {
            // Properties File output at project root folder
            output = new FileOutputStream("en.properties");
 
            // create properties object
            Properties prop = new Properties();
 
            // set the properties value
            prop.setProperty("errorCheckInputIntLimit", "Invalid. Re-input.");
            prop.setProperty("errCheckInputIntLimit", "String must not be empty.");
            prop.setProperty("errCheckInputAccount", "Account number must is a number and must have 10 digits.");
            prop.setProperty("errCheckLengthPassword", "Password must be between 8 and 31 characters.");
            prop.setProperty("errCheckAlphanumericPassword", "Password must be must be alphanumeric.");
            prop.setProperty("errCaptchaIncorrect", "Captcha incorrect");
            prop.setProperty("enterCaptcha", "Enter captcha: ");
            prop.setProperty("enterAccountNumber", "Account number: ");
            prop.setProperty("enterPassword", "Password: ");
            prop.setProperty("loginSuccess", "Login success");
            // save properties to a file
            prop.store(output, "Config Database connection");
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
 
        }
    }
}