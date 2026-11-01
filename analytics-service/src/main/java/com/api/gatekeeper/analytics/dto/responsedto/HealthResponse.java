package com.api.gatekeeper.analytics.dto.responsedto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HealthResponse {
    private String serviceName ;
    private String serviceDescription;
    private String appStatus;
}
