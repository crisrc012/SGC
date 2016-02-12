--drop function f_becas(character varying,integer,character varying,integer);

create or replace function f_becas(
	in dml character varying,
	in _id integer,
	in _nombre character varying,
	in _porcentaje integer)
returns table(
	id integer,
	nombre character varying,
	porcentaje integer) as
$body$
begin
	case dml
		when 'select' then
			return query
			select *
			from tbl_becas t
			where t.id = coalesce(_id, t.id) and
			t.nombre like '%' || coalesce(upper(_nombre), t.nombre) || '%' and
			t.porcentaje = coalesce(_porcentaje, t.porcentaje)
			order by t.porcentaje;
		when 'insert' then
			insert into tbl_becas (nombre,porcentaje) VALUES (upper(_nombre),_porcentaje);
		when 'update' then
			update tbl_becas t set nombre=upper(_nombre), porcentaje=_porcentaje
			where t.id = _id;
		when 'delete' then
			delete from tbl_becas t where t.id = _id;
	end case;
end;
$body$
language plpgsql
