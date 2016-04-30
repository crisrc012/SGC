-- Cantidad mensual de estudiantes que asisten sin beca
select date_part('year', fecha_compra) || ' ' || case date_part('month', fecha_compra)
		when 1 then 'Enero'
		when 2 then 'Febrero'
		when 3 then 'Marzo'
		when 4 then 'Abril'
		when 5 then 'Mayo'
		when 6 then 'Junio'
		when 7 then 'Julio'
		when 8 then 'Agosto'
		when 9 then 'Setiembre'
		when 10 then 'Octubre'
		when 11 then 'Noviembre'
		when 12 then 'Diciembre'
	end as "Mes", count(*) as "Cantidad"
from tbl_tiquetes t inner join tbl_personas p
on t.id_persona = p.cedula left join tbl_becados b
on t.id_persona = b.id_persona
where p.id_persona = 1 and -- Tipo de persona
t.fecha_compra between '2000-01-01' and (select current_date) and
b.id is null
group by "Mes"

-- Cantidad mensual de estudiantes que asisten con beca
select date_part('year', fecha_compra) || ' ' || case date_part('month', fecha_compra)
		when 1 then 'Enero'
		when 2 then 'Febrero'
		when 3 then 'Marzo'
		when 4 then 'Abril'
		when 5 then 'Mayo'
		when 6 then 'Junio'
		when 7 then 'Julio'
		when 8 then 'Agosto'
		when 9 then 'Setiembre'
		when 10 then 'Octubre'
		when 11 then 'Noviembre'
		when 12 then 'Diciembre'
	end as "Mes", count(*) as "Cantidad"
from tbl_tiquetes t inner join tbl_personas p
on t.id_persona = p.cedula inner join tbl_becados b
on t.id_persona = b.id_persona
where p.id_persona = 1 and -- Tipo de persona
t.fecha_compra between '2000-01-01' and (select current_date)
group by "Mes"

-- Cantidad mensual de funcionarios que asisten
select date_part('year', fecha_compra) || ' ' || case date_part('month', fecha_compra)
		when 1 then 'Enero'
		when 2 then 'Febrero'
		when 3 then 'Marzo'
		when 4 then 'Abril'
		when 5 then 'Mayo'
		when 6 then 'Junio'
		when 7 then 'Julio'
		when 8 then 'Agosto'
		when 9 then 'Setiembre'
		when 10 then 'Octubre'
		when 11 then 'Noviembre'
		when 12 then 'Diciembre'
	end as "Mes", count(*) as "Cantidad"
from tbl_tiquetes t inner join tbl_personas p
on t.id_persona = p.cedula
where p.id_persona = 2 and -- Tipo de persona
t.fecha_compra between '2000-01-01' and (select current_date)
group by "Mes"

-- Reporte semanal
create or replace function f_semanales(
	in fecha date)
returns text as
$body$
begin
	case date_part('month',fecha)
		when 1 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Enero de ' || date_part('year',fecha);
		when 2 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Febrero de ' || date_part('year',fecha);
		when 3 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Marzo de ' || date_part('year',fecha);
		when 4 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Abril de ' || date_part('year',fecha);
		when 5 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Mayo de ' || date_part('year',fecha);
		when 6 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Junio de ' || date_part('year',fecha);
		when 7 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Julio de ' || date_part('year',fecha);
		when 8 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Agosto de ' || date_part('year',fecha);
		when 9 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Setiembre de ' || date_part('year',fecha);
		when 10 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Octubre de ' || date_part('year',fecha);
		when 11 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Noviembre de ' || date_part('year',fecha);
		when 12 then return 'Semana ' || mod(date_part('week',fecha)::integer,4)+1 || ' de Diciembre de ' || date_part('year',fecha);
	end case;
end;
$body$
language plpgsql;
