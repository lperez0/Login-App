package com.leidos.webchat.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Getter
@Setter
@NoArgsConstructor
public class AgentRole {
    @ManyToOne
    @JoinColumn(name ="agent_id", nullable = false)
    private Long agentId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Long roleId;

}
