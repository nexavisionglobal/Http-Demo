package com.kodegravity.httpdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StatusInfo {
    private Long statuscode;
    private String statusMessage;

}
