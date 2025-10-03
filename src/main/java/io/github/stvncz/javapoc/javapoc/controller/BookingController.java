package io.github.stvncz.javapoc.javapoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.stvncz.javapoc.javapoc.domain.Booking;
import io.github.stvncz.javapoc.javapoc.service.BookingService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;
    
    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody @Valid Booking booking) {
        Booking entity = bookingService.createBooking(booking);
        return ResponseEntity.status(HttpStatus.OK).body(entity);
    }
}
