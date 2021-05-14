package com.springmvc.validate;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;




public class Customer {
	
	    @NotEmpty @Size(min=8, max=20) @Pattern(regexp = "[a-zA-Z0-9]{5}")
	    private String username;
	    
	    @NotEmpty @Size(min=8, max=20) @Pattern(regexp = "^[a-zA-Z0-9]{5}")
	    private String password;
	     
	    @NotEmpty @Email
	    private String email;
	    
		/*
		 * private String contact;
		 * 
		 * private List<String> city;
		 * 
		 * @Pattern(message = "only 6 digits", regexp = "{098}") private int zipcode;
		 */
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
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

		/*
		 * public String getContact() { return contact; }
		 * 
		 * public void setContact(String contact) { this.contact = contact; }
		 * 
		 * public List<String> getCity() { return city; }
		 * 
		 * public void setCity(List<String> city) { this.city = city; }
		 * 
		 * public int getZipcode() { return zipcode; }
		 * 
		 * public void setZipcode(int zipcode) { this.zipcode = zipcode; }
		 */
		
		
		
	

}
