package sava94.QatarAirwayAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sava94.QatarAirwayAPI.Models.Airport;
import sava94.QatarAirwayAPI.Repository.AirportRepository;

@RestController
public class AirportController {
	
	@Autowired
	AirportRepository airportRepository;
	
	
	//show all airports
	@GetMapping("/airport")
	public List<Airport> root() {
		return airportRepository.findAll();
	}
	

	
}




























