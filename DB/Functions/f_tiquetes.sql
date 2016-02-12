create or replace function f_tiquetes(
	in dml character varying,
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
language plpgsql
