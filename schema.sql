CREATE DATABASE gestor_materias;

CREATE TABLE materia (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    cuatrimestre VARCHAR(20)
);

CREATE TABLE actividad (
    id SERIAL PRIMARY KEY,
    materia_id INTEGER NOT NULL REFERENCES materia(id),
    titulo VARCHAR(150) NOT NULL,
    tipo VARCHAR(20) NOT NULL CHECK (tipo IN ('TP', 'Examen', 'Parcial')),
    fecha_entrega DATE,
    estado VARCHAR(20) NOT NULL DEFAULT 'Pendiente' CHECK (estado IN ('Pendiente', 'En progreso', 'Hecho')),
    descripcion TEXT
);

SELECT * FROM materia;
SELECT * FROM actividad;