﻿--Tablas de SGC
--PostgreSQL 9.5

drop database "dbSGC";

create database "dbSGC"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Spanish_Costa Rica.1252'
       LC_CTYPE = 'Spanish_Costa Rica.1252'
       CONNECTION LIMIT = -1;

create table tbl_becas(
	id serial primary key,
	nombre text not null unique,
	porcentaje integer not null,
	activo boolean not null,
	observaciones text not null
);

create table tbl_persona(
	id serial primary key,
	descripcion text not null unique
);

insert into tbl_persona
values
	(1,'Estudiante'),
	(2,'Funcionario');

create table tbl_personas(
	cedula bigint primary key,
	nombre text not null,
	apellidos text not null,
	fecha_nacimiento date not null,
	tel_celular integer,
	tel_habitacion integer,
	encargado text not null,
	activo boolean not null,
	id_persona integer references tbl_persona(id)
);

create table tbl_personas_avatar(
	cedula integer unique references tbl_personas(cedula),
	foto bytea
);

create table tbl_becados(
	id serial primary key,
	id_persona bigint references tbl_personas(cedula),
	id_beca integer references tbl_becas(id),
	activo boolean not null,
	observaciones text not null
);

create table tbl_comida(
	id serial primary key,
	descripcion text not null unique
);

insert into tbl_comida
values
	(1,'Desayuno'),
	(2,'Almuerzo');

create table tbl_precio(
	id serial primary key,
	id_persona integer references tbl_persona(id),
	id_comida integer references tbl_comida(id),
	precio integer not null
);

insert into tbl_precio
values
	(1,1,1,0),
	(2,2,1,0),
	(3,1,2,0),
	(4,2,2,0);

create table tbl_tiquetes(
	id serial primary key,
	id_persona bigint references tbl_personas(cedula),
	id_precio integer references tbl_precio(id),
	fecha_compra date not null,
	fecha_uso date,
	activo boolean not null
);

-- Usuarios Login
create table tbl_roles(
	id serial primary key,
	descripcion text unique
);

insert into tbl_roles
values
	(1000,'Administrador');

create table tbl_usuarios(
	cedula bigint primary key,
	usuario text not null unique,
	contrasena text not null,
	nombre text not null,
	apellidos text not null,
	activo boolean not null,
	observaciones text not null,
	id_rol integer references tbl_roles(id)
);

insert into tbl_usuarios
values
	(0,'root','Jj8OpRmCIuqBLvN+35WZJw==','root','root',true,'Superusuario',1000);

-- Tabla de Datos de la institución
create table tbl_institucion(
	id int not null,
	nombre text,
	foto bytea
);

insert into tbl_institucion values(0,null,null);

-- Funciones
create or replace function f_becados(
	in dml text,
	in _id integer,
	in _id_persona bigint,
	in _id_beca integer,
	in _activo boolean,
	in _observaciones text)
returns table(
	id integer,
	id_persona bigint,
	id_beca integer,
	activo boolean,
	observaciones text) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_becados t
			where t.id = coalesce(_id, t.id) and
			t.id = coalesce(_id, t.id) and
			t.id_persona = coalesce(_id_persona, t.id_persona) and
			t.id_beca = coalesce(_id_beca, t.id_beca) and
			t.activo = coalesce(_activo, t.activo) and
			t.observaciones like '%' || coalesce(upper(_observaciones), t.observaciones) || '%';
		when 'insert' then
			insert into tbl_becados (id_persona, id_beca, activo, observaciones)
			values (_id_persona, _id_beca, _activo, upper(_observaciones));
		when 'update' then
			update tbl_becados t
			set id_persona = _id_persona,
			id_beca = _id_beca,
			activo = _activo,
			observaciones = upper(_observaciones)
			where t.id = _id;
		when 'delete' then
			delete from tbl_becados t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql;

create  or replace function f_becas(
	in dml text,
	in _id integer,
	in _nombre text,
	in _porcentaje integer,
	in _activo boolean,
	in _observaciones text)
returns table(
	id integer,
	nombre text,
	porcentaje integer,
	activo boolean,
	observaciones text) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_becas t
			where t.id = coalesce(_id, t.id) and
			t.nombre like '%' || coalesce(upper(_nombre), t.nombre) || '%' and
			t.porcentaje = coalesce(_porcentaje, t.porcentaje) and
			t.activo = coalesce(_activo, t.activo) and
			t.observaciones = coalesce(_observaciones, t.observaciones)
			order by t.porcentaje;
		when 'insert' then
			insert into tbl_becas (nombre, porcentaje, activo, observaciones)
			values (upper(_nombre), _porcentaje, _activo, upper(_observaciones));
		when 'update' then
			update tbl_becas t
			set nombre = upper(_nombre),
			porcentaje = _porcentaje,
			activo = _activo,
			observaciones = upper(_observaciones)
			where t.id = _id;
		when 'delete' then
			delete from tbl_becas t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql;

create or replace function f_comida(
	in dml text,
	in _id integer,
	in _descripcion text)
returns table(
	id integer,
	descripcion text) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_comida t
			where t.id = coalesce(_id, t.id) and
			t.descripcion like '%' || coalesce(upper(_descripcion), t.descripcion) || '%'
			order by t.descripcion;
		when 'insert' then
			insert into tbl_comida (descripcion) VALUES (upper(_descripcion));
		when 'update' then
			update tbl_comida t
			set descripcion = upper(_descripcion)
			where t.id = _id;
		when 'delete' then
			delete from tbl_comida t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql;

create or replace function f_persona(
	in dml text,
	in _id integer,
	in _descripcion text)
returns table(
	id integer,
	descripcion text) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_persona t
			where t.id = coalesce(_id, t.id) and
			t.descripcion like '%' || coalesce(upper(_descripcion), t.descripcion) || '%'
			order by t.descripcion;
		when 'insert' then
			insert into tbl_persona (descripcion)
			values (upper(_descripcion));
		when 'update' then
			update tbl_persona t
			set descripcion = upper(_descripcion)
			where t.id = _id;
		when 'delete' then
			delete from tbl_persona t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql;

create or replace function f_personas(
	in dml text,
	in _cedula bigint,
	in _nombre text,
	in _apellidos text,
	in _fecha_nacimiento date,
	in _tel_celular integer,
	in _tel_habitacion integer,
	in _encargado text,
	in _activo boolean,
	in _id_persona integer)
returns table(
	cedula bigint,
	nombre text,
	apellidos text,
	fecha_nacimiento date,
	tel_celular integer,
	tel_habitacion integer,
	encargado text,
	activo boolean,
	id_persona integer) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_personas t
			where t.cedula = coalesce(_cedula, t.cedula) and
			t.nombre like '%' || coalesce(upper(_nombre), t.nombre) || '%' and
			t.apellidos like '%' || coalesce(upper(_apellidos), t.apellidos) || '%' and
			t.fecha_nacimiento = coalesce(_fecha_nacimiento, t.fecha_nacimiento) and
			t.tel_celular = coalesce(_tel_celular, t.tel_celular) and
			t.tel_habitacion = coalesce(_tel_habitacion, t.tel_habitacion) and
			t.activo = coalesce(_activo, t.activo) and
			t.encargado like '%' || coalesce(upper(_encargado), t.encargado) || '%' and
			t.id_persona = coalesce(_id_persona, t.id_persona)
			order by t.nombre;
		when 'insert' then
			insert into tbl_personas (cedula, nombre, apellidos, fecha_nacimiento, tel_celular, tel_habitacion, encargado, activo, id_persona)
			values (_cedula, upper(_nombre), upper(_apellidos), _fecha_nacimiento, _tel_celular, _tel_habitacion, upper(_encargado), _activo, _id_persona);
		when 'update' then
			update tbl_personas t
			set nombre = upper(_nombre),
			apellidos = upper(_apellidos),
			fecha_nacimiento = _fecha_nacimiento,
			tel_celular = _tel_celular,
			tel_habitacion = _tel_habitacion,
			encargado = upper(_encargado),
			activo = _activo,
			id_persona = _id_persona
			where t.cedula = _cedula;
		when 'delete' then
			delete from tbl_personas t
			where t.cedula = _cedula;
	end case;
end;
$body$
language plpgsql;

create or replace function f_precio(
	in dml text,
	in _id integer,
	in _id_persona integer,
	in _id_comida integer,
	in _precio integer)
returns table(
	id integer,
	id_persona integer,
	id_comida integer,
	precio integer) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_precio t
			where t.id = coalesce(_id, t.id) and
			t.id_persona = coalesce(_id_persona, t.id_persona) and
			t.id_comida = coalesce(_id_comida, t.id_comida) and
			t.precio = coalesce(_precio, t.precio)
			order by t.id;
		when 'insert' then
			insert into tbl_precio (id_persona, id_comida, precio)
			values (_id_persona, _id_comida, _precio);
		when 'update' then
			update tbl_precio t
			set id_persona = _id_persona,
			id_comida = _id_comida,
			precio = _precio
			where t.id = _id;
		when 'delete' then
			delete from tbl_precio t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql;

create or replace function f_roles(
	in dml text,
	in _id integer,
	in _descripcion text)
returns table(
	id integer,
	descripcion text) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_roles t
			where t.id = coalesce(_id, t.id) and
			t.descripcion like '%' || coalesce(upper(_descripcion), t.descripcion) || '%'
			order by t.descripcion;
		when 'insert' then
			insert into tbl_roles (descripcion)
			values (upper(_descripcion));
		when 'update' then
			update tbl_roles t
			set descripcion = upper(_descripcion)
			where t.id = _id;
		when 'delete' then
			delete from tbl_roles t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql;

create or replace function f_tiquetes(
	in dml text,
	in _id integer,
	in _id_persona integer,
	in _id_precio integer,
	in _fecha_compra date,
	in _fecha_uso date,
	in _activo boolean)
returns table(
	id integer,
	id_persona integer,
	id_precio integer,
	fecha_compra date,
	fecha_uso date,
	activo boolean) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_tiquetes t
			where t.id = coalesce(_id, t.id) and
			t.id_persona = coalesce(_id_persona, t.id_persona) and
			t.id_precio = coalesce(_id_precio, t.id_precio) and
			t.fecha_compra = coalesce(_fecha_compra, t.fecha_compra) and
			t.fecha_uso = coalesce(_fecha_uso, t.fecha_uso) and
			t.activo = coalesce(_activo, t.activo);
		when 'insert' then
			insert into tbl_tiquetes (id_persona, id_precio, fecha_compra, fecha_uso, activo)
			values (_id_persona, _id_precio, _fecha_compra, _fecha_uso, _activo);
		when 'update' then
			update tbl_tiquetes t
			set id_persona = _id_persona,
			id_precio = _id_precio,
			fecha_compra = _fecha_compra,
			fecha_uso = _fecha_uso,
			activo = _activo
			where t.id = _id;
		when 'delete' then
			delete from tbl_tiquetes t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql;

create or replace function f_usuarios(
	in dml text,
	in _cedula bigint,
	in _usuario text,
	in _contrasena text,
	in _nombre text,
	in _apellidos text,
	in _activo boolean,
	in _observaciones text,
	in _id_rol integer)
returns table(
	cedula bigint,
	usuario text,
	nombre text,
	apellidos text,
	activo boolean,
	observaciones text,
	id_rol integer) as
$body$
begin
	case dml
		when 'select' then
			return query
			select t.cedula, t.usuario, t.nombre, t.apellidos, t.activo, t.observaciones, t.id_rol
			from tbl_usuarios t
			where t.cedula = coalesce(_cedula, t.cedula) and
			t.usuario like '%' || coalesce(lower(_usuario), t.usuario) || '%' and
			t.nombre like '%' || coalesce(upper(_nombre), t.nombre) || '%' and
			t.apellidos like '%' || coalesce(upper(_apellidos), t.apellidos) || '%' and
			t.activo = coalesce(_activo, t.activo) and
			t.observaciones like '%' || coalesce(upper(_observaciones), t.observaciones) || '%' and
			t.id_rol = coalesce(_id_rol, t.id_rol)
			order by t.nombre;
		when 'insert' then
			insert into tbl_usuarios (cedula, usuario, contrasena, nombre, apellidos, activo, observaciones, id_rol)
			values (_cedula, lower(_usuario), _contrasena, upper(_nombre), upper(_apellidos), _activo, upper(_observaciones), _id_rol);
		when 'update' then
			update tbl_usuarios t
			set nombre = upper(_nombre),
			apellidos = upper(_apellidos),
			activo = _activo,
			observaciones = upper(_observaciones),
			id_rol = _id_rol
			where t.cedula = _cedula;
		when 'update_contrasena' then
			update tbl_usuarios t
			set contrasena = _contrasena,
			nombre = upper(_nombre),
			apellidos = upper(_apellidos),
			activo = _activo,
			observaciones = upper(_observaciones),
			id_rol = _id_rol
			where t.cedula = _cedula;
		when 'delete' then
			delete from tbl_usuarios t
			where t.cedula = _cedula;
		when 'reset_password' then
			update tbl_usuarios t
			set contrasena = _contrasena
			where t.cedula = _cedula;
	end case;
end;
$body$
language plpgsql;

create or replace function f_check_password(
	in _usuario text,
	in _contrasena text)
returns table(
	activo boolean) as
$body$
begin
	return query
	select t.activo
	from tbl_usuarios t
	where t.usuario = _usuario and
	contrasena = _contrasena;
end;
$body$
language plpgsql;

create or replace function f_personas_avatar(
	in dml text,
	in _cedula bigint,
	in _foto bytea)
returns table(
	foto bytea) as
$body$
begin
	case dml
		when 'select' then
			return query
			select t.foto
			from tbl_personas_avatar t
			where t.cedula = _cedula;
		when 'insert' then
			insert into tbl_personas_avatar
			values (_cedula, _foto);
		when 'update' then
			update tbl_personas_avatar t
			set foto = _foto
			where t.cedula = _cedula;
	end case;
end;
$body$
language plpgsql;

create or replace function f_institucion(
	in dml text,
	in _nombre text,
	in _foto bytea)
returns table(
	nombre text,
	foto bytea) as
$body$
begin
	case dml
		when 'select' then
			return query
			select t.nombre, t.foto
			from tbl_institucion t;
		when 'update' then
			update tbl_institucion t
			set foto = _foto,
			nombre = _nombre
			where t.id = 0;
	end case;
end;
$body$
language plpgsql;

-- Reportes
create or replace function f_reportes(
	in _periodo text,
	in _inicio date,
	in _fin date,
	in _persona integer,
	in _beca boolean)
returns table(Periodo text, Cantidad bigint) as
$body$
begin
	case _periodo
		when 'Semanal' then
			if _beca then
				-- Estudiantes becados
				return query
				select date_trunc('week', fecha_compra)::date || ' a ' || (date_trunc('week', fecha_compra)+ '6 days'::interval)::date,
				count(*)
				from tbl_tiquetes t inner join tbl_personas p
				on t.id_persona = p.cedula left join tbl_becados b
				on t.id_persona = b.id_persona
				where p.id_persona = _persona and
				t.fecha_compra between _inicio and _fin and
				b.id is not null
				group by date_trunc('week', fecha_compra)::date || ' a ' || (date_trunc('week', fecha_compra)+ '6 days'::interval)::date;
			else
				-- Funcionarios y estuantes sin beca
				return query
				select date_trunc('week', fecha_compra)::date || ' a ' || (date_trunc('week', fecha_compra)+ '6 days'::interval)::date,
				count(*)
				from tbl_tiquetes t inner join tbl_personas p
				on t.id_persona = p.cedula left join tbl_becados b
				on t.id_persona = b.id_persona
				where p.id_persona = _persona and
				t.fecha_compra between _inicio and _fin and
				b.id is null
				group by date_trunc('week', fecha_compra)::date || ' a ' || (date_trunc('week', fecha_compra)+ '6 days'::interval)::date;
			end if;
		when 'Mensual' then
			if _beca then
				-- Estudiantes becados
				return query
				select to_char(fecha_compra,'MONTHYYYY'), count(*)
				from tbl_tiquetes t inner join tbl_personas p
				on t.id_persona = p.cedula left join tbl_becados b
				on t.id_persona = b.id_persona
				where p.id_persona = _persona and
				t.fecha_compra between _inicio and _fin and
				b.id is not null
				group by to_char(fecha_compra,'MONTHYYYY');
			else
				-- Funcionarios y estuantes sin beca
				return query
				select to_char(fecha_compra,'MONTHYYYY'), count(*)
				from tbl_tiquetes t inner join tbl_personas p
				on t.id_persona = p.cedula left join tbl_becados b
				on t.id_persona = b.id_persona
				where p.id_persona = _persona and
				t.fecha_compra between _inicio and _fin and
				b.id is null
				group by to_char(fecha_compra,'MONTHYYYY');
			end if;
	end case;
end;
$body$
LANGUAGE plpgsql;

-- Vistas
create view vw_becados as
	select tps.cedula, tps.nombre, tps.apellidos, tp.descripcion, tb.nombre as beca, tb.porcentaje, tbs.activo
	from tbl_becados tbs, tbl_persona tp, tbl_personas tps, tbl_becas tb
	where
	tbs.id_persona = tps.cedula and
	tps.id_persona = tp.id and
	tbs.id_beca = tb.id
	order by tps.apellidos;
	
create view vw_personas as
	select ps.cedula,ps.nombre,ps.apellidos,ps.fecha_nacimiento,ps.tel_celular,ps.tel_habitacion,ps.encargado,ps.activo,p.descripcion as descripcion
	from tbl_personas ps
	inner join tbl_persona p
	on ps.id_persona = p.id
	order by apellidos;
