			// Create users: admin/jokuadmin user/salainen

INSERT INTO weatheruser (id, user_name, password, name, role)
VALUES (1, 'admin', '$2a$04$w6y7RlrWpcM4qUrTlBpqCewe.yoE50mUesURMVhTIX9vChxs1UwKi', 'Palvelun pääkäyttäjä', 2);
INSERT INTO weatheruser (id, user_name, password, name, role)
VALUES (2, 'user', '$2a$04$rOkXrvAb7xugTE8MTyTz2OtKQTzky/aW1TcZS6NjJXF5SYyKmutYm', 'Muu käyttäjä', 3);


INSERT INTO weather (weather_id, weatherdate, location, temperature, description) VALUES
(1, '2018-12-05', 'Espoo', '4', 'pilvinen');
INSERT INTO weather (weather_id, weatherdate, location, temperature, description) VALUES
(2, '2018-12-06', 'Espoo', '3', 'aurinkoinen');

INSERT INTO user (id, username, password, role) VALUES
(1, 'user', '$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi','USER');
INSERT INTO user (id, username, password, role) VALUES
(2, 'admin', '$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG','ADMIN');
