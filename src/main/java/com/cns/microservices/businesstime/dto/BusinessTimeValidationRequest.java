package com.cns.microservices.businesstime.dto;

import java.time.LocalDateTime;

public class BusinessTimeValidationRequest {
    public LocalDateTime date;
    public String businessTimeDefinition;
}
