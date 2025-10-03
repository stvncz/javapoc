package io.github.stvncz.javapoc.javapoc.controller.dto;

import lombok.Data;

@Data
public class BookingDto {
    private Long id;
    private Long rideId;
    private String passengerName;
}
