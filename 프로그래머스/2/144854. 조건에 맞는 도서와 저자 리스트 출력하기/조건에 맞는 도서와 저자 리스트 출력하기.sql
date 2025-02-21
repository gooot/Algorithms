-- 코드를 입력하세요
SELECT book_id , author_name , date_format(published_date,'%Y-%m-%d')
from book bo
join author au
on bo.author_id = au.author_id
where bo.category like '경제'
order by published_date asc