-- 코드를 입력하세요
with milk as (
    select id,cart_id
    from cart_products
    where name in ('milk')
),
yogurt as (
    select id,cart_id
    from cart_products
    where name in ('yogurt')
)

select milk.cart_id
from milk
inner join yogurt
on milk.cart_id = yogurt.cart_id
order by milk.id