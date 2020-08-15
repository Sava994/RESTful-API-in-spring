package sava94.QatarAirwayAPI.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sava94.QatarAirwayAPI.Models.Plane;
import sava94.QatarAirwayAPI.Repository.PlaneRepository;

@Service
public class PlaneServices {

	@Autowired
	private PlaneRepository planeRepository;
	
	public Plane getById(int id) {
		Optional<Plane> plane = planeRepository.findById(id);
		
		return plane.isPresent() ? plane.get() : null;
	}
}
