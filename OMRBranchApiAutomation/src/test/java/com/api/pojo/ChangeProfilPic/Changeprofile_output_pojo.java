package com.api.pojo.ChangeProfilPic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Changeprofile_output_pojo {
	private int status;
	 private String message;
	 private changeprofile data;
	 private int cart_count;


}
