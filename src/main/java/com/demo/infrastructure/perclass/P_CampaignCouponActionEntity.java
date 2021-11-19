package com.demo.infrastructure.perclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "perclass_campaign_coupon_action")
public class P_CampaignCouponActionEntity extends P_CampaignActionEntity {
    private Long couponId;

    public P_CampaignCouponActionEntity(Long id, String name, Long couponId) {
        super(id, name);
        this.couponId = couponId;
    }
}
