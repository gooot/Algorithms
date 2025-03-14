-- 코드를 입력하세요
with cs as (
    select * 
    from appointment
    where apnt_cncl_yn = 'N'
    and mcdp_cd = 'cs'
    and apnt_ymd like '2022-04-13%'
)


select apnt_no , pt.pt_name , cs.pt_no , cs.mcdp_cd , dr.dr_name , apnt_ymd
from cs 
join patient pt on pt.pt_no = cs.pt_no
join doctor dr on dr.dr_id = cs.mddr_id
order by apnt_ymd asc


