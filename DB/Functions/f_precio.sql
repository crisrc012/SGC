create or replace function f_precio(
	in dml character varying,
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
			t.precio = coalesce(_precio, t.precio);
		when 'insert' then
			insert into tbl_precio (id ,id_persona, id_comida, precio)
			values (_id, _id_persona, _id_comida, _precio);
		when 'update' then
			update tbl_precio t
			set id_persona = _id_persona, id_comida = _id_comida, precio = _precio
			where t.id = _id;
		when 'delete' then
			delete from tbl_precio t where t.id = _id;
	end case;
end;
$body$
language plpgsql
