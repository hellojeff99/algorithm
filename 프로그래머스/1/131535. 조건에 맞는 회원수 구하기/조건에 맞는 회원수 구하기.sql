-- 코드를 입력하세요
SELECT count(*) as users
from user_info
where joined between to_date('2021-01-01', 'yyyy-mm-dd') and to_date('2021-12-31', 'yyyy-mm-dd')
and age between 20 and 29;