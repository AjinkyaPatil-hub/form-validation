package com.ajay.vaidate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@NotNull
	@Size(min = 2, max = 10,message = "name should be in between 2 to 10 length..")
	private String name;
	
	@NotEmpty(message = "email should not be empty")
	@Email(regexp = "^(.+)@(.+)$",message = "Invalid email pattern..")
	private String email;
	
	@Pattern(regexp = "[7-9][0-9]{9}",message = "Invalid mobile number..")
	@Size(max = 10 ,message = "mobile must be 10 digits..")
	private String mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



}
