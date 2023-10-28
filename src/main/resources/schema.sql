create schema if not exists netology;
create table if not exists netology.CUSTOMERS
(
    id           serial primary key,
    name         varchar(255)            not null,
    surname      varchar(255)            not null,
    age          int check ( age < 140 ) not null,
    phone_number varchar(255)            not null
);

create table if not exists netology.ORDERS
(
    id           serial primary key,
    data         varchar(255) not null,
    customer_id  int,
    produсt_name varchar(255) not null,
    amount       int          not null check ( amount >= 0 ),
    foreign key (customer_id) references netology.CUSTOMERS (id)
);