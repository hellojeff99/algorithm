-- 코드를 입력하세요
SELECT b.category as category, sum(s.sales) as total_sales
from book b
inner join book_sales s on b.book_id = s.book_id
where to_char(s.sales_date, 'yyyy-mm') = '2022-01'
group by b.category
order by b.category asc;

