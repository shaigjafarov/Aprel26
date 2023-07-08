create table   apr26.users
(
    id int ,
    last_name varchar(200),
    first_name varchar(255),
    address varchar(255),
    city varchar(255)
);



insert into apr26.users
values (13, 'asa','adfwe','asdfa','asdasd');


insert into apr26.users (last_name, first_name)
values ('last', 'first');





alter table apr26.users
    add unique key (id);



select * from apr26.users limit 1 ;

select * from apr26.users u where  u.last_name like '_a__' ;



delete from apr26.users u where u.id is null;


update apr26.users set first_name='Xezer' ,last_name='Mammadov'  where id =12 ;



create table   apr26.role
(
    id int primary key ,
    role_name varchar(200),
    user_id int
);



select * from apr26.role u


select * from apr26.users u where  u.id in
                                   (select r.user_id from apr26.role r where r.role_name='admin' )



alter table apr26.users
    add column created date


select to_char(u.created ,'DD.MM.YYYY' ) from apr26.users  u where u.created between TO_DATE('19991201','YYYYMMDD')  and TO_DATE('20001201','YYYYMMDD')



ALTER TABLE  apr26.users
    alter column created set default now();


ALTER TABLE mytable ALTER COLUMN created_at SET DEFAULT now();



insert into apr26.users (id, last_name, first_name, address, city)
values (14, 'asa','adfwe','asdfa','asdasd');


create table   apr26.student
(
    id int primary key ,
    name varchar(200),
    surname varchar(200)
);

create table   apr26.teacher
(
    id int primary key ,
    name varchar(200),
    surname varchar(200),
    lesson varchar(200)

);

alter table apr26.student
    ADD CONSTRAINT fk_student_teacher FOREIGN KEY (teacher_id) REFERENCES apr26.teacher (id);






select * from apr26.student s
                  inner join  apr26.teacher t on s.teacher_id=t.id;


select * from apr26.student s
                  left join  apr26.teacher t on s.teacher_id=t.id;


select s.name from  apr26.student s
union
select t.name from apr26.teacher t;

select * from apr26.teacher t;


select t.lesson , count(t.id) from apr26.teacher t
group by t.lesson having count(t.id)=2
order by count(t.id) desc





































