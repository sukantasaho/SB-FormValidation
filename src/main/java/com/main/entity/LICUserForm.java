package com.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "LIC_USER_DETAILS1")
public class LICUserForm {

	@Id
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "gen1", sequenceName = "LIC_SEQ1", initialValue = 100, allocationSize = 1)
	@Column(name = "LIC_ID")
	private Integer licId;
	
	@Column(name = "NAME")
	@NotEmpty
	@Size(min = 6, message = "User name must be 6 character or greater")
	private String name;
	
	@Column(name = "AADHAR_ID")
	@NotNull
	private Long aadharId;
	
	@Column(name = "ADDRESS")
	@NotEmpty
	private String addr;
    
	@Column(name = "EMAIL")
	@Email(message = "Email address not valid")
	@NotEmpty
	private String email;
	
	@Column(name = "MOB_NO")
	@NotNull
	private Long mobNo;

	public Integer getLicId() {
		return licId;
	}

	public void setLicId(Integer licId) {
		this.licId = licId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAadharId() {
		return aadharId;
	}

	public void setAadharId(Long aadharId) {
		this.aadharId = aadharId;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobNo() {
		return mobNo;
	}

	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}
	
	
	
	
}
