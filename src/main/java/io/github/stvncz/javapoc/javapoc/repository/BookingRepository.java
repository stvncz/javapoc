package io.github.stvncz.javapoc.javapoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.stvncz.javapoc.javapoc.domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
