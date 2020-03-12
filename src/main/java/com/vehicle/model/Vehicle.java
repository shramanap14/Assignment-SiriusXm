package com.vehicle.model;

public class Vehicle {

	private String vin;
	private Integer year;
	private String make;
	private String model;
	private String transmissionType;
	
	public Vehicle(){
		
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

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

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	@Override
	public String toString() {
		return "Vehicle [vin=" + vin + ", year=" + year + ", make=" + make + ", model=" + model + ", transmissionType="
				+ transmissionType + "]";
	}


}
