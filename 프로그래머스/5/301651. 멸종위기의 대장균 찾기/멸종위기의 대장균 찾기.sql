-- 코드를 작성해주세요


with recursive t as (
    select id , parent_id , 1 as generation
    from ecoli_data
    where parent_id is null
    
    union all 
    
    select b.id , b.parent_id , generation +1
    from t
    join ecoli_data b on t.id = b.parent_id


) , 
child as (
    select id , generation
    from t
    where id not in (
        select parent_id
        from t
        where parent_id is not null
    )
    
)

select count(id) as count , generation
from child
group by generation
order by generation asc

