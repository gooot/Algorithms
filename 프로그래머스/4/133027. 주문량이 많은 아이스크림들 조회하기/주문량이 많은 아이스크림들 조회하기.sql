-- 코드를 입력하세요
select fh.flavor
from first_half fh
join july ju on fh.flavor = ju.flavor
group by flavor
order by sum(fh.total_order+ju.total_order) desc
limit 3