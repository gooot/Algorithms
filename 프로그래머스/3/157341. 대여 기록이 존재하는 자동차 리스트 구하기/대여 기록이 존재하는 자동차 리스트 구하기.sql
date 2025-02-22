-- 코드를 입력하세요
select distinct car.car_id
from car_rental_company_car car
join car_rental_company_rental_history history
on car.car_id = history.car_id
where car.car_type = '세단'
and month(history.start_date) = 10
order by 1 desc
