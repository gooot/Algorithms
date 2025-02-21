-- 코드를 입력하세요
SELECT product_code , sum(pr.price * os.sales_amount) sales
from product pr
join offline_sale os
on pr.product_id = os.product_id
group by pr.product_id
order by sales desc , product_code asc