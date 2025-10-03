package io.github.stvncz.javapoc.javapoc.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import io.github.stvncz.javapoc.javapoc.domain.Ride;
import io.github.stvncz.javapoc.javapoc.repository.RideRepository;

@Service
public class RideService {

    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository ) {
        this.rideRepository = rideRepository;
    }

    public Ride createRide(Ride ride) {
        // Dummy implementation for demonstration
        return rideRepository.save(ride);
    }

    public Ride getRideById(Long id) {
        // Dummy implementation for demonstration
        return rideRepository.findById(id).orElse(null);
    }

    public List<Ride> getRidesByOrigin(String origin) {
        // Dummy implementation for demonstration
        return rideRepository.findByOrigin(origin);
    }

    public List<Ride> getRidesByDestination(String destination) {
        // Dummy implementation for demonstration
        return rideRepository.findByDestination(destination);
    }

    public List<Ride> getRidesByDate(LocalDateTime dateTime) {
        // Dummy implementation for demonstration
        return rideRepository.findByDateTime(dateTime);
    }

    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }
}
