CREATE TABLE User (
	id BIGINT GENERATED BY DEFAULT AS IDENTITY,
	first_name varchar(255) not null,
	last_name varchar(255) not null
);

insert into User (first_name, last_name) values ('Dave', 'Syer');