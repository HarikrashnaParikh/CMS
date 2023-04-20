CREATE TYPE roles AS ENUM ('Admin','Owner','Employee');
create table userDetail(
	id serial,
    name varchar(200) Default null,
    email varchar(200) Default null UNIQUE,
    phoneNo varchar(200) Default null UNIQUE,
    userType roles not null default 'Employee',
    primary key(id)
);
	/* for desc of table : \d tableName*/
create table menu(
	id serial,
    itemName varchar(200) NOT NULL,
    itemType varchar(200) default NULL,
    price int not null,
    available boolean default true,
    primary key(id)
);
create table orderList(
	id serial,
    itemId int not null,
    userId int not null,
    createdAt timestamp default current_timestamp,
    quantity int not null,
    cost int not null,
    isReady boolean default false,
    foreign key(itemId) references menu(id),
    foreign key(userId) references userDetail(id),
    primary key(id)
);
create table feedback(
	id serial,
	detail varchar(1000) not null,
    createdAt timestamp default current_timestamp,
	userId int not null,
	foreign key(userId) references userDetail(id)
);
create table inventory(
	id serial,
    inventoryName varchar(200) NOT NULL,
    stock int not null,
    expiry timestamp default null
);