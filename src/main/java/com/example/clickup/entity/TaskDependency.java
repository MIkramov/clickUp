package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import com.example.clickup.enums.DependencyType;
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
public class TaskDependency extends AbsEntity {

    @ManyToOne
    private Task task;

    @OneToOne
    private TaskDependency taskDependency;

    @Enumerated
    private DependencyType dependencyType;
}
