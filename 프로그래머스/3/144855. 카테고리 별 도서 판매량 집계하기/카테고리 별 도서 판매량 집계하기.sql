-- 코드를 입력하세요
SELECT category , sum(sal.sales) as total_sales
from book bo
join book_sales sal
on bo.book_id = sal.book_id
where year(sal.sales_date) = 2022 and month(sal.sales_date) = 1
group by category
order by category