-- 코드를 작성해주세요

with front as (
    select name , category , code 
    from skillcodes
    where category like 'front end'
    
) ,
frontcode as (
    select sum(code) as code
    from front
) 


select id , email , first_name , last_name
from developers dev
where dev.skill_code & ( select frontcode.code from frontcode) > 0 
order by id