package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class WorkspaceRole extends AbsEntity {

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Workspace> workspaceSet;

    @Column(nullable = false)
    private String name;

    private String extendsRole;
}
