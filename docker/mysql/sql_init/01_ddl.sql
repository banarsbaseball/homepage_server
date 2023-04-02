CREATE DATABASE IF NOT EXISTS banars_homepage CHARACTER SET
utf8 COLLATE utf8_general_ci;

USE banars_homepage;

CREATE TABLE IF NOT EXISTS banars_homepage.user(
    id    varchar(50) PRIMARY KEY,
    team_id       varchar(50) NOT NULL,
    login_id       varchar(50) NOT NULL,
    login_password      varchar(30) NOT NULL,
    user_name     varchar(30) NOT NULL,
    user_type     varchar(30) NOT NULL,
    INDEX(id)
);

CREATE TABLE IF NOT EXISTS banars_homepage.user_introduction(
    id    varchar(50) PRIMARY KEY,
    user_id       varchar(50) NOT NULL,
    date_of_birth      varchar(30) NOT NULL,
    main_image_url     varchar(30) NOT NULL,
    discription     varchar(30) NOT NULL,
    INDEX(id)
);

CREATE TABLE IF NOT EXISTS banars_homepage.team(
    id    varchar(50) PRIMARY KEY,
    name       varchar(50) NOT NULL,
    main_image_url     varchar(50) NOT NULL,
    INDEX(id)
);

-- AddForeignKey
ALTER TABLE user_introduction ADD CONSTRAINT user_id_fkey FOREIGN KEY (user_id) REFERENCES user(id)