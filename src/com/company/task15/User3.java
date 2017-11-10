package com.company.task15;

public class User3 {
    static String login = "Azdazor", password = "dfgsdfg";

    static class Query {
        void printToLog() {
            System.out.println("Пользователь с логином - " + login + " и паролем - " + password + " отправил запрос");
        }
    }

    public static void main(String[] args) {
        Query query = new Query();
        query.printToLog();
    }
}
