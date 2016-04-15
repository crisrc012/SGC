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