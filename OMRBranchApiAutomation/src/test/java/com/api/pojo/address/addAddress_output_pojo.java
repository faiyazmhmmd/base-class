package com.api.pojo.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class addAddress_output_pojo {
	private int status;
	private String message;
	private int address_id;

}
