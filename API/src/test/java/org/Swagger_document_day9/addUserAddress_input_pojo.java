package org.Swagger_document_day9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class addUserAddress_input_pojo {
	
	 private String first_name;
	    private String last_name;
	    private String mobile;
	    private String apartment;
	    private int state;
	    private int city;
	    private int country;
	    private String zipcode;
	    private String address;
	    private String address_type;

}
