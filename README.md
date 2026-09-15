# Gestor de Materias

Aplicación para organizar materias y actividades (TPs, exámenes, parciales) de la facultad. Proyecto personal para practicar POO en Java y conexión a bases de datos con JDBC.

## Estado del proyecto
🚧 En construcción — por ahora solo el modelo de base de datos.

## Tecnologías
- Java
- PostgreSQL
- JDBC

## Base de datos
El esquema está en `schema.sql`. Incluye dos tablas:
- `materia`: las materias que estás cursando
- `actividad`: TPs, exámenes y parciales asociados a cada materia

Para levantar la base:
```sql
CREATE DATABASE gestor_materias;
-- luego correr el contenido de schema.sql
```

## Próximos pasos
- [ ] Clases Java (Materia, Actividad)
- [ ] Conexión JDBC
- [ ] Menú CRUD por consola