package com.api.globalData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalData {
	
	private int statuscode;
	private String stateidtext;
	private int cityidNum;
	private int stateidNum;
	private String logToken;
	private int address_id;
	private String address_id_text;

	}


