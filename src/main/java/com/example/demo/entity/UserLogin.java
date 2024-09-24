package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_LOGIN")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserLogin {
	@Id
	private String username;
	
	private String password;
	
	private String status;
	
	

}
