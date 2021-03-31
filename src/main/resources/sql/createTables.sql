CREATE TYPE Post_Status AS ENUM ('PUBLISHED','DRAFT','WORKSHEET','IN_PROGRESS');


CREATE TABLE  users (user_id int PRIMARY KEY,
            full_name varchar(50) NOT NULL,
            login varchar(50) NOT NULL UNIQUE,
            email varchar(255) NOT NULL UNIQUE CHECK ( email = '%@%') ,
            age INT CHECK(Age > 18) ,
            is_author boolean DEFAULT false,
            is_moderator boolean DEFAULT false );

CREATE TABLE posts(post_id int Primary Key AUTO_INCREMENT,
            title varchar(100) NOT NULL,
            content varchar(1000) ,
            author int NOT NULL,
            moderator int,
            rating int,
            status Post_Status NOT NULL,
            FOREIGN KEY(author) REFERENCES users(user_id)
            FOREIGN KEY(moderator) REFERENCES users(user_id)
            );


