/* tabela produktu */

CREATE TABLE IF NOT EXIST product
(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	name VARCHAR(155) NOT NULL,
	price DECIMAL (6,2) NOT NULL,
	tax DECIMAL (0,2) NOT NULL
);

CREATE TABLE IF NOT EXIST customer
(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	company_name varchar(255),
	street varchar(155),
	house_number varchar(4),
	flat_number int,
	post_code varchar(6),
	city varchar(155),
	nip varchar(10)
);

CREATE TABLE IF NOT EXIST bar_order
(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	customer_id INT NOT NULL FOREIGN KEY (customer_id) REFERENCES customer,
	status ENUM	('opened','closed') NOT NULL DEFAULT 'opened',
	payment_doc ENUM('invoice', 'receipt')

)
