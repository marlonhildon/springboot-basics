CREATE SCHEMA IF NOT EXISTS SPRINGBOOT_BASICS;

SET SCHEMA SPRINGBOOT_BASICS;

CREATE TABLE CHARACTERS (
    ID INTEGER AUTO_INCREMENT NOT NULL,
    NAME VARCHAR(20),
    PRIMARY KEY (ID)
)