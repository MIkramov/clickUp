package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import com.example.clickup.enums.ColorName;
import com.example.clickup.enums.StatusType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Status extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @OneToOne
    private Space space;

    @OneToOne
    private Project project;

    @OneToOne
    private Category category;

    @Enumerated
    private ColorName color;

    @Enumerated
    private StatusType type;
}
