BEGIN TRANSACTION;
CREATE TABLE cliente (
	id INTEGER PRIMARY KEY,
	identificacion TEXT,
	nombre TEXT,
	telefono TEXT,
	numero_tarjeta_credito INTEGER,
	residencia INTEGER
);

CREATE TABLE habitacion (
	id INTEGER PRIMARY KEY,
	hotel INTEGER,
	ocupacion_maxima INTEGER,
	numero INTEGER,
	mobiliario TEXT,
	costo REAL								
);

CREATE TABLE hotel (
	id INTEGER PRIMARY KEY,
	nombre TEXT,
	ubicacion INTEGER,
	telefono TEXT,
	email TEXT,
	clase INTEGER,
	nombre_persona_encargada TEXT
);

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

COMMIT;
