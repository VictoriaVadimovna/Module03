package com.alevel.module03;

import com.alevel.module03.helper.CreateTable;
import com.alevel.module03.helper.DbConnector;

public class App {
    public static void main(String[] args) {

        DbConnector dbConnector = new DbConnector();
        CreateTable.createTableUser(dbConnector);
        CreateTable.createTablePost(dbConnector);
        dbConnector.close();
    }

}
