package com.company.task18;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class ExpMain {
    public static void main(String[] args) {
        System.out.println(authentication("login1", "password1", "password1"));
        System.out.println(authentication("login1login1login1login1login1", "password1", "password1"));
        System.out.println(authentication("login1", "password1password1password1password1", "password1password1password1password1"));
        System.out.println(authentication("login1", "password1", "password2"));
        System.out.println(authentication("login1login1login1login1login1login1", "password1password1password1password1password1", "password2"));

    }

    public static boolean authentication(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("_______Неправильный логин_______");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("_______Неправильный пароль_______");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("login - " + login);
            System.out.println("password - " + password);
            System.out.println("confPassword - " + confPassword);
        }
        return true;
    }
}
