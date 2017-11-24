package com.company.task18;

/**
 * Created by Ukrainian IT_SCHOOL on 24.11.2017.
 */
public class ExpMain {
    public static void main(String[] args) {
        try {
            System.out.println(authentication("login1", "password1", "password1"));
            System.out.println(authentication("login1login1login1login1login1", "password1", "password1"));
            System.out.println(authentication("login1", "password1password1password1password1", "password1password1password1password1"));
            System.out.println(authentication("login1", "password1", "password2"));
            System.out.println(authentication("login1login1login1login1login1login1", "password1password1password1password1password1", "password2"));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }

    }

    public static boolean authentication(String login, String password, String confPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Неправильный логин");
        }
        if (password.length() > 20 || !password.equals(confPassword)) {
            throw new WrongPasswordException("Неправильный пароль");
        }
        return true;
    }
}
