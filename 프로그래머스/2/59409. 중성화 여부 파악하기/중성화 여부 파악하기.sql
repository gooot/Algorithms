-- 코드를 입력하세요
SELECT animal_id , name ,  
    if(
        (sex_upon_intake regexp 'Neutered|Spayed'),'O','X'
    )
from animal_ins
order by animal_id