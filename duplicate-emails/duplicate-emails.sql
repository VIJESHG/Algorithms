/* Write your T-SQL query statement below */
select A.email as Email from (select email,count(id) as cnt from Person group by email) as A
    where A.cnt > 1