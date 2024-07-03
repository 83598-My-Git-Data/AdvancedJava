package com.sunbeam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.VehicleReqDTO;
import com.sunbeam.entities.Vehicle;
import com.sunbeam.service.VehicleService;

@RestController
@RequestMapping
public class VehicleController {
	
	public VehicleController()
	{
		System.out.println("inside constructor");
	}
	
	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("/vehicle")
	public ResponseEntity<?> postvehicles(@RequestBody VehicleReqDTO vehicleReqDTO)
	{
		System.out.println("in add post "+vehicleReqDTO);
		
	
			return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.postvehicledetails(vehicleReqDTO));
	
		
	}
	
	@GetMapping("/user/{uname}")
    public ResponseEntity<List<VehicleReqDTO>> getVehiclesByUsername(@PathVariable String uname) {
        List<VehicleReqDTO> vehicles = vehicleService.getvehiclesbyusername(uname);
        if (vehicles.isEmpty()) {
        	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
           
        }
        return ResponseEntity.ok(vehicles);
    }
	
	

}
