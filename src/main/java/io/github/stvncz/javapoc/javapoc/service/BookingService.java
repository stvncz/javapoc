package io.github.stvncz.javapoc.javapoc.service;

import org.springframework.stereotype.Service;

import io.github.stvncz.javapoc.javapoc.domain.Booking;
import io.github.stvncz.javapoc.javapoc.repository.BookingRepository;
import jakarta.transaction.Transactional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final RideService rideService;

    public BookingService(BookingRepository bookingRepository, RideService rideService) {
        this.bookingRepository = bookingRepository;
        this.rideService = rideService;
    }

    @Transactional
    public Booking createBooking(Booking booking) {
        if(rideService.getRideById(booking.getRideId()) == null) {
            throw new IllegalArgumentException("Ride does not exist");
        }
        rideService.bookSeat(booking.getRideId());
        return bookingRepository.save(booking);
    }
}
