package io.github.stvncz.javapoc.javapoc.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String driverName;
    @NotNull
    private String origin;
    @NotNull
    private String destination;
    @NotNull
    private LocalDateTime dateTime;
    @NotNull
    @Enumerated
    private RideStatus status;
    @NotNull
    @Min(0)
    private int availableSeats;
}
