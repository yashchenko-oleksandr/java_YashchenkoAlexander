package com.company.task24;

public class MainDAO {
    public static void main(String[] args) {
        /*UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.findEntityById(2));*/
        PhoneDAO phoneDAO = new PhoneDAO();
        System.out.println(phoneDAO.findAll());
        System.out.println(phoneDAO.findEntityById(3));
    }
}
