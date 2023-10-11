create table feishu_bot_template
(
    id               bigint      not null auto_increment primary key,
    app_id           varchar(50) not null,
    template_code    varchar(50) not null unique,
    template_content text        not null,
    default_params   text        not null,
    ext_params       text        not null,
    state            varchar(10) not null default 'INIT',
    create_time      datetime    not null default now(),
    update_time      datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;