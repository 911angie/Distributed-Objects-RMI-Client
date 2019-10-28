package com.ics.rmiclient.service;

import com.ics.rmiclient.model.Booking;

import java.time.LocalTime;

public interface CabBookingService {
    public Booking bookRide(String pickupLocation, LocalTime orderTime);
}
