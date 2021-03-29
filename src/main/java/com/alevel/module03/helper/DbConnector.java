package com.alevel.module03.helper;

import java.io.Closeable;
import java.sql.*;

public class DbConnector implements Closeable {
    private static final String URL = "jdbc:mysql://localhost:3306/module03?useUnicode=true&serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "1234";

    private static Connection connection;

    public DbConnector(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    public Statement getStatement(){
        try {
            return connection.createStatement();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    public PreparedStatement getPreparedStatement(String sql){
        try {
            return connection.prepareStatement(sql);
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    public ResultSet getExecuteQuery(String query){
        try {
            return connection.createStatement().executeQuery(query);
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }

    }

    public int executeUpdate(String sql){
        try {
            return connection.createStatement().executeUpdate(sql);
        } catch (SQLException sqlException) {
            throw  new RuntimeException(sqlException);
        }

    }


    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }

    }


}
