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
@Table(name = "joined_campaign_message_action")
@DiscriminatorValue("APP_NOTIFICATION")
public class J_CampaignMessageActionEntity extends J_CampaignActionEntity {
    private String content;

    public J_CampaignMessageActionEntity(Long id, String name, String content) {
        super(id, name);
        this.content = content;
    }
}
