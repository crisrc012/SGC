--Tablas de SGC
--PostgreSQL 9.3

--Crear DB llamada "dbSGC"

create table tbl_becas(
	id serial primary key,
	nombre varchar(50) not null,
	porcentaje integer not null
);

create table tbl_persona(
	id serial primary key,
	descripcion varchar(10) not null
);

create table tbl_personas(
	cedula integer primary key,
	nombre varchar(25) not null,
	apellidos varchar(50) not null,
	fecha_nacimiento date not null,
	tel_celular integer,
	tel_habitacion integer,
	encargado varchar(50) not null,
	id_persona integer references tbl_persona(id)
);

create table tbl_becados(
	id serial primary key,
	id_persona integer references tbl_personas(cedula),
	id_beca integer references tbl_becas(id),
	activo boolean not null,
	observaciones varchar(200) not null
);

create table tbl_comida(
	id serial primary key,
	descripcion varchar(20) not null
);

create table tbl_precio(
	id serial primary key,
	id_persona integer references tbl_persona(id),
	id_comida integer references tbl_comida(id),
	precio integer not null
);

create table tbl_tiquetes(
	id serial primary key,
	id_persona integer references tbl_personas(cedula),
	id_precio integer references tbl_precio(id),
	fecha_compra date not null,
	fecha_uso date not null,
	activo boolean not null
);

-- Usuarios Login
create table tbl_roles(
	id serial primary key,
	descripcion varchar(20)
);

create table tbl_usuarios(
	cedula integer primary key,
	usuario varchar(25) not null,
	contrasena varchar(1000) not null,
	nombre_completo varchar(50) not null,
	activo boolean not null,
	observaciones varchar(200) not null,
	id_rol integer references tbl_roles(id)
);