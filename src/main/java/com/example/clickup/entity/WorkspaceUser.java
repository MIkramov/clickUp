package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class WorkspaceUser extends AbsEntity {
    @ManyToOne
    private Workspace workspace;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private WorkspaceRole workspaceRole;//o'zgarishi mumkin

    private Timestamp dateInvited;
    private Timestamp dateJoined;
}
