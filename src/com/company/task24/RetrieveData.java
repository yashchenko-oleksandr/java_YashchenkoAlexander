package com.company.task24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.company.task24.ConnectionData.*;

public class RetrieveData {
    private static final String SELECT_QUERY = "SELECT * FROM phones;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            System.out.printf("%-20s%-20s%s%n", "id", "user_id", "phone_number");
            System.out.println("----------------------------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int name = resultSet.getInt("user_id");
                String name1 = resultSet.getString("phone_number");
                System.out.printf("%-20d%-20d%s%n", id, name, name1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
