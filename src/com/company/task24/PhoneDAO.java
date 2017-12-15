package com.company.task24;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ukrainian IT_SCHOOL on 15.12.2017.
 */
public class PhoneDAO extends AbstractDAO<Integer, Phone> {
    public static final String SQL_SELECT_ALL_PHONE = "SELECT * FROM phones";
    public static final String SQL_SELECT_PHONE_ID = "SELECT * FROM phones WHERE id=?";

    @Override
    public List<Phone> findAll() {
        List<Phone> phone = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_PHONE);
            while (rs.next()) {
                int id = rs.getInt(1);
                int user_id = rs.getInt(2);
                String phone_number = rs.getString(3);
                phone.add(new Phone(id, user_id,phone_number));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return phone;
    }

    @Override
    public Phone findEntityById(Integer id) {
        Phone phone = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_PHONE_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int id1 = rs.getInt(1);
                int user_id = rs.getInt(2);
                String phone_number = rs.getString(3);
                phone = new Phone(id1, user_id,phone_number);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return phone;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean delete(Phone entity) {
        return false;
    }

    @Override
    public boolean create(Phone entity) {
        return false;
    }

    @Override
    public Phone update(Phone entity) {
        return null;
    }
}
