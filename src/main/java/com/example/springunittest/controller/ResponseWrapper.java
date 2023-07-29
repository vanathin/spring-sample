package com.example.springunittest.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ResponseWrapper {
    private String status;
    private Object data;
    private String result ;
    private String message;
}
