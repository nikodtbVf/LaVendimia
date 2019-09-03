create database bd_escuela;

/* Imagina una simple base de datos donde se almacena información de las calificaciones de alumnos.
Diseña como pudiera lucir esta base de datos y 
genera una consulta que regresa una lista con los mejores alumnos (top 10%), ordenados por su promedio.*/

Alumno
Profesores
Materias


create table persona(
   id serial primary key,
   nombre varchar(50) not null,
   apellido_paterno varchar(50) not null,
   apellido_materno varchar(50) not null,
   fecha_nacimiento date not null  	
);

create table profesor(
     id serial primary key,
     persona_id integer references persona(id),
     nivel integer not null default 1			
); 

create table alumno( 
    id serial primary key,
    persona_id integer references persona(id),
    matricula varchar(20) not null
);

create table materia(
    id serial primary key, 
    nombre varchar(50) not null,
    total_creditos integer not null default 1
);

create table profesor_materia(
    id serial primary key, 
    profesor_id integer references profesor(id),
    materia_id integer references materia(id)
);

create table alumno_materia(
    id serial primary key,
    alumno_id integer references alumno(id),
    profesor_materia_id integer references profesor_materia(id),
    calificacion integer not null default 0	
);

insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('NICO', 'VILLEGAS', 'FELIX', '1993-09-10');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'UNO', '2000-01-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'DOS', '2000-02-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'TRES', '2000-03-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'CUATRO', '2000-04-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'CINCO', '2000-05-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'SEIS', '2000-06-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'SIETE', '2000-07-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'OCHO', '2000-08-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'CERO', 'NUEVE', '2000-09-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'UNO', 'CERO', '2000-10-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'UNO', 'UNO', '2000-11-01');
insert into persona(nombre, apellido_paterno, apellido_materno, fecha_nacimiento) values ('ALUMNO', 'UNO', 'DOS', '2000-12-01');

insert into profesor (persona_id, nivel) values (1, 2);

insert into alumno (persona_id, matricula) values (2, '001');
insert into alumno (persona_id, matricula) values (3, '002');
insert into alumno (persona_id, matricula) values (4, '003');
insert into alumno (persona_id, matricula) values (5, '004');
insert into alumno (persona_id, matricula) values (6, '005');
insert into alumno (persona_id, matricula) values (7, '006');
insert into alumno (persona_id, matricula) values (8, '007');
insert into alumno (persona_id, matricula) values (9, '008');
insert into alumno (persona_id, matricula) values (10, '009');
insert into alumno (persona_id, matricula) values (11, '010');
insert into alumno (persona_id, matricula) values (12, '011');
insert into alumno (persona_id, matricula) values (3, '012');

insert into materia (nombre,total_creditos) values ('POO', 5);
insert into materia (nombre,total_creditos) values ('CALCULO DIFERENCIAL', 5);
insert into materia (nombre,total_creditos) values ('MATEMATICAS DISCRETAS', 4);
insert into materia (nombre,total_creditos) values ('ADMINISTRACION', 4);

insert into profesor_materia(profesor_id, materia_id) values (1, 1);
insert into profesor_materia(profesor_id, materia_id) values (1, 2);
insert into profesor_materia(profesor_id, materia_id) values (1, 3);
insert into profesor_materia(profesor_id, materia_id) values (1, 4);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (1,2, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (1,3, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (1,4, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (1,5, 80);


insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (2,2, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (2,3, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (2,4, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (2,5, 85);


insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (3,2, 90);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (3,3, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (3,4, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (3,5, 90);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (4,2, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (4,3, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (4,4, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (4,5, 100);


insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (5,2, 70);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (5,3, 60);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (5,4, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (5,5, 70);


insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (6,2, 50);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (6,3, 70);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (6,4, 30);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (6,5, 50);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (7,2, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (7,3, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (7,4, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (7,5, 85);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (8,2, 70);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (8,3, 70);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (8,4, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (8,5, 80);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (9,2, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (9,3, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (9,4, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (9,5, 100);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (10,2, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (10,3, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (10,4, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (10,5, 90);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (11,2, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (11,3, 80);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (11,4, 40);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (11,5, 50);

insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (12,2, 100);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (12,3, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (12,4, 85);
insert into alumno_materia (alumno_id, profesor_materia_id, calificacion) values (12,5, 80);









