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
public class Workspace extends AbsEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private ColorName color;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<User> users;

    private String initialLetter;

    @OneToOne
    private Attachment attachment;
}
