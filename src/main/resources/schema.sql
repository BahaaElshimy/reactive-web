create  table if not exists product (id bigserial primary key  , name varchar(100) unique , price numeric(18,2));

truncate table product;

insert into product(name , price) values ('mobile' , 40);
insert into product(name , price) values ('ipad' , 50);
insert into product(name , price) values ('macbook' , 100);
insert into product(name , price) values ('glasses' , 200);