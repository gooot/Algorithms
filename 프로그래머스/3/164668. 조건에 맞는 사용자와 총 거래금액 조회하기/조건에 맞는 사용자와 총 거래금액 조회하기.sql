-- 코드를 입력하세요
SELECT user_id , nickname , sum(price) as total_sales
from used_goods_board board
join used_goods_user member
on board.writer_id = member.user_id
where board.status = 'done'
group by user_id
having total_sales >= 700000
order by 3