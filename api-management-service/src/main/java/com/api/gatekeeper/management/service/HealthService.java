package com.api.gatekeeper.management.service;

import com.api.gatekeeper.management.dto.responsedto.HealthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HealthService {
    private final JdbcTemplate jdbcTemplate;
    public String getHealth(){
        String databaseStatus="DOWN";
        try{
            Integer result=jdbcTemplate.queryForObject("SELECT 1",Integer.class);
            if(Integer.valueOf(1).equals(result))
            {
              databaseStatus="UP";
            }

        }catch(Exception e){
            System.out.println("MYSQL HEALTH STATUS FAILED"+e.getMessage());
        }

        return databaseStatus;
    }
}
