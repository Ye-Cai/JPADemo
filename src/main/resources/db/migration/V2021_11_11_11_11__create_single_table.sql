create table single_campaign_action
(
    id        int auto_increment comment 'ID' primary key,
    name      varchar(100) not null comment 'Action名称',
    type      varchar(20)  not null comment '类型（PUBLISH_COUPON，APP_NOTIFICATION）',
    coupon_id int null comment '卡券ID（PUBLISH_COUPON）',
    content   varchar(20) null comment '消息内容（APP_NOTIFICATION）'
) comment '营销场景Action';