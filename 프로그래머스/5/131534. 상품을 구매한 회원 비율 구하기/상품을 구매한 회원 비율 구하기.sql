-- 코드를 입력하세요
SELECT 
        year(sales_date) as year , 
        month(sales_date) as month , 
        count(distinct os.user_id)as purchased_users,
        round(count(distinct os.user_id) / (select count(user_id) from user_info where joined like '2021%'),1)as purchased_ratio
from online_sale os
join user_info ui on os.user_id = ui.user_id
where ui.joined like '2021%'
group by year , month
order by year , month


