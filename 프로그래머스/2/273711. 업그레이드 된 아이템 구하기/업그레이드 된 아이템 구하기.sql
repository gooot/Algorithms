-- 코드를 작성해주세요

# select * from item_info

# select * from item_tree

select item_id , item_name , rarity
from item_info
where item_id in (
    select t.item_id
    from item_info i
    join item_tree t
    on i.item_id = t.parent_item_id
    where rarity = 'rare'
)
order by item_id desc

