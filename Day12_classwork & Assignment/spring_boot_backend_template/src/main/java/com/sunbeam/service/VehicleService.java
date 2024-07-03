package com.sunbeam.service;
import java.util.List;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.VehicleReqDTO;
import com.sunbeam.entities.Vehicle;

public interface VehicleService {
	
	public ApiResponse postvehicledetails(VehicleReqDTO vehicledto);
 public List<VehicleReqDTO> getvehiclesbyusername(String name);
}
