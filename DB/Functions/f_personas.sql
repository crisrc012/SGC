create or replace function f_personas(
	in dml character varying,
	in _cedula integer,
	in _nombre character varying,
	in _apellidos character varying,
	in _fecha_nacimiento date,
	in _tel_celular integer,
	in _tel_habitacion integer,
	in _encargado character varying,
	in _id_persona integer)
returns table(
	cedula integer,
	nombre character varying,
	apellidos character varying,
	fecha_nacimiento date,
	tel_celular integer,
	tel_habitacion integer,
	encargado character varying,
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
			t.encargado like '%' || coalesce(upper(_encargado), t.encargado) || '%' and
			t.id_persona = coalesce(_id_persona, t.id_persona)
			order by t.nombre;
		when 'insert' then
			insert into tbl_personas (cedula, nombre, apellidos, fecha_nacimiento, tel_celular, tel_habitacion, encargado, id_persona)
			values (_cedula, upper(_nombre), upper(_apellidos), _fecha_nacimiento, _tel_celular, _tel_habitacion, upper(_encargado), _id_persona);
		when 'update' then
			update tbl_personas t
			set cedula = _cedula,
			nombre = upper(_nombre),
			apellidos = upper(_apellidos),
			fecha_nacimineto = _fecha_nacimiento,
			tel_celular = _tel_celular,
			tel_habitacion = _tel_habitacion,
			encargado = upper(_encargado),
			id_persona = _id_persona
			where t.cedula = _cedula;
		when 'delete' then
			delete from tbl_personas t
			where t.cedula = _cedula;
	end case;
end;
$body$
language plpgsql
