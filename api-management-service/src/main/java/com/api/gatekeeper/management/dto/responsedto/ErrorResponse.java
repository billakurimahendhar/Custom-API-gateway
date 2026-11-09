package com.api.gatekeeper.management.dto.responsedto;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
    private Map<String,String> errors;
    private LocalDateTime timestamp;
}
