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
@Table(name = "mapped_campaign_message_action")
public class M_CampaignMessageActionEntity extends M_CampaignActionEntity {
    private String content;

    public M_CampaignMessageActionEntity(Long id, String name, String content) {
        super(id, name);
        this.content = content;
    }
}
