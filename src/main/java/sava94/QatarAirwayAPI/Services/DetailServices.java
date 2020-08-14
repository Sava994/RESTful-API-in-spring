package sava94.QatarAirwayAPI.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sava94.QatarAirwayAPI.Models.Detail;
import sava94.QatarAirwayAPI.Repository.DetailRepository;

@Service
public class DetailServices {
	
	@Autowired
	private DetailRepository detailRepository;
	
	public Detail getById(int id) {
		Optional<Detail> detail = detailRepository.findById(id);
		
		return detail.isPresent() ? detail.get() : null;
	}

}
