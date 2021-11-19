package com.demo.infrastructure.sigle;

import com.demo.AbstractBaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class S_CampaignActionJpaRepositoryTest extends AbstractBaseTest {
    @Autowired
    private S_CampaignActionJpaRepository campaignActionJpaRepository;

    @Test
    void add_action() {
        S_CampaignActionEntity couponEntity =
                new S_CampaignCouponActionEntity(null, "CouponAction", 1L);
        campaignActionJpaRepository.save(couponEntity);
        S_CampaignActionEntity messageEntity =
                new S_CampaignMessageActionEntity(null, "MessageAction", "Message");
        campaignActionJpaRepository.save(messageEntity);

        List<S_CampaignActionEntity> all = campaignActionJpaRepository.findAll();
        System.out.println(all);
    }
}