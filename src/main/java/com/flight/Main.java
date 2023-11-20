package com.flight;

import com.flight.dao.FlightBuilder;
import com.flight.model.Flight;
import com.flight.service.FlightFilterBuilderImpl;

import java.util.List;

public class Main {

public static void main(String[] args) {
    List<Flight> flights = FlightBuilder.createFlights();
    List<Flight> filterDepartureEarlierNow = new FlightFilterBuilderImpl(flights)
            .filterDepartureEarlierNow()
            .build();
    List<Flight> flightsArrivalBeforeDeparture = new FlightFilterBuilderImpl(flights)
            .filterArrivalBeforeDeparture()
            .build();
    List<Flight> filterTotalTimeSpentOnTheGroundMoreThanTwoHours = new FlightFilterBuilderImpl(flights)
            .filterTotalTimeSpentOnTheGroundMoreThanTwoHours()
            .build();

    System.out.println("Все рейсы" + flights);
    System.out.println("Не имеющий сегмента с отправлением, которое находится в более раннем" + filterDepartureEarlierNow);
    System.out.println("Наличие всех сегментов с приходом после отправления" + flightsArrivalBeforeDeparture);
    System.out.println("Общее время нахождения на земле не более 2 часов" + filterTotalTimeSpentOnTheGroundMoreThanTwoHours);
}
}

