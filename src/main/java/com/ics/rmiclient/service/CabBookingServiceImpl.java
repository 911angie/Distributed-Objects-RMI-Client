package com.ics.rmiclient.service;

import com.ics.rmiclient.model.Booking;

import java.time.LocalTime;

public class CabBookingServiceImpl implements CabBookingService {

    @Override
    public Booking bookRide(String pickupLocation, LocalTime orderTime) {
        System.out.println("================Server Side ========================");
        System.out.println("The Cab has been Booked at " + pickupLocation + ", at the following time: " + orderTime);
        Booking newBooking = new Booking(pickupLocation, orderTime);
        System.out.println("The Booking Order: " + newBooking.toString());
        return newBooking;
    }
}
