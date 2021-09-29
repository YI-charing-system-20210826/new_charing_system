CREATE TABLE customer(
customer_id int(10) NOT NULL  PRIMARY KEY UNIQUE KEY,
last_name VARCHAR(128) NOT NULL,
first_name VARCHAR(128) NOT NULL,
last_name_Kana VARCHAR(128) NOT NULL,
first_name_Kana VARCHAR(128) NOT NULL,
gender CHAR(1) NOT NULL,
tel_no int(11) NOT NULL,
email VARCHAR(100),
post_no int(7) NOT NULL,
address VARCHAR(128) NOT NULL,
address_datail VARCHAR(128) NOT NULL,
remarks VARCHAR(300),
)