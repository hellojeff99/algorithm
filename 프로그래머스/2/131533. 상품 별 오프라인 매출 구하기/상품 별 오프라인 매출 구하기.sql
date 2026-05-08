-- 코드를 입력하세요
SELECT p.product_code, o.amount*p.price as sales
from product p
inner join (select product_id, sum(sales_amount) as amount
           from offline_sale
           group by product_id) o on p.product_id = o.product_id
order by sales desc, p.product_code;