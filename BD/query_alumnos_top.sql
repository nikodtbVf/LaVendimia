select  a.matricula,(((p.nombre || ' '::text) || p.apellido_paterno::text) || ' '::text) || p.apellido_materno::text AS alumno, avg(am.calificacion) as promedio
from alumno_materia as am
inner join alumno as a on a.id = am.alumno_id
inner join persona as p on p.id = a.persona_id
group by alumno_id, matricula, alumno
order by promedio desc
limit 10; 
