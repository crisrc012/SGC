create or replace function f_usuarios(
	in dml character varying,
	in _cedula integer,
	in _usuario character varying,
	in _contrasena character varying,
	in _nombre_completo character varying,
	in _activo boolean,
	in _observaciones character varying,
	in _id_rol integer)
returns table(
	cedula integer,
	usuario character varying,
	nombre_completo character varying,
	activo boolean,
	observaciones character varying,
	id_rol integer) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_personas t
			where t.cedula = coalesce(_cedula, t.cedula) and
			t.usuario like '%' || coalesce(lower(_usuario), t.usuario) || '%' and
			t.nombre_completo like '%' || coalesce(upper(_nombre_completo), t.nombre_completo) || '%' and
			t.activo = coalesce(_activo, t.activo) and
			t.observaciones like '%' || coalesce(upper(_observaciones), t.observaciones) || '%' and
			t.id_rol = coalesce(_id_rol, t.id_rol)
			order by t.nombre_completo;
		when 'insert' then
			insert into tbl_personas (cedula, usuario, contrasena, nombre_completo, activo, observaciones, id_rol)
			values (_cedula, lower(_usuario), _contrasena, upper(_nombre_completo), _activo, upper(_observaciones), _id_rol);
		when 'update' then
			update tbl_personas t
			set cedula = _cedula,
			usuario = lower(_usuario),
			contrasena = _contrasena,
			nombre_completo = _nombre_completo,
			activo = _activo,
			observaciones = _observaciones,
			id_rol = _id_rol
			where t.cedula = _cedula;
		when 'delete' then
			delete from tbl_personas t
			where t.cedula = _cedula;
	end case;
end;
$body$
language plpgsql
