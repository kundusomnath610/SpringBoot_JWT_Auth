package com.example.jwt.model;

import lombok.*;


@Data                  // generates getters, setters, toString, equals, hashCode
@AllArgsConstructor     // generates a constructor with all fields
@NoArgsConstructor
public class Employee {

        private String id;
        private String name;
        private String email;
        private String location;
}
