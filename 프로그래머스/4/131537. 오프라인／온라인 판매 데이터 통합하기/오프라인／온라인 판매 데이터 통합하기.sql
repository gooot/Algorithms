-- 코드를 입력하세요
SELECT date_format(sales_date,'%Y-%m-%d') , product_id , user_id , sales_amount
from online_sale ons
where date_format(sales_date,'%Y-%m') = '2022-03'

union all

select date_format(sales_date,'%Y-%m-%d') , product_id ,null, sales_amount 
from offline_sale offs
where date_format(sales_date,'%Y-%m') = '2022-03'

order by 1 asc , product_id asc , user_id asc 