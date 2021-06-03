package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TaskHistory extends AbsEntity {

    @ManyToOne
    private Task task;

    private String changeFieldName;

    private String before;
    private String after;
    private Date date;
}
