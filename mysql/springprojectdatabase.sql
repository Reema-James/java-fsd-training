create database springDB;
use springDB;
create table Emp99(id int auto_increment primary key, name varchar(50), salary int not null, designation varchar(80));
alter table Emp99 modify column salary float(53);
select * from Emp99;
insert into Emp99(id, name, salary, designation) values
(1,'John',75000,'Devops Engineer'),(2,'Jannet',45000,'Operations Executive'),(3,'Steve',90000,'Senior Manager'),(4,'Rhea',55000,'HR Specialist');