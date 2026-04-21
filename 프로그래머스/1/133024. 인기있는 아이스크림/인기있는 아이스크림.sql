-- 코드를 입력하세요
SELECT t.flavor
from (select flavor, sum(total_order) as total
     from first_half
     group by flavor) t
order by total desc;
