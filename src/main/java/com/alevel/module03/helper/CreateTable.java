package com.alevel.module03.helper;

public class CreateTable {

    private static final String CREATE_TABLE_USER = "CREATE TABLE IF NOT EXISTS users (user_id int AUTO_INCREMENT PRIMARY KEY, " +
            "full_name varchar(50) NOT NULL, " +
            "login varchar(50) NOT NULL UNIQUE, " +
            "email varchar(255) NOT NULL UNIQUE CHECK ( email = '%@%') , " +
            "age INT CHECK(Age > 18) , " +
            "is_author TINYINT DEFAULT 0, " +
            "is_moderator TINYINT DEFAULT 0 " +
            ");";

    private static final String CREATE_TABLE_POST = "CREATE TABLE IF NOT EXISTS posts(post_id int Primary Key AUTO_INCREMENT, " +
            "title varchar(100) NOT NULL," +
            "content varchar(1000) ," +
            "author int NOT NULL" +
            "moderator int " +
            "rating int " +
            "status varchar(20) DEFAULT 'IN_PROGRESS' NOT NULL" +
            "FOREIGN KEY(author) REFERENCES users(user_id)," +
            "FOREIGN KEY(moderator) REFERENCES users(user_id)," +
            ");";


    public static void createTableUser(DbConnector dbConnector) {
        dbConnector.executeUpdate(CREATE_TABLE_USER);

    }

    public static void createTablePost(DbConnector dbConnector) {
        dbConnector.executeUpdate(CREATE_TABLE_POST);

    }

}

