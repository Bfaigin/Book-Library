CREATE TABLE Person (
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(100) NOT NULL UNIQUE,
    dateOfBirth int NOT NULL
);

CREATE TABLE Book (
    id int PRIMARY KEY AUTO_INCREMENT,
    title varchar(100) NOT NULL,
    author varchar(100) NOT NULL,
    year int NOT NULL,
    person_id int REFERENCES Person(id) ON DELETE SET NULL
);