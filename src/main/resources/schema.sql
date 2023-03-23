drop table if exists member;
drop table if exists article;

create table member
(
    member_number   bigint      not null auto_increment,
    member_id       varchar(64) not null,
    member_password varchar(64) not null,
    member_name     varchar(64) not null,
    member_email    varchar(64) not null,
    primary key (member_id)
);

create table article
(
    article_number      bigint        not null auto_increment,
    article_writer      varchar(64)   not null,
    article_title       varchar(200)  not null,
    article_contents    varchar(1000) not null,
    article_writtentime timestamp     not null default current_timestamp(),
    primary key (article_number)

);
