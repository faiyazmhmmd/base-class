package org.Day3_Ex2_write_Om;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private String streetName;
	private String stateName;
	private int pinCode;

}
