-- 코드를 입력하세요
select bo.author_id , author_name , category , sum(bo.price*bs.sales)
from book bo
join author au on bo.author_id = au.author_id
join book_sales bs on bo.book_id = bs.book_id
where date_format(bs.sales_date,'%Y-%m' ) = '2022-01'
group by author_name , category
order by bo.author_id asc , category desc