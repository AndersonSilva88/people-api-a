package com.project.personapi.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponse {

    private String message;
}
