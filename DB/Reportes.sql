CREATE OR REPLACE FUNCTION public.f_reportes(
	in _periodo text,
	in _inicio date,
	in _fin date,
	in _persona int,
	in _beca boolean)
RETURNS TABLE(Periodo text, Cantidad bigint) AS
$BODY$
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
$BODY$
LANGUAGE plpgsql