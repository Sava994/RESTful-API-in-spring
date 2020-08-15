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
import org.springframework.web.bind.annotation.RestController;

import sava94.QatarAirwayAPI.Models.Plane;
import sava94.QatarAirwayAPI.Repository.PlaneRepository;
import sava94.QatarAirwayAPI.Services.PlaneServices;

@RestController
public class PlaneController {
	
	@Autowired
	private PlaneRepository planeRepository;
	
	@Autowired
	private PlaneServices planeServices;
	
	//GET .detail show all planes
	@GetMapping("/plane")
	public List<Plane> root() {
		return planeRepository.findAll();
	}
	
	//GET /detail/{id} show specific plane
	@GetMapping("/plane/{id}")
	public ResponseEntity<Plane> getById(@PathVariable String id) {
		int plane_id = Integer.parseInt(id);
		Plane plane = planeServices.getById(plane_id);
		if(plane == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(plane, HttpStatus.OK);
	}
	
	//POST /plane creates new plane
	@PostMapping("/plane")
	public Plane create(@RequestBody Map<String, String> body) {
		String model = body.get("model");
		int max_seats = Integer.parseInt(body.get("max_seats"));
		
		return planeRepository.save(new Plane(model, max_seats));
	}
	
	//PUT /plane/{id} update existing detail
	@PutMapping("/plane/{id}")
	public ResponseEntity<Plane> update(@PathVariable String id, @RequestBody Map<String, String> body) {
		int plane_id = Integer.parseInt(id);
		Plane plane = planeServices.getById(plane_id);
		
		if(plane == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		plane.setModel(body.get("model"));
		plane.setMax_seats(Integer.parseInt(body.get("max_seats")));
		
		planeRepository.save(plane);
		
		return new ResponseEntity<>(plane, HttpStatus.OK);
	}
	
	//DELETE /plane/{id} deletes specific plane
	@DeleteMapping("/plane/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable String id) {
		int plane_id = Integer.parseInt(id);
		Plane plane = planeServices.getById(plane_id);
		
		if(plane == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		planeRepository.delete(plane);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}

	
}
