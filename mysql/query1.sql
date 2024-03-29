create database reemadb;
use reemadb;
create table EMP(Empid int not null, Empname varchar(20), age int);
select * from EMP;
insert into EMP (Empid, Empname, Age) values (6, 'Ann', 23);
update EMP set age=23 where Empid=1;
delete from EMP where Empid=3;
select Empname age from EMP;
select min(age) from EMP;
select max(age) from EMP;
select count(Empname) from EMP;
select avg(age) from EMP;
select sum(age) from EMP;
select * from EMP order by Empname DESC;
select Empname, max(age) from EMP group by Empname, Empid order by Empname, Empid;
select * from EMP where age in(23,24);
select * from EMP where age between 24 and 26;
