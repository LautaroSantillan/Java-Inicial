/* Crando tabla*/

CREATE TABLE Clientes(
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(50) NOT NULL,
dni INT(11) not NULL,
cantidad_años INT(3) NOT NULL);

--Insertando registros

INSERT INTO Clientes

VALUES('Lautaro', 'Santillan', 45175053, 19),
('Nazareno', 'Perez', 28729298, 39),
('Marcelo', 'Sosa', 23019138, 40),
('Juan', 'Lopez', 24985123, 50);

--Clientes menores a 25 años

SELECT *
FROM Clientes
WHERE cantidad_años < 25

--Clientes entre 35 a 45 años

SELECT *
FROM Clientes
WHERE cantidad_años > 35
AND cantidad_años < 45

--Para ver resultados

SELECT * FROM Clientes