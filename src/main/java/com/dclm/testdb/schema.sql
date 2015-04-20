drop table T_BASE if exists;
drop sequence BASE_SEQ if exists;

create table T_BASE (ID integer identity primary key, CODE varchar(50) not null, DESCRIPTION varchar(50) not null, unique(CODE varchar));
create sequence BASE_SEQ start with 1;