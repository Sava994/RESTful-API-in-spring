package sava94.QatarAirwayAPI.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flights_id;
	
	private Date departure;
	private Date arrival;
	private int airports_id;
	private int details_id;
	private int vip_passengers;
	private int standard_passengers;
	private int planes_id;
	
	public Flight() {}

	public Flight(Date departure, Date arrival, int airports_id, int details_id, int vip_passengers,
			int standard_passengers, int planes_id) {
		this.departure = departure;
		this.arrival = arrival;
		this.airports_id = airports_id;
		this.details_id = details_id;
		this.vip_passengers = vip_passengers;
		this.standard_passengers = standard_passengers;
		this.planes_id = planes_id;
	}

	public Flight(int flights_id, Date departure, Date arrival, int airports_id, int details_id, int vip_passengers,
			int standard_passengers, int planes_id) {
		this.flights_id = flights_id;
		this.departure = departure;
		this.arrival = arrival;
		this.airports_id = airports_id;
		this.details_id = details_id;
		this.vip_passengers = vip_passengers;
		this.standard_passengers = standard_passengers;
		this.planes_id = planes_id;
	}

	public int getFlights_id() {
		return flights_id;
	}

	public void setFlights_id(int flights_id) {
		this.flights_id = flights_id;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public int getAirports_id() {
		return airports_id;
	}
	
	public int getPlanes_id() {
		return planes_id;
	}

	public void setAirports_id(int airports_id) {
		this.airports_id = airports_id;
	}

	public int getDetails_id() {
		return details_id;
	}

	public void setDetails_id(int details_id) {
		this.details_id = details_id;
	}

	public int getVip_passengers() {
		return vip_passengers;
	}

	public void setVip_passengers(int vip_passengers) {
		this.vip_passengers = vip_passengers;
	}

	public int getStandard_passengers() {
		return standard_passengers;
	}

	public void setStandard_passengers(int standard_passengers) {
		this.standard_passengers = standard_passengers;
	}
	
	public void setPlanes_id(int planes_id) {
		this.planes_id = planes_id;
	}

	@Override
	public String toString() {
		return "Flight [flights_id=" + flights_id + ", departure=" + departure + ", arrival=" + arrival
				+ ", airports_id=" + airports_id + ", details_id=" + details_id + ", vip_passengers=" + vip_passengers
				+ ", standard_passengers=" + standard_passengers + "]";
	}
	
}
