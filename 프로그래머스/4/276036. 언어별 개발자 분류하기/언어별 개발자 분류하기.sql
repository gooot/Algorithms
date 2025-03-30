-- 코드를 작성해주세요

with sum_code as (
    select (
        select sum(code)
        from skillcodes
        where category like 'front end'
    ) as A , 
    (
        select sum(code)
        from skillcodes
        where name like 'C#'
    ) as B ,
    (
        select sum(code)
        from skillcodes
        where name like 'python'
    ) as C
    
) , 
grade_table as (
    select 
    case 
        when dev.skill_code & sc.A and dev.skill_code & sc.C then 'A'
        when dev.skill_code & sc.B then 'B'
        when dev.skill_code & sc.A then 'C'
    else null end 
 as grade 
, id , email
from developers dev , sum_code sc
)

select * 
from grade_table gt
where gt.grade is not null
order by gt.grade asc , gt.id asc



