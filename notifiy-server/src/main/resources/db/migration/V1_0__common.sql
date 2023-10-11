create table app
(
    id          bigint      not null auto_increment primary key,
    app_id      varchar(50) not null,
    create_time datetime    not null default now(),
    update_time datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;

create table channel
(
    id             bigint      not null auto_increment primary key,
    app_id         varchar(50) not null,
    channel_code   varchar(50) not null,
    cloud_provider varchar(20) not null,
    cloud_service  varchar(20) not null,
    cloud_app_id   varchar(20) not null,
    account_config text        not null,
    create_time    datetime    not null default now(),
    update_time    datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;