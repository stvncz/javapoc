package io.github.stvncz.javapoc.javapoc.controller.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class RideDto {
    @NotNull
    private String driverName;
    @NotNull
    private String origin;
    @NotNull
    private String destination;
    @NotNull
    @PositiveOrZero
    private int availableSeats;
    @Future
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateTime;
}
