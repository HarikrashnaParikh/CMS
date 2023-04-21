CREATE TYPE roles AS ENUM ('Admin','Owner','Employee');
create table userDetail(
	id serial,
    name varchar(200) Default null,
    email varchar(200) Default null UNIQUE,
    phone_no varchar(200) Default null UNIQUE,
    user_type roles not null default 'Employee',
    primary key(id)
);
	/* for desc of table : \d tableName*/
create table menu(
	id serial,
    item_name varchar(200) NOT NULL,
    item_type varchar(200) default NULL,
    price int not null,
    available boolean,
    primary key(id)
);
create table orderList(
	id serial,
    item_id int not null,
    user_id int not null,
    created_at timestamp default current_timestamp,
    quantity int not null,
    cost int not null,
    is_ready boolean default false,
    foreign key(item_id) references menu(id),
    foreign key(user_id) references userDetail(id),
    primary key(id)
);
create table feedback(
	id serial,
	detail varchar(1000) not null,
    created_at timestamp default current_timestamp,
	user_id int not null,
	foreign key(user_id) references userDetail(id)
);
create table inventory(
	id serial,
    inventory_name varchar(200) NOT NULL,
    stock int not null,
    expiry timestamp default null
);