package sava94.QatarAirwayAPI.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airports")
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airports_id;
	
	private String name;
	private String city;
	private String country;
	
	public Airport() {}
	
	public Airport(String name, String city, String country) {
		this.name = name;
		this.city = city;
		this.country = country;
	}
	
	public Airport(int airports_id, String name, String city, String country) {
		this.airports_id = airports_id;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public int getAirports_id() {
		return airports_id;
	}

	public void setAirports_id(int airports_id) {
		this.airports_id = airports_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Airport [airports_id=" + airports_id + ", name=" + name + ", city=" + city + ", country=" + country
				+ "]";
	}
	
		

}
