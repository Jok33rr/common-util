package com.smarthouse.commonutil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class User {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;
    @NonNull
    @Length(max = 255, min = 1)
    private String name;
    @NonNull
    @Length(max = 255, min = 3)
    private String email;
    @NonNull
    @Length(max = 255, min = 1)
    private String phoneNumber;
    @NonNull
    @Length(max = 255, min = 6)
    private String password;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
