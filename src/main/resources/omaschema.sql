	CREATE TABLE IF NOT EXISTS weatheruser (
	weatheruser_id int NOT NULL PRIMARY KEY,
	weatheruser_name varchar(50),
	name varchar(50)
	);

	CREATE TABLE IF NOT EXISTS weather (
	weather_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	weather_text varchar(500),
	location varchar(50),
	weatherdate date NOT NULL,
	CONSTRAINT FOREIGN KEY (weather_id)
	);