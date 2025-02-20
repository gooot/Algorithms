-- 코드를 작성해주세요

select sum(hg.score) as score , he.emp_no , he.emp_name , he.position , he.email
from hr_employees he
join hr_grade hg
on he.emp_no = hg.emp_no
group by hg.emp_no
order by 1 desc
limit 1