-- 코드를 작성해주세요
select  info.item_id , item_name
from item_info info
join item_tree tree
on info.item_id = tree.item_id
where parent_item_id is null