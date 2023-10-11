create table sms_template
(
    id               bigint      not null auto_increment primary key,
    app_id           varchar(50) not null,
    template_code    varchar(50) not null unique,
    template_content text        not null,
    sign_name        varchar(50) not null,
    default_params   text        not null,
    ext_params       text        not null,
    state            varchar(10) not null default 'INIT',
    create_time      datetime    not null default now(),
    update_time      datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;

create table sms_cloud_template
(
    id                     bigint      not null auto_increment primary key,
    app_id                 varchar(50) not null,
    template_code          varchar(50) not null unique,
    cloud_template_content text,
    cloud_template_code    varchar(50),
    cloud_sign_name        varchar(100),
    cloud_sign_code        varchar(50),
    cloud_state            varchar(50),
    create_time            datetime    not null default now(),
    update_time            datetime    not null default now()
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8MB4;