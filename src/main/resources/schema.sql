create schema netology;

create table netology.customers (
                                    id serial primary key,
                                    name varchar,
                                    surname varchar,
                                    age integer,
                                    phone_number bigint UNIQUE
);

create table netology.orders (
                                 id serial primary key,
                                 date date,
                                 customer_id integer,
                                 product_name varchar,
                                 amount integer,
                                 FOREIGN KEY (customer_id) REFERENCES netology.customers (id)
);


insert into netology.customers (name, surname, age, phone_number)
values ('Viktor', 'Perminov', 25, 89658568585);

insert into netology.customers (name, surname, age, phone_number)
values ('Natalia', 'Trifonova', 27, 89658567486);

insert into netology.customers (name, surname, age, phone_number)
values ('Alexey', 'Vachevske', 28, 89658567489);

insert into netology.customers (name, surname, age, phone_number)
values ('Andrey', 'Suvorov', 30, 89658567475);



insert into netology.orders (date, customer_id, product_name, amount)
values ('2023-10-21', 1, 'Консоль', 1);

insert into netology.orders (date, customer_id, product_name, amount)
values ('2022-10-20', 2, 'Телевизор', 1);

insert into netology.orders (date, customer_id, product_name, amount)
values ('2022-10-19', 3,  'Игра', 3);

insert into netology.orders (date, customer_id, product_name, amount)
values ('2022-10-20', 4, 'Инструмент', 10);