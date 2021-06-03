package com.example.clickup.entity;

import com.example.clickup.entity.template.AbsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.ws.soap.Addressing;

@EqualsAndHashCode(callSuper = true)
@Addressing
@NoArgsConstructor
@Data
@Entity(name = "Users")
public class User extends AbsEntity {
    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String color;
    private String initialLetter;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Attachment attachment;
}
