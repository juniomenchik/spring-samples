create table task
(
    id         bigint       not null auto_increment,
    created_at datetime(6),
    deleted_at datetime(6),
    done       bit          not null,
    message    varchar(500) not null,
    subject    varchar(50)  not null,
    updated_at datetime(6),
    primary key (id)
)