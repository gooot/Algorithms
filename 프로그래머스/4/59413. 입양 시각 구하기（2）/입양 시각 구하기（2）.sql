-- 코드를 입력하세요

with recursive ht(hour) as (
    select 0
    union all
    select hour +1
    from ht
    where hour < 23
)

select ht.hour , count(animal_id)
from animal_outs ao
right join ht on ht.hour = hour(ao.datetime)
group by ht.hour
order by ht.hour asc

