package com.ganesh.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @created: 20/09/2021 - 3:00 PM
 * @author: Ganesh
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
