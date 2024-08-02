package com.sunbeam.entities;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Table;

@Table(name="users")
public class User extends BaseEntity {

	    
	    @Column(name="first_name",length=25)
	    private String fname;
	 
	    @Column(name="last_name",length=25)
	 	private String lname;

	    private String address;
	    
	    @Column(length = 20, unique = true)
	    private String email;

	    @Column(length = 20, nullable = false)
	    private String password;

//	    @NotBlank(message = "Phone number is mandatory")
//	    @Pattern(regexp = "^[0-9]{10,20}$", message = "Phone number should be between 10 and 20 digits")
	    private String phoneNo;
	
}
