package com.vehicle.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vehicle.model.Vehicle;
import com.vehicle.service.VehicleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehicleServiceImplTest {

	@Autowired
	private VehicleService vehicleService;
	
	@Test
	public void validPayloadForManual() {
		Vehicle v = new Vehicle();
		v.setVin("1A4AABBC5KD501999");
		v.setYear(2019);
		v.setMake("FCA");
		v.setModel("RAM");
		v.setTransmissionType("MANUAL");
		
		assertNotNull(vehicleService.createVehicle(v));
	}
	
	@Test
	public void validPayloadForAuto() {
		Vehicle v = new Vehicle();
		v.setVin("1A4AABBC5KD501999");
		v.setYear(2019);
		v.setMake("FCA");
		v.setModel("RAM");
		v.setTransmissionType("AUTO");
		
		assertNotNull(vehicleService.createVehicle(v));
	}
	
	@Test
	public void inValidPayload() {
		Vehicle v = new Vehicle();
		v.setVin("1A4AABBC5KD501999");
		v.setYear(2019);
		v.setMake("FCA");
		v.setModel("RAM");
		v.setTransmissionType("ABC");
		try{
			assertNotNull(vehicleService.createVehicle(v));
			assertFalse(true);
		}catch(Exception e){
			assertTrue(true);
		}
	}

}
