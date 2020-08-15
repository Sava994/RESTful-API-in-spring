package sava94.QatarAirwayAPI.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planes")
public class Plane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planes_id;
	
	private String model;
	private int max_seats;
	
	public Plane() {}
	
	public Plane(String model, int max_seats) {
		this.model = model;
		this.max_seats = max_seats;
	}
	
	public Plane(int planes_id, String model, int max_seats) {
		this.planes_id = planes_id;
		this.model = model;
		this.max_seats = max_seats;
	}

	public int getPlanes_id() {
		return planes_id;
	}

	public void setPlanes_id(int planes_id) {
		this.planes_id = planes_id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMax_seats() {
		return max_seats;
	}

	public void setMax_seats(int max_seats) {
		this.max_seats = max_seats;
	}

	@Override
	public String toString() {
		return "Plane [planes_id=" + planes_id + ", model=" + model + ", max_seats=" + max_seats + "]";
	}
	
	

}
