create or replace function f_becados(
	in dml character varying,
	in _id integer,
	in _id_persona integer,
	in _id_beca integer,
	in _activo boolean,
	in _observaciones character varying)
returns table(
	id integer,
	id_persona integer,
	id_beca integer,
	activo boolean,
	observaciones character varying) as
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
			set id_persona = _id_persona, id_beca = _id_beca, activo = _activo, observaciones = upper(_observaciones)
			where t.id = _id;
		when 'delete' then
			delete from tbl_becados t where t.id = _id;
	end case;
end;
$body$
language plpgsql
