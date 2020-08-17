package sava94.QatarAirwayAPI.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sava94.QatarAirwayAPI.Models.Airport;
import sava94.QatarAirwayAPI.Repository.AirportRepository;
import sava94.QatarAirwayAPI.Services.AirportServices;

@RestController
@RequestMapping("qatar_airways")
public class AirportController {
	
	@Autowired
	AirportRepository airportRepository;
	
	@Autowired
	AirportServices airportServices;

	
	//show all airports
	@GetMapping("/airport")
	public List<Airport> root() {
		return airportRepository.findAll();
	}
	
	// GET /airport/{id} show specific airport
	@GetMapping("/airport/{id}")
	public ResponseEntity<Airport> getById(@PathVariable String id) {
		int airport_id = Integer.parseInt(id);
		Airport a = airportServices.getById(airport_id);
		if(a == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(a, HttpStatus.OK);
	}
	
	//POST /airport/search send information about city searched in format "text": "city"
	@PostMapping("/airport/search")
	public ResponseEntity<Airport> search(@RequestBody Map<String, String> body) {
		String searchTerm = body.get("text");
		Airport a = airportServices.searchByCity(searchTerm);
		
		if(a == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(a, HttpStatus.OK);
	}
	
	//POST /airport creates new airport
	@PostMapping("/airport")
	public Airport create(@RequestBody Map<String, String> body) {
		String name = body.get("name");
		String city = body.get("city");
		String country = body.get("country");
		return airportRepository.save(new Airport(name, city, country));

	}
	
	//PUT /airport/{id} updates existing airport
	@PutMapping("/airport/{id}")
	public ResponseEntity<Airport> update(@PathVariable String id, @RequestBody Map<String, String> body) {
		int airport_id = Integer.parseInt(id);
		Airport airport = airportServices.getById(airport_id);
		
		if(airport == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		airport.setName(body.get("name"));
		airport.setCity(body.get("city"));
		airport.setCountry(body.get("country"));
		
		airportRepository.save(airport);
		
		return new ResponseEntity<>(airport, HttpStatus.OK);

	}
	
	//DELETE /airport/{id} deletes specific airport
	@DeleteMapping("/airport/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable String id) {
		int airport_id = Integer.parseInt(id);
		Airport a = airportServices.getById(airport_id);
		airportRepository.delete(a);
		return new ResponseEntity<>(true,HttpStatus.OK);
	}
	

	

	
}




























