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
import java.sql.Date;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Task extends AbsEntity {

    @Column(nullable = false)
    private String name;

    private String description;

    @OneToOne
    private Status status;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Priority priority;

    @ManyToOne
    private Task parentTask;

    private Timestamp statedDate;

    private boolean startTimeHas;

    private Date dueDate;
    private boolean dueDateHas;

    private Long estimateTime;

    private Date activedDate;

}
