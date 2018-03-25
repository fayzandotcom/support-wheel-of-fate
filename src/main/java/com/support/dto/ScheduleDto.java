package com.support.dto;

import java.util.List;

import lombok.Data;

@Data
public class ScheduleDto {
    
    private String date;
    
    private List<EngineerDto> engineers;

}
