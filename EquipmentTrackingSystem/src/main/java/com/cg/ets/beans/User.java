package com.cg.ets.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User {
	@Id
	@Column(name = "user_id")
	private String userId;
	
	@Column(name="password")
	private String password;

	@Column(name = "designation")
	private String designation;
	
	@OneToOne//(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "location_id")
	Location location;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", designation=" + designation + ", location=" + location + "]";
	}
	
	
}
