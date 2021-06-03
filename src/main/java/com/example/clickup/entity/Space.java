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
public class Space extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private ColorName color;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Workspace workspace;

    private String initialLetter;

    @OneToOne
    private Icon icon;

    @OneToOne
    private Attachment attachment;

    @OneToMany
    private Set<User> user;

    @Enumerated
    private AccessType accessType;
}
