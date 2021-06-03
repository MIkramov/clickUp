package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import com.example.clickup.enums.ColorName;
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
public class Tag extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Enumerated
    private ColorName color;

    @OneToMany
    private Set<Workspace> workspaces;
}
