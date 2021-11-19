package com.demo.infrastructure.perclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "perclass_campaign_action")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class P_CampaignActionEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
