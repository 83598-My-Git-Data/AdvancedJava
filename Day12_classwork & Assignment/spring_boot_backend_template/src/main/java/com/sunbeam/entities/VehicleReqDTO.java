package com.sunbeam.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class VehicleReqDTO {
	@NotBlank
	private String vname;
	
	@NotBlank 
	@Size(min = 10)
	private Company company;
	@NotBlank
	private String vnumber;
	@NotBlank
	private String vtype;
	
	@NotBlank
	private Long userid;
	

}
