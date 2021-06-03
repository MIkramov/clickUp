package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import com.example.clickup.enums.ColorName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Project extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @OneToOne
    private Space space;

    @Enumerated
    private AccessType accessType;

    private String archived;

    @Enumerated
    private ColorName color;
}
