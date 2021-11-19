package com.demo.infrastructure.joined;

import com.demo.AbstractBaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class J_CampaignActionJpaRepositoryTest extends AbstractBaseTest {
    @Autowired
    private J_CampaignActionJpaRepository campaignActionJpaRepository;

    @Test
    void add_action() {
        J_CampaignActionEntity couponEntity =
                new J_CampaignCouponActionEntity(1L, "CouponAction", 1L);
        campaignActionJpaRepository.save(couponEntity);
        couponEntity.setId(2L);
        campaignActionJpaRepository.save(couponEntity);
        J_CampaignActionEntity messageEntity =
                new J_CampaignMessageActionEntity(null, "MessageAction", "message");
        campaignActionJpaRepository.save(messageEntity);
        campaignActionJpaRepository.deleteById(1L);
    }
}