-- 코드를 입력하세요
select fo.product_id , product_name , sum(amount * price)
from food_order fo
join food_product fp
on fo.product_id = fp.product_id
where date_format(fo.produce_date,'%Y-%m') = '2022-05'
group by fo.product_id
order by 3 desc , 1 asc