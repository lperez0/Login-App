package com.leidos.login.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Table
@Getter
@Setter
@NoArgsConstructor
public class UserRole {
    private Long userId;
    private Long roleId;
}
