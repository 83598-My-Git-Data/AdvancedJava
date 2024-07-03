package com.sunbeam.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sunbeam.entities.Company;

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

	public VehicleReqDTO(@NotBlank String vname, @NotBlank @Size(min = 10) Company company, @NotBlank String vnumber,
			@NotBlank String vtype, @NotBlank Long userid) {
		super();
		this.vname = vname;
		this.company = company;
		this.vnumber = vnumber;
		this.vtype = vtype;
		this.userid = userid;
	}

	
	

}
