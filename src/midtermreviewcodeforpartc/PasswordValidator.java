/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 * @author Anmol
 * Time 5:30pm
 */
public class PasswordValidator {
    public static boolean validatePassword(String password) {
        int specialCharCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                specialCharCount++;
            }
        }

        return specialCharCount > 0 && password.length() > 7;
    }
}
