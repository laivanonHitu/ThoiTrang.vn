create database if not exists trangsuc_vn;
use trangsuc_vn;
drop table if exists CUSTOMERS;
CREATE TABLE CUSTOMERS (
	id integer,
    image varchar(255)
);
alter table CUSTOMERS add column content nvarchar(255) null;
alter table CUSTOMERS add column caption nvarchar(255) null;
select * from CUSTOMERS;

