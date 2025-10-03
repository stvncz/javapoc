package io.github.stvncz.javapoc.javapoc.controller.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RideDto {
    private Long id;
    private String driverId;
    private String origin;
    private String destination;
    private int availableSeats;
    private LocalDateTime dateTime;
    private String status; 
}
