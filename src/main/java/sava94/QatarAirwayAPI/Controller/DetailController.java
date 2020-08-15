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

import sava94.QatarAirwayAPI.Models.Detail;
import sava94.QatarAirwayAPI.Repository.DetailRepository;
import sava94.QatarAirwayAPI.Services.DetailServices;

@RestController
public class DetailController {
	
	@Autowired
	private DetailRepository detailRepository;
	
	@Autowired
	private DetailServices detailServices;
	
	//GET /detail show all details
	@GetMapping("/detail")
	public List<Detail> root() {
		return detailRepository.findAll();
	}
	
	//GET /detail/{id} show specific detail
	@GetMapping("/detail/{id}")
	public ResponseEntity<Detail> getById(@PathVariable String id) {
		int detail_id = Integer.parseInt(id);
		Detail detail = detailServices.getById(detail_id);
		if(detail == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(detail, HttpStatus.OK);
	}
	
	//POST /detail creates new detail
	@PostMapping("/detail")
	public Detail create(@RequestBody Map<String, String> body) {
		float standard_price = Float.parseFloat(body.get("standard_price"));
		float vip_price = Float.parseFloat(body.get("vip_price"));
		
		return detailRepository.save(new Detail(standard_price, vip_price));
		
	}
	
	//PUT /detail/{id} update existing detail
	@PutMapping("/detail/{id}")
	public ResponseEntity<Detail> update(@PathVariable String id, @RequestBody Map<String, String> body) {
		int detail_id = Integer.parseInt(id);
		Detail detail = detailServices.getById(detail_id);
		
		if(detail == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		detail.setStandard_price(Float.parseFloat(body.get("standard_price")));
		detail.setVip_price(Float.parseFloat(body.get("vip_price")));
		
		detailRepository.save(detail);
		
		return new ResponseEntity<>(detail, HttpStatus.OK);
	}
	
	//DELETE /detail/{id} deletes specific detail
	@DeleteMapping("/detail/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable String id) {
		int detail_id = Integer.parseInt(id);
		Detail detail = detailServices.getById(detail_id);
		
		if(detail == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		detailRepository.delete(detail);
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}

}
