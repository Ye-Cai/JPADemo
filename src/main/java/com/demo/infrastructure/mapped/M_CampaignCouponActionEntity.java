package com.demo.infrastructure.mapped;

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
@Table(name = "mapped_campaign_coupon_action")
public class M_CampaignCouponActionEntity extends M_CampaignActionEntity {
    private Long couponId;

    public M_CampaignCouponActionEntity(Long id, String name, Long couponId) {
        super(id, name);
        this.couponId = couponId;
    }
}
