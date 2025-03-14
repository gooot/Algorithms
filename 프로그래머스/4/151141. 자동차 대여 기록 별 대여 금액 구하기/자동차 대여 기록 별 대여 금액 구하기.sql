-- 코드를 입력하세요
with truck as (
    select car.car_id , car_type , daily_fee , history_id , datediff(end_date,start_date)+1 as day 
    from car_rental_company_car car
    join car_rental_company_rental_history his on car.car_id = his.car_id
    where car.car_type like '트럭'
),
discount as ( 
    select 
        plan_id , 
        car_type , 
        replace(duration_type,'일 이상','') as duration_type , 
        replace(discount_rate,'%','') as discount_rate
    from car_rental_company_discount_plan
)

select history_id
    , min(day * daily_fee * (100 - ifnull(discount_rate, 0)) / 100) as fee
from truck tr
left outer join discount dis
    on tr.car_type = dis.car_type 
    and day >= duration_type 
group by history_id
order by fee desc, history_id desc;
