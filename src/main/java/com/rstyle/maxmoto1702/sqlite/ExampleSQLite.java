package com.rstyle.maxmoto1702.sqlite;

import java.sql.SQLException;

/**
 * Created by m on 05.04.2015.
 */
public class ExampleSQLite {

    private static final DB db = new DB();

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        db.connect();
        db.createDB();
        db.fillDB();
        db.showDB();
        db.closeDB();
    }
}
