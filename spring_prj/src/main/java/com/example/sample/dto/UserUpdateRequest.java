package com.example.sample.dto;

import lombok.Data;

@Data
public class UserUpdateRequest {
    
    private String userId;
    private String teamId;
    private String loginId;
    private String loginPassword;
    private String userName;
    private String userType;
    
}
