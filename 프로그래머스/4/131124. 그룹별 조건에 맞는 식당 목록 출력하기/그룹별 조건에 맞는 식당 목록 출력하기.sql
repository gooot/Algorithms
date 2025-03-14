-- 코드를 입력하세요



SELECT member_name , review_text , date_format(review_date,'%Y-%m-%d') as review_date
from member_profile mp
right join rest_review rr on mp.member_id = rr.member_id
where mp.member_id = (
    select member_id
    from rest_review
    group by member_id
    order by count(member_id) desc
    limit 1
)
order by review_date asc , review_text asc