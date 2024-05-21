package org.Day3_Ex2_write_Om;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pojo {
	
	private String name;
	private String email;
	private long phoneNo;
	private boolean payment;
	private Address address;

}
