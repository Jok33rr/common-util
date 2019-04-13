package com.smarthouse.commonutil.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Length(max = 255)
    @Column(nullable = false)
    private String name;
    @Min(0) // ADMIN
    @Max(3) // WEAK_OBSERVER
    @Column(nullable = false)
    private int accessLevel;
}
