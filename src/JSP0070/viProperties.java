package JSP0070;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LONG
 */
public class viProperties {
    public static void main(String[] args) throws Exception {
        OutputStream output = null;
        try {
            // Properties File output at project root folder
            output = new FileOutputStream("vi.properties");
 
            // create properties object
            Properties prop = new Properties();
 
            // set the properties value
            prop.setProperty("errorCheckInputIntLimit", "Kh\\u00f4ng h\\u1ee3p l\\u1ec7. Vui l\\u00f2ng nh\\u1eadp l\\u1ea1i.");
            prop.setProperty("errCheckInputIntLimit", "Chu\\u1ed7i kh\\u00f4ng \\u0111\\u01b0\\u1ee3c r\\u1ed7ng.");
            prop.setProperty("errCheckInputAccount", "S\\u1ed1 t\\u00e0i kho\\u1ea3n ph\\u1ea3i l\\u00e0 m\\u1ed9t s\\u1ed1 v\\u00e0 ph\\u1ea3i c\\u00f3 10 ch\\u1eef s\\u1ed1.");
            prop.setProperty("errCheckLengthPassword", "M\\u1eadt kh\\u1ea9u ph\\u1ea3i trong kho\\u1ea3ng 8 - 31 k\\u00fd t\\u1ef1.");
            prop.setProperty("errCheckAlphanumericPassword", "M\\u1eadt kh\\u1ea9u ph\\u1ea3i bao g\\u1ed3m c\\u1ea3 s\\u1ed1 v\\u00e0 ch\\u1eef c\\u00e1i. ");
            prop.setProperty("errCaptchaIncorrect", "Captcha sai.");
            prop.setProperty("enterCaptcha", "Nh\\u1eadp v\\u00e0o captcha: ");
            prop.setProperty("enterAccountNumber", "S\\u1ed1 t\\u00e0i kho\\u1ea3n: ");
            prop.setProperty("enterPassword", "M\\u1eadt kh\\u1ea9u: ");
            prop.setProperty("loginSuccess", "\\u0110\\u0103ng nh\\u1eadp th\\u00e0nh c\\u00f4ng.");
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
