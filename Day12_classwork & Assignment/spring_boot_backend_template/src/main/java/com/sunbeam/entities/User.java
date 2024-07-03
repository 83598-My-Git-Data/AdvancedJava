package com.sunbeam.entities;



import javax.persistence.Entity;

import javax.persistence.Table;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="user")

public class User extends BaseEntity {
	private String Uname;
	private String Email;
	private String Password;
	private String City;
	private String Contact_No;
	


	public User(String uname, String email, String password, String city, String contact_No) {
		super();
		Uname = uname;
		Email = email;
		Password = password;
		City = city;
		Contact_No = contact_No;
	}
	
	
	

}
