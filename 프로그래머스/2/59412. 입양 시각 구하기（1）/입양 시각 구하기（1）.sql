# -- 코드를 입력하세요
SELECT hour(datetime) , count(*)
from animal_outs
where hour(datetime) between 9 and 19
group by 1 
order by 1 asc