package com.sunbeam.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name="sellers")
@Getter
@Setter
public class Seller extends BaseEntity 
{
		@Column(name="store_name",length = 50)
	    private String storeName;

		@Column(length = 20, unique = true)
	    private String email;

		@Column(length = 20, nullable = false)
	    private String password;

	    @NotBlank(message = "Phone number is mandatory")
	    @Pattern(regexp = "^[0-9]{10,20}$", message = "Phone number should be between 10 and 20 digits")
	    private String phoneNo;

//	    @NotBlank(message = "GST number is mandatory")
//	    @Size(max = 50, message = "GST number must be less than 50 characters")
//	    private String gstNumber;
//
//	    @NotBlank(message = "Bank account number is mandatory")
//	    @Size(max = 50, message = "Bank account number must be less than 50 characters")
//	    private String bankAcc;
//
//	    @NotBlank(message = "IFSC number is mandatory")
//	    @Size(max = 50, message = "IFSC number must be less than 50 characters")
//	    private String ifscNumber;
//
//	    @NotBlank(message = "Branch name is mandatory")
//	    @Size(max = 255, message = "Branch name must be less than 255 characters")
//	    private String branch;

	    @NotBlank(message = "Address is mandatory")
	    @Size(max = 255, message = "Address must be less than 255 characters")
	    private String address;
	
}
