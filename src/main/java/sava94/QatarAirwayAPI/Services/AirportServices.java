package sava94.QatarAirwayAPI.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sava94.QatarAirwayAPI.Models.Airport;
import sava94.QatarAirwayAPI.Repository.AirportRepository;

@Service
public class AirportServices {

	@Autowired
	private AirportRepository airportRepository;
	
	public Airport getById(int id) {
		Optional<Airport> a = airportRepository.findById(id);

		return a.isPresent() ? a.get() : null;
	}
	
	public Airport searchByCity(String city) {
		List<Airport> all = airportRepository.findAll();
		
		for(Airport a : all) {
			if(a.getCity().toLowerCase().equalsIgnoreCase(city))
				return a;
		}
		return null;
	}
	
}
