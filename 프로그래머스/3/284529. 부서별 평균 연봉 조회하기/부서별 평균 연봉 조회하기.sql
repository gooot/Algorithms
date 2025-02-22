-- 코드를 작성해주세요
select dp.dept_id as dept_id, dept_name_en , round(avg(sal),0) as avg_sal
from hr_department dp
join hr_employees em
on dp.dept_id = em.dept_id
group by dp.dept_id
order by 3 desc
