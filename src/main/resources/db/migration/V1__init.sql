CREATE TABLE User (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  first_name varchar(255) not null,
  last_name varchar(255) not null,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO User(first_name, last_name) VALUES('Dave', 'Syer');