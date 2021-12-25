/* Write your T-SQL query statement below */
select A.Name as Employee from Employee A left join Employee B on A.ManagerId = B.Id where A.Salary > B.Salary