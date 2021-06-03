package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;

import javax.persistence.ManyToMany;

public class TaskTag extends AbsEntity {

    @ManyToMany
    private Task task;

    @ManyToMany
    private Tag tag;
}
