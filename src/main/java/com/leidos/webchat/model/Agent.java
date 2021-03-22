package com.leidos.webchat.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table
@Getter
@Setter
@NoArgsConstructor
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agentId;

    @Column
    private String username;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToMany(mappedBy = "agent_role")
    private List<AgentRole> agentRole;

}
