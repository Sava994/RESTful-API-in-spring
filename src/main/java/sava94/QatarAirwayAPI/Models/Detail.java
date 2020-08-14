package sava94.QatarAirwayAPI.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int details_id;
	
	private float standard_price;
	private float vip_price;
	
	public Detail() {}
	
	public Detail(float standard_price, float vip_price) {
		this.standard_price = standard_price;
		this.vip_price = vip_price;
	}
	
	public Detail(int details_id, float standard_price, float vip_price) {
		this.details_id = details_id;
		this.standard_price = standard_price;
		this.vip_price = vip_price;
	}

	public int getDetails_id() {
		return details_id;
	}

	public void setDetails_id(int details_id) {
		this.details_id = details_id;
	}

	public float getStandard_price() {
		return standard_price;
	}

	public void setStandard_price(float standard_price) {
		this.standard_price = standard_price;
	}

	public float getVip_price() {
		return vip_price;
	}

	public void setVip_price(float vip_price) {
		this.vip_price = vip_price;
	}

	@Override
	public String toString() {
		return "Detail [details_id=" + details_id + ", standard_price=" + standard_price + ", vip_price=" + vip_price
				+ "]";
	}
	
	
	
}
