package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Attachment extends AbsEntity {
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String originalName;

    @Column(nullable = false)
    private double size;

    @Column(nullable = false)
    private String contentType;
}
