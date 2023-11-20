package com.flight.service;

import com.flight.model.Flight;

import java.util.List;

public interface FlightFilterBuilder {

List<Flight> build();

FlightFilterBuilder filterDepartureEarlierNow();

FlightFilterBuilder filterArrivalBeforeDeparture();

FlightFilterBuilder filterTotalTimeSpentOnTheGroundMoreThanTwoHours();
}

