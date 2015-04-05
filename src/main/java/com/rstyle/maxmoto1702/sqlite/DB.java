package com.rstyle.maxmoto1702.sqlite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Created by m on 05.04.2015.
 */
public class DB {

    private static final Logger LOG = LoggerFactory.getLogger(DB.class);

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void connect() {
        connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:spitter.s3db");
        } catch (ClassNotFoundException e) {
            LOG.error("Class 'org.sqlite.JDBC' not found", e);
        } catch (SQLException e) {
            LOG.error("SQL error", e);
        }
        LOG.info("База Подключена!");
    }

    public void createDB() {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'phone' INT);");
        } catch (SQLException e) {
            LOG.error("SQL error", e);
        }
        LOG.info("Таблица создана или уже существует.");
    }

    public void fillDB() {
        try {
            statement.execute("INSERT INTO 'USERS' ('NAME', 'PHONE') VALUES ('Petya', 125453); ");
            statement.execute("INSERT INTO 'USERS' ('NAME', 'PHONE') VALUES ('Vasya', 321789); ");
            statement.execute("INSERT INTO 'USERS' ('NAME', 'PHONE') VALUES ('Masha', 456123); ");
        } catch (SQLException e) {
            LOG.error("SQL error", e);
        }
        LOG.info("Таблица заполнена");
    }

    public void showDB() {
        try {
            resultSet = statement.executeQuery("SELECT ID, NAME, PHONE FROM USERS");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String phone = resultSet.getString("PHONE");
                LOG.info("ID = " + id + "; NAME = " + name + "; PHONE = " + phone);
            }
        } catch (SQLException e) {
            LOG.error("SQL error", e);
        }
        LOG.info("Таблица выведена");
    }

    public void closeDB() {
        try {
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            LOG.error("SQL error", e);
        }
        LOG.info("Соединения закрыты");
    }
}
