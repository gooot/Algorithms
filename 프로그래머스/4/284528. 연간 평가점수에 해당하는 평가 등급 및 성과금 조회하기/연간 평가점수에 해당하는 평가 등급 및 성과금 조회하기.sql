-- 코드를 작성해주세요
# select * 
# from hr_employees he
# join hr_grade gh on he.emp_no = gh.emp_no

select he.emp_no , emp_name , hg.grade , 
    case
        when hg.grade = 'S' then sal*0.2
        when hg.grade = 'A' then sal*0.15
        when hg.grade = 'B' then sal*0.1
        when hg.grade = 'C' then sal*0
        end as bonus
from hr_employees he
join 
    (select emp_no , 
        case
            when avg(score) >= 96 then 'S'
            when avg(score) >= 90 then 'A'
            when avg(score) >= 80 then 'B'
            else 'C'
            end as grade
    from hr_grade
    group by emp_no) as hg
    on he.emp_no = hg.emp_no
order by emp_no asc
