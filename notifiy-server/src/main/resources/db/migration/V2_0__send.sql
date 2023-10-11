create table send_request
(
    id              bigint        not null auto_increment primary key,
    app_id          varchar(50)   not null,
    batch_id        varchar(50)   not null,
    template_code   varchar(50)   not null,
    template_params varchar(500)  not null,
    target_type     varchar(50)   not null,
    target_list     varchar(50)   not null,
    send_status     varchar(50)   not null,
    send_time       datetime,
    send_result     varchar(1024) not null,
    create_time     datetime      not null default now(),
    update_time     datetime      not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;

create table send_detail
(
    id          bigint      not null auto_increment primary key,
    app_id      varchar(50) not null,
    batch_id    varchar(50) not null,
    task_id     varchar(50) not null,
    create_time datetime    not null default now(),
    update_time datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;

create table send_task
(
    id          bigint      not null auto_increment primary key,
    app_id      varchar(50) not null,
    task_id     varchar(50) not null,
    batch_id    varchar(50) not null,
    create_time datetime    not null default now(),
    update_time datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;

create table template_channel
(
    id            bigint      not null auto_increment primary key,
    app_id        varchar(50) not null,
    template_code varchar(50) not null,
    channel_code  varchar(50) not null,
    create_time   datetime    not null default now(),
    update_time   datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;