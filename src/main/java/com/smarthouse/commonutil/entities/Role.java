package com.smarthouse.commonutil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@Entity
public class Role {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Length(max = 255)
    private String name;
    @Min(0) // ADMIN
    @Max(3) // WEAK_OBSERVER
    @NonNull
    private int accessLevel;

}
