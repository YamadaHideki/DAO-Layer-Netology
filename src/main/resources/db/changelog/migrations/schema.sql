create table customers (
	id serial primary key,
	name varchar(256),
	surname varchar(256),
	age integer,
	phone_number varchar(256)
);
create table orders (
	id serial primary key,
	date date,
	customer_id integer,
	product_name varchar(256),
	amount integer,
	foreign key (customer_id) references customers (id)
);
insert into customers (name) values ('Alexey');
insert into customers (name) values ('aLeXeY');
insert into orders (date, customer_id, product_name) values (current_date, 2, 'peach');
insert into orders (date, customer_id, product_name) values (current_date, 1, 'milk');