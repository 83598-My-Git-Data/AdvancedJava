package com.sunbeam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.custom_exceptions.ApiException;
import com.sunbeam.custom_exceptions.ResourceNotFoundException;
import com.sunbeam.dao.UserDao;
import com.sunbeam.dao.VehicleDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.VehicleReqDTO;
import com.sunbeam.entities.Vehicle;
import com.sunbeam.entities.User;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    
    @Autowired
    private VehicleDao vehicleDao;
    
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public ApiResponse postvehicledetails(VehicleReqDTO vehicledto) {
        // Find the user by ID, or throw an exception if not found
        User user = userDao.findById(vehicledto.getUserid())
                           .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + vehicledto.getUserid()));
        if(user.getUname().isEmpty())
        {
        	//return new ApiResponse("vehicles cannot register without user ");
        	throw new ApiException("vehicles cannot register without user");
        	
        }
        else {
        	
		
        // Map VehicleReqDTO to Vehicle entity
        Vehicle persistentVehicle = modelMapper.map(vehicledto, Vehicle.class);
        
       
        persistentVehicle.setUser(user);
        
      
       vehicleDao.save(persistentVehicle);
        
        
        ApiResponse response = new ApiResponse("Vehicle details saved successfully");
        
        return response;
        }
    }

	@Override
	public List<VehicleReqDTO> getvehiclesbyusername(String name) {

		return vehicleDao.getVehiclesByUname(name);
		
	}
}
