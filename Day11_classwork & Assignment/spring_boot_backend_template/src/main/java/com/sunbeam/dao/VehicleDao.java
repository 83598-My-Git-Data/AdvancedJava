package com.sunbeam.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sunbeam.dto.VehicleReqDTO;
import com.sunbeam.entities.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Long>{
	
	@Query 
	(" SELECT new com.sunbeam.dto.VehicleReqDTO( v.vname, v.company, v.vnumber, v.vtype,) from Vehicle v where v.user.Uname=:name")
	List<VehicleReqDTO> getVehiclesByUname(String name);
	

}
