package com.demo.springboot.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user_tab")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	@Size(min = 3, message = "Username must be minimum 3 characters long.")
	@NotBlank(message = "Username is Mandatory")
	@Schema(description = "username",example = "Raj", requiredMode = RequiredMode.REQUIRED)
	private String userName;
	
	@Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+{}\\[\\]:;\"'<>,.?/~\\-=`|]).{8,}$",
			message = "Password must be at least 8 characters long."+
						"Password must include at least one lowercase letter."+
						"Password must include at least one uppercase letter."+
						"Password must include at least one number."+
						"Password must include at least one special character (e.g., !@#$%).")
	@Schema(description = "password",example = "Bhalu@123",requiredMode = RequiredMode.REQUIRED)
	private String password;
	
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", 
			message = "Please enter a valid email address"+
					  "Email must contain '@' symbol."+
					  "Email must include a domain name"+
					  "Email must include a valid extension"+
					  "Email contains invalid characters. Only letters, numbers, dots, underscores, and hyphens are allowed before '@'."
					  )
	@Schema(description = "Email", example = "Bhalu@demo.com", requiredMode = RequiredMode.REQUIRED)
	private String email;
	@Schema(description = "Mobile Number", example = "9874563210")
	private String mobile;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userId, String userName, String password, String email, String mobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
