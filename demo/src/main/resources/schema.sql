CREATE TABLE if not exists customer(
customer_id int(10) NOT NULL  PRIMARY KEY UNIQUE KEY,
last_name VARCHAR(128) NOT NULL,
first_name VARCHAR(128) NOT NULL,
last_name_Kana VARCHAR(128) NOT NULL,
first_name_Kana VARCHAR(128) NOT NULL
);