package com.lam.jira.role.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lam.jira.common.model.BaseEntity;
import com.lam.jira.user.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = RoleEntity.Role.TABLE_NAME)
public class Role extends BaseEntity {
    @Column(name = RoleEntity.Role.NAME)
    private String name;
    @Column(name = RoleEntity.Role.DESCRIPTION)
    private String description;
    @Column(name = RoleEntity.Role.CODE)
    private String code;
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new LinkedHashSet();
}
