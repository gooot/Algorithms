-- 코드를 작성해주세요

# select * from skillcodes

# select * from developers

select distinct a.id , a.email , a.first_name , a.last_name
from developers as a
join skillcodes as b 
on a.skill_code & b.code 
where b.name like 'python' or b.name like 'C#'
order by a.id asc