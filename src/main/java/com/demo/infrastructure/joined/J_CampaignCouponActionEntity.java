package com.demo.infrastructure.joined;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "joined_campaign_coupon_action")
@DiscriminatorValue("PUBLISH_COUPON")
public class J_CampaignCouponActionEntity extends J_CampaignActionEntity {
    private Long couponId;

    public J_CampaignCouponActionEntity(Long id, String name, Long couponId) {
        super(id, name);
        this.couponId = couponId;
    }
}
