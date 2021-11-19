package com.demo.representation.application;

import com.demo.infrastructure.joined.J_CampaignActionJpaRepository;
import com.demo.infrastructure.joined.J_CampaignCouponActionEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HelloApplication {
    private final J_CampaignActionJpaRepository campaignActionJpaRepository;

    public void testSave() {
        J_CampaignCouponActionEntity entity =
                new J_CampaignCouponActionEntity(null, "CouponAction", 1L);
        campaignActionJpaRepository.save(entity);
    }
}
