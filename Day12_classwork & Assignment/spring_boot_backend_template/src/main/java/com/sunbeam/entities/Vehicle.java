package com.sunbeam.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sunbeam.entities.User;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="vehicle")
@Setter
@Getter
@NoArgsConstructor

public class Vehicle  extends BaseEntity{
	
	private String vname;
	private Company company;
	private String vnumber;
	private String vtype;
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	public Vehicle(String vname, Company company, String vnumber, String vtype, User user) {
		super();
		this.vname = vname;
		this.company = company;
		this.vnumber = vnumber;
		this.vtype = vtype;
		this.user = user;
	}
	

	
	
	

}
