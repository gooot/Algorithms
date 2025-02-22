-- 코드를 입력하세요
SELECT concat_ws('/', '/home/grep/src',file.board_id,concat(file.file_id,file.file_name,file.file_ext)) as file_path
from used_goods_file file
where file.board_id = (
    select board_id
    from used_goods_board
    order by views desc
    limit 1
)
order by file_id desc