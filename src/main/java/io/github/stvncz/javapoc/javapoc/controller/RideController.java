package io.github.stvncz.javapoc.javapoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.stvncz.javapoc.javapoc.controller.dto.RideDto;
import io.github.stvncz.javapoc.javapoc.domain.Ride;
import io.github.stvncz.javapoc.javapoc.service.RideService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@RestController
@RequestMapping
public class RideController {

    private final RideService rideService;

    @PostMapping
    public ResponseEntity<Ride> createRide(@Valid @RequestBody RideDto rideDto) {
        Ride ride = mapDtoToModel(rideDto);
        Ride entity = rideService.createRide(ride);
        return ResponseEntity.status(HttpStatus.OK).body(entity);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Ride>> getAllRides() {
        List<Ride> rides = rideService.getAllRides();
        return ResponseEntity.ok(rides);
    }

    private Ride mapDtoToModel(RideDto dto) {
        Ride ride = new Ride();
        ride.setDriverName(dto.getDriverName());
        ride.setOrigin(dto.getOrigin());
        ride.setDestination(dto.getDestination());
        ride.setDateTime(dto.getDateTime());
        ride.setAvailableSeats(dto.getAvailableSeats());
        return ride;
    }
}
