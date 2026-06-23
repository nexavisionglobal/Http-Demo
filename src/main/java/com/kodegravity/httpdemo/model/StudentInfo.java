package com.kodegravity.httpdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentInfo {
    private Long id;
    private String name;
    private String address;
    private List<String> hobby;
}
