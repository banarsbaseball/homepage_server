package com.example.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserEntity {

    @Id
    private String id;

    @Column(name = "team_id", nullable = false)
    private String team_id;

    @Column(name = "login_id", nullable = false)
    private String login_id;

    @Column(name = "login_password", nullable = false)
    private String login_password;

    @Column(name = "user_name", nullable = false)
    private String user_name;

    @Column(name = "user_type", nullable = false)
    private String user_type;
}
