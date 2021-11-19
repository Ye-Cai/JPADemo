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
@DiscriminatorValue("APP_NOTIFICATION")
public class S_CampaignMessageActionEntity extends S_CampaignActionEntity {
    private String content;

    public S_CampaignMessageActionEntity(Long id, String name, String content) {
        super(id, name);
        this.content = content;
    }
}
