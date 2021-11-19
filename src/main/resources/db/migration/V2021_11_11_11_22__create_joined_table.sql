create table joined_campaign_action
(
    id        int auto_increment comment 'ID' primary key,
    name      varchar(100) not null comment 'Action名称',
    type      varchar(20)  not null comment '类型（PUBLISH_COUPON，APP_NOTIFICATION）'
) comment '营销场景Action';

create table joined_campaign_coupon_action
(
    id        int auto_increment comment 'ID' primary key,
    coupon_id int null comment '卡券ID（PUBLISH_COUPON）'
) comment '营销场景Action';

create table joined_campaign_message_action
(
    id        int auto_increment comment 'ID' primary key,
    content   varchar(20) null comment '消息内容（APP_NOTIFICATION）'
) comment '营销场景Action';