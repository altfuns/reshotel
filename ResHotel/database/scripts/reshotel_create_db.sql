BEGIN TRANSACTION;
CREATE TABLE cliente (
	id INTEGER PRIMARY KEY,
	identificacion TEXT,
	nombre TEXT,
	telefono TEXT,
	numero_tarjeta_credito INTEGER,
	residencia INTEGER
);
INSERT INTO cliente VALUES(1,111111111,'Carlos',2211145,545448484,1);
CREATE TABLE habitacion (
	id INTEGER PRIMARY KEY,
	ocupacion_maxima INTEGER,
	numero INTEGER,
	mobiliario TEXT,
	costo REAL								
);
INSERT INTO habitacion VALUES(830705326,4,120,'TV, Refri, AC',60000.0);
INSERT INTO habitacion VALUES(1405646000,5,123,'TV',40000.0);
CREATE TABLE hotel (ubicacion INTEGER, id INTEGER PRIMARY KEY, telefono TEXT, email TEXT, clase INTEGER, nombre_persona_encargada TEXT);
INSERT INTO hotel VALUES(1,2,2222222,'hotel2@hoteles.com',3,'Pedro');
INSERT INTO hotel VALUES(3,1364358399,33333333,'hotel3@hoteles.com',4,'Rolando');
CREATE TABLE reservacion (
	id INTEGER PRIMARY KEY,
	habitacion INTEGER,
	fecha_entrada TEXT,
	fecha_salida TEXT,
	ocupacion INTEGER,
	monto REAL,
	identificacion_cliente TEXT
);
CREATE TABLE ubicacion (
	id INTEGER PRIMARY KEY,
	pais TEXT,
	ciudad TEXT
);
INSERT INTO ubicacion VALUES(1,'Costa Rica','San José');
INSERT INTO ubicacion VALUES(2,'Costa Rica','Guanacaste');
INSERT INTO ubicacion VALUES(3,'Estados Unidos','Florida');
INSERT INTO ubicacion VALUES(4,'Mexico','Cancún');
COMMIT;
