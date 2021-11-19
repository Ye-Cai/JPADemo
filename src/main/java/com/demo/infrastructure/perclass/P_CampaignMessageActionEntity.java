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
@Table(name = "perclass_campaign_message_action")
public class P_CampaignMessageActionEntity extends P_CampaignActionEntity {
    private String content;

    public P_CampaignMessageActionEntity(Long id, String name, String content) {
        super(id, name);
        this.content = content;
    }
}
