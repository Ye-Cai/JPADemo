package com.demo.infrastructure.mapped;

import com.demo.AbstractBaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class M_CampaignActionJpaRepositoryTest extends AbstractBaseTest {
    @Autowired
    private M_CampaignActionJpaRepository campaignActionJpaRepository;

    @Test
    void add_action() {
        M_CampaignActionEntity couponEntity =
                new M_CampaignCouponActionEntity(null, "CouponAction", 1L);
        campaignActionJpaRepository.save(couponEntity);
        M_CampaignActionEntity messageEntity =
                new M_CampaignMessageActionEntity(null, "MessageAction", "Message");
        campaignActionJpaRepository.save(messageEntity);
    }
}