package com.vehicle.service.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.vehicle.model.Vehicle;
import com.vehicle.service.VehicleService;
import com.vehicle.util.VehicleConstants;

@Service
public class VehicleServiceImpl implements VehicleService{
	Logger logger = LoggerFactory.getLogger(VehicleServiceImpl.class);
	@Override
	public UUID createVehicle(Vehicle vehicle) {
		try{
			if(VehicleConstants.TYPE.contains(vehicle.getTransmissionType())){
				logger.info("Valid Vehicle details are :" + vehicle.toString());
				return UUID.randomUUID();
			}
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Failed due to :"+e.getMessage());
		}
		throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,"Invalid Input. Please try with valid input.");
	}

}
