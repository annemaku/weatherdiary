	CREATE TABLE IF NOT EXISTS weatheruser (
	id int NOT NULL PRIMARY KEY,	
	user_name varchar(50),
	password varchar(20),
	name varchar(50),
	role varchar(50)
	);

	CREATE TABLE IF NOT EXISTS weather (
	weather_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	weatherdate date NOT NULL,
	location varchar(50),
	temperature varchar(20),
	description varchar(50)
	);
	
	CREATE TABLE IF NOT EXISTS user (
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	username varchar(10),
	password varchar(100),
	role varchar(10)
	);