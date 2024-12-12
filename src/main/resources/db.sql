DROP DATABASE IF EXISTS proyectosjsp;
CREATE DATABASE proyectosjsp;
USE proyectosjsp;

CREATE TABLE users(
                      userID INT AUTO_INCREMENT PRIMARY KEY,
                      username VARCHAR(50) NOT NULL UNIQUE,
                      password VARCHAR(20) NOT NULL
);

INSERT INTO users (username, password) VALUES ('admin', 'admin');