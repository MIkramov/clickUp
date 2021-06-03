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
public class Icon extends AbsEntity {

    @OneToOne
    private Attachment attachment;

    @Enumerated
    private ColorName color;

    private String initialLetter;
}
