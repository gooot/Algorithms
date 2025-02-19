-- 코드를 입력하세요
SELECT product_id , product_name , product_cd , category , max(price)
from food_product 
group by product_cd 
order by price desc
limit 1
