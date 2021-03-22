DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS role;

CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    ip_address VARCHAR(250),
    alias VARCHAR(250)
);

CREATE TABLE users (
    user_id int PRIMARY KEY,
    user_name VARCHAR(250),
    first_name VARCHAR(250),
    last_name VARCHAR(250)
);

CREATE TABLE role (
    role_id int PRIMARY KEY,
    role_desc VARCHAR(250) NOT NULL
);

CREATE TABLE user_role (
    user_id int ,
    role_id int,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (role_id) REFERENCES role (role_id)
);

