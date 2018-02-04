insert into user (id, user_id, password, name, email) values (1, 'javajigi', '2222','자바지기', 'abc@abc.com');
insert into user (id, user_id, password, name, email) values (2, 'sanjigi', '2222','산지기', 'sanjigi@abc.com');

insert into question (id, writer_id, title, contents, create_date) values (1, 1, '자바지기가 등록한글', '자바지기가 등록했어요', current_timestamp());
insert into question (id, writer_id, title, contents, create_date) values (2, 2, '산지기가 등록한글', '산지기가 등록했어요', current_timestamp());