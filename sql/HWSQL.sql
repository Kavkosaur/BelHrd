create database bh18dbHW ; 
use bh18dbHW;

create table Players(
	id int auto_increment primary key,
    name varchar(56) not null,
    lvl int default 20 check (lvl > 0),
    sex boolean not null,
    birthdate date default '2001-01-01',
    pClass  varchar(56)
);

insert into Players (id , name ,lvl , sex ,birthdate , pClass)
	value (1,'Anclead',19,true,'2000-01-05','Warrior');
    
insert into Players (name, lvl , sex , birthdate , pClass)
	value ('Kirito',13,true,'2014-11-15','Assasin'),('Veltor',15,true,'2010-12-14','Mage'),
    ('NOOB',1,true,'2007-05-05','Warrior');
    

insert into Players value (null,'Igor',5,true,null,null);

select * from Players;
select * from Players where lvl > 10;
select * from Players where lvl <10;
 
update Players set sex = false where pClass = 'Mage';

delete from Players where sex = false ;
drop table employees;
