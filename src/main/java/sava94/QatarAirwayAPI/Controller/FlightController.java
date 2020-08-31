package sava94.QatarAirwayAPI.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sava94.QatarAirwayAPI.Models.Flight;
import sava94.QatarAirwayAPI.Models.Plane;
import sava94.QatarAirwayAPI.Repository.FlightRepository;
import sava94.QatarAirwayAPI.Services.FlightServices;
import sava94.QatarAirwayAPI.Services.PlaneServices;

@RestController
@RequestMapping("qatar_airways")
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private FlightServices flightServices;
	
	@Autowired
	private PlaneServices planeServices;
	
	//GET /flight  show all flights
	@GetMapping("/flight")
	public List<Flight> root() {
		return flightRepository.findAll();
	}
	
	//GET /plane/{id}
	@GetMapping("/flight/{id}")
	public ResponseEntity<Flight> getById(@PathVariable String id) {
		int flight_id = Integer.parseInt(id);
		Flight flight = flightServices.getById(flight_id);
		
		if(flight == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(flight, HttpStatus.OK);
	}
	
	//POST /flight creates new flight and add new flight_plane with chosen id of plane
	@PostMapping("/flight")
	public Flight create(@RequestBody Map<String, String> body) {
		String departure_string = body.get("departure");
		Date departure = null;
		Date arrival = null;
		try {
			departure = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(departure_string);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		String departure_arrival = body.get("arrival");
		try {
			arrival = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(departure_arrival);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int airports_id = Integer.parseInt(body.get("airports_id"));
		int details_id = Integer.parseInt(body.get("details_id"));
		int vip_passengers = Integer.parseInt(body.get("vip_passengers"));
		int standard_passengers = Integer.parseInt(body.get("standard_passengers"));
		int planes_id = Integer.parseInt(body.get("planes_id"));
		
		Plane plane = planeServices.getById(planes_id);
		
		//it should be something else to return but for now is null so we know that passengers are more than seats in plane
		if(plane.getMax_seats() < (vip_passengers+standard_passengers)) {
			return null;
		}
		
		return flightRepository.save(new Flight(departure, arrival, airports_id, details_id, 
				vip_passengers, standard_passengers, planes_id));
	}
}
