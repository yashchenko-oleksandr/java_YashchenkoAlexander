package com.company.task15;

public class User {
    public static void main(String[] args) {
        User user = new User("Sancho", "1234");
        user.createQuery();
        User.Guery guery1 = user.new Guery();
        User.Guery guery2 = new User().new Guery();
        guery1.printToLog();
        guery2.printToLog();
    }

    private String login, password;

    public User() {
        login = "adazor";
        password = "qwery";
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public class Guery {
        public void printToLog() {
            System.out.println("Пользовтель с логином - " + login + " и паролем - " + password + " отправил запрос");
        }
    }

    public void createQuery() {
        Guery guery = new Guery();
        guery.printToLog();
    }
}
