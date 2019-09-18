package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.GeneratedValue;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tb_person")
public class Person {
    @Id
    @GeneratedValue //自增
    private Long id;
    @Column(name = "name",nullable = false,length = 100)
    private String name;
    @Column(name = "age",nullable = true,length = 4)
    private Integer age;
}
