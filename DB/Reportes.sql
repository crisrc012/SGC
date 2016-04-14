-- Cantidad mensual de funcionarios que asisten
select case date_part('month', fecha_compra)
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
where p.id_persona = 2 -- Funcionario
group by "Mes"

