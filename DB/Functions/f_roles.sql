create or replace function f_roles(
	in dml character varying,
	in _id integer,
	in _descripcion character varying)
returns table(
	id integer,
	descripcion character varying) as
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
			update tbl_roles t set descripcion=upper(_descripcion)
			where t.id = _id;
		when 'delete' then
			delete from tbl_roles t
			where t.id = _id;
	end case;
end;
$body$
language plpgsql
