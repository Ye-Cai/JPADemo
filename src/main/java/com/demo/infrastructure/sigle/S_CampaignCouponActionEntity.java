package com.demo.infrastructure.sigle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("PUBLISH_COUPON")
public class S_CampaignCouponActionEntity extends S_CampaignActionEntity {
    private Long couponId;

    public S_CampaignCouponActionEntity(Long id, String name, Long couponId) {
        super(id, name);
        this.couponId = couponId;
    }
}
