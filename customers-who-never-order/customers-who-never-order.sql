/* Write your T-SQL query statement below */
select name as Customers from Customers where id 
    not in (select distinct CustomerId from Orders)