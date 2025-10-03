package io.github.stvncz.javapoc.javapoc.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.stvncz.javapoc.javapoc.domain.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {

    List<Ride> findByOrigin(String origin);
    List<Ride> findByDestination(String destination);
    List<Ride> findByDateTime(LocalDateTime dateTime);
}
