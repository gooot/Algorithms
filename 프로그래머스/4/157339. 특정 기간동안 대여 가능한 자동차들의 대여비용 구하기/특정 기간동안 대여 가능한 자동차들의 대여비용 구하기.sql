-- 코드를 입력하세요

with car as(
    select c.car_id , c.car_type , c.daily_fee , dis.duration_type , dis.discount_rate
    from car_rental_company_car c
    join car_rental_company_discount_plan dis on c.car_type = dis.car_type
    and dis.duration_type like '30%'
    and dis.car_type in ('SUV','세단')
    
) , 

free_car as (
    select * 
    from car_rental_company_rental_history rh
    where rh.start_date < '2022-11-30'
    and rh.end_date > '2022-11-01'
    order by rh.car_id asc
)

select 
    c.car_id ,
    c.car_type , 
    (
        round(30*c.daily_fee*(1-c.discount_rate/100),0)
    ) as fee
from car c
left join free_car fc
on c.car_id = fc.car_id
where fc.car_id is null
and (
        round(30*c.daily_fee*(1-c.discount_rate/100),0)
    ) >= 500000
and (
        round(30*c.daily_fee*(1-c.discount_rate/100),0)
    ) < 2000000
    
order by 3 desc , 2 asc , 1 desc