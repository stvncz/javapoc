package io.github.stvncz.javapoc.javapoc.service;

import org.springframework.stereotype.Service;

import io.github.stvncz.javapoc.javapoc.domain.Booking;
import io.github.stvncz.javapoc.javapoc.repository.BookingRepository;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        // Dummy implementation for demonstration
        return bookingRepository.save(booking);
    }
}
