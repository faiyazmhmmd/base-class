package com.api.pojo.address;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class getAddress_output_pojo {
	 private int status;
	    private String message;
	    private ArrayList<getAdressList> data;

}
