package car_dealership;

import java.util.Objects;

public class Vehicle {
	private String make;
	private String model;
	private double price;
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + "]";
	}
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(make, model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if(make == null) {
			if(other.make != null)
				return false;
			}else if(!make.equals(other.make))
				return false;
		if(model == null) {
			if(other.model != null)
				return false;
		}else if(!model.equals(other.model))
			return false;
		if(Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;	
	}
	
	
}
