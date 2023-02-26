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
