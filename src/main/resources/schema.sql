/* tabela produktu */

CREATE TABLE IF NOT EXISTS product
(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	name VARCHAR(155) NOT NULL,
	price DECIMAL (6,2) NOT NULL,
	tax DECIMAL (0,2) NOT NULL
);

/* tabela klienta musi zawierać informacje potrzebne do faktury */

CREATE TABLE IF NOT EXISTS customer
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

/* zamówienie ma przypisanego klienta, ma informacje o swoim statusie oraz wersji rachunku*/

CREATE TABLE IF NOT EXISTS bar_order
(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	customer_id INT NOT NULL, 
	status ENUM	('opened','closed') NOT NULL DEFAULT 'opened',
	payment_doc ENUM('invoice', 'receipt'),
	CONSTRAINT FK_customer_id FOREIGN KEY (customer_id) REFERENCES customer(id)

);

/* tabela pośrednia łącząca informacje o produkcie na zamówieniu */

CREATE TABLE IF NOT EXISTS bar_order_product
(
	bar_order_id INT NOT NULL, 
	product_id INT NOT NULL, 
	quantity INT NOT NULL,
	PRIMARY KEY (bar_order_id, product_id),
	CONSTRAINT FK_bar_order_id FOREIGN KEY (bar_order_id) REFERENCES bar_order(id),
	CONSTRAINT FK_product_id FOREIGN KEY (product_id) REFERENCES product(id)
);


