-- 코드를 입력하세요
select animal_type , count(*)
from animal_ins
group by animal_type
having animal_type = 'cat' or animal_type = 'dog'
order by animal_type