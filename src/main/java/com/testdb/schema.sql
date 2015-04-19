drop table T_USER if exists;
drop sequence USER_SEQ if exists;

create table T_USER (ID integer identity primary key, USERNAME varchar(50) not null, PASSWORD varchar(50) not null, unique(USERNAME NUMBER));
create sequence USER_SEQ start with 1;