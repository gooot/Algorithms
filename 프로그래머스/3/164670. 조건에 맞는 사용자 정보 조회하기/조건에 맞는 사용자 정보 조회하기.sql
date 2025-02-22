-- 코드를 입력하세요
SELECT member.user_id as 'user_id' , nickname , concat(city,' ',street_address1,' ',street_address2) as '전체번호' , 
concat_ws('-',substr(tlno,1,3),substr(tlno,4,4),substr(tlno,8,4)) as '전화번호'
from used_goods_user member
join used_goods_board board
on board.writer_id = member.user_id
group by member.user_id
having count(board.board_id) >= 3
order by member.user_id desc