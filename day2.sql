use office;
-- create table emp(emp_id int, first_name varchar(50), last_name varchar(50), dept_id int, primary key(emp_id), job_id int, dept varchar(50), foreign key(dept_id) references dept(dept_id), foreign key(job_id) references job(job_id));
-- create table dept(dept_id int primary key, dept_name varchar(50));
-- create table job(job_id int primary key, job_name varchar(50));
-- alter table emp add foreign key(dept_id) references dept;
-- alter table emp add foreign key(job_id) references job;
-- alter table emp add primary key(emp_id);
-- drop table emp;
-- insert into dept values (9, "IT");
-- insert into dept values (8, "CST");
-- insert into dept values (7, "ECE");
-- insert into job values (4, "Solutions");
-- insert into job values (5, "testing");
-- insert into job values (6, "integration");

-- insert into emp values (1, 'Pankaj', 'Naik', 9, 4, 'IT');
-- insert into emp values (2, 'Francis', 'Hmar', 8, 5, 'CST');
-- insert into emp values (3, 'Otis', 'Wiley', 7, 6, 'ECE');


-- select * from emp;
-- select * from dept;
-- select * from job;


-- DELIMITER &&  
-- CREATE PROCEDURE printEmp ()    
-- BEGIN    
--     select * from emp;   
-- END &&  
-- DELIMITER ; 

-- DELIMITER &&  
-- CREATE PROCEDURE printJob()    
-- BEGIN    
--     select * from job;   
-- END &&  
-- DELIMITER ; 

-- DELIMITER &&  
-- CREATE PROCEDURE printDept()    
-- BEGIN    
--     select * from dept;   
-- END &&  
-- DELIMITER ; 

-- call printEmp();
-- call printDept();
-- call printJob();
show procedure status;