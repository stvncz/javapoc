package io.github.stvncz.javapoc.javapoc.controller.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookingDto {
    @NotNull
    private Long rideId;
    @NotNull
    private String passengerName;
}
