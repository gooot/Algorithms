-- 코드를 작성해주세요
select c.id
from ecoli_data a
join ecoli_data b on b.parent_id = a.id
join ecoli_data c on c.parent_id = b.id
where a.parent_id is null
and c.id is not null
order by c.id asc