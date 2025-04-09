-- 코드를 입력하세요
with rental_car as (
    select history_id , car_id , start_date , end_date
    from car_rental_company_rental_history rh
    where start_date <= '2022-10-16'
    and end_date >= '2022-10-16'
)


select rh.car_id , 
    case 
        when rc.car_id is null then '대여 가능'
        when rc.car_id is not null then '대여중'
        end as availability

from car_rental_company_rental_history rh
left join rental_car rc on rh.car_id = rc.car_id
group by rh.car_id
order by rh.car_id desc