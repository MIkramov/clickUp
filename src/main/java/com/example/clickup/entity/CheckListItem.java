package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CheckListItem extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private CheckList checkList;

    private String resolved;//o'zgarishi mumkin

    @OneToOne
    private User assignedUser;
}
