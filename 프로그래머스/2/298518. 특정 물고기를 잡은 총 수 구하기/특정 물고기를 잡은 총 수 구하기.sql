-- 코드를 작성해주세요
select count(*) as fish_count
from fish_info f
join fish_name_info fn on f.fish_type = fn.fish_type 
and fish_name in ('bass','snapper')
