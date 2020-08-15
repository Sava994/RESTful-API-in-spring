package sava94.QatarAirwayAPI.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sava94.QatarAirwayAPI.Models.Flight;
import sava94.QatarAirwayAPI.Repository.FlightRepository;

@Service
public class FlightServices {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public Flight getById(int id) {
		Optional<Flight> flight = flightRepository.findById(id);
		
		return flight.isPresent() ? flight.get() : null;
	}

}
